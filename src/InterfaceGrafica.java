import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica extends JFrame{
	
	private JLabel  labBemVindo = new JLabel();
	private JButton btnBotao[] = new JButton[5];
	Elevador lele = new Elevador();
	
	public InterfaceGrafica(String titulo) {
		super(titulo);
		this.setSize(450,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labBemVindo.setText("BEM VINDO AO SIMULADOR DE ELEVADOR!");
		labBemVindo.setBounds(78, 10, 350, 30);
		labBemVindo.setFont(new Font("Lucinda Sans", Font.BOLD, 15));
		labBemVindo.setForeground(Color.BLUE);
		
		btnBotao[0] = new JButton("CHAMAR ELEVADOR");
		btnBotao[0].setBounds(12,52,180,30);
		
		btnBotao[1] = new JButton("ENTRAR NO ELEVADOR");
		btnBotao[1].setBounds(12,92,180,30);
		
		btnBotao[2] = new JButton("SAIR DO ELEVADOR");
		btnBotao[2].setBounds(12,132,180,30);
		
		btnBotao[3] = new JButton("ESCOLHER ANDAR");
		btnBotao[3].setBounds(12,172,180,30);
		
		btnBotao[4] = new JButton("STATUS DO ELEVADOR");
		btnBotao[4].setBounds(12,212,180,30);
		
//		painel.setBounds(165,47,290,210);
		
//		txaCaixaTexto.setEditable(false);
//		txaCaixaTexto.setLineWrap(true);
//		txaCaixaTexto.setWrapStyleWord(true);
		
//		spBarRol = new JScrollPane(txaCaixaTexto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
//		txaCaixaTexto.append(lele.chamarElevador());
//		txaCaixaTexto.append(lele.entrarElevador());
		
//		painel.add(spBarRol);		
		
		for(int x = 0; x < btnBotao.length; x++) {
			this.add(btnBotao[x]);
		}
//		this.add(painel);
		this.add(labBemVindo);
		this.setVisible(true); 
	}
	
	public static void main (String args[]) {
		new InterfaceGrafica("Elevador");
	}
		
}