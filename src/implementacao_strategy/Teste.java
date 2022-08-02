package implementacao_strategy;

public class Teste {

	public static void main(String[] args) {
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo r1 = new Robo();
		r1.setComportamento(normal);
		r1.mover();
		r1.mover();
		r1.setComportamento(agressivo);
		r1.mover();
		r1.mover();
		r1.setComportamento(defensivo);
		r1.mover();
		r1.mover();
	}

}
