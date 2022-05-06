package com.example.googlepreperation;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> temp = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (true) {
            for (int i = left; i <= right; i++) temp.add(matrix[top][i]);
            top++;
            if (left > right || top > bottom) break;

            for (int i = top; i <= bottom; i++) temp.add(matrix[i][right]);
            right--;
            if (left > right || top > bottom) break;

            for (int i = right; i >= left; i--) temp.add(matrix[bottom][i]);
            bottom--;
            if (left > right || top > bottom) break;

            for (int i = bottom; i >= top; i--) temp.add(matrix[i][left]);
            left++;
            if (left > right || top > bottom) break;
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}


