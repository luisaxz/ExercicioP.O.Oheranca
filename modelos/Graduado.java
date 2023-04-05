/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Graduado extends Estudante{
    protected int anoDaConclusao;
    protected int anoDaColacao;
    protected int numeroDiploma;
    
    

    public int getAnoDaConclusao() {
        return 2025;
    }

    public void setAnoDaConclusao(int anoDaConclusao) {
        this.anoDaConclusao = anoDaConclusao;
    }

    public int getAnoDaColacao() {
        return 2026;
    }

    public void setAnoDaColacao(int anoDaColacao) {
        this.anoDaColacao = anoDaColacao;
    }

    public int getNumeroDiploma() {
        return 666;
    }

    public void setNumeroDiploma(int numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }

    @Override
    public String toString() {
        return "Graduado{" + "anoDaConclusao=" + anoDaConclusao + ", anoDaColacao=" + anoDaColacao + ", numeroDiploma=" + numeroDiploma + '}';
    }
    

}
