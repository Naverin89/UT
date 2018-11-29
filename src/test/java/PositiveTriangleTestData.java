import org.testng.annotations.DataProvider;

public class PositiveTriangleTestData {

    @DataProvider(name = "ordinaryInputs")
    public Object[][] ordinaryInputsValues() {
        return new Object[][]{
                {0.00003, 0.00005, 0.00006},
                {5, 6, 3},
                {600.0, 500.0, 300.0},
                {3000000.3, 6000000.6, 5000000.5}
        };
    }
    @DataProvider(name = "isoscelesInputs")
    public Object[][] isoscelesInputsValues() {
        return new Object[][]{
                {0.00005, 0.00003, 0.00003},
                {5, 6, 5},
                {600.0, 600.0, 500.0},
                {5000000.5, 3000000.3, 5000000.5}
        };
    }
    @DataProvider(name = "equilateralInputs")
    public Object[][] equilateralInputsValues() {
        return new Object[][]{
                {0.00003, 0.00003, 0.00003},
                {5, 5, 5},
                {600.0, 600.0, 600.0},
                {3000000.3, 3000000.3, 3000000.3}
        };
    }
    @DataProvider(name = "ordinaryRectangularInputs")
    public Object[][] ordinaryRectangularInputsValues() {
        return new Object[][]{
                {0.00003, 0.00005, Math.sqrt((0.00003 * 0.00003) + (0.00005 * 0.00005))},
                {Math.sqrt((6 * 6) + (5 * 5)), 6, 5},
                {300.0, Math.sqrt((300.0 * 300.0) + (600.0 * 600.0)), 600.0},
                {5000000.5, Math.sqrt((5000000.5 * 5000000.5) + (3000000.3 * 3000000.3)), 3000000.3}
        };
    }
    @DataProvider(name = "isoscelesRectangularInputs")
    public Object[][] isoscelesRectangularInputsValues() {
        return new Object[][]{
                {0.00006, 0.00006, Math.sqrt((0.00006 * 0.00006) * 2)},
                {Math.sqrt((5 * 5) * 2), 5, 5},
                {300.0, Math.sqrt((300.0 * 300.0) * 2), 300.0},
                {Math.sqrt((3000000.3 * 3000000.3) * 2), 3000000.3, 3000000.3}
        };
    }
}
