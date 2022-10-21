/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lavajato;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class Lavajato {

    public static void main(String[] args) {
        //Estanciar classe Fila
        Fila F1 = new Fila(); //Fila de carros sujos
        Fila F2 = new Fila(); //Fila de carros limpos
        
        //Declarar variável contador
        int cont = 0;
        
        //Estanciar classe Carro
        Carro C = new Carro(); //Carros
        
        //Estanciar objetos genericos
        Object obj = new Object(); //Objetos carros
        
        //Entrada de dados dos carros
        for(int i = 1; i < 16; i++){
            Carro entrada = new Carro(); //Objeto que armazena a entrada de dados
            
            entrada.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do carro: "));
            entrada.placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
            entrada.proprietario = JOptionPane.showInputDialog("Digite o nome do proprietário do carro: ");
            
            //Inserindo carros
            System.out.println("Entrando na fila para lavar: \n");
            F1.inserir(entrada);
            
            //Imprimir o carro inserido
            F1.imprimir(entrada);
            
            //Removendo o último carro lavado
            if(i % 3 == 0){
                if(F1.fila_vazia()){
                    System.out.println("A fila está vazia");
                }else{
                    //Removendo veiculo lavado da fila
                    System.out.println("Veiculo lavado, indo para a fila de lavados: \n");
                    obj = F1.remover();
                    
                    C = (Carro) obj;
                    
                    //Inserindo carro na fila dos lavados
                    F2.inserir(C);
                    
                    F2.imprimir(C);
                    cont++;
                }
            }
        }
        
        System.out.println("Fila dos carros que já foram lavados: ");
        
        for(int j = 0; j < cont; j++){
            
            obj = F2.mostrar(j); //Mostra o objeto na posição j
            C = (Carro) obj;

            F2.imprimir(C); //Imprime a lista com as características dos carros limpos
        }    
    }
}
