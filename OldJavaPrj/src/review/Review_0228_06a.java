package review;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Review_0228_06a {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Workspace\\JavaPrj\\res\\data.txt");
		Scanner scan = new Scanner(fis);

		int total = 0;
		int index = 0;
		int count = 0;

		while (scan.hasNext()) {
			int num = Integer.parseInt(scan.next());
			if (++index >= 65) {
				total += num;
				count++;
			}
		}
		float avg = (float) total / count;

		System.out.printf("65번째 이후 수들의 총합은 %d\n", total);
		System.out.printf("65번째 이후 수들의 평균은 %.2f", avg);

		scan.close();
		fis.close();

	}

}
