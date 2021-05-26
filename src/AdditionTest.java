import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    private final Addition addition = new Addition();

    @Test
    void calculateSum() {
        assertEquals(10, addition.sum(3,7),0.00);
        assertEquals(8, addition.sum(5.5,2.5),0.00);
    }
}