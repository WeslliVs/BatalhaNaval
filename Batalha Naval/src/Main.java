import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Tabuleiro t1 = new Tabuleiro();
        Tabuleiro t2 = new Tabuleiro();
        Tabuleiro t1_alvo = new Tabuleiro();
        Tabuleiro t2_alvo = new Tabuleiro();

        Navio n1 = new Navio(0, 0, 1, 1);
        Navio n2 = new Navio(0, 0, 1, 2);
        Navio n3 = new Navio(0, 0, 1, 2);
        Navio n4 = new Navio(0, 0, 1, 3);
        Navio n5 = new Navio(0, 0, 1, 3);
        Navio n6 = new Navio(0, 0, 1, 4);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== JOGADOR 01 - POSICIONE SEUS NAVIOS =====");
        JogoBatalha.preencheTabela(n1, n2, n3, n4, n5, n6, t1);
        System.out.println("\n===== JOGADOR 02 - POSICIONE SEUS NAVIOS =====");
        JogoBatalha.preencheTabela(n1, n2, n3, n4, n5, n6, t2);
        System.out.println("\n--- TABULEIRO PREENCHIDO, VAMOS COMEÇAR A JOGAR ---");
        int nl = 0;
        int nc = 0;
        int currentPlayer = 1;
        while (!JogoBatalha.endGame(t1_alvo, currentPlayer) && !JogoBatalha.endGame(t2_alvo, currentPlayer)) {
            System.out.println("---             TURNO DO JOGADOR " + currentPlayer + "              ---");
            System.out.println("---     ESCOLHA A POSIÇÃO QUE DESEJA ATACAR     ---");
            if (currentPlayer == 1) {

                System.out.format("LINHA: ");
                nl = JogoBatalha.scanner(scanner);
                System.out.format("COLUNA: ");
                nc = JogoBatalha.scanner(scanner);

                while (!JogoBatalha.validacao(nl, nc)) {
                    System.out.println("\n--- ATIRE EM UMA POSIÇÃO VÁLIDA (ENTRE 0 E 9)---\n");

                    System.out.format("LINHA: ");
                    nl = JogoBatalha.scanner(scanner);

                    System.out.format("COLUNA: ");
                    nc = JogoBatalha.scanner(scanner);
                }

                if (JogoBatalha.disparo(nl, nc, t2, t2_alvo)){
                    System.out.println("\nVOCÊ ACERTOU UM ALVO!");
                } else {
                    currentPlayer = 2;
                }

                System.out.println("\n");
                t2_alvo.showTabuleiro();
                Thread.sleep(2500);
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
            } else {

                System.out.format("LINHA: ");
                nl = JogoBatalha.scanner(scanner);

                System.out.format("COLUNA: ");
                nc = JogoBatalha.scanner(scanner);

                while (!JogoBatalha.validacao(nl, nc)) {
                    System.out.println("\n--- ATIRE EM UMA POSIÇÃO VÁLIDA (ENTRE 0 E 9)---\n");

                    System.out.format("LINHA: ");
                    nl = JogoBatalha.scanner(scanner);

                    System.out.format("COLUNA: ");
                    nc = JogoBatalha.scanner(scanner);
                }

                if (JogoBatalha.disparo(nl, nc, t2, t1_alvo)){
                    System.out.println("\nVOCÊ ACERTOU UM ALVO!");
                } else {
                    currentPlayer = 1;
                }

                System.out.println("\n");
                t1_alvo.showTabuleiro();
                Thread.sleep(2500);
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
                System.out.println("\n \n \n \n \n \n \n \n \n \n");
            }
        }
    }
}