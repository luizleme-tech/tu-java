package br.com.luizleme.tech.tujava.transacao;

import lombok.Getter;

import java.time.LocalDate;

public class Transacao {

	private String id;
	private double valor;
	private LocalDate data;
	@Getter
	private TipoTransacao tipo;

	public Transacao(String id, double valor, LocalDate data, TipoTransacao tipo) {
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}

	public boolean validar() {
		if(valor <=0) return false;
		if(data.isAfter(LocalDate.now())) return false;
		return tipo != null;
	}
}
