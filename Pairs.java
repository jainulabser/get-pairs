import java.util.Scanner;

public class Pairs {
	private int arr[];

	private void noOfPair() {
		int count, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers want to insert array");
		count = sc.nextInt();
		arr = new int[count];
		System.out.println("Enter " + count + " Values");
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter number from given array");
		k = sc.nextInt();
		sc.close();

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if ((arr[i]<arr[j]) && (arr[i] + arr[j]) % k == 0)
					System.out.println(arr[i] + " " + arr[j]);
			}
		}

	}

	public static void main(String[] args) {
		Pairs obj = new Pairs();
		obj.noOfPair();

	}

}