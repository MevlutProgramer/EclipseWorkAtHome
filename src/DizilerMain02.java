import javax.annotation.processing.AbstractProcessor;

public class DizilerMain02 {

	public static void main(String[] args) {

		int x = 1;
		int[] numbers = new int[6];
		int k = 0;
		boolean durum = k < numbers.length;
		k++;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = x;
			x++;
		System.out.println(numbers[i]);
		}
		System.out.println("-------------------");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}for (int numaralar:numbers) {
			System.out.println(numaralar);
		}
	}

}
