package thirdPhone;

import java.util.Scanner;
import java.util.Vector;

import thirdPhone.Student;

public class Main {
	static Vector<Student> studentList;
	static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentList = new Vector<Student>();
		scanner = new Scanner(System.in);
		studentList.add(new Student("김가영", "010-0000-0001", "kgy@mju.ac.kr", "응소21"));
		studentList.add(new Student("김나영", "010-0000-0002", "kny@mju.ac.kr", "응소22"));
		studentList.add(new Student("김다영", "010-0000-0003", "kdy@mju.ac.kr", "응소23"));
		while (true) {
			show();
			userInfoInput();
		}
	}

	public static void show() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("연락처(" + studentList.size() + ")"
				+ "                                                                             추가(A) 삭제(D) 수정(M) 종료(X)  ");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		System.out.print("선택:");
	}

	public static void userInfoInput() {// 정보 입력 시작
		String input = scanner.nextLine();
		String fInput = convertToLowerCase(input);

		if (fInput.equals("x")) {
			exit();
		} else if (fInput.equals("a")) {
			add();
		} else if (fInput.equals("d")) {
			delete();
		} else if (fInput.equals("m")) {
			modify();
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void add() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("연락처 추가");
		System.out.print("\n이름:");
		String name = scanner.nextLine();
		System.out.print("전화번호:");
		String phonNumber = scanner.nextLine();
		System.out.print("이메일:");
		String email = scanner.nextLine();
		System.out.print("메모:");
		String memo = scanner.nextLine();
		System.out.println("아래 연락처를 추가하시겠습니까?(Y/N)");
		System.out.println(name + "  " + phonNumber + "  " + email + "  " + memo);
		System.out.print("입력:");
		String answer = scanner.nextLine();
		String fAnswer = answer.toLowerCase();
		if (answer.equals("n")) {
			System.out.println("연락처 등록이 취소되었습니다");
		} else if (answer.equals("y")) {
			studentList.add(new Student(name, phonNumber, email, memo));
		}
	}

	public static void delete() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("연락처 삭제");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		System.out.print("삭제할 연락처 인덱스 입력:");
		String pDelIndex = scanner.nextLine();
		int delIndex = Integer.parseInt(pDelIndex) - 1;
		String name = studentList.get(delIndex).getName();
		String phonNumber = studentList.get(delIndex).getMajor();
		String email = studentList.get(delIndex).getPn();
		String memo = studentList.get(delIndex).getMemo();
		System.out.println("아래 연락처를 삭제하시겠습니까?(Y/N)");
		System.out.println(name + "  " + phonNumber + "  " + email + "  " + memo);
		System.out.print("입력:");
		String yesNo = scanner.nextLine();
		String fyesNo = yesNo.toLowerCase();
		if (fyesNo.equals("n")) {
			System.out.println("연락처 삭제가 취소되었습니다");
		} else if (fyesNo.equals("y")) {
			studentList.remove(delIndex);
		}

	}

	public static void modify() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("연락처 수정");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		
		System.out.print("수정할 연락처 인덱스 입력:");
		String pModIndex = scanner.nextLine();
		int modIndex = Integer.parseInt(pModIndex) - 1;
		String ame = studentList.get(modIndex).getName();
		String honNumber = studentList.get(modIndex).getMajor();
		String mail = studentList.get(modIndex).getPn();
		String emo = studentList.get(modIndex).getMemo();
		System.out.println("아래 연락처를 수정하시겠습니까?(Y/N)");
		System.out.println(ame + "  " + honNumber + "  " + mail + "  " + emo);
		System.out.print("입력:");
		String yesNo = scanner.nextLine();
		String fyesNo = yesNo.toLowerCase();
		if (fyesNo.equals("n")) {
			System.out.println("연락처 수정이 취소되었습니다");
		} else if (fyesNo.equals("y")) {
			System.out.println("연락처 수정");
			System.out.print("이름:");
			String name = scanner.nextLine();
			System.out.print("전화번호:");
			String phonNumber = scanner.nextLine();
			System.out.print("이메일:");
			String email = scanner.nextLine();
			System.out.print("메모:");
			String memo = scanner.nextLine();
			studentList.get(modIndex).setName(name);
			studentList.get(modIndex).setMajor(phonNumber);
			studentList.get(modIndex).setPn(email);
			studentList.get(modIndex).setMemo(memo);
			System.out.println("연락처가 수정되었습니다");
		}

	}

	public static void exit() {
		System.out.println("종료:프로그램이 종료되었습니다.");
		System.exit(0);
	}

	public static String convertToLowerCase(String str) {
		return str.toLowerCase();
	}
}