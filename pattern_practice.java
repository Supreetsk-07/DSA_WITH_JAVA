import java.util.Scanner;

class pattern_practice {
    int i, j;

    void star(int n) {
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = s1.nextInt();
        pattern_practice pp = new pattern_practice();
        pp.star(n);
    }
}