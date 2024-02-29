package edu.ebac.vinisantosn.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_CARRO")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "CODIGO", length = 30, nullable = false, unique = true)
    private String codigo;
    @Column(name = "MODELO", length = 30, nullable = false)
    private String modelo;
    @Column(name = "ANO_FABRICACAO", nullable = false)
    private int anoFabricacao;
    @Column(name = "PRECO", nullable = false)
    private double preco;
    @OneToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"), referencedColumnName = "id", nullable = false)
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
