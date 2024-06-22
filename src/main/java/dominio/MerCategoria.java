package dominio;

import java.io.Serializable;

public class MerCategoria implements Serializable{

    private static long id = 1;
    private long idMerCategoria;
    private String nome;
    private String descricao;

    public MerCategoria(String nome, String descricao) {
        this.idMerCategoria = MerCategoria.id;
        MerCategoria.setId(id++);
        this.nome = nome;
        this.descricao = descricao;

    }

    public static void setId(long id) {
        MerCategoria.id = id;
    }

    public long getIdMerCategoria() {
        return idMerCategoria;
    }

    public void setIdMerCategoria(long idMerCategoria) {
        this.idMerCategoria = idMerCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
