/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deborah
 */
public class Fila{
    
    //Criar Fila
    List<Carro> obj = new ArrayList<>();
    
    //Procedimento para inserir um carro na fila
    void inserir(Carro carro){
        this.obj.add(carro);
    }
    
    //Função para remover um carro da fila
    Carro remover(){
        return this.obj.remove(0);
    }
    
    //Função para esvaziar a fila
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
    
    //Função para mostrar um carro em determinada posição
    Object mostrar(int i){
        return this.obj.get(i);
    }
    
    //Procedimento para imprimir os dados do carro
    void imprimir(Object obj){
        if (obj instanceof Carro){
            System.out.println("Carro ID: " + ((Carro) obj).id);
            System.out.println("Placa: " + ((Carro) obj).placa);
            System.out.println("Proprietário: " + ((Carro) obj).proprietario);
            System.out.println("---------------------------------------\n");
        }
    }  
}
