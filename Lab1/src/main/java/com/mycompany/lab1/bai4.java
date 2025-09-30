/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          System.out.print("Nguyễn Phạm Bảo Trân");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);
        if (delta < 0) {
            System.out.println("Delta âm -> không có căn delta thực.");
        } else {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        }
    }
}
