package services;

import java.util.List;
import models.Clientes;

public interface ClientesService {

	// Definimos la interface Listar
	List<Clientes> listarClientes();

	// Definimos la interface Insertar
	void insertarCategoria(Clientes clientes);
}