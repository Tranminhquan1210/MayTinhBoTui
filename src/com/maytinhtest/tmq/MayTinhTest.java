package com.maytinhtest.tmq;

import java.util.Scanner;

import com.maytinh.tmq.XuLiMayTinh;

public class MayTinhTest {
	private static Scanner sc;
	private static int number1;
	private static int number2;

	public static void main(String[] args) {

		String chon;
		int ketqua = 0;
		System.out.println("Chào mừng đến với công cụ máy tính bỏ túi ");
		System.out.println("------------------------------------------");
		sc = new Scanner(System.in);
		extracted();

		XuLiMayTinh a = new XuLiMayTinh();

		System.out.println("Thực hiện phép toán tử +,-,*,/,%(Chia lấy phần dư),f(Chia lấy phần thập phân):");
		chon = sc.nextLine();

		switch (chon) {
		case "+":
			ketqua = a.tongnguyen(number1, number2);
			break;
		case "-":
			ketqua = a.trunguyen(number1, number2);
			break;
		case "*":
			ketqua = a.nhannguyen(number1, number2);
			break;
		case "/":
			try {
				ketqua = a.chia(number1, number2);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Gặp phải lỗi chia cho 0: " + e);
			}
		case "%":

			try {
				ketqua = a.chialaynguyen(number1, number2);
				break;
			} catch (ArithmeticException e) { // (2)
				System.out.println("Gặp phải lỗi chia cho 0: " + e);
			}
		case "f":
			try {
				float c = a.chialaydu(number1, number2);
				System.out.println("Đáp án chia dư là:" + c);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Gặp phải lỗi chia cho 0:" + e);
			}
			break;
		default: {
			System.out.println("Bạn nhập sai phép tính");

			break;
		}
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("Đáp án phép tính: %d %s %d = %d", number1, chon, number2, ketqua);

	}

	private static void extracted() {
		try {
			System.out.println("Nhập số A:");
			number1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập số B:");
			number2 = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			System.out.println("A và B phải là số");
			System.exit(0);
		}
	}
}