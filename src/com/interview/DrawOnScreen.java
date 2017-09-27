package com.interview;

public class DrawOnScreen {

    public static char[][] createCanvas(int xAxis, int yAxis) {
        int horizontalBorder = 2;
        int modifiedYAxis = yAxis + horizontalBorder;
        int verticalBorder = 2;
        int modifiedXAxis = xAxis + verticalBorder;
        char[][] box = new char[modifiedYAxis][modifiedXAxis];
        int headerLine = 0;
        int footerLine = modifiedYAxis-1;

        fillMatrix(modifiedYAxis, modifiedXAxis, box, headerLine, footerLine);

        return box;
    }


    private static void ifVacantInCanvas(int modifiedXAxis, char[][] box, int headerLine, int footerLine, int height, int width) {
        if ( (height > headerLine && height < footerLine) && (width > 0 && width < modifiedXAxis-1)) {
            box[height][width] = ' ';
        }
    }

    private static void ifBorderCoOrdinates(int modifiedXAxis, char[][] box, int headerLine, int footerLine, int height, int width) {
        if (height == headerLine || height == footerLine){
            box[height][width] = '-';
        }

        if ((height > headerLine && height < footerLine) && (width == 0 || width == modifiedXAxis-1 )) {
            box[height][width] = '|';

        }
    }

    private static void fillMatrix(int modifiedYAxis, int modifiedXAxis, char[][] box, int headerLine, int footerLine) {
        for (int height = 0; height < modifiedYAxis; height++) {
            for (int width = 0; width < modifiedXAxis; width++) {
                box[height][width] = ' ';

                ifBorderCoOrdinates(modifiedXAxis, box, headerLine, footerLine, height, width);
                ifVacantInCanvas(modifiedXAxis, box, headerLine, footerLine, height, width);
            }
        }
    }

    public static void drawHorizontalLineInCanvas(char[][] box, int xCoOrdinate, int yCoOrdinate, int lineLength){
        for (int xAxis=0; xAxis <= lineLength-1; xAxis++) {
            box[yCoOrdinate][xCoOrdinate + xAxis] = 'x';
        }
    }

    public static void drawVerticalLineInCanvas(char[][] box, int xCoOrdinate, int yCoOrdinate, int lineLength){
        for (int yAxis=0; yAxis <= lineLength-1; yAxis++) {
            box[yCoOrdinate + yAxis][xCoOrdinate] = 'x';
        }
    }

    public static char[][] drawSmallerRectangle(int firstXCoOrdinate, int firstYCoOrdinate, int secondXCoOrdinate, int secondYCoOrdinate){
        int xAxis = (secondXCoOrdinate - firstXCoOrdinate)-1;
        int yAxis = (secondYCoOrdinate - firstYCoOrdinate)-1;
        char[][] smallBox = createCanvas(xAxis, yAxis);

        return smallBox;
    }

//    public static char[][] mergeSmallBoxIntoCanvas(char[][] canvas, char[][] smallBox){
//        null;
//    }

    public static void printCanvas(char[][] box){

        for(char[] row : box) {
            for (char cell : row) {
                System.out.print(cell);
            }

            System.out.println();
        }
    }
}
