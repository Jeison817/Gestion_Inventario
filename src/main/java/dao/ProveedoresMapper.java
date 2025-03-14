package dao;

//----- Importamos lo sgte
import java.util.List;
import models.Proveedores;

// Definimos el mapeo de la Interface
public interface ProveedoresMapper {
 // definimos todo los metodos 
	
	// ***** Definimos la una clase listar, para ver infirmaicon de la clase categorias *****
	List<Proveedores> listarProveedores();
}