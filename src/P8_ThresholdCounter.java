import java.util.Scanner;
/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P8_ThresholdCounter {

	public static void main(String[] args) {
		int seriesSize = 0;
		int[] series = null;
		int threshold = 0;
		int howMany = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers are in the series? ");
		seriesSize = input.nextInt();
		System.out.println("What is the threshold? ");
		threshold = input.nextInt();
		for (int x = x; x < seriesSize; x++) {
			System.out.println(number + (x + 1) + "? ");
			series[x] = input.nextInt();
		}
		howMany = aboveThreshold(seriesSize, threshold, series);
		System.out.println("The count of numbers above the threshold is " + howMany);
	}

	public static int aboveThreshold(int size, int max, int[] array) {
		int count = 0;
		for (int i = 0; i < size; i++) {

			if (array[i] > max) {

				count++;
			}
		}
		return count;

	}

}
