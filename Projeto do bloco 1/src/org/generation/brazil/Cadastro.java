package org.generation.brazil;

import java.util.Scanner;

public class Cadastro {
		
		Scanner leitor = new Scanner(System.in);
		
		private String nome;
		private String telefone;
		private String enderešo;
		private String usuario;
		private String senha;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEnderešo() {
			return enderešo;
		}
		public void setEnderešo(String enderešo) {
			this.enderešo = enderešo;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
}
