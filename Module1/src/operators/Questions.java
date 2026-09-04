package operators;

public class Questions {


//    cal area of cube
//    area of parallalogram
//    cal surface area of sphere
//    cal surface area of cone
//    cal volume of cone
//    volume of cylinder
//    cal total surfacec are aof hemisphere
//    cal total surface area of cuboid
//    cal total surface area of cube
//    cal area of pentagone


}

class Cube{
    public static void main(String[] args) {
        double side = 15 ;
        double area = 6*side*side ;
        System.out.println("area of cube is" + area );


    }
}

class Parallalogram{
    public static void main(String[] args) {
    double base = 10.0 ;
    double  height = 10 ;
    double area = base * height ;
        System.out.println("area of Parallalogram is " + area );
    }
}
class Sphere{
    public static void main(String[] args) {
        double radius = 4.5 ;
        double area = 4 * 3.14 * radius*radius ;
//        4*3.14*r*r
        System.out.println("Area of Sphere is " + area);
    }
}

class SurfaceAreaCone{
    public static void main(String[] args) {
        double radius = 10.5 ;
        double area = 3.14 * radius * radius ;

        System.out.println("surface area of cone is  " + area);
//3.14 * r*r
    }
}

class VolumeCone{
    public static void main(String[] args) {
        double radius = 5.5 ;
        double height = 10.1 ;
        double volume = 1.0/3 * 3.14 * radius * radius * height  ;
        System.out.println("volume of cone is " + volume);
    }
}

class VolumeCyliner{
//    π r² h
public static void main(String[] args) {
    double radius = 7.5 ;
    double height = 7 ;
    double volume = 3.14 * radius * radius * height ;
    System.out.println("Volume of Cylinder is "  + volume);
}
}

class SurfaceAreaHemisphere{
    public static void main(String[] args) {
//2 * 3.14* r*r
    double radius = 7.5 ;
    double area = 2 * 3.14 * radius * radius ;

        System.out.println("Surface Area of hemispher is " + area);
    }

}

//    cal total surface area of cuboid
//    cal total surface area of cube
//    cal area of pentagone
class SurfaceAreaCuboid{
    public static void main(String[] args) {
        double l = 15 ;
    double w = 10 ;
    double h = 10 ;
        double area = 2*(l*w +l*h + h*w) ;
        System.out.println("surface area of cuboid is" + area );
    }
}
class SurfaceAreaCube{
    public static void main(String[] args) {
        double side = 15 ;
        double area = 6*side*side ;
        System.out.println(" surface area of cube is" + area );
    }
}
class SurfaceAreaPentagone{
    public static void main(String[] args) {
double side = 15 ;
double area =1.720477 * side * side ;
        System.out.println("Area of pentagone is " +  area);
    }
}