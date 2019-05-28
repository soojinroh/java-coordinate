package calculator.domain.figure;

import calculator.domain.figure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author soojinroh
 * @version 1.0 2019-05-23
 */
public class RectangleTest {

    Figure rectangle;
    Coordinates coordinates;

    @BeforeEach
    void setUp() {
        coordinates = new Coordinates();
        coordinates.add(new Coordinate(0 ,0));
        coordinates.add(new Coordinate(10 ,0));
        coordinates.add(new Coordinate(0 ,10));
        coordinates.add(new Coordinate(10 ,10));
        rectangle = FigureFactory.create(coordinates);
    }

    @Test
    void create_생성_확인() {
        assertThat(rectangle).isEqualTo(FigureFactory.create(coordinates));
    }

    @Test
    void area_사각형_넓이_확인() {
        assertThat(rectangle.area()).isEqualTo(100.000,offset(0.00099));
    }

    @Test
    void checkRectangle_직사각형이_아닌_경우_확인() {
        Coordinates coordinatesException = new Coordinates();
        coordinatesException.add(new Coordinate(10,20));
        coordinatesException.add(new Coordinate(10,10));
        coordinatesException.add(new Coordinate(0,10));
        coordinatesException.add(new Coordinate(0,5));
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(coordinatesException);
        });

    }
}
