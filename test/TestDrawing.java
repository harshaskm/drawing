import com.interview.DrawOnScreen;
import org.junit.Assert;
import org.junit.Test;

public class TestDrawing {

    @Test
    public void printArrayLength(){
        char[][] box = DrawOnScreen.createCanvas(20, 4);
        char[][] smallBox = DrawOnScreen.drawSmallerRectangle(14, 1, 18, 3); //This is in preparation for the small box (a rectangle)
//        DrawOnScreen.drawHorizontalLineInCanvas(box, 12, 1, 6);
//        DrawOnScreen.drawVerticalLineInCanvas(box, 16, 1, 3);
        DrawOnScreen.printCanvas(box);
        DrawOnScreen.printCanvas(smallBox);
        Assert.assertTrue(true);
    }

}
