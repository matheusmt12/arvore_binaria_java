/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore_java;
import java.util.Scanner;
/**
 *
 * @author Matheus Souza
 */
public class Arvore_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
TArvore T1 = new TArvore();

		System.out.print("========INSERINDO========\n");

		System.out.print("Inserindo a chave 37\n");
		TInfo item = new TInfo(37,"Alícia");
		T1.insere(item);
		
	
		System.out.print("Inserindo a chave 20\n");
		item.chave = 20; item.nome = "Alan";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 10\n");
		item.chave = 10; item.nome = "Maria";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 30\n");
		item.chave = 30; item.nome = "Olívia";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 80\n");
		item.chave = 80; item.nome = "Elen";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 100\n");
		item.chave = 100; item.nome = "Lucas";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 5\n");
		item.chave = 5; item.nome = "Sônia";
		T1.insere(item);
		

		System.out.print("Inserindo a chave 180\n");
		item.chave = 180; item.nome = "Luiz";
		T1.insere(item);		
		

		System.out.print("Inserindo a chave 90\n");
		item.chave = 90; item.nome = "Eunice";
		T1.insere(item);		
		
                    	//--------------------- PESQUISA
		System.out.print("========PESQUISANDO========\n");
		System.out.print("Pesquisando a chave 180\n");
		item.chave = 180;
		TNodo nodoPesq = T1.pesquisa(item);
		if (nodoPesq != null)
			System.out.print("Elemento encontrado: " + nodoPesq.item.chave + " - " + nodoPesq.item.nome + "\n");
		else
			System.out.print("Elemento não encontrado.\n");

		System.out.print("Pesquisando a chave 81\n");
		item.chave = 81;
		nodoPesq = T1.pesquisa(item);
		if (nodoPesq != null)
			System.out.print("Elemento encontrado: " + nodoPesq.item.chave + " - " + nodoPesq.item.nome + "\n");
		else
			System.out.print("Elemento não encontrado.\n");
    }
}