import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import triangle.Triangle;

@Test()
public class PositiveTriangleTest {

    private Triangle testTriangle;

    @DataProvider(name = "correctInputs")
    public Object[][]  correctInputsData(){
        return new Object[][]{
                {2.0, 5.0, 6.0},
                {0.002,0.005,0.006},
                {200000.0,500000.0,600000.0},
                {200000.02,500000.02,600000.2}
        };
    }

    @Test(dataProvider = "correctInputs")
        public void test(Double frst,Double scnd,Double thrd) {
        testTriangle = new Triangle(frst,  scnd, thrd);
        boolean res = testTriangle.checkTriangle();
        assert(res);

    }

    @Test()
    public void squareTest(){
      double res = new Triangle(12, 8, 14).getSquare();
      double p = (12 + 8 + 14) / 2.0;
        double calc = Math.sqrt(p * (p - 12) * (p - 8) * (p - 14));

        Assert.assertEquals(calc,res);
    }

    @Test(expectedExceptions = Exception.class)
    public void squareTestMaxVal(){
        double max = Double.MAX_VALUE;
        double res = new Triangle(max,max,max ).getSquare();

        double p = (max + max + max) / 2.0;
        double calc = Math.sqrt(p * (p - max) * (p - max) * (p - max));
        Assert.assertEquals(calc,res);
    }
}
