# 🐳 Docker — Complete Mastery Guide

> Read this top to bottom once, then use it as a permanent reference. Every section has **Definition → Explanation → Example → Use Cases → 🔑 Key Points**.

---

## 📑 INDEX

1. What is Docker & Why It Exists
2. Virtualization vs Containerization
3. Docker Architecture
4. Images vs Containers
5. Installing Docker
6. Docker Images — Deep Dive
7. Dockerfile — Complete Reference
8. Docker Container Lifecycle & Commands
9. Docker Networking
10. Docker Storage — Volumes, Bind Mounts, tmpfs
11. Environment Variables, Args & Secrets
12. Docker Compose — Multi-Container Apps
13. Docker Registry & Docker Hub
14. Multi-Stage Builds
15. Docker Swarm — Orchestration Basics
16. Docker Security Best Practices
17. Real-World Use Cases
18. Complete Command Cheat Sheet
19. Troubleshooting Guide
20. 🎯 Interview Questions

---

<a name="1"></a>
## 1. What is Docker & Why It Exists

### Definition
**Docker** is an **open-source platform** used to **build, ship, and run applications** inside lightweight, isolated environments called **containers**. A container packages an application together with everything it needs to run — code, runtime, system tools, libraries, and settings — so it behaves the same way on any machine.

### The Problem Docker Solves
Before Docker, developers faced the classic complaint:
> *"It works on my machine, but not on the server!"*

This happened because of differences in OS versions, installed dependencies, environment variables, and configurations between development, testing, and production environments.

### Docker's Solution
Docker **packages the application + its environment together** into a single portable unit (a container image), so it runs **identically** everywhere — your laptop, a colleague's laptop, a test server, or the cloud.

**🔑 One-line definition to remember:**
> *"Docker lets you package an application with everything it needs so it runs the same way anywhere."*

### 🎯 Interview Questions
- Q: What core problem does Docker solve?
  → *A: Environment inconsistency between development, testing, and production — "works on my machine" issues.*
- Q: Is Docker a programming language, a tool, or a platform?
  → *A: A platform — it provides tools (CLI, daemon, APIs) to build, ship, and run containerized applications.*

---

<a name="2"></a>
## 2. Virtualization vs Containerization

This is the single most important concept to understand *why* Docker is fast and lightweight.

### Virtual Machines (VMs)
A VM virtualizes an **entire physical machine**, including its own full **Guest OS**, using a **Hypervisor** (e.g., VMware, VirtualBox, Hyper-V).

```
┌─────────────────────────────────────────┐
│              Host OS                    │
│  ┌──────────────────────────────────┐   │
│  │           Hypervisor              │  │
│  │  ┌────────┐ ┌────────┐ ┌────────┐ │  │
│  │  │Guest OS│ │Guest OS│ │Guest OS│ │  │
│  │  │  App A │ │  App B │ │  App C │ │  │
│  │  └────────┘ └────────┘ └────────┘ │  │
│  └──────────────────────────────────┘   │
│              Hardware                    │
└─────────────────────────────────────────┘
```
- Each VM has its **own full operating system** — heavy (GBs in size), slow to boot (minutes).

### Containers
Containers **share the host machine's OS kernel** but run in isolated user-space environments. No guest OS is needed per container.

```
┌─────────────────────────────────────────┐
│              Host OS                    │
│  ┌──────────────────────────────────┐   │
│  │         Docker Engine             │  │
│  │  ┌────────┐ ┌────────┐ ┌────────┐ │  │
│  │  │Container│ │Container│ │Container│ │
│  │  │  App A │ │  App B │ │  App C │ │  │
│  │  └────────┘ └────────┘ └────────┘ │  │
│  └──────────────────────────────────┘   │
│              Hardware                    │
└─────────────────────────────────────────┘
```
- Containers are **lightweight** (MBs in size), start in **seconds** (sometimes milliseconds), and share the host kernel.

### Comparison Table

| | **Virtual Machine** | **Container** |
|---|---|---|
| OS | Full Guest OS per VM | Shares Host OS kernel |
| Size | GBs | MBs |
| Boot time | Minutes | Seconds/milliseconds |
| Isolation | Strong (hardware-level) | Process-level (namespace/cgroup based) |
| Performance | More overhead | Near-native performance |
| Portability | Less portable | Highly portable |
| Tooling | Hypervisor (VMware, VirtualBox) | Docker Engine |

**🔑 Key takeaway:** *VMs virtualize hardware. Containers virtualize the operating system.*

### 🎯 Interview Questions
- Q: Why are containers faster to start than VMs?
  → *A: Containers don't boot a full OS — they share the host kernel and only start the application process, so there's no OS boot overhead.*
- Q: Does a container have its own kernel?
  → *A: No — it shares the host machine's kernel; only the OS-level user-space (files, libraries) is isolated.*
- Q: Which offers stronger isolation, and why might that matter?
  → *A: VMs offer stronger isolation since each has a separate kernel; this matters in multi-tenant, high-security environments where kernel-level separation is required.*

---

<a name="3"></a>
## 3. Docker Architecture

