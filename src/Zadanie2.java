public class Zadanie2 {
    public static void main(String[] args) {
        int[] tabela = {5, 2, 8, 13, 1, 9, 3};
        int[] posortowanaTabela = posortujTabele(tabela);
        drukujTabele(posortowanaTabela);
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

    public static void drukujTabele(int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
    }
}