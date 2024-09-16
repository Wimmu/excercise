import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    App app = new App();
    
    @Test
    public void testAddMe() {
        assertEquals(5, app.addMe(2, 3), 0.0001);
    }

    @Test
    public void testSubtractMe() {
        assertEquals(2, app.subtractMe(5, 3), 0.0001);
    }
    
    @Test
    public void testMultiplyMe() {
        assertEquals(6, app.multiplyMe(2, 3), 0.0001);
    }
}
