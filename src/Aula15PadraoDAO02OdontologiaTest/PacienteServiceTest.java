package Aula15PadraoDAO02OdontologiaTest;

import Aula15PadraoDAO02Odontologia.dao.impl.EnderecoDaoH2;
import Aula15PadraoDAO02Odontologia.dao.impl.PacienteDaoH2;
import Aula15PadraoDAO02Odontologia.model.Endereco;
import Aula15PadraoDAO02Odontologia.model.Paciente;
import Aula15PadraoDAO02Odontologia.service.EnderecoService;
import Aula15PadraoDAO02Odontologia.service.PacienteService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
public class PacienteServiceTest {

    private static PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new EnderecoDaoH2()));
    private static EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2());

    @BeforeClass
    public static void carregarDataSet() {
        Endereco endereco = new Endereco("Av. Magabeira", "500", "Pituba", "Salvador");
        Paciente paciente = pacienteService.salvar(new Paciente("Gaspar", "Sousa", "1234567890", new Date(), endereco));
        Endereco endereco2 = new Endereco("Av. Conde de Bonfim", "300", "Tijuca", "Rio de Janeiro");
        Paciente paciente2 = pacienteService.salvar(new Paciente("Cristina", "Salles", "0987654321", new Date(), endereco2));
    }

    @Test
    public void cadastrarEBuscarPacienteTEst(){
        Endereco endereco = new Endereco("Av. Atlântica", "125", "Copacabana", "Rio de Janeiro");
        Paciente paciente = pacienteService.salvar(new Paciente("Clarisse", "Telles", "1597536548", new Date(), endereco));
        Assert.assertNotNull(pacienteService.buscar(paciente.getId()));

    }

    @Test
    public void excluirPacienteTest() {
        pacienteService.excluir(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());
    }

    @Test
    public void trazerTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
        Assert.assertTrue(pacientes.size() == 2);
        System.out.println(pacientes);
    }


}
