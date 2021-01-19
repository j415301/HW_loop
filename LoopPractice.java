package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num>=1) {
			for (int i=1 ; i<=num ; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num>=1) {
			for (int i=1 ; i<=num ; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num2 = sc.nextInt();
			for (int i=1 ; i<=num2 ; i++) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num>=1) {
			for (int i=num ; i>=1 ; i--) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num>=1) {
			for (int i=num ; i>=1 ; i--) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num2 = sc.nextInt();
			for (int i=num2 ; i>=1 ; i--) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1 ; i<=num ; i++) {
			sum += i;
			if (i!=num) {
				System.out.print(i+" + ");
			} else {
				System.out.println(i+" = "+sum);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num1>0 && num2>0) {
			if (num1>num2) {
				for (int i=num2 ; i<=num1 ; i++) {
					System.out.print(i+" ");
				} 
			} else if (num2>num1) {
				for (int i=num1 ; i<=num2 ; i++) {
					System.out.print(i+" ");
				}
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num1>0 && num2>0) {
			if (num1>num2) {
				for (int i=num2 ; i<=num1 ; i++) {
					System.out.print(i+" ");
				} 
			} else if (num2>num1) {
				for (int i=num1 ; i<=num2 ; i++) {
					System.out.print(i+" ");
				}
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			int num3 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num4 = sc.nextInt();
			if (num3>0 && num4>0) {
				if (num3>num4) {
					for (int i=num4 ; i<=num3 ; i++) {
						System.out.print(i+" ");
					} 
				} else if (num4>num3) {
					for (int i=num3 ; i<=num4 ; i++) {
						System.out.print(i+" ");
					}
				} else {
					System.out.println("");
				}
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("===== "+num+"단 =====");
		for (int i=1; i<10 ; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num<=9) {
			for (int i=num; i<10 ; i++) {
				System.out.println("===== "+i+"단 =====");
				for (int i2=1, i3=0 ; i2<10 && i3<10 ; i2++, i3++ ) {
					System.out.println(i+" * "+i2+" = "+i*i2);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num<=9) {
			for (int i=num; i<10 ; i++) {
				System.out.println("===== "+i+"단 =====");
				for (int i2=1, i3=0 ; i2<10 && i3<10 ; i2++, i3++ ) {
					System.out.println(i+" * "+i2+" = "+i*i2);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			System.out.print("숫자 : ");
			int num2 = sc.nextInt();
			if (num2<=9) {
				for (int i=num2; i<10 ; i++) {
					System.out.println("===== "+i+"단 =====");
					for (int i2=1, i3=0 ; i2<10 && i3<10 ; i2++, i3++ ) {
						System.out.println(i+" * "+i2+" = "+i*i2);
					}
				}
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int stnum = sc.nextInt();
		System.out.print("공차 : ");
		int allo = sc.nextInt();
		for (int i=0 ; i<10 ; i++) {
			if (i==0) {
				System.out.print(stnum+" ");
			} else {
				stnum += allo;
				System.out.print(stnum+" ");
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			switch (op) {
				case "+":
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case "-":
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case "*":
					System.out.println(num1+" * "+num2+" = "+num1*num2);
					break;
				case "/":
					if (num2>0) {
						System.out.println(num1+" / "+num2+" = "+num1/num2);
					} else {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
						continue;
					}
					break;
				case "%":
					System.out.println(num1+" % "+num2+" = "+num1%num2);
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
					continue;
			} break;
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String star = "*";
		for (int i=0 ; i<num ; i++) {
			System.out.println(star);
			star += "*";
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		for (int i=num ; i>0 ; i--) {
			for (int j=0 ; j<i ; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
