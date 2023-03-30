public class prazoMedioPagamento {
	public static void main(String[] args) {
		double fornecedores = 8245000;
		double cmv = 128550000;
				
		double prazoMedioPagamento;
		
		prazoMedioPagamento = (fornecedores / cmv)*360;
		
		System.out.println("O Prazo Médio de Pagamento é?  " + 
				prazoMedioPagamento + " dias ");
	}
}