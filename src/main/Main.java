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

			System.out.print("�̸�, �� �� �й�, - �� ������ ��ȭ��ȣ�� �Է����ּ���:");
			String information = scanner.nextLine();
			String x = "x";
			String bigX = "X";
			if (information.equals(x) || information.equals(bigX)) {// �Է¹��� ���� x �ϰ�� ���α׷��� ����Ǿ���Ѵ�
				System.out.println("����:���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}

			String[] infoArray = information.split(",");// �Է¹��� ���� [�̸�, �� �� �й�, ��ȭ��ȣ]

			if (infoArray.length != 3) {// ������ ����� ���� �ʰų� �̻��ϰ� �Է����� �� ����ó��
				System.out.println("���:����Ȯ�� �Է��Դϴ�. �ٽ� �Է��Ͽ��ּ���");
				continue;
			}
			String phonNumber = infoArray[2];// information���� ��ȭ��ȣ�� �ش��ϴ� �κ�
			String[] phonNumArray = phonNumber.split("");// ��ȭ��ȣ�� �ڸ������ ����

			if (phonNumArray.length != 11) {// ��ȭ��ȣ�� ���̰� ����Ȯ�� ����� ����ó��
				System.out.println("���:��ȭ��ȣ�� �Է��� �߸��Ǿ����ϴ�.");
				continue;
			} else {
				System.out.println("�������� �Է��Դϴ�");
				isSuccess = false;
			}
			a = infoArray[0];
			b = infoArray[1];
			c = infoArray[2];
		} while (isSuccess);

		return new student(a, b, c);
	}

}
