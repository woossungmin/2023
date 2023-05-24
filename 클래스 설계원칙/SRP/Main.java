package SRP;

import java.util.Scanner;

//���� Ŭ����
class Calculator {
 public int add(int a, int b) {
     return a + b;
 }

 public int subtract(int a, int b) {
     return a - b;
 }

 public int multiply(int a, int b) {
     return a * b;
 }

 public int divide(int a, int b) {
     return a / b;
 }
}

//����� �Է� Ŭ����
class UserInput {
 private Scanner scanner;

 public UserInput() {
     scanner = new Scanner(System.in);
 }

 public int getIntInput(String message) {
     System.out.print(message);
     return scanner.nextInt();
 }

 public char getCharInput(String message) {
     System.out.print(message);
     return scanner.next().charAt(0);
 }
}

//���� Ŭ����
public class Main {
	 public static void main(String[] args) {
	     UserInput userInput = new UserInput();
	     Calculator calculator = new Calculator();

	     int a = userInput.getIntInput("ù ��° ���ڸ� �Է��ϼ���: ");
	     int b = userInput.getIntInput("�� ��° ���ڸ� �Է��ϼ���: ");
	     char operator = userInput.getCharInput("�����ڸ� �Է��ϼ��� (+, -, *, /): ");

	     int result;
	     switch (operator) {
	         case '+':
	             result = calculator.add(a, b);
	             System.out.println("���� ���: " + result);
	             break;
	         case '-':
	             result = calculator.subtract(a, b);
	             System.out.println("���� ���: " + result);
	             break;
	         case '*':
	             result = calculator.multiply(a, b);
	             System.out.println("���� ���: " + result);
	             break;
	         case '/':
	             result = calculator.divide(a, b);
	             System.out.println("������ ���: " + result);
	             break;
	         default:
	             System.out.println("�ùٸ� �����ڸ� �Է����ּ���.");
	     }
	 }
}
