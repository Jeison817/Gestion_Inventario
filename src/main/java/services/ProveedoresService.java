package services;

import java.util.List;
import models.Proveedores;

public interface ProveedoresService {

	// Definimos la interface Listar
	List<Proveedores> listarProveedores();

	// Definimos la interface Insertar
	void insertarCategoria(Proveedores proveedores);
}