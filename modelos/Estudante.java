/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class  Estudante extends Pessoa {
     //Atributos 
    protected int matricula;
    protected String curso;
    protected String campus;
    

    public int getMatricula() {
        return 552255;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return "Analise e Desenvolvimento de Sistemas";
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return "Senai Fatesg";
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Estudante{" + "matricula=" + matricula + ", curso=" + curso + ", campus=" + campus + '}';
    }
    
    
    
}


