public class Zadanie3 {
    public static void main(String[] args) {
        int[] tabela = {1, 2, 3, 4, 5};
        int[] odwroconaTabela = odwrocTabele(tabela);
        drukujTabele(odwroconaTabela);
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

    public static void drukujTabele(int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
    }
}
