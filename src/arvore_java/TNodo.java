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
public class TNodo {
      
	TNodo esq;
	TInfo item;
	TNodo dir;
	TNodo pai;

	public TNodo (TInfo item, TNodo pai) { 
		this.item = new TInfo(item.chave,item.nome);
		this.esq = null;
		this.dir = null;
		this.pai = pai;
	}
}
