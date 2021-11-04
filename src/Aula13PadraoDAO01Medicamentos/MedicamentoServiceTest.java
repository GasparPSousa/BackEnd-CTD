package Aula13PadraoDAO01Medicamentos;

import Aula13PadraoDAO01Farmacia.dao.ConfiguracaoJDBC;
import Aula13PadraoDAO01Farmacia.dao.impl.MedicamentoDAOH2;
import Aula13PadraoDAO01Farmacia.model.Medicamento;
import Aula13PadraoDAO01Farmacia.service.MedicamentoService;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.Assert;
import org.junit.jupiter.api.Assertions;


public class MedicamentoServiceTest {


    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDAOH2(new ConfiguracaoJDBC()));

    @Test
    private void guardarMedicamento() {
        Medicamento medicamento = new Medicamento(
                "Iboprofeno",
                "lab123",
                1000,
                200.0);

        medicamentoService.salvar(medicamento);
//        Assert.assertTrue(medicamento.getId() != null);
        Assertions.assertTrue(medicamento.getId() != null);

    }
}

//jdbc:h2:tcp://localhost/~/test

// this.dbUrl = "jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/create.sql'";
