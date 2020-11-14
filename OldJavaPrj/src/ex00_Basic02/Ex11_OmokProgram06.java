package ex00_Basic02;
import java.util.Scanner;

public class Ex11_OmokProgram06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Q. 어떤 바둑판 크기를 원하십니까?");
		System.out.println(" 1. (20 x 20)");
		System.out.println(" 2. (40 x 20)");
		System.out.println(" 3. (60 x 30)");
		System.out.print(" > ");

		int menu = Integer.parseInt(scan.nextLine());
		scan.close();

		int width = 0;
		int height = 0;

		// 선택지
		if (menu == 2) {
			width = 40;
			height = 20;
		} else if (menu == 3) {
			width = 60;
			height = 30;
		} else {
			width = 20;
			height = 20;
		}

		// < 바둑판 >
		for (int y = 1; y <= height; y++) {
			for (int x = 1; x <= width; x++)

				// 꼭지점
				if (x == 1 && y == 1)
					System.out.print("┌");
				else if (x == width && y == 1)
					System.out.print("┐");
				else if (x == 1 && y == height)
					System.out.print("└");
				else if (x == width && y == height)
					System.out.print("┘");

				// 테두리
				else if (y == 1)
					System.out.print("┬");
				else if (x == 1)
					System.out.print("├");
				else if (x == width)
					System.out.print("┤");
				else if (y == height)
					System.out.print("┴");

				// 내부
				else
					System.out.print("┼");
			System.out.println();
		}

	}
}
