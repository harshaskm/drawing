package com.interview;

import static java.lang.System.*;

public class DrawOnScreen {

    public static char[][] createMatrix(int xaxis, int yaxis) {
        int horizontalBorder = 2;
        int modifiedYaxis = yaxis + horizontalBorder;
        int verticalBorder = 2;
        int modifiedXaxis = xaxis + verticalBorder;
        char[][] box = new char[modifiedYaxis][modifiedXaxis];
        int headerLine = 0;
        int footerLine = modifiedYaxis-1;

        for (int height = 0; height < modifiedYaxis; height++) {
            for (int width = 0; width < modifiedXaxis; width++) {
                box[height][width] = ' ';
                if (height == headerLine || height == footerLine){
                    box[height][width] = '-';
                }

                if ((height > headerLine && height < footerLine) && (width == 0 || width == modifiedXaxis-1 )) {
                    box[height][width] = '|';

                }

                if ( (height > headerLine && height < footerLine) && (width > 0 && width < modifiedXaxis-1)) {
                    box[height][width] = ' ';
                }
            }
        }

        return box;
    }

    public static void print2DArray(char[][] box){

        for(char[] row : box) {
            for (char cell : row) {
                System.out.print(cell);
            }

            System.out.println();
        }
    }
}
