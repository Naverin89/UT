import org.testng.Assert;
import org.testng.annotations.*;
import triangle.Triangle;

public class NegativeTriangleTest {

    //-------Negative tests for checkTriangle() and getMessage()-------
    @Test(dataProvider = "inputsForNegativeTest", dataProviderClass = NegativeTriangleTestData.class)
    public void negCheckTriangle(double a, double b, double c) {
        Triangle negTriangle = new Triangle(a, b, c);

        boolean isValid = negTriangle.checkTriangle();

        Assert.assertFalse(isValid);

        if (a <= 0) {
            Assert.assertEquals(negTriangle.getMessage(), "a<=0");
            isValid = true;
        }
        if ((b <= 0) && (!isValid)) {
            Assert.assertEquals(negTriangle.getMessage(), "b<=0");
            isValid = true;
        }
        if ((c <= 0) && (!isValid)) {
            Assert.assertEquals(negTriangle.getMessage(), "c<=0");
            isValid = true;
        }
        if ((a + b <= c) && (!isValid)) {
            Assert.assertEquals(negTriangle.getMessage(), "a+b<=c");
            isValid = true;
        }
        if ((a + c <= b) && (!isValid)) {
            Assert.assertEquals(negTriangle.getMessage(), "a+c<=b");
            isValid = true;
        }
        if ((b + c <= a) && (!isValid)) {
            Assert.assertEquals(negTriangle.getMessage(), "b+c<=a");
        }
    }
    //-------End of negative tests for checkTriangle() and getMessage()-------

    //-------Negative tests for detectTriangle()-------
    @Test(expectedExceptions = Exception.class, dataProvider = "inputsForNegativeTest", dataProviderClass = NegativeTriangleTestData.class)
    public void negDetectTriangle(double a, double b, double c){
        Triangle negTriangle = new Triangle(a,b,c);
        negTriangle.detectTriangle();
    }
    //-------End of negative tests for detectTriangle()-------


    //-------Negative tests for getSquare()-------
    @Test(expectedExceptions = Exception.class, dataProvider = "inputsForNegativeTest", dataProviderClass = NegativeTriangleTestData.class)
    public void negGetSquareTriangle(double a, double b, double c) {
        Triangle negTr = new Triangle(a, b, c);
        negTr.getSquare();
    }
    //-------End of negative tests for getSquare()-------

}
