import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGrafica {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Elevador");
		JPanel painel = new JPanel();
		JButton btao1 = new JButton("Chamar Elevador");
		JButton btao2 = new JButton("Entrar Elevador");
		JButton btao3 = new JButton("Sair Elevador");
		JButton btao4 = new JButton("Escolher Andar");
		JButton btao5 = new JButton("Status Elevador");
		
		painel.add(btao1);
		painel.add(btao2);
		painel.add(btao3);
		painel.add(btao4);
		painel.add(btao5);		
		
		janela.setSize(800,600);
		janela.add(painel);
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
	
}