import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Botones implements ActionListener {
    JFrame ventana;

    JButton botonMensaje, boton1, boton2, boton3;
    JPanel panelBotones,panel2;

    public Botones(){
        ventana = new JFrame("Tarea corta 4"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregar();
        ventana.setPreferredSize(new Dimension(400,400));
        ventana.pack(); 
        ventana.setVisible(true);  
    }
    public void agregar(){
        botonMensaje = new JButton("Presione los botones en orden númerico");
        botonMensaje.setBackground(new Color( 102, 153, 102));
        botonMensaje.addActionListener(this);
        boton1 = new JButton("Botón 1");
        boton1.addActionListener(this);
        boton2 = new JButton("Botón 2");
        boton2.addActionListener(this);
        boton3 = new JButton("Botón 3");
        boton3.addActionListener(this);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(10, 1));

        panelBotones.add(botonMensaje);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        ventana.add(panelBotones, BorderLayout.CENTER);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        try {
            for(int i=0; i<=2;i++){
                if((i==0)&& (!e.getSource().equals(boton1)) ){
                    System. out. println("ERROR");
                }
                else if((i==1)&& (!e.getSource().equals(boton2)) ){
                    System. out. println("ERROR");
                }
                else if((i==2)&& (!e.getSource().equals(boton3)) ){
                    System. out. println("ERROR");
                }
                else{
                    System. out. println("Tocaste todos los botones bien");
                }
            
            }
            
        } catch (Exception error) {
            JDialog msj = new JDialog();
            msj.setVisible(true); 
            msj.setSize(300, 100); 
            JLabel lab = new JLabel("ERROR. Tocaste mal los botones");
            msj.add(lab);
            msj.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        }
        
    }
}
