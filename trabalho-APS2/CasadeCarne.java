public class CasadeCarne {
    protected String nomeEmpresa;
 
    public CasadeCarne(String nome) {
        nomeEmpresa = nome;
    }
 
    public void realizarCompra(double valor, PagamentoCommand formaDePagamento){
        Itens compra = new Itens(nomeEmpresa);
        compra.setValor(valor);
        formaDePagamento.processarCompra(compra);
    }
}