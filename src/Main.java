import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen sayıy giriniz:");
        int n = input.nextInt();
        int total=0;
        for(int i=1;i<n;i++) {
            if ((n % i == 0)) {
                total += i;
            } }
            if (total == n) {
                System.out.println(+n +"Mükkemmel sayı");
            }
            else {
                System.out.println(+n+"Mükkemel sayı değil");
            }
        }







    }
