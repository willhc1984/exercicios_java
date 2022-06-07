package exercicio_OO_Heranca;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calculoImposto() {
		if(rendaAnual < 20000.00) {
			return rendaAnual * 0.15 - gastosSaude * 0.5;
		}
		else {
			return rendaAnual * 0.25 - gastosSaude * 0.5;
		}
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	

}
