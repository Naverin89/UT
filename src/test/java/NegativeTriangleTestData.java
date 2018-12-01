import org.testng.annotations.DataProvider;

public class NegativeTriangleTestData {

    @DataProvider(name = "inputsForNegativeTest")
    public Object[][] negGetSquareInputsValues() {
        return new Object[][]{
                {0, 4, 5},
                {3, 0, 5},
                {3, 4, 0},
                {3, 0, 0},
                {0, 4, 0},
                {0, 0, 5},
                {0, 0, 0},
                {-3, -4, -5},
                {-3, 0, 0},
                {0, -4, 0},
                {0, 0, -5},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {-Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE},
        };
    }
}
