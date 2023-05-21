public class Tabuleiro {
    int tabuleiro[][];

    public Tabuleiro() {
        this.tabuleiro = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    public void showTabuleiro() {
        System.out.println("    0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "   ");
            for (int j = 0; j < 10; j++) {
                if (this.tabuleiro[i][j] == 0) {
                    System.out.print("\u001B[34m~ \u001B[0m");
                } else if (this.tabuleiro[i][j] == 1) {
                    System.out.print("\u001B[31m# \u001B[0m");
                } else if (this.tabuleiro[i][j] == 8) {
                    System.out.print("\u001B[33mx \u001B[0m");
                }
            }
            System.out.println();
        }
    }
}