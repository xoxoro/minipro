package com.project.mini;

import java.util.Scanner;

public class miniproject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i==0) {
			System.out.println("");
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("--------------------------------");
			System.out.print("메뉴번호:");
			int one = sc.nextInt();
		
			
			switch (one) {

//			case 2 :
//				System.out.println("2.등록");
//				String w = sc.nextLine();
//				System.out.print("이름:");
//				String name = sc.nextLine();
//				System.out.print("휴대전화:");
//				String hp = sc.nextLine();
//				System.out.print("회사전화:");
//				String company = sc.nextLine();
//				break;
				
//			case 2:
//				String n = sc.nextLine();
//				System.out.print("이름 :");
//                System.out.println("");
//                
//                String h = sc.nextLine();
//                System.out.print("휴대전화 :");
//                System.out.println("");
//                
//                String c = sc.nextLine();
//                System.out.print("회사전화 :");
//                System.out.println("");
//
//				break;
				
			case 2: 
				System.out.println("<2.등록>");
				
				System.out.print("이름: ");
				String nameAdd = sc.next();
				System.out.print("휴대전화: ");
				String phAdd = sc.next();
				System.out.print("회사전화: ");
				String companyAdd = sc.next();
				break;
			}
		}
        sc.close();
	}

}
