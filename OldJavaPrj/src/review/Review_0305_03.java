package review;

import java.util.Scanner;

public class Review_0305_03 {

	public static void main(String[] args) {

		// 파일명 대문자 길이

		Scanner scan = new Scanner(System.in);

		System.out.print(" > 파일명 입력: ");
		String fileName = scan.next();

		System.out.printf(" > 파일명 출력: %s\n", fileName);
		System.out.printf(" > 파일명 변환: %s\n", fileName.toUpperCase());
		System.out.printf(" > 파일명 길이: %d", fileName.length());

		scan.close();

	}

}
