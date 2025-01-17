package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		//scanner 라는 이름의 Scanner 객체 생성
//		System.out.println("전화번호:");//텍스트
//	int number = scanner.nextInt();//입력 받기
//		System.out.println(String.format("%011d",number));
//		scanner.close();
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화번호:");
		String pNumber = scanner.nextLine();
		System.out.println(pNumber);
		String phonArray[] = pNumber.split("");

		if(phonArray.length != 11 ) {
			System.out.println("11자리를 입력하세요");
		}else {
			String finalNumber = phonArray[0]+phonArray[1]+ phonArray[2] + "-" + phonArray[3] + phonArray[4]+phonArray[5]+phonArray[6]+"-"+ phonArray[7]+phonArray[8]+phonArray[9]+phonArray[10];
			System.out.println(finalNumber);
		}
	}
}
