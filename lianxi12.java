package lianxi1;

import java.util.Scanner;

public class lianxi12 {
	public static void main(String[] args){
		System.out.println("������ɼ�");
		Scanner scanner=new Scanner(System.in);
		int cj=scanner.nextInt();
		
		
		switch (cj/10) {
		case 9:
			System.out.println("�ȼ�ΪA");
			break;
		case 8:
			System.out.println("�ȼ�ΪB");
			break;
		case 7:
			System.out.println("�ȼ�ΪC");
			break;
		case 6:
			System.out.println("�ȼ�ΪD");
			break;
		default:
			System.out.println("�ȼ�ΪE");
			break;
		}
	
}
}
