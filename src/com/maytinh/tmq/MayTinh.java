package com.maytinh.tmq;

import java.util.Scanner;

public class MayTinh {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		String chon;
		int ketqua = 0;

		// TODO Auto-generated method stub
		System.out.println("Chào mừng đến với công cụ máy tính bỏ túi ");
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
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

		XuLiMayTinh a = new XuLiMayTinh();
		System.out.println("Thực hiện phép toán tử +,-,*,/,%(Chia lấy phần dư),f(Chia lấy phần thập phân):");
		System.out.println("Lựa chọn phép tính bạn muốn thực hiện:");

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
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0");

			} else {
				ketqua = a.chia(number1, number2);
			}
			break;
		case "%":
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0");
				System.exit(0);
			} else {
				ketqua = a.chialaynguyen(number1, number2);
			}
			break;
		case "f":
			if (number2 == 0) {
				System.out.println("Không thể nhập mẫu bằng 0");
				System.exit(0);
			} else {

				float c = a.chialaydu(number1, number2);
				System.out.println("Đáp án chia dư là:" + c);
				System.exit(0);
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

}
