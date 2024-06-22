package dominio;

import java.io.Serializable;

public class MerEnderecoEstoque implements Serializable{

    private static long id = 1;
    private long idMerEnderecoEstoque;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String pontoRef;
    private long numero;

    public MerEnderecoEstoque(String rua, String bairro, String cidade, String estado, String cep, long numero) {
        this.idMerEnderecoEstoque = MerEnderecoEstoque.id;
        MerEnderecoEstoque.setId(id++);
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
    }
    
     public MerEnderecoEstoque(String rua, String bairro, String cidade, String estado, String cep, String pontoRef) {
        this.idMerEnderecoEstoque = MerEnderecoEstoque.id;
        MerEnderecoEstoque.setId(id++);
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pontoRef = pontoRef;
    }

    public static void setId(long id) {
        MerEnderecoEstoque.id = id;
    }

}
