/**
 * Это точка 2D
 */

public class case3 {
    private int x, y;

    /**
     * Это конструктор
     * @param valueX координата X
     * @param valueY координата Y
     */
    public case3(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public case3(int value) {
        this(value, value);
    }

    public case3() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(case3 a, case3 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
     }
}
