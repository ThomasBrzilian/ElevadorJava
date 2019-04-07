public class Elevador {

	// Atributos
	private int andarAtualElev; // Atributo que informa qual andar atual do elevador
	private int andarAtualPess; // Atributo que informa qual andar o usuario est�
	private boolean insideElev; // Atributo que informa se tem alguem no elevador

	// Construtor
	public Elevador() {
		this.setAndarAtualElev(0);  // Elevador come�a no Terreo (andar 0)
		this.alguemPegouElev(); 	// Logo ap�s alguma pessoa pega o elevador que fica em um andar aleat�rio
		this.setInsideElev(false);  // Iniciar sem ninguem dentro do elevador
	}
	
	//M�todos
	
	//M�todo para chamar o elevador!!
	public void chamarElevador() {
		if (this.getAndarAtualElev() == this.getAndarAtualPess()) { 	 	// 1a condicao, pergunta se o elevador est� no msmo andar do usuario??
			System.out.println("Elevador j� est� no andar!!!");      		// se sim, informa a mensagem!
		} else {
			if (this.getAndarAtualElev() > this.getAndarAtualPess()) {  	// 2a condicao, pergunta se o elevador t� em um andar mais alto q o do usuario?
				System.out.println("Voc� pediu o elevador!");				// se sim, ele faz um loop descendo at� o andar atual do usuario 
				System.out.println("Elevador Descendo!!"+this.getAndarAtualElev()); 
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}else {															//3a e ultima condi��o possivel, qnd o elevador t� em um andar mais baixo que o do usuario
				System.out.println("Voc� pediu o elevador! ");				//faz um loop subindo o elevador at� o andar atual da pessoa.					
				System.out.println("Elevador Subindo!"+ this.getAndarAtualElev());
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}
			System.out.println("O Elevador est� no seu andar!");
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
