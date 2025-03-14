package dao;

//----- Importamos lo sgte
import java.util.List;
import models.Productos;

// Definimos el mapeo de la Interface
public interface ProductosMapper {
 // definimos todo los metodos 
	
	// ***** Definimos la una clase listar, para ver infirmaicon de la clase categorias *****
	List<Productos> listarProductos();
}