package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class SeInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<SeInFo> arr = new ArrayList<>();
		ArrayList<String> str = new ArrayList<>();
		/*
		String s = "Test";
		str.add(s);
		
		SeInFo st = new SeInFo();
		arr.add(st);
		*/
		
		while(true) {
			System.out.println("1.등록 2.확인");
			int num = scanner.nextInt();
			switch(num) {
				case 1:
					SeInFo s = new SeInFo();
					System.out.println("이름 입력");
					String name = scanner.next();
					System.out.println("나이 입력");
					int age = scanner.nextInt();
					
					s.setAge(age);
					s.setName(name);
					
					arr.add(s);
					System.out.println("등록 되었습니다!");
					break;
				case 2:
					for(int i=0; i<arr.size(); i++) {
						SeInFo ss = arr.get(i);
						System.out.println("이름 : " + ss.getName());
						System.out.println("나이 : " + ss.getAge());
						System.out.println("-----------------------");
					}
					break;
				default:
					break;
			}
		}
	}

}
