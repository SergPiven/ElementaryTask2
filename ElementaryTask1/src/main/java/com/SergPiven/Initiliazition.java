package com.SergPiven;

import java.util.Scanner;

public class Initiliazition {

    public static void run() {

        ChessBoard board = new ChessBoard();
        int value1 = 0, value2 = 0;
        String[] args = new String[0];

        if (args.length >= 1) {

            if (Double.parseDouble(args[0]) > 0 && Double.parseDouble(args[1]) > 0) {
                System.out.println(board.Board(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
            }
        } else {
            instruction.ContentsOfInstruction();

            try {
                System.out.println("Введите ширину шахматной доски");
                Scanner scanner = new Scanner(System.in);
                value1 = scanner.nextInt();
                System.out.println("Введите длину шахматной доски");
                value2 = scanner.nextInt();

            } catch (NumberFormatException exception) {
                System.err.println("Ошибка!!\nВведите правильный тип данных (double)");
            }
                if (value1 > 0 && value2 > 0) {
                    System.out.println(board.Board(value1, value2));
                }
            }
        }
    }

