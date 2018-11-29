import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import triangle.Triangle;

import javax.print.attribute.standard.PresentationDirection;
import java.math.BigDecimal;


@Test()
public class PositiveTriangleTest {

    //-------Positives tests for checkTriangle() and getMessage()-------
    @Test(dataProvider = "ordinaryInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void ordinaryTriangleCheck(double a, double b, double c) {
        Triangle ordTr = new Triangle(a, b, c);
        boolean isValid = ordTr.checkTriangle();
        Assert.assertTrue(ordTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(ordTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "isoscelesInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void isoscelesTriangleCheck(double a, double b, double c) {
        Triangle isoTr = new Triangle(a, b, c);
        boolean isValid = isoTr.checkTriangle();
        System.out.println(isoTr.getMessage());
        Assert.assertTrue(isoTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(isoTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "equilateralInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void equilateralTriangleCheck(double a, double b, double c) {
        Triangle equiTr = new Triangle(a, b, c);
        boolean isValid = equiTr.checkTriangle();
        System.out.println(equiTr.getMessage());
        Assert.assertTrue(equiTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(equiTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "ordinaryRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void oRectangularTriangleCheck(double a, double b, double c) {
        Triangle oRecTr = new Triangle(a, b, c);
        boolean isValid = oRecTr.checkTriangle();
        System.out.println(oRecTr.getMessage());
        Assert.assertTrue(oRecTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(oRecTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "isoscelesRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void isoRectangularTriangleCheck(double a, double b, double c) {
        Triangle isoRecTr = new Triangle(a, b, c);
        boolean isValid = isoRecTr.checkTriangle();
        System.out.println(isoRecTr.getMessage());
        Assert.assertTrue(isoRecTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(isoRecTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(enabled = false, dataProvider = "ordinaryInputs")
    public void areaTest(double fs, double sc, double tgr) {
        double res = new Triangle(fs, sc, tgr).getSquare();
        double exp = PreciseTriangleArea.calculate(fs, sc, tgr);
        Assert.assertEquals(res, exp);
    }
    //-------End positives tests for checkTriangle() and getMessage()-------


    //-------Positives tests for getSquare()-------
    @Test(dataProvider = "ordinaryInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void ordinaryTriangleSquareCheck(double a, double b, double c) {
        Triangle ordTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(ordTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "isoscelesInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void isoscelesTriangleSquareCheck(double a, double b, double c) {
        Triangle isoTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(isoTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "equilateralInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void equilateralTriangleSquareCheck(double a, double b, double c) {
        Triangle equiTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(equiTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "ordinaryRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void oRectangularTriangleSquareCheck(double a, double b, double c) {
        Triangle oRecTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(oRecTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "isoscelesRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void isoRectangularTriangleSquareCheck(double a, double b, double c) {
        Triangle isoRecTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(isoRecTr.getSquare(), expPrecise);
    }
    //-------End positives tests for getSquare()-------


}
