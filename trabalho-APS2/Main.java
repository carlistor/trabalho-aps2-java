public class Main {
	public static void main(String[] args) {
    
		CasadeCarne CasadeCarneCHURRASCOES = new CasadeCarne("CHURRASCOES");
		CasadeCarneCHURRASCOES.realizarCompra(1350.00, new PagamentoCartaoCredito());
    
		CasadeCarneCHURRASCOES.realizarCompra(847.00, new PagamentoBoleto());
		CasadeCarneCHURRASCOES.realizarCompra(69.00, new PagamentoCartaoDebito());

		CasadeCarne CasadeCarneNOVA = new CasadeCarne("CasadeCarneNOVA");
		CasadeCarneNOVA.realizarCompra(170.00, new PagamentoCartaoCredito());

	}
}