public class Elevador {

	// Atributos
	private int andarAtualElev; // Atributo que informa qual andar atual do elevador
	private int andarAtualPess; // Atributo que informa qual andar o usuario est�
	private boolean insideElev; // Atributo que informa se o usuario est� no elevador

	// Construtor
	public Elevador() {
		this.setAndarAtualElev(0);  // Elevador come�a no Terreo (andar 0)
		this.alguemPegouElev();     // Logo ap�s alguma pessoa pega o elevador que fica em um andar aleat�rio
		this.setInsideElev(false);  // Iniciar sem ninguem dentro do elevador
	}
	
	//M�todos
	
	//M�todo para chamar o elevador!!
	public void chamarElevador() {
		if (this.getAndarAtualElev() == this.getAndarAtualPess()) {         // 1a condicao, pergunta se o elevador est� no msmo andar do usuario??
			System.out.println("Elevador j� est� no andar!!!");             // se sim, informa a mensagem!
		} else {
			if (this.getAndarAtualElev() > this.getAndarAtualPess()) {      // 2a condicao, pergunta se o elevador t� em um andar mais alto q o do usuario?
				System.out.println("Voc� pediu o elevador!");               // se sim, ele faz um loop descendo at� o andar atual do usuario 
				System.out.println("Elevador Descendo!! \n"+this.getAndarAtualElev()); 
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}else {                                                         //3a e ultima condi��o possivel, qnd o elevador t� em um andar mais baixo que o do usuario
				System.out.println("Voc� pediu o elevador! ");              //faz um loop subindo o elevador at� o andar atual da pessoa.					
				System.out.println("Elevador Subindo!! \n"+ this.getAndarAtualElev());
				do {
					this.setAndarAtualElev(this.getAndarAtualElev() - 1);
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != this.getAndarAtualPess());
			}
			System.out.println("O Elevador est� no seu andar!");
		}
	}
	
	//M�todo para entrar no elevador!!
	public void entrarElevador() {
		if(this.getAndarAtualElev() != this.getAndarAtualPess()) {          //1a condicao, pergunta se o elevador est� no msmo andar do usuario??
			System.out.println("Voc� precisa chamar o elevador primeiro");  //se n�o, informa a mensagem pedindo para chamar o elevador antes
		}else {
			if(this.isInsideElev()) {                                       //pergunta se a pessoa j� est� dentro do elevador?
				System.out.println("Voc� j� esta dentro do elevador");      //se sim informa a mensagem.
			}else {
				this.setInsideElev(true);                                   //ultima condi��o, quando o usuario ta no msmo andar do elevador e nao ta dentro do elevador, ele entra no elevador!!
				System.out.println("Voc� entrou do Elevador!");             //Mensagem que entrou no elevador!!!
			}
		}
	}
	
	//Metodo para escolher o andar!!!
	public void escolherAndar(int andar) {				
		if(!this.isInsideElev()) {                                                          //Verifica se a pessoa esta dentro do elevador???
			System.out.println("Voc� precisa esta dentro do Elevador!!");                   //Se n�o, informa que precisa esta dentro do elevador primeiro
		}else {
			if(this.getAndarAtualElev() > andar) {                                          //1a condi��o , se o andar que o usuario escolheu � menor que o andar atual
				System.out.println("Voc� escolheu o "+andar+"� andar!!");                   //informa que andar ela escolheu
				System.out.println("Elevador Descendo!! \n"+this.getAndarAtualElev()); 
				do {                                                                        //faz um loop descendo o elevador at� o andar que a pessoa escolheu	
					this.setAndarAtualElev(this.getAndarAtualElev() - 1 );
					System.out.println(this.getAndarAtualElev());
				}while(this.getAndarAtualElev() != andar);
				System.out.println("O Elevador chegou no andar "+this.getAndarAtualElev());
				this.setAndarAtualPess(this.getAndarAtualElev());
			}else {
				if(this.getAndarAtualElev() < andar) {                                      //2a condi��o , se o andar que o usuario escolheu � maior que o andar atual
					System.out.println("Voc� escolheu o "+andar+"� andar!!");               //informa que andar ela escolheu
					System.out.println("Elevador Subindo!! \n"+ this.getAndarAtualElev());
					do {                                                                    //faz um loop subindo o elevador at� o andar que a pessoa escolheu	
						this.setAndarAtualElev(this.getAndarAtualElev() + 1);
						System.out.println(this.getAndarAtualElev());
					}while(this.getAndarAtualElev() != andar);
					System.out.println("O Elevador chegou no andar "+this.getAndarAtualElev());
					this.setAndarAtualPess(this.getAndarAtualElev());
				}else {                                                                     //ultima condi��o se o andar que o usuario escolheu, for o mesmo do atual
					System.out.println("O Elevador j� est� nesse andar!!");                 //informa a mensagem
				}
			}
		}
	}
	
	//M�todo para sair do Elevador
	public void sairElevador() {
		if(!this.isInsideElev()) {                                                          //Pergunta se o usuario esta dentro do elevador??
			System.out.println("Voc� ja est� fora do elevador!");                           //Se n�o, informa a mensagem que o usuario ja esta fora do elevador
		}else {                                                                             //Se sim
			this.setInsideElev(false);                                                      //O usuario sai do elevador
			System.out.println("Voc� saiu do Elevador!!");                                  //Informa a mensagem
		}
	}
	
	//Metodo para quando alguma outra pessoa chama o elevador!
	public int alguemPegouElev() {
		this.setAndarAtualElev(1 + (int) (Math.random() * 15));                             //Sorteia um numero aleatorio de 1 a 15 (inicialmente o predio vai s� tem 15 andares)
		return this.getAndarAtualElev();                                                    //Retorna o valor
	}
	
	//M�todo que informa o status atual do elevador
	public void status() {
		System.out.println("O andar que a pessoa est� �: "+this.getAndarAtualPess());
		System.out.println("O andar que o elevator est� �: "+this.getAndarAtualElev());
		System.out.print("A pessoa est� dentro do elevador? ");
		System.out.println(this.isInsideElev()? "Sim" : "N�o");
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
