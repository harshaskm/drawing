import com.interview.DrawOnScreen;
import org.junit.Assert;
import org.junit.Test;

public class TestDrawing {

    @Test
    public void printArrayLength(){
        char[][] box = DrawOnScreen.createCanvas(20, 4);
        DrawOnScreen.drawHorizontalLineInCanvas(box, 1, 2, 6);
        DrawOnScreen.printCanvas(box);
        Assert.assertTrue(true);
    }

}
