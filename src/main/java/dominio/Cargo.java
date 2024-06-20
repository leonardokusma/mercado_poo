package dominio;

import java.io.Serializable;

public class Cargo implements Serializable {

    private static Integer idCargo;
    private String cargo;
    private String descricao;
    private double salario;

    public Cargo(int id, String cargo, String descricao, double salario) {
        this.idCargo = id;
        this.cargo = cargo;
        this.descricao = descricao;
        this.salario = salario;
    }

    public static Integer getIdCargo() {
        return idCargo;
    }

    public static void setIdCargo(Integer idCargo) {
        Cargo.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo{" + "cargo=" + cargo + ", descricao=" + descricao + ", salario=" + salario + '}';
    }
    

}
