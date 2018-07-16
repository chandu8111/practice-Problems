

import java.util.*;

public class MonkVisitsCoderland {

	public static void main(String args[]) throws Exception {

		// Reading Input
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();

		int N = 0; // Number of Checkpoints
		long[] petrolCost, petrolRequired;
		long lowcost, result = 0;

		for (int i = 0; i < testCases; i++) {
			// Reading input for number of checkpoints
			N = s.nextInt();

			petrolCost = new long[N];
			petrolRequired = new long[N];
			for (int j = 0; j < N; j++) {
				petrolCost[j] = s.nextInt();
			}
			for (int j = 0; j < N; j++) {
				petrolRequired[j] = s.nextInt();
			}

			// Logic part
			lowcost = petrolCost[0];
			result = petrolCost[0] * petrolRequired[0];
			for (int j = 1; j < N; j++) {
				if (petrolCost[j] < lowcost) {
					lowcost = petrolCost[j];
				}
				result = result + (lowcost * petrolRequired[j]);
			}
			System.out.println(result);
		}

		s.close();
	}

}
