package calculator.domain;

/**
 * @author heebg
 * @version 1.0 2019-05-22
 */
public class LineCalculate extends Shape implements ShapeCalculate {
    private final Points points;

    public LineCalculate(Points points) {
        super("직선", "거리");
        this.points = points;
    }

    @Override
    public double calculate() {
        Point a = points.get(0);
        Point b = points.get(1);
        return Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY() - b.getY(),2));
    }
}
