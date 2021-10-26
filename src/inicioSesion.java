import javax.swing.*;

public class inicioSesion extends JFrame{
    private JPanel inicioSesion;
    private JTextField textField1;
    private JTextField textField2;
    private JButton aceptBtn;
    private JButton cancelBtn;

    public inicioSesion(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(inicioSesion);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new inicioSesion("Inicio Secion");
        frame.setVisible(true);
    }

}
