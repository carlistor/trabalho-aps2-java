public class PagamentoCartaoDebito implements PagamentoCommand {

	@Override
	public void processarCompra(Itens compra) {
		System.out.println("Compra debitada!\n" + compra.getInfoNota());
	}

}