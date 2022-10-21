/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

/**
 *
 * @author deborah
 */
public class Carro{
    //Definição dos atributos
    int id;
    String placa;
    String proprietario;
    
    //Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.
    //
    public int getId() { //Get: usado para acessar atributos da classe
        return id;
    }

    public void setId(int id) { //Set: usado para alterar, modificar os valores de um atributo da classe 
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

}
