import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame{
	
	private JLabel  texto;
	private JPanel  painel = new JPanel();
	private JButton botao[] = new JButton[5];
	
	public InterfaceGrafica(String tit) {
		super(tit);
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		botao[0] = new JButton("CHAMAR ELEVADOR");
		botao[1] = new JButton("ENTRAR NO ELEVADOR");
		botao[2] = new JButton("SAIR DO ELEVADOR");
		botao[3] = new JButton("STATUS DO ELEVADOR");
		botao[4] = new JButton("ESCOLHER ANDAR");
		
		for(int x = 0; x < botao.length; x++) {
			painel.add(botao[x]);
		}
		
		this.add(painel);
		
		this.setVisible(true); 
	}
	
	public static void main (String args[]) {
		new InterfaceGrafica("Elevador");
	}
		
}