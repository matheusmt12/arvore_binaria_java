/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arvore_java;

/**
 *
 * @author Matheus Souza
 */
public class TInfo {
    public int chave;
    String nome;
    
    public TInfo(int chave, String nome){
    this.chave = chave;
    this.nome = nome;
}

    @Override
    public String toString (){
   return "Nome :" + nome + " | Chave " + chave; 
}    
    
}
