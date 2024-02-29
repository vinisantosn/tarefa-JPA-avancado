package edu.ebac.vinisantosn.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TBL_MARCA")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq",sequenceName = "sq_marca", initialValue = 1,allocationSize = 1)
    private Long id;
    @Column(name = "NOME",length = 30,nullable = false,unique = true)
    private String nome;
    @Column(name = "PAIS_ORIGEM",length = 30,nullable = false)
    private String paisOrigem;
    @Column(name = "ANO_FUNDACAO",nullable = false)
    private int anoFundacao;

    @OneToOne(mappedBy = "marca")
    private Carro carro;
    @OneToMany(mappedBy = "marca")
    private List<Acessorio> acessorios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
