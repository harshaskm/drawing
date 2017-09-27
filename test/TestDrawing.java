import com.interview.DrawOnScreen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDrawing {

    @Test
    public void printArrayLength(){
        char[][] box = DrawOnScreen.createMatrix(20, 4);
        DrawOnScreen.print2DArray(box);
        Assert.assertTrue(true);
    }

}