Docker uses a **Client-Server architecture**.

```
┌───────────────┐        REST API / CLI         ┌─────────────────────────────┐
│  Docker Client │ ─────────────────────────────▶│       Docker Daemon (dockerd) │
│  (docker CLI)  │                                │  ┌────────────────────────┐  │
└───────────────┘                                 │  │ Images │ Containers    │  │
                                                   │  │ Networks │ Volumes     │  │
                                                   │  └────────────────────────┘  │
                                                   └───────────────┬──────────────┘
                                                                   │
                                                          ┌────────▼────────┐
                                                          │  Docker Registry │
                                                          │  (Docker Hub etc)│
                                                          └─────────────────┘
```

### Components

| Component | Role |
|---|---|
| **Docker Client** | The CLI tool (`docker` command) you interact with |
| **Docker Daemon (`dockerd`)** | Background service that does the actual work — builds, runs, and manages containers/images/networks/volumes |
| **Docker Registry** | Stores and distributes Docker images (e.g., **Docker Hub**, AWS ECR, private registries) |
| **Docker Objects** | Images, Containers, Networks, Volumes managed by the daemon |

**🔑 Flow:** You type a `docker` command in the **Client** → it talks to the **Daemon** via REST API → Daemon executes the actual task (pulling image from Registry, creating container, etc.)

### 🎯 Interview Questions
- Q: What does the Docker Daemon do?
  → *A: It's the background process that manages Docker objects — building images, running containers, handling networks and volumes.*
- Q: How does the Docker Client talk to the Daemon?
  → *A: Via a REST API (over a Unix socket or network interface).*
- Q: Can the Docker Client and Daemon run on different machines?
  → *A: Yes — Docker supports remote daemon access, which is common in CI/CD and cloud setups.*

---

<a name="4"></a>
## 4. Images vs Containers

This distinction confuses beginners the most — get this crystal clear.

### Docker Image
> A **read-only template/blueprint** containing the application code, runtime, libraries, environment variables, and configuration needed to run an application.

- Built from a set of instructions (a `Dockerfile`).
- **Immutable** — once built, it doesn't change.
- Made of **layers** stacked on top of each other (each Dockerfile instruction creates a layer).

### Docker Container
> A **running instance** of an image. It's the actual live, executing environment.

- Has a **writable layer** on top of the image's read-only layers.
- Can be **started, stopped, moved, and deleted**.

### The Analogy
| Concept | Real-world analogy |
|---|---|
| **Image** | A **class** in OOP, or a **recipe** for a cake |
| **Container** | An **object** (instance of the class), or the **actual baked cake** |

You can create **many containers from one image**, just like you can create many objects from one class.

```
        Docker Image (blueprint)
        /        |         \
  Container 1  Container 2  Container 3
   (running)    (running)    (stopped)
```

### 🎯 Interview Questions
- Q: If I delete a container, does the image get deleted too?
  → *A: No — the image is independent; multiple containers can be created from and deleted independently of the same image.*
- Q: Are Docker images mutable or immutable?
  → *A: Immutable — once built, an image doesn't change. Any runtime changes happen only in the container's writable layer.*
- Q: Can two containers run from the same image simultaneously?
  → *A: Yes — each container gets its own isolated writable layer on top of the same shared read-only image layers.*

---

<a name="5"></a>
## 5. Installing Docker

