package exercicio_OO_Heranca;

public class PessoaJuridica extends Pessoa{
	
	protected int numeroFuncionarios;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double calculoImposto() {
		if(numeroFuncionarios < 10) {
			return rendaAnual * 0.16;
		}
		else {
			return rendaAnual * 0.14;
		}
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	
	
	

}
