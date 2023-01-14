import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        int[] tabela = wygenerujTabele();
        drukujTabele(tabela);
    }

    public static int[] wygenerujTabele() {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = skanuj.nextInt();
        Random rand = new Random();
        int[] tabela = new int[n];
        for (int i = 0; i < n; i++) {
            tabela[i] = rand.nextInt(101);
        }
        return tabela;
    }

    public static void drukujTabele(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
