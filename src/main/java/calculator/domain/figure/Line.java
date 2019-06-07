package calculator.domain.figure;

/**
 * @author soojinroh
 * @version 1.0 2019-05-22
 */
public class Line extends Figure {
    private final Coordinates coordinates;

    public Line(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public double area() {
        return super.straight(coordinates.get(0), coordinates.get(1));
    }
}
