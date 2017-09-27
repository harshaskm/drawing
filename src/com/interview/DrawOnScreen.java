package com.interview;

public class DrawOnScreen {

    public static char[][] createCanvas(int xAxis, int yAxis, char symbol) {
        int horizontalBorder = 2;
        int modifiedYAxis = yAxis + horizontalBorder;
        int verticalBorder = 2;
        int modifiedXAxis = xAxis + verticalBorder;
        char[][] box = new char[modifiedYAxis][modifiedXAxis];
        int headerLine = 0;
        int footerLine = modifiedYAxis-1;

        initializeMatrix(modifiedYAxis, modifiedXAxis, box, headerLine, footerLine, symbol);

        return box;
    }


    private static void ifVacantInCanvas(int modifiedXAxis, char[][] box, int headerLine, int footerLine, int height, int width, char symbol) {
        if ( (height > headerLine && height < footerLine) && (width > 0 && width < modifiedXAxis-1)) {
            box[height][width] = ' ';
        }
    }

    private static void createPerimeter(int modifiedXAxis, char[][] box, int headerLine, int footerLine, int height, int width, char symbol) {
        if (height == headerLine || height == footerLine) {
            if (symbol != 'x') symbol = '-';
            box[height][width] = symbol;
        }

        if ((height > headerLine && height < footerLine) && (width == 0 || width == modifiedXAxis-1 )) {
            if (symbol != 'x') symbol = '|';
            box[height][width] = symbol;

        }
    }

    private static void initializeMatrix(int modifiedYAxis, int modifiedXAxis, char[][] box, int headerLine, int footerLine, char symbol) {
        for (int height = 0; height < modifiedYAxis; height++) {
            for (int width = 0; width < modifiedXAxis; width++) {

                createPerimeter(modifiedXAxis, box, headerLine, footerLine, height, width, symbol);
                ifVacantInCanvas(modifiedXAxis, box, headerLine, footerLine, height, width, symbol);
            }
        }
    }

    private static void drawHorizontalLineInCanvas(char[][] box, int xCoOrdinate, int yCoOrdinate, int lineLength, char symbol){
        if (symbol != 'x') symbol = '|';
        for (int xAxis=0; xAxis <= lineLength-1; xAxis++) {
            box[yCoOrdinate][xCoOrdinate + xAxis] = symbol;
        }
    }

    private static void drawVerticalLineInCanvas(char[][] box, int xCoOrdinate, int yCoOrdinate, int lineLength, char symbol){
        if (symbol != 'x') symbol = '|';
        for (int yAxis=0; yAxis <= lineLength-1; yAxis++) {
            box[yCoOrdinate + yAxis][xCoOrdinate] = symbol;
        }
    }

    public static char[][] drawLinesInCanvas(char[][] canvas, int firstXCoOrdinate, int firstYCoOrdinate, int secondXCoOrdinate, int secondYCoOrdinate, char symbol){
        int lineLength = (secondXCoOrdinate - firstXCoOrdinate)+1;
        int verticalLength = (secondYCoOrdinate - firstYCoOrdinate);
        if (firstYCoOrdinate == secondYCoOrdinate){
            drawHorizontalLineInCanvas(canvas, firstXCoOrdinate, firstYCoOrdinate, lineLength, symbol);
            drawVerticalLineInCanvas(canvas, firstXCoOrdinate, firstYCoOrdinate, verticalLength, symbol);
        }else{
            drawHorizontalLineInCanvas(canvas, firstXCoOrdinate, firstYCoOrdinate, lineLength, symbol);
            drawVerticalLineInCanvas(canvas, secondXCoOrdinate, secondYCoOrdinate, verticalLength, symbol);

        }
        return canvas;
    }

    public static char[][] mergeSmallBoxIntoCanvas(char[][] box, int firstXCoOrdinate, int firstYCoOrdinate, int secondXCoOrdinate, int secondYCoOrdinate, char symbol){
        char [][] canvas = box;
        int lineLength = (secondXCoOrdinate - firstXCoOrdinate)+1;
        int verticalLength = (secondYCoOrdinate - firstYCoOrdinate);
        drawHorizontalLineInCanvas(canvas, firstXCoOrdinate, firstYCoOrdinate, lineLength, symbol);
        drawHorizontalLineInCanvas(canvas, firstXCoOrdinate, secondYCoOrdinate, lineLength, symbol);
        drawVerticalLineInCanvas(canvas, firstXCoOrdinate, firstYCoOrdinate, verticalLength, symbol);
        drawVerticalLineInCanvas(canvas, secondXCoOrdinate, firstYCoOrdinate, verticalLength, symbol);

        return canvas;
    }

    public static void printCanvas(char[][] box){

        for(char[] row : box) {
            for (char cell : row) {
                System.out.print(cell);
            }

            System.out.println();
        }
    }
}
