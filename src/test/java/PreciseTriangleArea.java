import java.math.BigDecimal;

public class PreciseTriangleArea {

    public static double calculate(Double a, Double b, Double c) {
        BigDecimal aSide = new BigDecimal(a);
        BigDecimal bSide = new BigDecimal(b);
        BigDecimal cSide = new BigDecimal(c);
        BigDecimal semiPerimeter = aSide.add(bSide).add(cSide).divide(new BigDecimal(2));
        BigDecimal quad = semiPerimeter.multiply((
                semiPerimeter.subtract(aSide)).
                multiply((semiPerimeter.subtract(bSide))).
                multiply(semiPerimeter.subtract(cSide)
                ));

        return Math.sqrt(Double.valueOf(quad.toString()));
    }

}
