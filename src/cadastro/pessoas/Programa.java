package cadastro.pessoas;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import cadastro.pessoas.entidade.CadastroPessoa;
import cadastro.pessoas.entidade.Endereco;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Endereco endereco1 = new Endereco(2L, "Rua", "Estevao Jordan", "254", "Apto 732", "05861-300", "Sao Paulo", "SP", null);
		CadastroPessoa cP1 = new CadastroPessoa(1L, "Lucas", "Araujo", sdf.parse("25/05/1984"), "321.787.088-38", endereco1);
		
		
		System.out.println(cP1);
		
	}
}
