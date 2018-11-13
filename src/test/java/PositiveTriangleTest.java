import org.testng.annotations.Test;
import triangle.Triangle;

@Test()
public class PositiveTriangleTest {

    @Test()
    public void test() {
        boolean res = new Triangle(10, 10, 10).checkTriangle();
        assert(res);

    }


}
