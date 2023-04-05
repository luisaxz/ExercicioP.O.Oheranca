/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class Pessoa {
    //Atributos
    protected String nome;
    protected String endereco;
    protected int telefone = 991134848;
    protected String email;

    /*/public Pessoa(String nome, String endereço, int telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }*/

    public Pessoa() {
    }

    public String getNome() {
        return "luisa";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return "Rua sol ";
    }

    public void setEndereco(String endereço) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return "luisa@gmail.com";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + "endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
}


