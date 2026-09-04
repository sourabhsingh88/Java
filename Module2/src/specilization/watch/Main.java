package specilization.watch;

public class Main {
    public static void main(String[] args) {
        FastTrack f1 = new FastTrack("ikno", "black", 1500);
        FastTrack f2 = new FastTrack("ikno", "white", 3500);
        FastTrack f3 = new FastTrack("ikno", "grey", 1500);

        Titan t1 = new Titan("tit 1", "black", 2500);
        Titan t2 = new Titan("tit 2", "black", 1700);
        Titan t3 = new Titan("tit 3 ", "white", 1500);

        Sonata s1 = new Sonata("son 1", "white", 2500);
        Sonata s2 = new Sonata("son 2", "black", 3300);
        Sonata s3 = new Sonata("son 3", "brown", 7500);
        Watch[] w = {f1, f2, f3, t1, t2, t3, s1, s2, s3};

        for (int i = 0; i < w.length; i++) {
            w[i].display();
        }
                //================ Specilization ======================


        for (int i = 0; i < w.length; i++) {
            if (w[i] != null) {
                if (w[i] instanceof FastTrack) {
                    FastTrack f = (FastTrack) w[i];
                    f.fasttrackDetails();
                } else if (w[i] instanceof Titan) {
                    Titan t = (Titan) w[i];
                    t.titanDetails();
                } else {
                    Sonata s = (Sonata) w[i];
                    s.sonataDetails();
                }
            }
        }

    }
}
