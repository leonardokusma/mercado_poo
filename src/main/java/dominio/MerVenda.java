package dominio;

import java.io.Serializable;
import java.util.Date;

public class MerVenda implements Serializable {

    private static long id = 1;
    private long idMerVenda;
    private MerTipoPagamento tipoPagamento;
    private MerFuncionario funcionario;
    private MerCliente cliente;
    private double valor;
    private Date data;
    private String log;
    private long desconto;
    private int qtdVenda;

    public MerVenda() {
        this.idMerVenda = MerVenda.id;
        MerVenda.setId(id++);
        this.data = new Date();
    }

    public MerVenda(MerTipoPagamento tipoPagamento, MerFuncionario funcionario, MerCliente cliente, double valor, int qtdVenda) {
        this.idMerVenda = MerVenda.id;
        MerVenda.setId(id++);
        this.tipoPagamento = tipoPagamento;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.valor = valor;
        this.data = new Date();
        this.qtdVenda = qtdVenda;
    }

    public static void setId(long id) {
        MerVenda.id = id;
    }

    public MerTipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(MerTipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public MerFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(MerFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public MerCliente getCliente() {
        return cliente;
    }

    public void setCliente(MerCliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public long getDesconto() {
        return desconto;
    }

    public void setDesconto(long desconto) {
        this.desconto = desconto;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

}
