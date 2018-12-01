import org.testng.Assert;
import org.testng.annotations.*;
import triangle.Triangle;

@Test()
public class PositiveTriangleTest {

    //-------Positives tests for checkTriangle() and getMessage()-------
    @Test(dataProvider = "ordinaryInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void checkOrdinaryTriangle(double a, double b, double c) {
        Triangle ordTr = new Triangle(a, b, c);
        boolean isValid = ordTr.checkTriangle();
        Assert.assertTrue(ordTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(ordTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "isoscelesInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void checkIsoscelesTriangle(double a, double b, double c) {
        Triangle isoTr = new Triangle(a, b, c);
        boolean isValid = isoTr.checkTriangle();
        System.out.println(isoTr.getMessage());
        Assert.assertTrue(isoTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(isoTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "equilateralInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void checkEquilateralTriangle(double a, double b, double c) {
        Triangle equiTr = new Triangle(a, b, c);
        boolean isValid = equiTr.checkTriangle();
        System.out.println(equiTr.getMessage());
        Assert.assertTrue(equiTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(equiTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "ordinaryRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void checkORectangularTriangle(double a, double b, double c) {
        Triangle oRecTr = new Triangle(a, b, c);
        boolean isValid = oRecTr.checkTriangle();
        System.out.println(oRecTr.getMessage());
        Assert.assertTrue(oRecTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(oRecTr.getMessage(), "", "Fail in getMessage()");
    }

    @Test(dataProvider = "isoscelesRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void checkIsoRectangularTriangle(double a, double b, double c) {
        Triangle isoRecTr = new Triangle(a, b, c);
        boolean isValid = isoRecTr.checkTriangle();
        System.out.println(isoRecTr.getMessage());
        Assert.assertTrue(isoRecTr.checkTriangle(), "Fail in checkTriangle()");
        Assert.assertEquals(isoRecTr.getMessage(), "", "Fail in getMessage()");
    }
    //-------End positives tests for checkTriangle() and getMessage()-------

    //-------Positives tests for DetectTriangle()-------
    @Test(dataProvider = "ordinaryInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void detectOrdinaryTriangle(double a, double b, double c) {
        Triangle ordTr = new Triangle(a, b, c);
        Assert.assertEquals(ordTr.detectTriangle(), PositiveTriangleTestData.TR_ORDYNARY, "Firstly check PosiriveTriangleTestData.class in case it has older fields values/ ");
    }

    @Test(dataProvider = "isoscelesInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void detectIsoscelesTriangle(double a, double b, double c) {
        Triangle isoTr = new Triangle(a, b, c);
        Assert.assertEquals(isoTr.detectTriangle(), PositiveTriangleTestData.TR_ISOSCELES, "Firstly check PosiriveTriangleTestData.class in case it has older fields values/ ");
    }

    @Test(dataProvider = "equilateralInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void detectEquilateralTriangle(double a, double b, double c) {
        Triangle equiTr = new Triangle(a, b, c);
        Assert.assertEquals(equiTr.detectTriangle(), PositiveTriangleTestData.TR_EQUILATERAL | PositiveTriangleTestData.TR_ISOSCELES, "Firstly check PosiriveTriangleTestData.class in case it has older fields values/ ");
    }

    @Test(dataProvider = "ordinaryRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void detectORectangularTriangle(double a, double b, double c) {
        Triangle oRecTr = new Triangle(a, b, c);
        Assert.assertEquals(oRecTr.detectTriangle(), PositiveTriangleTestData.TR_RECTANGULAR, "Firstly check PosiriveTriangleTestData.class in case it has older fields values/ ");
    }

    @Test(dataProvider = "isoscelesRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void detectIsoRectangularTriangle(double a, double b, double c) {
        Triangle isoRecTr = new Triangle(a, b, c);
        Assert.assertEquals(isoRecTr.detectTriangle(), PositiveTriangleTestData.TR_RECTANGULAR | PositiveTriangleTestData.TR_ISOSCELES, "Firstly check PosiriveTriangleTestData.class in case it has older fields values/ ");
    }
    //-------End positives tests for DetectTriangle()-------

    //-------Positives tests for getSquare()-------
    @Test(dataProvider = "ordinaryInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void getSquareOrdinaryTriangle(double a, double b, double c) {
        Triangle ordTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(ordTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "isoscelesInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void getSquareIsoscelesTriangle(double a, double b, double c) {
        Triangle isoTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(isoTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "equilateralInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void getSquareEquilateralTriangle(double a, double b, double c) {
        Triangle equiTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(equiTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "ordinaryRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void getSquareORectangularTriangle(double a, double b, double c) {
        Triangle oRecTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(oRecTr.getSquare(), expPrecise);
    }

    @Test(dataProvider = "isoscelesRectangularInputs", dataProviderClass = PositiveTriangleTestData.class)
    public void getSquareIsoRectangularTriangle(double a, double b, double c) {
        Triangle isoRecTr = new Triangle(a, b, c);
        double expPrecise = PreciseTriangleArea.calculate(a, b, c);
        Assert.assertEquals(isoRecTr.getSquare(), expPrecise);
    }
    //-------End positives tests for getSquare()-------

}
