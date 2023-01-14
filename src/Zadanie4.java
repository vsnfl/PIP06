public class Zadanie4 {

    public static void main(String[] args) {
        int[] tabela1 = {1, 2, 3, 4, 5};
        int[] tabela2 = {5, 4, 3, 2, 1};
        boolean odwrotnosc = czyJestOdwrotnoscia(tabela1, tabela2);
        System.out.println(odwrotnosc);
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
}