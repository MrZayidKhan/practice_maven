package example.com.maven_practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", Grade.Grade(90));
    }

    @Test
    public void testGradeABoundaries() {
        assertEquals("A", Grade.Grade(80));
        assertEquals("A", Grade.Grade(100));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", Grade.Grade(70));
    }

    @Test
    public void testGradeBBoundaries() {
        assertEquals("B", Grade.Grade(60));
        assertEquals("B", Grade.Grade(79));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", Grade.Grade(40));
    }

    @Test
    public void testGradeCBoundaries() {
        assertEquals("C", Grade.Grade(0));
        assertEquals("C", Grade.Grade(59));
    }

    @Test
    public void testInvalidMarksHigh() {
        assertEquals("Invalid marks", Grade.Grade(110));
    }

    @Test
    public void testInvalidMarksLow() {
        assertEquals("Invalid marks", Grade.Grade(-5));
    }
}