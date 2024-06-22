package dominio;

import java.io.Serializable;
import java.util.Objects;


public class Cargo implements Serializable{
    private static long id;
    private long idCargo;
    private String cargo;
    private String descricao;
    private double salario;

    public Cargo(String cargo, String descricao, double salario) {
        this.idCargo = Cargo.id;
        Cargo.setId(id++);
        this.cargo = cargo;
        this.descricao = descricao;
        this.salario = salario;
    }

    public static void setId(long id) {
        Cargo.id = id;
    }

    public long getIdCargo() {
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

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.cargo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cargo other = (Cargo) obj;
        return Objects.equals(this.cargo, other.cargo);
    }

    @Override
    public String toString() {
        return "idCargo:" + idCargo + ", cargo :" + cargo + ", descricao: " + descricao + ", salario: " + salario + ';';
    }
}