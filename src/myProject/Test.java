package myProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cmd;
		List<String[]> list = new ArrayList<>();
		int num = 1;
		while (true) {
			System.out.println("명령어를 입력하세요: ");
			System.out.println("종료: exit, 게시물 추가: add");
			System.out.println("게시물 조회: list");
			System.out.println("게시물 수정: update");
			cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			if (cmd.equals("add")) {
				System.out.print("게시물 제목을 입력해주세요: ");
				String[] book = new String[3];// 번호, 제목, 내용
				book[0] = String.valueOf(num);
				num++;
				sc.nextLine();
				book[1] = sc.nextLine();
				System.out.print("게시물 내용을 입력해주세요: ");
				book[2] = sc.nextLine();
				list.add(book);
				System.out.println("-----------------------------");
			}
			if (cmd.equals("list")) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println("번호: " + list.get(i)[0]);
					System.out.println("제목: " + list.get(i)[1]);
					System.out.println("-----------------------------");
				}

			}
			if (cmd.equals("update")) {
				System.out.print("수정할 게시물 번호: ");
				int input = sc.nextInt();
				for(String[] arr: list) {
					if(arr[0].equals(String.valueOf(input))) {
						sc.nextLine();
						System.out.print("제목: ");
						arr[1]= sc.nextLine();
						
						System.out.print("내용: ");
						arr[2]= sc.nextLine();
						System.out.println("수정이 완료되었습니다.");
						System.out.println("------------------------");
					}
					
				}
			}
			
			System.out.println("잘못 입력했습니다. 다시 입력하세요");
			

		}

	}

}
