public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Ponit2D p2a = new Ponit2D(1,2);
        System.out.println(p2a);
        Ponit2D p2b = new Ponit2D();
        System.out.println(p2b);
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("x is: "+ p2a.getX());
        System.out.println("y is: "+ p2a.getY());
        Point3D p3a = new Point3D(11,22,13);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);
        p3a.setX(3);
        p3b.setY(4);
        p3b.setZ(4);
        System.out.println(p3a);
        System.out.println("x is: "+ p3a.getX());
        System.out.println("y is: "+ p3a.getY());
        System.out.println("z is: "+ p3a.getZ());

    }
}
