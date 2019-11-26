package com.maytinh.tmq;

public class XuLiMayTinh {
	private float hieu;
	private int tongnguyen;
	private int sodu;

	public int tongnguyen(int a, int b) {
		return tongnguyen = a + b;
	}

	public int trunguyen(int a, int b) {
		return tongnguyen = a - b;
	}

	public int nhannguyen(int a, int b) {
		return tongnguyen = a * b;
	}

	public float chialaydu(int a, int b) {
		return hieu = (float) a / b;
	}

	public int chialaynguyen(int a, int b) {
		return sodu = a % b;
	}

	public int chia(int a, int b) {
		return sodu = a / b;
	}

}
