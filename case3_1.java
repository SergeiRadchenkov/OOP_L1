public class case3_1 {
    public static void main(String[] args) {
        case3 a = new case3(0, 2);
        a.setX(12);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.getInfo());

        case3 b = new case3(10);
        System.out.println(b);
        
        var dis = case3.distance(a, b);
        System.out.println(dis);
    }
}
