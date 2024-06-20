/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author João Ferrari
 */
public class Cargo {
    private int idCargo;
    private String cargo;
    private String descricao;
    private double salario;

    public Cargo(int id, String cargo, String descricao, double salario) {
        this.idCargo = id;
        this.cargo = cargo;
        this.descricao = descricao;
        this.salario = salario;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdCargo(int id) {
        this.idCargo = id;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}