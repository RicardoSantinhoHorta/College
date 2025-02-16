import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        numerosIguais();
    }

    public static void numerosIguais() {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        System.out.println(verNums(num1,num2,num3));
    }

    private static String verNums(int num1, int num2, int num3){
        if(num1 == num2 && num2 == num3)
            return "iguais";
        return "diferentes";
    }
}