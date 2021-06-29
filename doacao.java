package com.javatpoint.bean;

import java.util.*;


public class doacao {
	private int ID_doacao_donatario, ID_doacao, ID_donatario, peso_aprox, preco;
	private String isbn, nome_livro, genero, autor, editora, ano_publicacao, qtd_pagina, 
	foto_1, foto_2, foto_3, estado, rasuras, endereco, email_1, email_2, API_correios,
	API_chat, feedback_usuario; 
	private Boolean status;
	private Date data_entra = new Date();
	private Date data_sai = new Date();
	
	/*INTEIROS*/
	
	public int getID_doacao_donatario() {
		return ID_doacao_donatario;
	}
	
	public int getID_doacao() {
		return ID_doacao;
	}
	
	public int getID_donatario() {
		return ID_donatario;
	}
	
	public int getpeso_aprox() {
		return peso_aprox;
	}
	public void setpeso_aprox(int peso_aprox) {
		this.peso_aprox = peso_aprox;
	}
	
	public int getpreco() {
		return preco;
	}
	public void setpreco(int preco) {
		this.preco = preco;
	}
	
	/*STRINGS*/
	
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getnome_livro() {
		return nome_livro;
	}
	public void setnome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	
	public String getgenero() {
		return genero;
	}
	public void setgenero(String genero) {
		this.genero = genero;
	}
	
	public String getautor() {
		return autor;
	}
	public void setautorn(String autor) {
		this.autor = autor;
	}
	
	public String geteditora() {
		return isbn;
	}
	public void seteditora(String editora) {
		this.editora = editora;
	}
	
	public String getano_publicacao() {
		return ano_publicacao;
	}
	public void setano_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public String getqtd_pagina() {
		return qtd_pagina;
	}
	public void setqtd_pagina(String qtd_pagina) {
		this.qtd_pagina = qtd_pagina;
	}
	
	public String getfoto_1() {
		return foto_1;
	}
	public void setfoto_1(String foto_1) {
		this.foto_1 = foto_1;
	}
	
	public String getfoto_2() {
		return foto_2;
	}
	public void setfoto_2(String foto_2) {
		this.foto_2 = foto_2;
	}
	
	public String getfoto_3() {
		return foto_3;
	}
	public void setfoto_3(String foto_3) {
		this.foto_3 = foto_3;
	}
	
	public String getestado() {
		return estado;
	}
	public void setestado(String estado) {
		this.estado = estado;
	}
	
	public String getrasuras() {
		return rasuras;
	}
	public void setrasuras(String rasuras) {
		this.rasuras = rasuras;
	}
	
	public String getendereco() {
		return endereco;
	}
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getemail_1() {
		return email_1;
	}
	public void setemail_1(String email_1) {
		this.email_1 = email_1;
	}
	
	public String getemail_2() {
		return email_2;
	}
	public void setemail_2(String email_2) {
		this.email_2 = email_2;
	}
	
	public String getAPI_correios() {
		return API_correios;
	}
	
	public String getAPI_chat() {
		return API_chat;
	}
	
	public String getfeedback_usuario() {
		return feedback_usuario;
	}

	/*BOOLEANS E DATAS*/
	
	public Boolean getstatus() {
		return status;
	}
	public void setstatus(Boolean status) {
		this.status = status;
	}
	
	public Date getdata_entra() {
		return data_entra;
	}
	public void setdata_entra(Date data_entra) {
		this.data_entra = data_entra;
	}
	
	public Date getdata_sai() {
		return data_sai;
	}
	public void setdata_sai(Date data_sai) {
		this.data_sai = data_sai;
	}
}
