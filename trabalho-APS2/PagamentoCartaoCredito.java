public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Itens compra) {
		System.out.println("Compra emitida!\n" + compra.getInfoNota());
	}

}