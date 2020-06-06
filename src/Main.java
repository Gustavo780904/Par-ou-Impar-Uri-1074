import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = 0, X = 0, i;

		N = sc.nextInt();

		for (i = 0; i < N; i++) {
			X = sc.nextInt();

			if (X > 0 && X % 2 == 1) {
				System.out.println("ODD POSITIVE");
			} else if (X > 0 && X % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (X < 0 && X % 2 == -1) {
				System.out.println("ODD NEGATIVE");
			} else if (X < 0 && X % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else {
				System.out.println("NULL");
			}

		}

		sc.close();

	}

}
