/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          System.out.print("Nguyễn Phạm Bảo Trân");
         System.out.print("Nguyễn Phạm Bảo Trân");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu vi hình chữ nhật = " + chuVi);
        System.out.println("Diện tích hình chữ nhật = " + dienTich);
        System.out.println("Cạnh nhỏ nhất = " + canhNho);
    }
}
