public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {

        boolean isTriangle = (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b);
        boolean isEquilateralTriangle = (a == b && b == c);
        boolean isSquareTriangle = (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
        boolean isIsoscelesTriangle = (a == b || b == c || c == a);
        boolean isIsoscelesSquareTriangle = isSquareTriangle && isIsoscelesTriangle;

        if (isTriangle) {
            if (isEquilateralTriangle) {
                return "Equilateral Triangle";
            } else {
                if (isIsoscelesSquareTriangle) {
                    return "Isosceles Square Triangle";
                } else if (isSquareTriangle) {
                    return "Square Triangle";
                } else if (isIsoscelesTriangle) {
                    return "Isosceles Triangle";
                } else {
                    return "Normal Triangle";
                }
            }
        } else {
            return "Not a Triangle";
        }
    }

}
