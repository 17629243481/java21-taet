package lianxi1;

import java.util.Scanner;

public class lianxi12 {
	public static void main(String[] args){
		System.out.println("请输入成绩");
		Scanner scanner=new Scanner(System.in);
		int cj=scanner.nextInt();
		
		
		switch (cj/10) {
		case 9:
			System.out.println("等级为A");
			break;
		case 8:
			System.out.println("等级为B");
			break;
		case 7:
			System.out.println("等级为C");
			break;
		case 6:
			System.out.println("等级为D");
			break;
		default:
			System.out.println("等级为E");
			break;
		}
	
}
}
