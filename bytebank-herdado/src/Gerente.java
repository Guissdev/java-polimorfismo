//Gerente eh um funcionario, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {


	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
	}

}
