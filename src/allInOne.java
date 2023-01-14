import java.util.Random;
import java.util.Scanner;

public class allInOne {
    public static void main(String[] args) {
        int[] tabela = wygenerujTabele(100);
        drukujTabele(tabela);
        int[] posortowanaTabela = posortujTabele(tabela);
        drukujTabele(posortowanaTabela);
        int[] odwroconaTabela = odwrocTabele(posortowanaTabela);
        drukujTabele(odwroconaTabela);
        System.out.println(czyJestOdwrotnoscia(posortowanaTabela, odwroconaTabela));
    }
    public static int[] wygenerujTabele(int zakres) {
        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = skanuj.nextInt();
        Random rand = new Random();
        int[] tabela = new int[n];
        for (int i = 0; i < n; i++) {
            tabela[i] = rand.nextInt(zakres + 1);
        }
        return tabela;
    }

    public static int[] posortujTabele(int[] tabela) {
        int[] posortowanaTabela = tabela.clone();
        for (int i = 0; i < posortowanaTabela.length; i++) {
            for (int j = 0; j < posortowanaTabela.length - 1; j++) {
                if (posortowanaTabela[j] > posortowanaTabela[j + 1]) {
                    int tymczasowa = posortowanaTabela[j];
                    posortowanaTabela[j] = posortowanaTabela[j + 1];
                    posortowanaTabela[j + 1] = tymczasowa;
                }
            }
        }
        return posortowanaTabela;
    }

    public static int[] odwrocTabele(int[] tabela) {
        int[] odwroconaTabela = tabela.clone();
        for (int i = 0; i < odwroconaTabela.length / 2; i++) {
            int tymczasowa = odwroconaTabela[i];
            odwroconaTabela[i] = odwroconaTabela[odwroconaTabela.length - 1 - i];
            odwroconaTabela[odwroconaTabela.length - 1 - i] = tymczasowa;
        }
        return odwroconaTabela;
    }
    public static boolean czyJestOdwrotnoscia(int[] tabela1, int[] tabela2) {
        if (tabela1.length != tabela2.length) {
            return false;
        }

        for (int i = 0; i < tabela1.length; i++) {
            if (tabela1[i] != tabela2[tabela2.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static void drukujTabele(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}