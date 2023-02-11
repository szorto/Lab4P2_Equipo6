package lab4p2_Equipo6;

import java.util.Scanner;

public class Lab4P2_Equipo6 {

    public static void main(String[] args) {
        Scanner entrad = new Scanner(System.in);
        

        Object[][] Bayonetta = new Object[9][9];
        System.out.println("------------------------------");
        System.out.println("----------Bienvenidxs---------");
        //AAAAAAAAAAAAAAAAAAAAAA
        Bayonetta[0][0] = "  ";
        Bayonetta[0][1] = "A ";
        Bayonetta[0][2] = "B ";
        Bayonetta[0][3] = "C ";
        Bayonetta[0][4] = "D ";
        Bayonetta[0][5] = "E ";
        Bayonetta[0][6] = "F ";
        Bayonetta[0][7] = "G ";
        Bayonetta[0][8] = "H ";

        Bayonetta[0][0] = "  ";
        Bayonetta[1][0] = "0 ";
        Bayonetta[2][0] = "1 ";
        Bayonetta[3][0] = "2 ";
        Bayonetta[4][0] = "3 ";
        Bayonetta[5][0] = "4 ";
        Bayonetta[6][0] = "5 ";
        Bayonetta[7][0] = "6 ";
        Bayonetta[8][0] = "7 ";

        Bayonetta[8][4] = new Dama(true) + " ";
        Bayonetta[1][4] = new Dama(false) + " ";
        Bayonetta[1][5] = new Rey(false) + " ";
        Bayonetta[8][5] = new Rey(true) + " ";
        Bayonetta[8][6] = new Alfil(true) + " ";
        Bayonetta[8][3] = new Alfil(true) + " ";
        Bayonetta[1][6] = new Alfil(false) + " ";
        Bayonetta[1][3] = new Alfil(false) + " ";
        Bayonetta[1][7] = new Caballo(false) + " ";
        Bayonetta[1][2] = new Caballo(false) + " ";
        Bayonetta[8][2] = new Caballo(true) + " ";
        Bayonetta[8][7] = new Caballo(true) + " ";
        Bayonetta[8][1] = new Torre(true) + " ";
        Bayonetta[8][8] = new Torre(true) + " ";
        Bayonetta[1][8] = new Torre(false) + " ";
        Bayonetta[1][1] = new Torre(false) + " ";

        Bayonetta[2][8] = new Peon(false) + " ";
        Bayonetta[2][7] = new Peon(false) + " ";
        Bayonetta[2][6] = new Peon(false) + " ";
        Bayonetta[2][5] = new Peon(false) + " ";
        Bayonetta[2][4] = new Peon(false) + " ";
        Bayonetta[2][3] = new Peon(false) + " ";
        Bayonetta[2][2] = new Peon(false) + " ";
        Bayonetta[2][1] = new Peon(false) + " ";

        Bayonetta[7][1] = new Peon(true) + " ";
        Bayonetta[7][2] = new Peon(true) + " ";
        Bayonetta[7][3] = new Peon(true) + " ";
        Bayonetta[7][4] = new Peon(true) + " ";
        Bayonetta[7][5] = new Peon(true) + " ";
        Bayonetta[7][6] = new Peon(true) + " ";
        Bayonetta[7][7] = new Peon(true) + " ";
        Bayonetta[7][8] = new Peon(true) + " ";

        for (int i = 0; i < Bayonetta.length; i++) {
            for (int j = 0; j < Bayonetta.length; j++) {
                if (Bayonetta[i][j] == null) {
                    Bayonetta[i][j] = "  ";
                }
                System.out.print("" + Bayonetta[i][j] + "|");
            }
            System.out.println("");
        }

        boolean win = true;
        do {

            System.out.print("Ingrese la posicion de la pieza que quiere mover y donde la movera (xx-xx): ");
            String mue = entrad.nextLine();
            String muee[] = mue.split("-");
            
            for (int i = 0; i < muee.length; i++) {
                if(muee[i].charAt(0) ){
                    if(muee[i].charAt(0))
                }
            }

        } while (win);

    }

}
