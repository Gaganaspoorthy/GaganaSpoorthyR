import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input a: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
