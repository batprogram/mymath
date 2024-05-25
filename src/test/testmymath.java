import org.junit.Test;
import static org.junit.Assert.*;

public class mymathtest {

    @Test
    public void testAdd() {
        // Arrange
        int a = 3;
        int b = 7;
        MyMath myMath = new mymath();

        // Act
        int result = mymath.add(a, b);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        int a = 10;
        int b = 5;
        MyMath myMath = new mymath();

        // Act
        int result = mymath.subtract(a, b);

        // Assert
        assertEquals(5, result);
    }
}