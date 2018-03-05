import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class AgruparBotones extends JFrame implements ActionListener {

    public AgruparBotones(String titulo) {
        //Creación de los RadioButtons
        JRadioButton birdButton = new JRadioButton("Pajarito");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gatito");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Perrito");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Cerdito");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        ButtonGroup btgAnimalitos = new ButtonGroup();

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0,1));
        //radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        radioPanel.setBackground(Color.BLACK);

        JLabel picture = new JLabel(new ImageIcon("src/loro.png"));
        JPanel PanelCont2=new JPanel();
        PanelCont2.setLayout(new GridLayout(1,2));
        PanelCont2.add(radioPanel);
        PanelCont2.add(picture);
        PanelCont2.setBackground(Color.GREEN);
        
        
        JPanel ButtonPanel = new JPanel();
        //ButtonPanel.setLayout(new GridLayout(1,2));
        /*ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.X_AXIS));
        JRadioButton Button1 = new JRadioButton("Boton1");
        JRadioButton Button2 = new JRadioButton("Boton2");
        ButtonPanel.add(Button1);
        ButtonPanel.add(Button2);*/
        ButtonPanel.setBackground(Color.RED);
        
        ButtonPanel.setLayout(new GridLayout(3,3));     
        JButton btn1 = new JButton("Boton1");
        JButton btn2 = new JButton("Boton2");       
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(btn1);
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(btn2);
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(new JLabel(""));
        ButtonPanel.add(new JLabel(""));
        
        /*BoxLayout distBoxLayout = new BoxLayout(this.getContentPane(),
                                                BoxLayout.X_AXIS);
        getContentPane().setLayout(distBoxLayout);
        */
        
        GridLayout distGrid = new GridLayout(2,0);
        setPreferredSize(new Dimension(300,320));
        setResizable(false);
        getContentPane().setLayout(distGrid);
        getContentPane().add(PanelCont2);
        getContentPane().add(ButtonPanel);
        getContentPane().setBackground(Color.BLUE);

        /*
        getContentPane().add(radioPanel, BorderLayout.WEST);
        getContentPane().add(picture,BorderLayout.CENTER);
        */

       

        pack();

        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new AgruparBotones("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);

        frame.pack();
        frame.setVisible(true);
    }
}