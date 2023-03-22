package semana04;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        int numInteiro, sucessor, antecessor;
        numInteiro = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

        sucessor = numInteiro + 1;
        antecessor = numInteiro -1;

        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor:" + antecessor);

       

        
    }

}

