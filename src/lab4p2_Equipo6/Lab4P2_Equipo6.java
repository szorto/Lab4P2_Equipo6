/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_Equipo6;

public class Lab4P2_Equipo6 {

    public static void main(String[] args) {
        try {
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
            
            
            for (int i = 0; i < Bayonetta.length; i++) {
                for (int j = 0; j < Bayonetta.length; j++) {
                    if(Bayonetta[i][j]==null){
                        Bayonetta[i][j] = "  ";
                       
                    }
                    System.out.print(""+Bayonetta[i][j]+"|"); 
                    
                }
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Algo salio muy mal, intente otra vez");
        }

    }

}
