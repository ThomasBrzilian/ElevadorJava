public class Elevador {

	// Atributos
	private int andarAtualElev; // Atributo que informa qual andar atual do elevador
	private int andarAtualPess; // Atributo que informa qual andar o usuario está
	private boolean insideElev; // Atributo que informa se tem alguem no elevador

	// Construtor
	public Elevador() {
		this.setAndarAtualElev(0);  // Elevador começa no Terreo (andar 0)
		this.alguemPegouElev(); 	// Logo após alguma pessoa pega o elevador que fica em um andar aleatório
		this.setInsideElev(false);  // Iniciar sem ninguem dentro do elevador
	}
	
	//Métodos
	
	//Método para chamar o elevador!!
	public void chamarElevador() {
		if (this.getAndarAtualElev() == this.getAndarAtualPess()) { 	 	// 1a condicao, pergunta se o elevador está no msmo andar do usuario??
			System.out.println("Elevador já está no andar!!!");      		// se sim, informa a mensagem!
		} else {
			if (this.getAndarAtualElev() > this.getAndarAtualPess()) {  	// 2a condicao, pergunta se o elevador tá em um andar mais alto q o do usuario?
				System.out.println("Você pediu o elevador!");				// se sim, ele faz um loop descendo até o andar atual do usuario 
				System.out.println("Elevador Descendo!!"+this.getAndarAtualElev()); 
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}else {															//3a e ultima condição possivel, qnd o elevador tá em um andar mais baixo que o do usuario
				System.out.println("Você pediu o elevador! ");				//faz um loop subindo o elevador até o andar atual da pessoa.					
				System.out.println("Elevador Subindo!"+ this.getAndarAtualElev());
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}
			System.out.println("O Elevador está no seu andar!");
		}
	}

	public void entrarElevador() {

	}

	public void escolherAndar(int andar) {

	}

	public void sairElevador() {

	}

	public int alguemPegouElev() {

	}

	public int getAndarAtualElev() {
		return andarAtualElev;
	}

	public void setAndarAtualElev(int andarAtualElev) {
		this.andarAtualElev = andarAtualElev;
	}

	public int getAndarAtualPess() {
		return andarAtualPess;
	}

	public void setAndarAtualPess(int andarAtualPess) {
		this.andarAtualPess = andarAtualPess;
	}

	public boolean isInsideElev() {
		return insideElev;
	}

	public void setInsideElev(boolean insideElev) {
		this.insideElev = insideElev;
	}

	public void status() {
	
	}
}
