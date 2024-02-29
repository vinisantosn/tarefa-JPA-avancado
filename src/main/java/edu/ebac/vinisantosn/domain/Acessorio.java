package edu.ebac.vinisantosn.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq",sequenceName = "sq_acessorio", initialValue = 1,allocationSize = 1)
    private Long id;
    @Column(name = "nome",length = 30,nullable = false,unique = true)
    private String nome;
    @Column(name = "PRECO",nullable = false)
    private double preco;
    @Column(name = "DESCRICAO",length = 100,nullable = false)
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_acessorio"), referencedColumnName = "id", nullable = false)
    private Marca marca;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
