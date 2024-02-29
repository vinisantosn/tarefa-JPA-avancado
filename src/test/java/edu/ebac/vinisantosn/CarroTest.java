package edu.ebac.vinisantosn;

import edu.ebac.vinisantosn.dao.CarroDAO;
import edu.ebac.vinisantosn.dao.ICarroDAO;
import edu.ebac.vinisantosn.dao.IMarcaDAO;
import edu.ebac.vinisantosn.dao.MarcaDAO;
import edu.ebac.vinisantosn.domain.Carro;
import edu.ebac.vinisantosn.domain.Marca;
import org.junit.Test;

public class CarroTest {
    private ICarroDAO carroDAO;
    private IMarcaDAO marcaDAO;

    public CarroTest(){
        carroDAO = new CarroDAO();
        marcaDAO = new MarcaDAO();

    }
    @Test
    public void cadastrarCarroTest(){
        Marca marca =  criarMarca("FIAT");
        Carro carro = new Carro();
        carro.setCodigo("CAR01");
        carro.setAnoFabricacao(2024);
        carro.setModelo("Argo");
        carro.setMarca(marca);
        carro = carroDAO.cadastrar(carro);


    }

    private Marca criarMarca(String nomeMarca) {
        Marca marca = new Marca();
        marca.setNome(nomeMarca);
        marca.setAnoFundacao(1914);
        marca.setPaisOrigem("Alemanha");
        return marcaDAO.cadastrar(marca);
    }
}
