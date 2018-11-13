import org.testng.Assert;
import org.testng.annotations.Test;
import triangle.Triangle;

@Test()
public class PositiveTriangleTest {

    @Test()
    public void test() {
        boolean res = new Triangle(10, 10, 10).checkTriangle();
        assert(res);

    }

    @Test()
    public void squareTest(){
      double res = new Triangle(12, 8, 14).getSquare();
      double p = (12 + 8 + 14) / 2.0;
        double calc = Math.sqrt(p * (p - 12) * (p - 8) * (p - 14));

        Assert.assertEquals(calc,res);
    }
}
