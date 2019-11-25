public class PagamentoBoleto implements PagamentoCommand {

	@Override
	public void processarCompra(Itens compra) {
		System.out.println("Boleto criado!\n" + compra.getInfoNota());
	}

}