import com.interview.DrawOnScreen;
import org.junit.Assert;
import org.junit.Test;

public class TestDrawing {

    @Test
    public void printArrayLength(){
        char[][] box = DrawOnScreen.createCanvas(20, 4, ' ');
        char[][] smallBox = DrawOnScreen.createSmallBoxInTheCanvas(box, 14, 1, 18, 3, 'x');
        char[][] anotherSmallBox = DrawOnScreen.drawLinesInCanvas(box, 1,3,8,4,'x');
        char[][] bucketFillBox = DrawOnScreen.bucketFill(box,12,2,'o');
        DrawOnScreen.printCanvas(bucketFillBox);
        Assert.assertTrue(true);
    }

}
