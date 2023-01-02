
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int answer = 0;
        answer = Integer.parseInt(arr[0]);


        for (int i = 1; i < arr.length; i++) {
                if ("+".equals(arr[i])) {
                    answer += Integer.parseInt(arr[i + 1]);
                }
                else if ("-".equals(arr[i])) {
                    answer -= Integer.parseInt(arr[i + 1]);
                }
                else if ("*".equals(arr[i])) {
                    answer *= Integer.parseInt(arr[i + 1]);
                }
                else if ("/".equals(arr[i])) {
                    answer /= Integer.parseInt(arr[i + 1]);
                }

        }
        System.out.println(answer);
    }

}