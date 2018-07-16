package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlexAndHisString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder input = new StringBuilder(s.nextLine());
		int K = s.nextInt();

		StringBuilder output = new StringBuilder();
		char[] t = {};

		do {

			t = input.toString().substring(0, K).toCharArray();
			Arrays.sort(t);
			output.append(t[0]);
			input.replace(0, K, String.valueOf(t).substring(1));

		} while (input.length() > K);

		t = input.toString().toCharArray();
		Arrays.sort(t);
		output.append(t);

		System.out.println(output);

		s.close();
	}

}
