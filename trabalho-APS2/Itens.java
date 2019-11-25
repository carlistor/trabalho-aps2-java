public class Itens {
    private static int Cont_ID;
    protected int idNF;
    protected String nomeEmpresa;
    protected double valorTotal;
 
    public Itens(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        idNF = ++Cont_ID;
    }
 
    public void setValor(double valor) {
        this.valorTotal = valor;
    }
 
    public String getInfoNota() {
        return new String("Nota fiscal nº: " + idNF + "\nLoja: "+ nomeEmpresa + "\nValor: " + valorTotal);
    }
}
