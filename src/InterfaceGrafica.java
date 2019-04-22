import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class InterfaceGrafica {
	
	public static void main(String[] args) {
		
		Elevador elevator = new Elevador();
		
		Scanner leia = new Scanner(System.in);
		
		JFrame janela = new JFrame("Elevador");
		
		JPanel painel = new JPanel();
		
		JButton btao1 = new JButton("Chamar Elevador");
		JButton btao2 = new JButton("Entrar Elevador");
		JButton btao3 = new JButton("Sair Elevador");
		JButton btao4 = new JButton("Status Elevador");
		JButton btao5 = new JButton("Escolher Andar");
		
		
		JLabel mensag = new JLabel();
		
		btao1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				System.out.println();
				System.out.println("Aguarde enquanto o elevador chega ");
				elevator.chamarElevador();
				System.out.println();
				
			}
		});
		
		btao2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				System.out.println();
				elevator.entrarElevador();;
				System.out.println();
				
			}
		});
		
		btao3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				System.out.println();
				elevator.sairElevador();
				System.out.println();
				
			}
		});
		
		btao4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				System.out.println();
				elevator.status();
				System.out.println();
				
			}
		});
		
		btao5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				System.out.println();
				if(elevator.isInsideElev()) {
					System.out.print("Digite o Andar que voce quer: ");
					int andar = leia.nextInt();
					elevator.escolherAndar(andar);
				}else {
					System.out.println("ERRO! Voce precisa está dentro do elevador!!");
				}							
				System.out.println("");
				
			}
		});		
		
		painel.add(btao1);
		painel.add(btao2);
		painel.add(btao3);
		painel.add(btao4);
		painel.add(btao5);		
		painel.add(mensag);
		
		janela.setSize(800,600);
		
		janela.add(painel);
		
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
	
}