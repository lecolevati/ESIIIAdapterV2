package controller;

import model.Cartao;

public class Visa {

	public void validarCartao(Cartao cartao) {
		System.out.println("Cart�o: "+cartao.getNumeroCartao()+" CVV: "+cartao.getCvv()+"  v�lido");
	}
	
	public void pagar(double valor) {
		System.out.println("Pago com VISA, valor: R$"+valor);
	}
	
}
