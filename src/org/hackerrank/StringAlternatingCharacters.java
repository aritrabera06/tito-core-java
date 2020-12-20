package org.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringAlternatingCharacters {
	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int deletionCount = 0;
		if (s.length() > 1) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					deletionCount++;
				}
			}
		}
		System.out.println("For String: " + s + " , no of deletions : " + deletionCount);
		return deletionCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\StringAlternatingCharacters.txt"));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
