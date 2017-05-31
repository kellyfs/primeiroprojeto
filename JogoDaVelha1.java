/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelly.fsantos8
 */
public class JogoDaVelha1 {
    public static String[][] jogodavelha = new String[3][3];
    
 public static boolean jogadaMaquina() {
     
     //GERAR COMANDOS PARA TESTAR SE A POSIÇÃO DO RANDOM É VÁLIDA, SE SIM, A POSIÇÃO SERÁ ESCOLHIDA!
     
        Random jogador2 = new Random();
        int sorteio = jogador2.nextInt(8)+1;
        switch (sorteio) {
            case 1:
                jogodavelha[0][0] = "o";
                break;
            case 2:
                jogodavelha[0][1] = "o";
                break;
            case 3:
                jogodavelha[0][2] = "o";
                break;
            case 4:
                jogodavelha[1][0] = "o";
                break;
            case 5:
                jogodavelha[1][1] = "o";
                break;
            case 6:
                jogodavelha[1][2] = "o";
                break;
            case 7:
                jogodavelha[2][0] = "o";
                break;
            case 8:
                jogodavelha[2][1] = "o";
                break;
            case 9:
                jogodavelha[2][2] = "o";
                break;

        }
       return true;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        //LAÇO PARA PEDIR A POSIÇÃO PARA O USUÁRIO        
        System.out.println("Você é o X!");
        for (int p = 1; p <= 3; p++) {
            System.out.println("Informe a posição desejada de 1 a 9: ");
            String posicao = leitor.next();

            //DECISÃO DA IMPRESSÃO CONFORME A POSIÇÃO
            switch (posicao) {
                case "1":
                    jogodavelha[0][0] = "x";
                    break;
                case "2":
                    jogodavelha[0][1] = "x";
                    break;
                case "3":
                    jogodavelha[0][2] = "x";
                    break;
                case "4":
                    jogodavelha[1][0] = "x";
                    break;
                case "5":
                    jogodavelha[1][1] = "x";
                    break;
                case "6":
                    jogodavelha[1][2] = "x";
                    break;
                case "7":
                    jogodavelha[2][0] = "x";
                    break;
                case "8":
                    jogodavelha[2][1] = "x";
                    break;
                case "9":
                    jogodavelha[2][2] = "x";
                    break;

            }
               
            //COMANDOS DO TABULEIRO
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (jogodavelha[i][j] == null) {
                        jogodavelha[i][j] = "-";
                    }

                    System.out.print(jogodavelha[i][j] + " ");

                }
                System.out.println("");

            }
            
            jogadaMaquina();
            
            //COMANDOS DO TABULEIRO
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (jogodavelha[i][j] == null) {
                        jogodavelha[i][j] = "-";
                    }

                    System.out.print(jogodavelha[i][j] + " ");

                }
                System.out.println("");

            }

        }
    }
}
