/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brightvending;

/**
 *
 * @author User // Resource get from https://stackoverflow.com/questions/22377447/java-multidimensional-array-to-string-and-string-to-array/22428926#22428926
 * Author: Akhilesh Dhar Dubey
 * Date Mar 15, 2014
 */
import java.util.*;

public class DeepToArray {

public static void main(String[] args) {

    int row, col;
    row = 2;
    col = 3;
    String[][] in = new String[row][col];

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            in[i][j] = i + " " + j;
        }
    }
    String str = Arrays.deepToString(in);

    System.out.println(str);

    String[][] out = stringToDeep(str);

    for (String s2[] : out) {
        for (String s3 : s2) {
            System.out.print(s3 + "  ");
        }
        System.out.println();
    }
}

    public static String[][] stringToDeep(String str) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                row++;
            }
        }
        row--;
        for (int i = 0;; i++) {
            if (str.charAt(i) == ',') {
                col++;
            }
            if (str.charAt(i) == ']') {
                break;
            }
        }
        col++;

        String[][] out = new String[row][col];

        str = str.replaceAll("\\[", "").replaceAll("\\]", "");

        String[] s1 = str.split(", ");

        int j = -1;
        for (int i = 0; i < s1.length; i++) {
            if (i % col == 0) {
                j++;
            }
            out[j][i % col] = s1[i];
            //System.out.println(s1[i] + "\t" + j + "\t" + i % col);
        }
        return out;
    }
}
