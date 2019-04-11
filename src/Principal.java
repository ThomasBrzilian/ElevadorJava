public class Principal {

	public static void main(String[] args) {
		
		Elevador e1 = new Elevador();
		e1.status();
		e1.chamarElevador();
		e1.entrarElevador();
		e1.escolherAndar(10);
		e1.sairElevador();
		e1.status();

	}

}
