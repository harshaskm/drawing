package com.interview;

import static java.lang.System.*;

public class DrawOnScreen {

    public static String[][] createMatrix(int xaxis, int yaxis) {
        int horizontalBorder = 2;
        int modifiedYaxis = yaxis + horizontalBorder;
        int verticalBorder = 2;
        int modifiedXaxis = xaxis + verticalBorder;
        String[][] box = new String[modifiedYaxis][modifiedXaxis];
        int headerLine = 0;
        int footerLine = modifiedYaxis-1;

        box = initializeBox(box, modifiedYaxis, modifiedXaxis);

        for (int height = 0; height < modifiedYaxis; height++) {
            for (int width = 0; width < modifiedXaxis; width++) {
                if (height == headerLine || height == footerLine){
                    box[height][width] = "-";
                }

                if ((height > headerLine && height < footerLine) && (width == 0 || width == modifiedXaxis-1 )) {
                    box[height][width] = "|";

                }

                if ( (height > headerLine && height < footerLine) && (width > 0 && width < modifiedXaxis-1)) {
                    box[height][width] = " ";
                }
            }
        }

        return box;
    }

    public static String[][] initializeBox(String[][] box, int modifiedYaxis, int modifiedXaxis){
        String[][] initializedBox = box;

        for (int height = 0; height < modifiedYaxis; height++) {
            for (int width = 0; width < modifiedXaxis; width++) {
                box[height][width] = null;
            }
        }
        return initializedBox;
    }

    public static void print2DArray(String[][] box, int xaxis, int yaxis){
        int horizontalBorder = 2;
        int modifiedYaxis = yaxis + horizontalBorder;
        int verticalBorder = 2;
        int modifiedXaxis = xaxis + verticalBorder;
        String lineOut = new String("");

        for (int height = 0; height < modifiedYaxis; height++){
            for (int width = 0; width < modifiedXaxis; width++) {
                     lineOut += box[height][width];
            }
            lineOut += System.lineSeparator();
            System.out.println(lineOut);
            lineOut = "";
        }
    }
}
