package Treinos;

import javax.swing.*;

public class switchCaseJpane {
    public static void main(String []args){
        String mes = (String) JOptionPane.showInputDialog("Forneça o numero do mês");
        if(mes != null){
            switch(mes){
                case "1":
                    mes = "Janeiro";
                    break;
                case"2":
                    mes = "Fevereiro";
                    break;
                case "3":
                    mes="Março";
                    break;
                case "4":
                default:
                    mes="Mes Desconhecido!";
            }
            JOptionPane.showMessageDialog(null,mes);
        }
    }
}
