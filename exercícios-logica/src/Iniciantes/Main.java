import java.util.*;

public class Main {
	
	public static int med_sal(int[] x) {
		
		Arrays.sort(x);
		
		return x[1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] employees = new int[3];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = scan.nextInt();
		}

		System.out.println(med_sal(employees));

	}
}
