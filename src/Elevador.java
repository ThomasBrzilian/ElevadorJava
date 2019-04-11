public class Elevador {

	// Atributos
	private int andarAtualElev; // Atributo que informa qual andar atual do elevador
	private int andarAtualPess; // Atributo que informa qual andar o usuario está
	private boolean insideElev; // Atributo que informa se o usuario está no elevador

	// Construtor
	public Elevador() {
		this.setAndarAtualElev(0);  // Elevador começa no Terreo (andar 0)
		this.alguemPegouElev();     // Logo após alguma pessoa pega o elevador que fica em um andar aleatório
		this.setInsideElev(false);  // Iniciar sem ninguem dentro do elevador
	}
	
	//Métodos
	
	//Método para chamar o elevador!!
	public void chamarElevador() {
		if (this.getAndarAtualElev() == this.getAndarAtualPess()) {         // 1a condicao, pergunta se o elevador está no msmo andar do usuario??
			System.out.println("Elevador já está no andar!!!");             // se sim, informa a mensagem!
		} else {
			if (this.getAndarAtualElev() > this.getAndarAtualPess()) {      // 2a condicao, pergunta se o elevador tá em um andar mais alto q o do usuario?
				System.out.println("Você pediu o elevador!");               // se sim, ele faz um loop descendo até o andar atual do usuario 
				System.out.println("Elevador Descendo!! \n"+this.getAndarAtualElev()); 
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}else {                                                         //3a e ultima condição possivel, qnd o elevador tá em um andar mais baixo que o do usuario
				System.out.println("Você pediu o elevador! ");              //faz um loop subindo o elevador até o andar atual da pessoa.					
				System.out.println("Elevador Subindo!! \n"+ this.getAndarAtualElev());
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}
			System.out.println("O Elevador está no seu andar!");
		}
	}
	
	//Método para entrar no elevador!!
	public void entrarElevador() {
		if(this.getAndarAtualElev() != this.getAndarAtualPess()) {          //1a condicao, pergunta se o elevador está no msmo andar do usuario??
			System.out.println("Você precisa chamar o elevador primeiro");  //se não, informa a mensagem pedindo para chamar o elevador antes
		}else {
			if(this.isInsideElev()) {                                       //pergunta se a pessoa já está dentro do elevador?
				System.out.println("Você já esta dentro do elevador");      //se sim informa a mensagem.
			}else {
				this.setInsideElev(true);                                   //ultima condição, quando o usuario ta no msmo andar do elevador e nao ta dentro do elevador, ele entra no elevador!!
				System.out.println("Você entrou do Elevador!");             //Mensagem que entrou no elevador!!!
			}
		}
	}
	
	//Metodo para escolher o andar!!!
	public void escolherAndar(int andar) {				
		if(!this.isInsideElev()) {                                                          //Verifica se a pessoa esta dentro do elevador???
			System.out.println("Você precisa esta dentro do Elevador!!");                   //Se não, informa que precisa esta dentro do elevador primeiro
		}else {
			if(this.getAndarAtualElev() > andar) {                                          //1a condição , se o andar que o usuario escolheu é menor que o andar atual
				System.out.println("Você escolheu o "+andar+"° andar!!");                   //informa que andar ela escolheu
				System.out.println("Elevador Descendo!! \n"+this.getAndarAtualElev()); 
				do {                                                                        //faz um loop descendo o elevador até o andar que a pessoa escolheu	
					this.setAndarAtualElev(this.getAndarAtualElev() - 1 );
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != andar);
				System.out.println("O Elevador chegou no andar "+this.getAndarAtualElev());
				this.setAndarAtualPess(this.getAndarAtualElev());
			}else {
				if(this.getAndarAtualElev() < andar) {                                      //2a condição , se o andar que o usuario escolheu é maior que o andar atual
					System.out.println("Você escolheu o "+andar+"° andar!!");               //informa que andar ela escolheu
					System.out.println("Elevador Subindo!! \n"+ this.getAndarAtualElev());
					do {                                                                    //faz um loop subindo o elevador até o andar que a pessoa escolheu	
						this.setAndarAtualElev(this.getAndarAtualElev() + 1);
						System.out.println(this.getAndarAtualElev());
					}while(this.getAndarAtualElev() != andar);
					System.out.println("O Elevador chegou no andar "+this.getAndarAtualElev());
					this.setAndarAtualPess(this.getAndarAtualElev());
				}else {                                                                     //ultima condição se o andar que o usuario escolheu, for o mesmo do atual
					System.out.println("O Elevador já está nesse andar!!");                 //informa a mensagem
				}
			}
		}
	}
	
	//Método para sair do Elevador
	public void sairElevador() {
		if(!this.isInsideElev()) {                                                          //Pergunta se o usuario esta dentro do elevador??
			System.out.println("Você ja está fora do elevador!");                           //Se não, informa a mensagem que o usuario ja esta fora do elevador
		}else {                                                                             //Se sim
			this.setInsideElev(false);                                                      //O usuario sai do elevador
			System.out.println("Você saiu do Elevador!!");                                  //Informa a mensagem
		}
	}
	
	//Metodo para quando alguma outra pessoa chama o elevador!
	public int alguemPegouElev() {
		this.setAndarAtualElev(1 + (int) (Math.random() * 15));                             //Sorteia um numero aleatorio de 1 a 15 (inicialmente o predio vai só tem 15 andares)
		return this.getAndarAtualElev();                                                    //Retorna o valor
	}
	
	//Método que informa o status atual do elevador
	public void status() {
		System.out.println("O andar que a pessoa está é: "+this.getAndarAtualPess());
		System.out.println("O andar que o elevator está é: "+this.getAndarAtualElev());
		System.out.print("A pessoa está dentro do elevador? ");
		System.out.println(this.isInsideElev()? "Sim" : "Não");
	}
	
	//Metodos Getters e Setters
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
	
}
