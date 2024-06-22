package dominio;

import java.io.Serializable;

public class MerForneAlternativo implements Serializable {

    private static long id = 1;
    private long idMerForneAlternativo;
    private String nome;
    private String nomeFantasia;
    private String cnpj;
    private String rua;
    private String cep;
    private long numero;
    private String cidade;
    private String telefoneForne;
    private String emailForne;

    public MerForneAlternativo(String nome, String nomeFanatasia, String cnpj, String rua,
            String cep, long numero, String cidade, String telefoneForne, String emailForne) {
        this.idMerForneAlternativo = MerForneAlternativo.id;
        MerForneAlternativo.setId(id++);
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.telefoneForne = telefoneForne;
        this.emailForne = emailForne;

    }

    public static void setId(long id) {
        MerForneAlternativo.id = id;
    }

    public long getIdMerForneAlternativo() {
        return idMerForneAlternativo;
    }

    public void setIdMerForneAlternativo(long idMerForneAlternativo) {
        this.idMerForneAlternativo = idMerForneAlternativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefoneForne() {
        return telefoneForne;
    }

    public void setTelefoneForne(String telefoneForne) {
        this.telefoneForne = telefoneForne;
    }

    public String getEmailForne() {
        return emailForne;
    }

    public void setEmailForne(String emailForne) {
        this.emailForne = emailForne;
    }
}
