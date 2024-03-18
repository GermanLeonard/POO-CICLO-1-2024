import javax.swing.JOptionPane;  

public class Gui {

    public static void main(String[]args){

        String name=JOptionPane.showInputDialog("ingresa tu nombre: ");
        JOptionPane.showMessageDialog(null,"hola "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("cual es tu edad "+name+"? "));
        JOptionPane.showMessageDialog(null,"la edad de "+name+" es "+age);

        double height=Double.parseDouble(JOptionPane.showInputDialog("Cual es tu altura "+name+" ?"));
        JOptionPane.showMessageDialog(null,"La altura de "+name+" es "+height+" metros");


    }
    
}
