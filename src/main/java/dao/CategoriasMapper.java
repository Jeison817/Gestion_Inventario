package dao;

//----- Importamos lo sgte
import java.util.List;
import models.Categorias;

// Definimos el mapeo de la Interface
public interface CategoriasMapper {
 // definimos todo los metodos 
	
	// ***** Definimos la una clase listar, para ver infirmaicon de la clase categorias *****
	List<Categorias> listarCategorias();
}
