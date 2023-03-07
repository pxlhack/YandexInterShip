import java.util.Scanner;

public class AndreyAndAcid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int cur;
        int first = prev;
        int i = 1;

        boolean flag = true;
        while (i < n) {
            cur = sc.nextInt();
            i++;
            if (cur < prev) {
                flag = false;
                break;
            } else {
                prev = cur;
            }
        }

        if (flag) {
            System.out.println(prev - first);
        } else {
            System.out.println(-1);
        }
    }
}
