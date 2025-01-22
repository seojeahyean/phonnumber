package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<student> studentList = new Vector<>();
		
		while (true) {
		student newStudent = processUserInput();
		studentList.add(newStudent);
		for(int i=0; i < studentList.size();i++) {
			 int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			System.out.println(a+ " "+ n + " "+ m + " "+ p);
		}
		System.out.println("");
		}
	}

	public static student processUserInput() {
		Scanner scanner = new Scanner(System.in);
		boolean isSuccess = true;
		String a = "", b = "", c = "";

		do {

			System.out.print("이름, 과 및 학번, - 를 제외한 전화번호를 입력해주세요:");
			String information = scanner.nextLine();
			String x = "x";
			String bigX = "X";
			if (information.equals(x) || information.equals(bigX)) {// 입력받은 값이 x 일경우 프로그램이 종료되어야한다
				System.out.println("종료:프로그램이 종료되었습니다.");
				System.exit(0);
			}

			String[] infoArray = information.split(",");// 입력받은 값을 [이름, 과 및 학번, 전화번호]

			if (infoArray.length != 3) {// 반점을 제대로 찍지 않거나 이상하게 입력했을 때 예외처리
				System.out.println("경고:부정확한 입력입니다. 다시 입력하여주세요");
				continue;
			}
			String phonNumber = infoArray[2];// information에서 전화번호에 해당하는 부분
			String[] phonNumArray = phonNumber.split("");// 전화번호를 자릿수대로 나눔

			if (phonNumArray.length != 11) {// 전화번호의 길이가 부정확할 경우의 예외처리
				System.out.println("경고:전화번호의 입력이 잘못되었습니다.");
				continue;
			} else {
				System.out.println("정상적인 입력입니다");
				isSuccess = false;
			}
			a = infoArray[0];
			b = infoArray[1];
			c = infoArray[2];
		} while (isSuccess);

		return new student(a, b, c);
	}

}
