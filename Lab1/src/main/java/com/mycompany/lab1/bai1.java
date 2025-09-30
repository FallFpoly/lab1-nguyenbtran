/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        // sinh viên code ở đây
        System.out.print("Nguyễn Phạm Bảo Trân");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f điểm", hoTen, diemTB);
    }
}
