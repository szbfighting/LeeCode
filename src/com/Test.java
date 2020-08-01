package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[1000][12];
        int n ;//输入行数
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                data[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i+7<n; i++) {
            double aver = average(data,i,i+7);
            System.out.println(""+(i+1)+"-"+(i+7+1)+":"+aver);
        }
    }

    private static double average(double[][] data, int i, int j) {
        double sum = 0;
        int count = 0;
        for (int k = i; k <=j ; k++) {
            for (int l = 0; l < data[k].length; l++) {
                sum+=data[k][l];
                count++;
            }
        }
        return sum/count;
    }
}
