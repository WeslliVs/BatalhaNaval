import java.util.Scanner;

public class JogoBatalha {

    public static void preencheTabela(Navio n1, Navio n2, Navio n3, Navio n4, Navio n5, Navio n6, Tabuleiro t) {
        int countNavios = 1;

        System.out.println("----- POSICIONE SEUS NAVIOS NO TABULEIRO -----");

        while (countNavios <= 6) {
            System.out.print("\n");
            insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);

            switch (countNavios) {
                case 1:
                    while (!validacao(n1.posLinha, n1.posColuna) || !insert(n1.posLinha, n1.posColuna, n1.orientacao, n1, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;

                case 2:
                    while (!validacao(n2.posLinha, n2.posColuna) || !insert(n2.posLinha, n2.posColuna, n2.orientacao, n2, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;

                case 3:
                    while (!validacao(n3.posLinha, n3.posColuna) || !insert(n3.posLinha, n3.posColuna, n3.orientacao, n3, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;

                case 4:
                    while (!validacao(n4.posLinha, n4.posColuna) || !insert(n4.posLinha, n4.posColuna, n4.orientacao, n4, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;

                case 5:
                    while (!validacao(n5.posLinha, n5.posColuna) || !insert(n5.posLinha, n5.posColuna, n5.orientacao, n5, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;

                case 6:
                    while (!validacao(n6.posLinha, n6.posColuna) || !insert(n6.posLinha, n6.posColuna, n6.orientacao, n6, t)) {
                        insereNavios(n1, n2, n3, n4, n5, n6, t, countNavios);
                    }
                    break;
            }

            countNavios++;
        }

        System.out.println("\n \n \n \n \n \n \n \n \n \n");
        System.out.println("SEU TABULEIRO: ");
        t.showTabuleiro();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n \n \n \n \n \n \n \n \n \n");
        System.out.println("\n \n \n \n \n \n \n \n \n \n");
    }

    public static boolean insereNavios (Navio n1, Navio n2, Navio n3, Navio n4, Navio n5, Navio n6, Tabuleiro t, int countNavios){
        Scanner scanner = new Scanner(System.in);
        int nl;
        int nc;
        int no;

        switch (countNavios){
            case 1:
                System.out.println("--- 1º NAVIO - TAMANHO 1 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n1.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n1.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n1.orientacao = no;

                return true;

            case 2:
                System.out.println("--- 2º NAVIO - TAMANHO 2 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n2.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n2.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n2.orientacao = no;

                if (no == 1){
                    n2.linha = 2;
                    n2.coluna = 1;
                }

                return true;

            case 3:
                System.out.println("--- 3º NAVIO - TAMANHO 2 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n3.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n3.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n3.orientacao = no;

                if (no == 1){
                    n3.linha = 2;
                    n3.coluna = 1;
                }

                return true;

            case 4:
                System.out.println("--- 4º NAVIO - TAMANHO 3 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n4.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n4.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n4.orientacao = no;

                if (no == 1){
                    n4.linha = 3;
                    n4.coluna = 1;
                }

                return true;

            case 5:
                System.out.println("--- 5º NAVIO - TAMANHO 3 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n5.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n5.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n5.orientacao = no;

                if (no == 1){
                    n5.linha = 3;
                    n5.coluna = 1;
                }

                return true;

            case 6:
                System.out.println("--- 6º NAVIO - TAMANHO 4 ---");
                System.out.format("LINHA: ");
                nl = scanner(scanner);
                n6.posLinha = nl;

                System.out.format("COLUNA: ");
                nc = scanner(scanner);
                n6.posColuna = nc;

                System.out.format("ORIENTAÇÃO (1 - VERTICAL OU 2 - HORIZONTAL): ");
                no = scanner(scanner);
                n6.orientacao = no;

                if (no == 1){
                    n6.linha = 4;
                    n6.coluna = 1;
                }

                return true;
        }
        return false;
    }

    public static boolean validacao(int l, int c) {
        if (l > 9 || c > 9 || l < 0 || c < 0) {
            System.out.println("\n ----- INSIRA UM NÚMERO ENTRE 0 E 9 ----- \n");
            return false;
        }
        return true;
    }

    public static boolean insert(int l, int c, int o, Navio n, Tabuleiro t) {
        if(n.linha+l > 10 || n.coluna+c > 10) {
            System.out.println("\n ----- SEU NAVIO VAI CAIR DA BORDA DA TERRA, COLOQUE EM OUTRO LUGAR ----- \n");
            return false;
        }

        if (o == 1) {
            for (int i = l; i < l + n.linha; i++) {
                if (t.tabuleiro[i][c] == 1) {
                    System.out.println("\n ----- JÁ TEM UM NAVIO AQUI, COLOQUE EM OUTRO LUGAR ANTES QUE AFUNDE ----- \n");
                    return false;
                }
                t.tabuleiro[i][c] = 1;
            }
        } else if (o == 2) {
            for (int j = c; j < c + n.coluna; j++) {
                if (t.tabuleiro[l][j] == 1) {
                    System.out.println("\n ----- JÁ TEM UM NAVIO AQUI, COLOQUE EM OUTRO LUGAR ANTES QUE AFUNDE ----- \n");
                    return false;
                }
                t.tabuleiro[l][j] = 1;
            }
        } else {
            System.out.println("\n ----- ORIENTAÇÃO INVÁLIDA ----- \n");
            return false;
        }
        return true;
    }

    public static boolean disparo(int l, int c, Tabuleiro t, Tabuleiro alvo) {

        if (t.tabuleiro[l][c] == 1) {
            if (alvo.tabuleiro[l][c] == 1){
                System.out.println("\nVOCÊ JÁ ATIROU AQUI!");
                return false;
            }
            alvo.tabuleiro[l][c] = 1;
            return true;
        }
        alvo.tabuleiro[l][c] = 8;
        System.out.println("\nVOCÊ ERROU O DISPARO!");
        return false;
    }

    public static boolean endGame(Tabuleiro t, int jogador) {
        int count_acertos = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (t.tabuleiro[i][j] == 1) {
                    count_acertos++;
                }
            }
        }

        if (count_acertos == 15){
            System.out.println("\n \n --- PARABÉNS JOGADOR " + jogador + " VOCÊ GANHOU! ---");
            System.out.println("          \uD83D\uDC51 \uD83C\uDF89 ᕦ(òᴥó)ᕥ \uD83C\uDF89 \uD83D\uDC51");

            return true;
        } else return false;
    }

    public static int scanner(Scanner scanner) {
        scanner.hasNextInt();
        while(!scanner.hasNextInt()) {
            System.out.println("INSIRA UMA ENTRADA VÁLIDA: ");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        return numero;
    }
}