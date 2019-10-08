package com.SergPiven;

import javax.swing.*;
import java.awt.*;

public class ChessBoard {

    StringBuilder vertical = new StringBuilder();

    public String Board ( double width, double height){

        for (int i = 1; i <= height; i++) {//цикл на заполнение по выстоте

            for (int j = 1; j <= width+1; j++) {//цикл на заполнение по ширине

                if((i+j)%2==0){
                    vertical.append(' ');//условие если четное то пробел, другом случае "х'
                } else {
                    vertical.append('x');
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }
}