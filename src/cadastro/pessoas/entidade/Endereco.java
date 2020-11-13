package cadastro.pessoas.entidade;

import java.io.Serializable;

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String logradouro;
	private String nomeLogradouro;
	private String numero;
	private String complemento;
	private String cep;
	private String estado;
	private String cidade;
	
	
	private CadastroPessoa cadastroPessoa;
	
	public Endereco() {		
	}

	public Endereco(Long id, String logradouro, String nomeLogradouro, String numero, String complemento, String cep,
			String estado, String cidade, CadastroPessoa cadastroPessoa) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.cadastroPessoa = cadastroPessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNomeLogradouro() {
		return nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public CadastroPessoa getCadastroPessoa() {
		return cadastroPessoa;
	}

	public void setCadastroPessoa(CadastroPessoa cadastroPessoa) {
		this.cadastroPessoa = cadastroPessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", nomeLogradouro=" + nomeLogradouro + ", numero="
				+ numero + ", complemento=" + complemento + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade
				+ ", cadastroPessoa=" + cadastroPessoa + "]";
	}

}
