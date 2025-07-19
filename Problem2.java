import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (a): ");
        int a = sc.nextInt();

        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
