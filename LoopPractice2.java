package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice2 {
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		boolean flag = false;
		if (num>=2) {
			for (int i=2 ; i<num ; i++) {
				if (num%i==0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			} else {
				System.out.println("�Ҽ��Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			boolean flag = false;
			if (num>=2) {
				for (int i=2 ; i<num ; i++) {
					if (num%i==0) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				} else {
					System.out.println("�Ҽ��Դϴ�.");
					break;
				}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}

	//*****************��ǰ
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int count = 0;
		boolean flag = false;
		if (num>=2) {
			for(int i=2 ; i<num ; i++) {
				if (num%i==0) {
					flag = true;
					count++;
					break;
				} else {
					
				}
			}
			if (flag) {
				System.out.println("");
			} else {
				System.out.println("2���� "+num+"���� �Ҽ��� ������ "+(num-count-1)+"���Դϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	//*************************
	
	//*************************
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
	}
	//*************************
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String star = "";
		for (int i=0 ; i<num ; i++) {
			star = "";
			for (int j=0 ; j<=i ; j++) {
				star += "*";
			}
			System.out.printf("%4s",star);
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String star = "";
		for (int i=0 ; i<num ; i++) {
			star = "";
			for(int j=0 ; j<=i ; j++) {
				star += "*";
			}
			System.out.print(star);
			System.out.println();
		}
		for (int i=num-1 ; i>0 ; i--) {
			star = "";
			for (int j=0 ; j<i ; j++) {
				star += "*";
			}
			System.out.print(star);
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i=0 ; i<num ; i++) {
			for (int j=0 ; j<num ; j--) {
				
			}
		}
	}
}
