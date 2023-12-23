public class case2_1 {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(case2 a, case2 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        case2 a = new case2();
        a.x = 0;
        a.y = 2;
        System.out.println(a.toString());

        case2 b = new case2();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());

        System.out.println(distance(a, b));
    }
}