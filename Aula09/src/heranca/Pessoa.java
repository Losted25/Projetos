package heranca;

public class Pessoa {
	//Atributos
	
		private String nome, sexo;
		private int idade;
		
		//Métodos

		public void fazerAniversario() {
			this.idade++;
		}
		
		public Pessoa(String no, String se, int id) {
			super();
			this.nome = no;
			this.sexo = se;
			this.idade = id;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
}
