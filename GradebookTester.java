import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradebookTester {
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(50);
        g1.addScore(75);
        g1.addScore(90);

        g2.addScore(80);
        g2.addScore(60);
        g2.addScore(40);
    }

    @After
    public void tearDown() throws Exception {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        assertEquals("50.0 75.0 90.0", g1.toString().trim());
        assertEquals(3, g1.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(215, g1.sum(), 0.001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50, g1.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(165, g1.finalScore(), 0.001);
    }
}
