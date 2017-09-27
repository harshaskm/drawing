import com.interview.DrawOnScreen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDrawing {

    @Test
    public void printArrayLength(){
        String[][] box = DrawOnScreen.createMatrix(20, 4);
        DrawOnScreen.print2DArray(box,20,4);
        Assert.assertTrue(true);
    }

}
