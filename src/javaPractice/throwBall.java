package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class throwBall {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4 };
		int numbers1[] = { 1, 2, 3, 4, 5, 6 };
		int numbers2[] = { 1, 2, 3 };
		System.out.println(goExecute(numbers, 2));
	}

	public static int goExecute(int[] numbers, int k) {
		int answer = 0;
		List<Integer> numbers1 = new ArrayList<>();
		List<Integer> numbers2 = new ArrayList<>();
//Â¦¼ö
		if (numbers.length % 2 == 0) {
			int tempVal = k % (numbers.length / 2);
			Integer b[] = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

			numbers1 = Arrays.asList(b);
			numbers2 = numbers1.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());

			answer = numbers2.get((tempVal + 1) % (numbers.length / 2));
		} else {

		}
		return answer;

	}

}
