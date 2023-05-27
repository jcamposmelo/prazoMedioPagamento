O prazo médio de pagamento é o tempo médio em dias, que a empresa irá demorar para pagar esses fornecedores. Nesse caso, o prazo médio de pagamento quanto maior for, melhor será para a empresa, ou melhor, para o caixa da empresa.

```
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
