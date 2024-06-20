/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */
public class MerTipoPagamento {
    private int idMerTipoPagamento;
    private String tipo;

    public MerTipoPagamento(int id, String tipo) {
        this.idMerTipoPagamento = id;
        this.tipo = tipo;
    }

    public int getIdMerTipoPagamento() {
        return idMerTipoPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}