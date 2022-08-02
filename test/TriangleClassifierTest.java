import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangle222() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "Equilateral Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle223() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "Isosceles Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle345() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "Square Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle456() {
        int a = 4;
        int b = 5;
        int c = 6;

        String expected = "Normal Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle823() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "Not a Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle_121() {
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "Not a Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }

    @Test
    void testTriangle011() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "Not a Triangle";

        String actual = TriangleClassifier.classifyTriangle(a, b, c);

        assertEquals(expected, actual);
    }
}