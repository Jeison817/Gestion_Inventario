package services;

import java.util.List;
import models.Productos;

public interface ProductosService {

	// Definimos la interface Listar
	List<Productos> listarProductos();

	// Definimos la interface Insertar
	void insertarCategoria(Productos productos);
}