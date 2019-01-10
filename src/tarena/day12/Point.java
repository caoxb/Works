package tarena.day12;

public class Point {
    private int x;
    private int y;

    public Point() {
        super();
    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /* 重写 hashCode 方法
     * 使用 x、y 属性进行运算，产生一个哈希值，
     * 使得具有相同 x,y 值的 Point 实例，
     * 可以得到相同的哈希值，
     * 而不同 x,y 值的 Point 实例，
     * 尽量得到不同的哈希值
     */
    public int hashCode() {
        // 一种常用hashCode算法,
        // 可尽量产生不同的哈希值
        final int prime = 31; // 11111, 1111111
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Point)) return false;

        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }
}




