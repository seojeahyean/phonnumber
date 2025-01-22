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
		studentList.add(new Student("�谡��", "010-0000-0001", "kgy@mju.ac.kr", "����21"));
		studentList.add(new Student("�質��", "010-0000-0002", "kny@mju.ac.kr", "����22"));
		studentList.add(new Student("��ٿ�", "010-0000-0003", "kdy@mju.ac.kr", "����23"));
		while (true) {
			show();
			userInfoInput();
		}
	}

	public static void show() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("����ó(" + studentList.size() + ")"
				+ "                                                                             �߰�(A) ����(D) ����(M) ����(X)  ");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		System.out.print("����:");
	}

	public static void userInfoInput() {// ���� �Է� ����
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
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public static void add() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("����ó �߰�");
		System.out.print("\n�̸�:");
		String name = scanner.nextLine();
		System.out.print("��ȭ��ȣ:");
		String phonNumber = scanner.nextLine();
		System.out.print("�̸���:");
		String email = scanner.nextLine();
		System.out.print("�޸�:");
		String memo = scanner.nextLine();
		System.out.println("�Ʒ� ����ó�� �߰��Ͻðڽ��ϱ�?(Y/N)");
		System.out.println(name + "  " + phonNumber + "  " + email + "  " + memo);
		System.out.print("�Է�:");
		String answer = scanner.nextLine();
		String fAnswer = answer.toLowerCase();
		if (answer.equals("n")) {
			System.out.println("����ó ����� ��ҵǾ����ϴ�");
		} else if (answer.equals("y")) {
			studentList.add(new Student(name, phonNumber, email, memo));
		}
	}

	public static void delete() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("����ó ����");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		System.out.print("������ ����ó �ε��� �Է�:");
		String pDelIndex = scanner.nextLine();
		int delIndex = Integer.parseInt(pDelIndex) - 1;
		String name = studentList.get(delIndex).getName();
		String phonNumber = studentList.get(delIndex).getMajor();
		String email = studentList.get(delIndex).getPn();
		String memo = studentList.get(delIndex).getMemo();
		System.out.println("�Ʒ� ����ó�� �����Ͻðڽ��ϱ�?(Y/N)");
		System.out.println(name + "  " + phonNumber + "  " + email + "  " + memo);
		System.out.print("�Է�:");
		String yesNo = scanner.nextLine();
		String fyesNo = yesNo.toLowerCase();
		if (fyesNo.equals("n")) {
			System.out.println("����ó ������ ��ҵǾ����ϴ�");
		} else if (fyesNo.equals("y")) {
			studentList.remove(delIndex);
		}

	}

	public static void modify() {
		System.out.println(
				"===================================================================================================================");
		System.out.println("����ó ����");
		for (int i = 0; i < studentList.size(); i++) {
			int a = i + 1;
			String n = studentList.get(i).getName();
			String m = studentList.get(i).getMajor();
			String p = studentList.get(i).getPn();
			String f = studentList.get(i).getMemo();
			System.out.println(a + " " + n + " " + m + " " + p + " " + f);
		}
		
		System.out.print("������ ����ó �ε��� �Է�:");
		String pModIndex = scanner.nextLine();
		int modIndex = Integer.parseInt(pModIndex) - 1;
		String ame = studentList.get(modIndex).getName();
		String honNumber = studentList.get(modIndex).getMajor();
		String mail = studentList.get(modIndex).getPn();
		String emo = studentList.get(modIndex).getMemo();
		System.out.println("�Ʒ� ����ó�� �����Ͻðڽ��ϱ�?(Y/N)");
		System.out.println(ame + "  " + honNumber + "  " + mail + "  " + emo);
		System.out.print("�Է�:");
		String yesNo = scanner.nextLine();
		String fyesNo = yesNo.toLowerCase();
		if (fyesNo.equals("n")) {
			System.out.println("����ó ������ ��ҵǾ����ϴ�");
		} else if (fyesNo.equals("y")) {
			System.out.println("����ó ����");
			System.out.print("�̸�:");
			String name = scanner.nextLine();
			System.out.print("��ȭ��ȣ:");
			String phonNumber = scanner.nextLine();
			System.out.print("�̸���:");
			String email = scanner.nextLine();
			System.out.print("�޸�:");
			String memo = scanner.nextLine();
			studentList.get(modIndex).setName(name);
			studentList.get(modIndex).setMajor(phonNumber);
			studentList.get(modIndex).setPn(email);
			studentList.get(modIndex).setMemo(memo);
			System.out.println("����ó�� �����Ǿ����ϴ�");
		}

	}

	public static void exit() {
		System.out.println("����:���α׷��� ����Ǿ����ϴ�.");
		System.exit(0);
	}

	public static String convertToLowerCase(String str) {
		return str.toLowerCase();
	}
}