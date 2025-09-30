/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
          // sinh viên code ở đây
          System.out.print("Nguyễn Phạm Bảo Trân");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double theTich1 = canh * canh * canh;
        double theTich2 = Math.pow(canh, 3);

        System.out.println("Thể tích (cách 1) = " + theTich1);
        System.out.println("Thể tích (cách 2) = " + theTich2);
    }
}
