import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Botones implements ActionListener {
    JFrame ventana;

    JButton boton1, boton2, boton3;
    JButton []arrBotones = new JButton[3];

    public Botones(){
        ventana = new JFrame("Tarea corta 4"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregar();
        ventana.setPreferredSize(new Dimension(500,300));
        ventana.pack(); 
        ventana.setVisible(true);  
    }
    public void agregar(){
        JLabel mensaje = new JLabel();
        mensaje.setText( "Toque los botones en orden numerico." );
        mensaje.setForeground(Color.red);
        ventana.add(mensaje);
        ventana.setLayout(new GridLayout(3,3,3,1));
        for (int i=0;i<arrBotones.length;++i){
            arrBotones[i]=new JButton("Botón "+(1+i));
            arrBotones[i].addActionListener(this);
            ventana.add(arrBotones[i]);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        boton1=arrBotones[0];
        boton2=arrBotones[1];
        boton3=arrBotones[2];
        for (int i=0;i<arrBotones.length;++i){
            if((arrBotones[0]==boton1)&&(i==0)){
                if(e.getSource().equals(boton1)){
                    System. out. println("Muy bien");
                }
            }
            if((arrBotones[1]==boton2)&&(i==1)){
                if(e.getSource().equals(boton2)){
                    System. out. println("Sigue así");
                }
            }
            if((arrBotones[2]==boton3)&&(i==2)){
                if(e.getSource().equals(boton3)){
                    System. out. println("Lo hiciste");
                }
            }
        }
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
