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
public class TArvore {
 
    	public TNodo T;

	public TArvore () { 
		T = null;
	}

	public TNodo raiz(){
		return T;
	}

	public void insere (TInfo item) {
		T = insere(T,item,null);
	}

	public TNodo insere (TNodo T, TInfo item, TNodo pai) {
		if (T == null) {
			T = new TNodo(item,pai);
		} else {
			pai = T;
			if (item.chave < T.item.chave)
				T.esq = insere(T.esq,item,pai);
			else if (item.chave > T.item.chave)
				T.dir = insere(T.dir,item,pai);
		}
		return T;
	}

	public TNodo pesquisa (TInfo item) {
		return pesquisa(T,item);
	}

	public TNodo pesquisa(TNodo T,TInfo item) {
		if (T == null) {
			return T;
		} else {

			if (item.chave == T.item.chave) 
				return T;
			else
				if (item.chave < T.item.chave) 
					T = pesquisa(T.esq,item);
				else
					T = pesquisa(T.dir,item);
		}
		return T;
	}


	public void Remove(TNodo T, TInfo X) {
		if (T == null)
			System.out.print("Elemento não encontrado\n");
		else
			if (X.chave == T.item.chave) 
			{
				TNodo P = T;
				if ((T.esq == null) && (T.dir == null)) {// CASO O PAI NAO TENHA NENHUM FILHO
					if (T.pai == null)
					{
						this.T = null;
					} else   
						if (T.item.chave > T.pai.item.chave)
							T.pai.dir = null;
						else
							T.pai.esq = null;
				}
				else  //CASO O PAI TENHA FILHO NA DIREITA 
					if (T.esq == null) {
						if (T.pai != null) {
							if (T.dir != null)                                                            
                                                                T.dir.pai = T.pai;
							if (T.item.chave > T.pai.item.chave) 
								T.pai.dir = T.dir;
							else
								T.pai.esq = T.dir;
						} else {
							this.T = T.dir;
							this.T.pai = null;
						}
					}
					else
						if (T.dir == null) {
							if (T.pai != null) {					
								if (T.esq != null) 
                                                                        T.esq.pai = T.pai;
								if (T.item.chave > T.pai.item.chave) 
									T.pai.dir = T.esq;
								else 
									T.pai.esq = T.esq;
							} else {
								this.T = T.esq;
								this.T.pai = null;
							}
						}
						else
						{
							P = getMax(T.esq);
							T.item = P.item;
						}

			} 
			else
				if (X.chave < T.item.chave) 
					Remove(T.esq,X);
				else
					Remove(T.dir,X);
	}

// Primeiro fazer o filho apontar para o pai
	public TNodo getMax (TNodo T) {
		if (T.dir == null) 
		{
			if (T.esq != null) 
                                T.esq.pai = T.pai;
			if (T.item.chave > T.pai.item.chave) 
				T.pai.dir = T.esq;
			else
				T.pai.esq = T.esq;

			return T;
		}
		else
			return getMax(T.dir);
	}

	public void emOrdem (TNodo T) {
		if (T != null) {
			emOrdem(T.esq);
			System.out.print (T.item + " ");
			emOrdem(T.dir);
		}
	}

	public void preOrdem (TNodo T) {
		if (T != null) {
			System.out.print (T.item + " ");
			preOrdem(T.esq);
			preOrdem(T.dir);
		}
	}

	public void posOrdem (TNodo T) {
		if (T != null) {
			posOrdem(T.esq);
			posOrdem(T.dir);
			System.out.print (T.item + " ");
		}
	}
}