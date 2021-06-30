package models;

public class Venda {
    
    private Produto produto;
    
    public Venda(){
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nProduto=" + produto;
    }
    
    
}
