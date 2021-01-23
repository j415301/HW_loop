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
				System.out.println(flag? "�Ҽ��� �ƴմϴ�." : "�Ҽ��Դϴ�");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		boolean flag = true;
		int primeNumberCount = 0;
		String primeNumber = "";
		if (num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			for (int i=2 ; i<=num ; i++) {
				flag = true;
				for (int j=2 ; j<i ; j++) {
					if(i%j==0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					primeNumberCount++;
					primeNumber += i + " ";
				}
			}
			System.out.println(primeNumber);
			System.out.println("2���� "+num+"���� �Ҽ��� ������ "+primeNumberCount+"�Դϴ�.");
		}
	}
	
	public void practice17_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		boolean flag = true;
		String primeNumber = "";
		int primeNumberCount = 0;
		if (num>=2) {
			for (int i=2 ; i<=num ; i++) {
				flag = true;
				for (int j=2 ; j<i ; j++) {
					if (i%j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					primeNumber += i + " ";
					primeNumberCount++;
				}
			}
			System.out.println(primeNumber);
			System.out.println("2���� "+num+"���� �Ҽ��� ������ "+primeNumberCount+"���Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int commonMultipleCount = 0;
		String commonMultiple = "";
		for (int i=2 ; i<=num ; i++) {
			if (i%2==0 || i%3==0) {
				commonMultiple += i + " ";
			}
			if (i%2==0 && i%3==0) {
				commonMultipleCount++;
			}
		}
		System.out.println(commonMultiple);
		System.out.println("count : "+commonMultipleCount);
	}
	
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
			for (int j=num-i-1 ; j>0 ; j--) {
				System.out.print(" ");
			}
			for (int j=0 ; j<i*2+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i=0 ; i<num ; i++) {
			if (i == 0) {
				System.out.println("*****");
			} else if (i == num-1) {
				System.out.println("*****");
			} else {
				System.out.println("*   *");
			}
		}
	}
}
