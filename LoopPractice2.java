package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice2 {
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
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
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 : ");
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
					System.out.println("소수가 아닙니다.");
					break;
				} else {
					System.out.println("소수입니다.");
					break;
				}
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}

	//*****************못품
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
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
				System.out.println("2부터 "+num+"까지 소수의 개수는 "+(num-count-1)+"개입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	//*************************
	
	//*************************
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
	}
	//*************************
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
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
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i=0 ; i<num ; i++) {
			for (int j=0 ; j<num ; j--) {
				
			}
		}
	}
}
