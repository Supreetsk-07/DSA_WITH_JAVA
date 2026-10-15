import java.util.Scanner;

class pattern_practice {
    int i, j;

    void star(int n) {
        System.err.println("Star pattern");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void star1(int n){
        int i, j;
        System.out.println("Star pattern (right). ");
        for (i = 0 ; i < n ; i++){
            for (j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void star_with_number(int n){
        int i, j;
        System.out.println("Star pattern with number (right). ");
        for (i = 0 ; i < n ; i++){
            for (j = 0 ; j <= i ; j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }

    void star_with_I_number(int n){
        int i, j;
        System.out.println("Star pattern with number (right). ");
        for (i = 0 ; i < n ; i++){
            for (j = 0 ; j <= i ; j++){
                System.out.print(i+1+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = s1.nextInt();
        pattern_practice pp = new pattern_practice();
        pp.star(n);
        pp.star1(n);
        pp.star_with_number(n);
        pp.star_with_I_number(n);
    }
}