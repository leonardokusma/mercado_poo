package dominio;

public class MerEstoqueProduto {

    private static long id = 1;
    private long idMerEstoqueProduto;
    private double precoUnitario;
    private int qtd;
    private MerProduto produto;
    private MerEstoque estoque;
    private MerFornePrincipal forne;
    private MerForneAlternativo forneAlternativo;

    public MerEstoqueProduto(double preco, int qtd, MerProduto produto, MerEstroque estoque, MerFornePrincipal forne, MerForneAlternativo forneAlternativo) {
        this.idMerEstoqueProduto = MerEstoqueProduto.id;
        MerEstoqueProduto.setId(id++);
        this.precoUnitario = preco;
        this.qtd = qtd;
        this.produto = produto;
        this.estoque = estoque;
        this.forne = forne;
        this.forneAlternativo = forneAlternativo;
    }

    public static void setId(long id) {
        MerEstoqueProduto.id = id;
    }

    public long getIdMerEstoqueProduto() {
        return idMerEstoqueProduto;
    }

    public void setIdMerEstoqueProduto(long idMerEstoqueProduto) {
        this.idMerEstoqueProduto = idMerEstoqueProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public MerProduto getProduto() {
        return produto;
    }

    public void setProduto(MerProduto produto) {
        this.produto = produto;
    }

    public MerEstoque getEstoque() {
        return estoque;
    }

    public void setEstoque(MerEstoque estoque) {
        this.estoque = estoque;
    }

    public MerFornePrincipal getForne() {
        return forne;
    }

    public void setForne(MerFornePrincipal forne) {
        this.forne = forne;
    }

    public MerForneAlternativo getForneAlternativo() {
        return forneAlternativo;
    }

    public void setForneAlternativo(MerForneAlternativo forneAlternativo) {
        this.forneAlternativo = forneAlternativo;
    }

}
