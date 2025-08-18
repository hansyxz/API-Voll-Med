package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        this.logradouro = dados.logradouro() != null ? dados.logradouro() : logradouro;
        this.bairro = dados.bairro() != null ? dados.bairro() : bairro;
        this.cep = dados.cep() != null ? dados.cep() : cep;
        this.cidade = dados.cidade() != null ? dados.cidade() : cidade;
        this.uf = dados.uf() != null ? dados.uf() : uf;
        this.numero = dados.numero() != null ? dados.numero() : numero;
        this.complemento = dados.complemento() != null ? dados.complemento() : complemento;
    }
}
