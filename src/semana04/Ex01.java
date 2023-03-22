package semana04;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira seu código de funcionário: ");
            final String codigo = sc.nextLine();

            if (codigo.length()  != 7) {
                System.out.println("Código inválido");
            
            } else if (codigo.startsWith("BR")||codigo.endsWith("X")) {
                System.out.println("Código válido");

            } else {
                final int val = Integer.parseInt(codigo, 2, 6, 10);

                if (val < 1 || val > 9999) {
                System.out.println("Código inválido");

                } else {
                    System.out.println("Código válido");

                }
            }






        } catch (Exception ex) {
            System.out.println("Código inválido");
        }
    } 
    
}



        
    }

}

