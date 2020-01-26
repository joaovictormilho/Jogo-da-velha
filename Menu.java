package jogos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Menu extends JFrame{
    
    JPanel pMenu = new JPanel(new GridLayout(3, 3, 10, 10));
    
    public Menu() {
        configurarJanela();
        configurarTela();
    }
    
    public static void main(String[] args) {
            new Menu();
    }
    
    public final void configurarTela(){

        add(BorderLayout.CENTER,pMenu);
        pMenu.setBackground(Color.BLACK);
        Botao bt = new Botao("Novo Jogo");
        pMenu.add(bt);
    }

    public final void configurarJanela() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public class Botao extends JButton{
        public Botao(String nome){
            setBackground(Color.white);
            setText(nome);
            
            addActionListener(e->{
                new JogoDaVelhaJava();
            });
        }
    }
}
