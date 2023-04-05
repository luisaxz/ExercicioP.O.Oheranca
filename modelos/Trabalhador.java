/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Trabalhador extends Pessoa {
    protected String funcao;
    protected String departamento;
    protected float salario;
    
    

    public String getFuncao() {
        return "Analista";
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return "Sistemas";
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return 1300;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "funcao=" + funcao + ", departamento=" + departamento + ", salario=" + salario + '}';
    }
    

}
