package Aula13PadraoDAO01Farmacia.service;

import Aula13PadraoDAO01Farmacia.dao.IDao;
import Aula13PadraoDAO01Farmacia.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;

    }

    public Medicamento salvar(Medicamento medicamento) {
        return medicamentoDao.salvar(medicamento);
    }

    public Medicamento buscar(Integer id) {
        return medicamentoDao.buscar(id);
    }

}
