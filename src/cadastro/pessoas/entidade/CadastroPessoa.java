package cadastro.pessoas.entidade;

import java.io.Serializable;
import java.util.Date;

public class CadastroPessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String primeiroNome;
	private String sobrenome;
	private Date dataNascimento;
	private String cpf;
	private Endereco endereco;
	
			
	public CadastroPessoa() {		
	}

	public CadastroPessoa(Long id, String primeiroNome, String sobrenome, Date dataNascimento, String cpf,
			Endereco endereco) {
		super();
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroPessoa other = (CadastroPessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CadastroPessoa [id=" + id + ", primeiroNome=" + primeiroNome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
}