### Components installed
- **Docker Engine** (daemon + CLI)
- **Docker Compose** (usually bundled now as `docker compose`)
- **Docker Desktop** (GUI app for Windows/Mac, bundles everything + a lightweight VM since these OSes don't have a Linux kernel natively)

### Basic Verification Commands
```bash
docker --version        # check Docker version
docker info             # detailed system/daemon info
docker run hello-world  # test that Docker is working correctly
```

**🔑 Note:** On **Windows/Mac**, Docker actually runs a small **Linux VM** in the background since Docker containers need a Linux kernel — this is hidden from the user by Docker Desktop.

### 🎯 Interview Questions
- Q: Why does Docker Desktop use a lightweight VM on Windows/Mac but not on Linux?
  → *A: Docker containers rely on Linux kernel features (namespaces, cgroups). Windows/Mac don't have a Linux kernel natively, so Docker Desktop runs one in a small VM behind the scenes.*

---

<a name="6"></a>
## 6. Docker Images — Deep Dive

### Image Layers & Union File System
Every Dockerfile instruction (`FROM`, `RUN`, `COPY`, etc.) creates a new **layer**. These layers are stacked using a **Union File System**, and **cached** — if a layer hasn't changed, Docker reuses it instead of rebuilding, which massively speeds up builds.

```
Layer 4: COPY . /app         ← your app code
Layer 3: RUN npm install     ← dependencies
Layer 2: RUN apt-get update  ← OS packages
Layer 1: FROM node:18        ← base image
```

**🔑 Best practice:** Order Dockerfile instructions from **least frequently changed → most frequently changed** so Docker can reuse cached layers efficiently. (e.g., install dependencies *before* copying your source code, since source code changes far more often than dependencies.)

### Common Image Commands
```bash
docker pull nginx              # download an image from registry
docker images                  # list all local images
docker build -t myapp:1.0 .    # build an image from a Dockerfile
docker rmi myapp:1.0           # remove an image
docker tag myapp:1.0 myapp:latest   # add another tag to an existing image
docker history myapp:1.0       # see the layer history of an image
docker inspect myapp:1.0       # detailed metadata about an image
```

### Image Naming Convention
```
[registry-host/]repository-name[:tag]

Example: docker.io/library/nginx:1.25
          └────┬────┘ └───┬───┘ └┬┘ └─┬─┘
          registry     namespace name  tag
```
- If no tag is specified, Docker defaults to `latest`.

**⚠️ Common mistake:** `latest` does **NOT** mean "most recent version" automatically — it's just a **tag name/convention**; it only points to whatever image was last tagged as `latest` by whoever pushed it.

### 🎯 Interview Questions
- Q: Why does Docker build images in layers instead of as one single blob?
  → *A: For caching and efficiency — unchanged layers can be reused across builds, drastically speeding up rebuild times, and layers can be shared across multiple images.*
- Q: Does the `latest` tag always point to the newest version of an image?
  → *A: No — it's just a tag name; it points to whatever image was most recently pushed with that tag, which may or may not be the actual newest version.*
- Q: What happens to the layer cache if you change an early instruction in your Dockerfile (e.g., the base image)?
  → *A: All subsequent layers are invalidated and must be rebuilt, even if their instructions didn't change — cache invalidation cascades downward.*

---

<a name="7"></a>
## 7. Dockerfile — Complete Reference

### Definition
A **Dockerfile** is a plain-text file containing a set of instructions that Docker reads **top to bottom** to automatically build an image.

### Full Instruction Reference

| Instruction | Purpose |
|---|---|
| `FROM` | Sets the **base image** to build on top of (mandatory, first instruction) |
| `WORKDIR` | Sets the working directory inside the container for subsequent instructions |
| `COPY` | Copies files/folders from host machine into the image |
| `ADD` | Like `COPY`, but also supports URL downloads and auto-extracting tar files |
| `RUN` | Executes a command **during the build** (e.g., installing packages) — creates a new layer |
| `CMD` | Specifies the **default command** to run when the container starts (can be overridden at runtime) |
| `ENTRYPOINT` | Specifies the **main executable** for the container (harder to override than `CMD`) |
| `EXPOSE` | Documents which port the container listens on (doesn't actually publish it) |
| `ENV` | Sets environment variables inside the image |
| `ARG` | Defines a build-time variable (only available during build, not at runtime) |
| `VOLUME` | Creates a mount point for persistent/shared data |
| `USER` | Sets the user (and group) to run subsequent instructions/container as |
| `LABEL` | Adds metadata (key-value pairs) to the image |

### Example Dockerfile (Node.js app)
```dockerfile
# 1. Base image
FROM node:18-alpine

# 2. Set working directory
WORKDIR /app

# 3. Copy dependency files first (better layer caching)
COPY package*.json ./

# 4. Install dependencies
RUN npm install

# 5. Copy the rest of the source code
COPY . .

# 6. Document the port
EXPOSE 3000

# 7. Set environment variable
ENV NODE_ENV=production

# 8. Default command to run the app
CMD ["node", "server.js"]
```

### CMD vs ENTRYPOINT

| | `CMD` | `ENTRYPOINT` |
|---|---|---|
| Purpose | Default command, easily overridden | Fixed main command, harder to override |
| Override | `docker run myimage echo hi` replaces the entire CMD | Arguments passed at `docker run` get **appended** to ENTRYPOINT, not replaced |
| Best used for | Apps where users might want to run a different command | Apps that should always run the same executable, just with different args |

**🔑 Combo pattern (very common):**
```dockerfile
ENTRYPOINT ["python3", "app.py"]
CMD ["--verbose"]
```
This lets `docker run myimage --debug` override just the argument (`--verbose` → `--debug`), while `python3 app.py` always runs.

### Shell Form vs Exec Form
```dockerfile
# Shell form — runs via /bin/sh -c, supports shell features (variables, pipes)
CMD npm start

# Exec form — runs directly, no shell, preferred (avoids extra shell process, handles signals correctly)
CMD ["npm", "start"]
```
**🔑 Best practice:** Prefer **exec form** — it properly forwards OS signals (like `SIGTERM` for graceful shutdown) to your application.

### .dockerignore
Just like `.gitignore`, this file tells Docker which files/folders to **exclude** when copying context into the image — speeds up builds and avoids bloating the image with unnecessary files (e.g., `node_modules`, `.git`, `*.log`).

```
# .dockerignore example
node_modules
.git
*.log
Dockerfile
.env
```

### 🎯 Interview Questions
- Q: What's the difference between `CMD` and `ENTRYPOINT`?
  → *A: `CMD` sets a default command that's fully replaced if arguments are passed at `docker run`. `ENTRYPOINT` sets the fixed main process; extra arguments get appended rather than replacing it.*
- Q: Why is exec form (`["cmd", "arg"]`) preferred over shell form (`cmd arg`)?
  → *A: Exec form runs the process directly as PID 1 without an intermediate shell, allowing proper signal handling (e.g., graceful shutdown on `SIGTERM`) and avoiding unnecessary shell overhead.*
- Q: Why should `COPY package*.json ./` and `RUN npm install` come *before* `COPY . .` in a Dockerfile?
  → *A: To leverage Docker's layer caching — dependencies change far less often than source code, so putting the install step first means Docker can reuse the cached dependency layer on most rebuilds, only re-copying/re-running when source code (not dependencies) changes.*
- Q: What's the difference between `ADD` and `COPY`?
  → *A: `COPY` only copies local files/directories. `ADD` can also fetch remote URLs and auto-extract compressed archives — but because of this "magic" behavior, `COPY` is generally recommended unless you specifically need `ADD`'s extra features.*
- Q: Does `EXPOSE` actually publish a port to the host machine?
  → *A: No — it's just documentation/metadata for the image. You must still use `-p` at `docker run` to actually map/publish the port.*

---

<a name="8"></a>
## 8. Docker Container Lifecycle & Commands

### Container Lifecycle States
```
       docker create
            │
            ▼
        [Created] ──docker start──▶ [Running] ──docker stop──▶ [Stopped]
                                        │                          │
                                   docker pause                docker rm
                                        ▼                          │
                                     [Paused]                       ▼
                                        │                      [Removed]
                                  docker unpause
                                        ▼
                                     [Running]
```

### Essential Commands

```bash
# Running containers
docker run nginx                     # create + start a container
docker run -d nginx                  # run in detached mode (background)
docker run -it ubuntu bash           # interactive mode with terminal
docker run --name myweb nginx        # give the container a custom name
docker run -p 8080:80 nginx          # map host port 8080 → container port 80
docker run --rm nginx                # auto-remove container when it stops

# Managing containers
docker ps                            # list running containers
docker ps -a                         # list ALL containers (including stopped)
docker start <container>             # start a stopped container
docker stop <container>              # gracefully stop a running container
docker restart <container>           # restart a container
docker rm <container>                # remove a stopped container
docker rm -f <container>             # force remove (even if running)

# Interacting with containers
docker exec -it <container> bash     # open an interactive shell inside a running container
docker logs <container>              # view container logs
docker logs -f <container>           # follow logs in real-time
docker inspect <container>           # detailed JSON metadata
docker stats <container>             # live resource usage (CPU, memory)
docker cp file.txt <container>:/app  # copy files between host and container
```

### 🔑 -d (Detached) vs -it (Interactive)
| Flag | Meaning | Use case |
|---|---|---|
| `-d` | Run in **background**, returns control to terminal immediately | Long-running services (web servers, databases) |
| `-it` | **Interactive** + allocate a pseudo-**t**erminal | Debugging, running a shell, one-off interactive tasks |

### 🎯 Interview Questions
- Q: What's the difference between `docker stop` and `docker kill`?
  → *A: `docker stop` sends `SIGTERM` first (graceful shutdown, giving the app time to clean up) and then `SIGKILL` if it doesn't stop in time. `docker kill` sends `SIGKILL` immediately, forcefully terminating the process.*
- Q: What happens to a container's data when you run `docker rm`?
  → *A: Any data stored only in the container's writable layer is lost, unless it was stored in a volume or bind mount (which persist independently of the container).*
- Q: How do you get a shell inside an already-running container?
  → *A: `docker exec -it <container_name> bash` (or `sh` if bash isn't available in the image).*
- Q: What's the difference between `docker ps` and `docker ps -a`?
  → *A: `docker ps` shows only currently running containers; `docker ps -a` shows all containers including stopped/exited ones.*

---

<a name="9"></a>
## 9. Docker Networking

### Why Networking Matters
Containers often need to talk to each other (e.g., a web app container talking to a database container) and to the outside world.

### Network Drivers

| Driver | Description | Use Case |
|---|---|---|
| **bridge** (default) | Private internal network on the host; containers get their own IP, can communicate with each other | Default choice for most single-host setups |
| **host** | Container shares the host's network stack directly (no isolation) | Max performance, when network isolation isn't needed |
| **none** | No networking at all | Fully isolated container, security-sensitive tasks |
| **overlay** | Connects containers across **multiple Docker hosts** | Docker Swarm, multi-host clustering |
| **macvlan** | Assigns a MAC address to a container, making it appear as a physical device on the network | Legacy apps needing direct LAN presence |

### Custom Bridge Networks (Recommended)
```bash
docker network create my-network
docker run -d --name db --network my-network mongo
docker run -d --name app --network my-network mynode-app
```
**🔑 Key benefit:** Containers on the **same custom network** can find each other **by container name** (Docker's built-in DNS), e.g., the app container can just connect to `mongodb://db:27017` instead of needing an IP address.

### Port Mapping
```bash
docker run -p <host-port>:<container-port> nginx
docker run -p 8080:80 nginx    # host:8080 → container:80
```

### Common Networking Commands
```bash
docker network ls                # list all networks
docker network inspect bridge    # inspect a network's details
docker network create mynet      # create a custom network
docker network connect mynet container1   # attach a running container to a network
docker network rm mynet          # remove a network
```

### 🎯 Interview Questions
- Q: Why is the **default bridge** network less convenient than a **custom bridge** network?
  → *A: The default bridge network doesn't provide automatic DNS resolution by container name — containers must use IP addresses. Custom networks give you name-based service discovery.*
- Q: What's the risk of using `--network host`?
  → *A: The container shares the host's network namespace entirely, removing network isolation — port conflicts and reduced security are risks.*
- Q: How do two containers on the same custom network communicate?
  → *A: By using each other's container name as a hostname — Docker's embedded DNS resolves it to the correct internal IP.*

---

<a name="10"></a>
## 10. Docker Storage — Volumes, Bind Mounts, tmpfs

### The Core Problem
Containers are **ephemeral** — by default, any data written inside a container is lost when the container is removed. Docker provides 3 ways to persist or share data.

### 1. Volumes (Recommended)
> Managed by Docker itself, stored in a Docker-controlled area on the host filesystem (`/var/lib/docker/volumes/` on Linux).

```bash
docker volume create mydata
docker run -d -v mydata:/app/data myapp
```
**Use case:** Persisting database data, sharing data between containers, backing up/restoring data easily.

### 2. Bind Mounts
> Maps a **specific path on the host machine** directly into the container.

```bash
docker run -d -v /home/user/project:/app myapp
```
**Use case:** Local development — instantly reflect code changes on your host machine inside the running container without rebuilding the image.

### 3. tmpfs Mounts
> Stored only in the **host's memory (RAM)** — never written to disk.

```bash
docker run -d --tmpfs /app/cache myapp
```
**Use case:** Storing sensitive temporary data (e.g., secrets, session tokens) that should never persist to disk.

### Comparison Table

| | **Volume** | **Bind Mount** | **tmpfs** |
|---|---|---|---|
| Managed by | Docker | You (host filesystem path) | Docker (in-memory) |
| Persists after container removal? | Yes | Yes (it's just a host folder) | No — lost on container stop |
| Best for | Databases, persistent app data | Local dev, sharing host files | Sensitive/temporary data |
| Portable across environments? | Yes | No (depends on host path existing) | N/A |

### Common Volume Commands
```bash
docker volume ls              # list volumes
docker volume inspect mydata  # inspect volume details
docker volume rm mydata       # remove a volume
docker volume prune           # remove all unused volumes
```

### 🎯 Interview Questions
- Q: Why are volumes generally preferred over bind mounts in production?
  → *A: Volumes are portable (they don't depend on a specific host directory structure existing), fully managed by Docker (easier backup/migration), and decoupled from the host filesystem layout.*
- Q: If you remove a container that used a volume, does the data disappear?
  → *A: No — volumes exist independently of containers; the data persists until you explicitly remove the volume itself.*
- Q: When would you use a `tmpfs` mount instead of a volume?
  → *A: When you need temporary, sensitive, or high-speed data that should never be written to disk and should disappear when the container stops (e.g., secrets, cache).*

---

<a name="11"></a>
## 11. Environment Variables, Args & Secrets

### Environment Variables (`ENV` / `-e`)
Used to pass **runtime configuration** into a container without hardcoding it into the image.

```dockerfile
ENV DATABASE_URL=localhost:5432
```
```bash
docker run -e DATABASE_URL=prod-db:5432 myapp
docker run --env-file .env myapp   # load multiple vars from a file
```

### Build Arguments (`ARG`)
Only available **during the image build**, not at container runtime.
```dockerfile
ARG VERSION=1.0
RUN echo "Building version $VERSION"
```
```bash
docker build --build-arg VERSION=2.0 -t myapp .
```

### ENV vs ARG

| | `ENV` | `ARG` |
|---|---|---|
| Available at build time? | Yes | Yes |
| Available at runtime (in container)? | Yes | **No** |
| Overridable at `docker run`? | Yes, with `-e` | N/A (it doesn't exist at runtime) |

### Secrets (Sensitive Data)
**⚠️ Never** hardcode passwords/API keys in a Dockerfile or `ENV` — they get baked into the image layers and are visible via `docker history` or `docker inspect`.

**Better approaches:**
- Docker **secrets** (in Swarm mode) — encrypted, only mounted into containers that need them.
- External secret managers (AWS Secrets Manager, HashiCorp Vault).
- `.env` files kept **out of version control** (`.gitignore`), loaded at runtime.

### 🎯 Interview Questions
- Q: Why shouldn't you put a password directly in a Dockerfile using `ENV`?
  → *A: It gets permanently baked into the image layer, visible to anyone who can inspect the image (`docker history`) — a serious security risk.*
- Q: Can you access an `ARG` variable while the container is running?
  → *A: No — `ARG` values only exist during the image build process, not inside the running container.*

---

<a name="12"></a>
## 12. Docker Compose — Multi-Container Apps

### Definition
**Docker Compose** is a tool for defining and running **multi-container** Docker applications using a single YAML configuration file (`docker-compose.yml`).

### Why Use It
Real applications rarely run in a single container — you typically need a web app + database + cache + etc. Compose lets you define **all of them together**, with networking and dependencies handled automatically.

### Example `docker-compose.yml`
```yaml
version: "3.9"

services:
  web:
    build: .
    ports:
      - "3000:3000"
    environment:
      - NODE_ENV=production
    depends_on:
      - db
    volumes:
      - .:/app

  db:
    image: mongo:6
    volumes:
      - dbdata:/data/db
    ports:
      - "27017:27017"

volumes:
  dbdata:
```

### Key Compose Commands
```bash
docker compose up             # create and start all services
docker compose up -d          # start in detached mode
docker compose down           # stop and remove containers, networks
docker compose build          # rebuild images
docker compose ps             # list running compose services
docker compose logs -f        # follow logs of all services
docker compose exec web bash  # exec into a specific service
```

### 🔑 Key Concepts
- **`services`**: each service = one container definition.
- **`depends_on`**: controls startup **order** (does NOT wait for the app inside to be "ready", just that the container has started).
- Compose automatically creates a shared network so services can talk to each other by **service name** (e.g., `web` connects to `db` via hostname `db`).

### 🎯 Interview Questions
- Q: Does `depends_on` guarantee that the dependent service is fully ready (e.g., database accepting connections)?
  → *A: No — it only guarantees the container has **started**, not that the application inside is ready. You often need retry logic or a healthcheck for true readiness.*
- Q: How do services in the same `docker-compose.yml` communicate with each other?
  → *A: Compose creates a shared default network, and services can reach each other using their service name as the hostname.*
- Q: What's the difference between `docker compose up` and `docker compose up -d`?
  → *A: Without `-d`, it runs in the foreground and streams logs to your terminal. With `-d`, it runs detached in the background.*

---

<a name="13"></a>
## 13. Docker Registry & Docker Hub

### Definition
A **Registry** is a storage and distribution system for Docker images. **Docker Hub** is the default, most popular public registry.

### Types
| Type | Example |
|---|---|
| Public Registry | Docker Hub |
| Private/Cloud Registry | AWS ECR, Google GCR, Azure ACR |
| Self-Hosted Registry | Harbor, self-hosted `registry` image |

### Common Commands
```bash
docker login                          # authenticate to a registry
docker pull <image>                   # download image
docker push <username>/<image>:<tag>  # upload image to registry
docker tag myapp:1.0 username/myapp:1.0   # tag before pushing
```

### 🎯 Interview Questions
- Q: Why would a company use a private registry instead of Docker Hub?
  → *A: For security (keeping proprietary images out of the public), compliance, faster internal pulls, and access control over who can pull/push images.*
- Q: What must you do before pushing an image to a specific registry/repo?
  → *A: Tag it correctly with the registry/username/repository format (e.g., `docker tag myapp username/myapp:1.0`) and log in with `docker login`.*

---

<a name="14"></a>
## 14. Multi-Stage Builds

### The Problem
A single build often needs heavy tools (compilers, build dependencies) that aren't needed at **runtime** — bloating the final image unnecessarily.

### The Solution
**Multi-stage builds** let you use multiple `FROM` statements in one Dockerfile — each stage can do its work, and only the final stage's output gets included in the final image.

### Example (Go application)
```dockerfile
# Stage 1: Build
FROM golang:1.21 AS builder
WORKDIR /app
COPY . .
RUN go build -o myapp

# Stage 2: Run (final, lightweight image)
FROM alpine:latest
WORKDIR /app
COPY --from=builder /app/myapp .
CMD ["./myapp"]
```

**🔑 Result:** The final image only contains the compiled binary + a minimal `alpine` base — not the entire Go compiler toolchain. This can shrink image sizes from **~1GB down to ~20MB**.

### 🎯 Interview Questions
- Q: Why use multi-stage builds instead of just cleaning up after installing build tools in one stage?
  → *A: Even if you delete build tools in the same stage, they still exist in earlier image layers (layers are immutable once created), bloating the image. Multi-stage builds physically exclude the entire build-stage's filesystem from the final image.*
- Q: What does `COPY --from=builder` do?
  → *A: Copies specific files from a previous named build stage (`builder`) into the current stage, without carrying over anything else from that stage.*

---

<a name="15"></a>
## 15. Docker Swarm — Orchestration Basics

### Definition
**Docker Swarm** is Docker's **native clustering and orchestration tool** — it lets you manage a cluster of Docker hosts (nodes) as a single virtual system, running and scaling containerized services across them.

### Key Concepts

| Term | Meaning |
|---|---|
| **Node** | A machine (physical/VM) participating in the swarm |
| **Manager Node** | Manages the cluster state, schedules tasks |
| **Worker Node** | Executes containers (tasks) assigned by managers |
| **Service** | The definition of a task to run (e.g., "run 5 replicas of nginx") |
| **Task** | A single running container, part of a service |

### Basic Commands
```bash
docker swarm init                          # initialize a swarm (become manager)
docker swarm join --token <token> <ip>     # join a node to the swarm
docker service create --replicas 3 -p 80:80 nginx   # create a scaled service
docker service scale myservice=5           # scale a service up/down
docker service ls                          # list services
docker node ls                             # list nodes in the swarm
```

**🔑 Note:** Docker Swarm is simpler than **Kubernetes** but less feature-rich; Kubernetes has become the dominant orchestration standard in most modern production environments, though Swarm is still valued for its simplicity.

### 🎯 Interview Questions
- Q: What's the difference between a manager node and a worker node?
  → *A: Manager nodes handle cluster state, scheduling, and orchestration decisions. Worker nodes simply execute the containers (tasks) assigned to them.*
- Q: How does Swarm compare to Kubernetes?
  → *A: Swarm is simpler to set up and use but has fewer advanced features (auto-scaling policies, richer scheduling, ecosystem tooling) compared to Kubernetes, which is the more widely adopted industry standard for large-scale orchestration.*

---

<a name="16"></a>
## 16. Docker Security Best Practices

1. **Use official/minimal base images** (e.g., `alpine` variants) — smaller attack surface.
2. **Never run containers as root** — use `USER` instruction in Dockerfile.
3. **Don't store secrets in images** — use secrets managers or runtime env injection.
4. **Scan images for vulnerabilities** (e.g., `docker scan`, Trivy, Snyk).
5. **Keep images updated** — rebuild regularly to pick up security patches.
6. **Use `.dockerignore`** to avoid leaking sensitive files (`.env`, `.git`, keys) into the build context.
7. **Limit container resources** (`--memory`, `--cpus`) to prevent one container from starving the host.
8. **Use read-only file systems** where possible (`--read-only` flag).
9. **Regularly prune unused images/containers/volumes** to reduce exposure surface.

```bash
docker run --user 1000:1000 myapp      # run as non-root user
docker run --memory=512m --cpus=1 myapp   # limit resources
docker run --read-only myapp           # read-only filesystem
```

### 🎯 Interview Questions
- Q: Why is running a container as `root` risky?
  → *A: If an attacker exploits the application inside the container, running as root gives them elevated privileges within (and potentially escaping) the container, increasing the blast radius of a compromise.*
- Q: What's the security risk of a large, non-minimal base image?
  → *A: More installed packages/tools mean a larger attack surface — more potential vulnerabilities to be exploited.*

---

<a name="17"></a>
## 17. Real-World Use Cases

| Use Case | Why Docker Helps |
|---|---|
| **Microservices Architecture** | Each service runs in its own container, independently deployable/scalable |
| **CI/CD Pipelines** | Consistent, reproducible build/test/deploy environments across all pipeline stages |
| **Local Development** | Spin up an entire dev environment (app + DB + cache) with one `docker compose up` |
| **Legacy App Modernization** | Package an old app + its exact dependencies into a container without touching the host system |
| **Cloud Migration** | Containers are portable across AWS, GCP, Azure, on-prem — reducing vendor lock-in |
| **Testing/QA Environments** | Spin up isolated, disposable environments for each test run, then tear them down |
| **Machine Learning** | Package specific library/CUDA versions needed for ML models, avoiding "dependency hell" |
| **Horizontal Scaling** | Easily run multiple identical container instances behind a load balancer |

### 🎯 Interview Questions
- Q: How does Docker specifically help in a microservices architecture?
  → *A: Each microservice can be packaged, deployed, scaled, and updated independently in its own container, without affecting other services — enabling true service isolation and independent lifecycle management.*
- Q: Why is Docker valuable in CI/CD pipelines?
  → *A: It guarantees the exact same environment is used for building, testing, and deploying — eliminating "it passed in CI but fails in production" type issues.*

---

<a name="18"></a>
## 18. Complete Command Cheat Sheet

```bash
# ── IMAGES ──
docker pull <image>                   # download image
docker build -t <name>:<tag> .        # build image from Dockerfile
docker images                         # list images
docker rmi <image>                    # remove image
docker tag <src> <target>             # tag an image
docker history <image>                # view image layers
docker save -o file.tar <image>       # export image to tar file
docker load -i file.tar               # import image from tar file

# ── CONTAINERS ──
docker run <image>                    # create + start container
docker run -d <image>                 # run detached
docker run -it <image> bash           # run interactive with terminal
docker run -p host:container <image>  # port mapping
docker run -v host:container <image>  # volume/bind mount
docker run --name <name> <image>      # custom container name
docker run --rm <image>               # auto-remove on stop
docker ps                             # list running containers
docker ps -a                          # list all containers
docker start/stop/restart <container> # lifecycle control
docker rm <container>                 # remove container
docker exec -it <container> bash      # shell into running container
docker logs -f <container>            # follow logs
docker inspect <container>            # metadata
docker stats                          # live resource usage
docker cp <src> <container>:<dest>    # copy files in/out

# ── NETWORKS ──
docker network ls
docker network create <name>
docker network inspect <name>
docker network connect <net> <container>
docker network rm <name>

# ── VOLUMES ──
docker volume ls
docker volume create <name>
docker volume inspect <name>
docker volume rm <name>
docker volume prune

# ── COMPOSE ──
docker compose up -d
docker compose down
docker compose build
docker compose logs -f
docker compose ps
docker compose exec <service> bash

# ── SYSTEM CLEANUP ──
docker system df                      # disk usage
docker system prune                   # remove unused data
docker system prune -a                # remove ALL unused images too
docker container prune                # remove stopped containers
docker image prune                    # remove dangling images
```

---

<a name="19"></a>
## 19. Troubleshooting Guide

| Problem | Likely Cause | Fix |
|---|---|---|
| `docker: command not found` | Docker not installed/not in PATH | Reinstall / check installation |
| Container exits immediately | Main process finished or crashed (no long-running foreground process) | Check `docker logs <container>`; ensure `CMD`/`ENTRYPOINT` runs a foreground process |
| `port is already allocated` | Another process/container is using that host port | Change the host port in `-p` mapping, or stop the conflicting process |
| Can't connect between containers | Containers on different/default networks (no DNS resolution) | Put them on the same **custom** network |
| Changes to code not reflecting | Using a volume that's out of sync, or forgot to rebuild image | Use a bind mount for dev, or `docker build` again |
| "No space left on device" | Too many unused images/containers/volumes accumulating | Run `docker system prune -a` |
| Permission denied errors inside container | Running as non-root user without proper file ownership | Adjust `USER`, file permissions, or ownership in Dockerfile |

### 🎯 Interview Questions
- Q: A container exits right after `docker run` with no error. What's the most likely cause?
  → *A: The container's main process (CMD/ENTRYPOINT) completed and exited — Docker containers only stay alive as long as their main process (PID 1) is running in the foreground.*
- Q: How do you check why a container is running out of disk space on the host?
  → *A: Run `docker system df` to see disk usage breakdown, then `docker system prune` to clean up unused images, containers, networks, and volumes.*

---

<a name="20"></a>
## 20. 🎯 Extra Mastery-Level Interview Questions

- Q: What is the difference between an **image** and a **container**, in one sentence?
  → *A: An image is a static, read-only blueprint; a container is a running, writable instance of that blueprint.*
- Q: How does Docker achieve isolation without a full guest OS?
  → *A: Using Linux kernel features — **namespaces** (isolate process views: PID, network, mount, etc.) and **cgroups** (control resource usage: CPU, memory limits).*
- Q: What is a "dangling image"?
  → *A: An image layer with no tag, usually left behind after rebuilding an image with the same tag (the old version becomes untagged/"dangling"). Clean up with `docker image prune`.*
- Q: If you change one line of application code, does Docker rebuild the entire image from scratch?
  → *A: No — thanks to layer caching, only the layer containing that changed file (and everything after it in the Dockerfile) gets rebuilt; earlier unchanged layers are reused from cache.*
- Q: Can a container run without an image?
  → *A: No — every container is created from an image; the image provides the filesystem and initial state.*
- Q: What happens if you don't specify a `CMD` or `ENTRYPOINT` in your Dockerfile?
  → *A: The container will use the base image's default `CMD`/`ENTRYPOINT` (if any); if none exists anywhere in the layer chain, running the container will fail with an error.*
- Q: Why is it recommended to run **one process per container**?
  → *A: It keeps containers simple, easier to scale/restart independently, and aligns with the microservices philosophy — mixing multiple unrelated processes in one container makes lifecycle management, logging, and scaling much harder.*

---

## 📌 One-Page Master Summary

- **Docker** = package an app + its environment into a portable **container** so it runs identically everywhere.
- **Containers vs VMs**: containers share the host kernel (lightweight, fast); VMs have their own full OS (heavy, slow).
- **Architecture**: Client → Daemon (`dockerd`) → manages Images/Containers/Networks/Volumes, pulls from **Registry**.
- **Image** = immutable blueprint (layers). **Container** = running writable instance of an image.
- **Dockerfile**: `FROM`, `WORKDIR`, `COPY`, `RUN`, `CMD`/`ENTRYPOINT`, `EXPOSE`, `ENV`, `ARG`, `VOLUME`, `USER`.
- **CMD** = overridable default command. **ENTRYPOINT** = fixed main process; args append to it.
- **Networking**: bridge (default, isolated), host (shares host network), custom bridge (name-based DNS between containers), overlay (multi-host).
- **Storage**: Volumes (Docker-managed, persistent, portable) > Bind mounts (host path, dev use) > tmpfs (RAM-only, sensitive/temp data).
- **ENV** available at build + runtime; **ARG** only at build time.
- **Docker Compose**: one YAML file to define & run multi-container apps; services talk to each other by name.
- **Multi-stage builds**: separate build tools from the final runtime image → much smaller final images.
- **Docker Swarm**: native orchestration — manager nodes schedule, worker nodes execute; simpler but less powerful than Kubernetes.
- **Security**: minimal base images, non-root user, no secrets in images, scan for vulnerabilities, limit resources.
- **Cleanup**: `docker system prune -a` reclaims disk space from unused images/containers/volumes.

---
*🔥 Master this file, and you'll be able to explain, build, debug, and optimize any Docker-based workflow with confidence.*