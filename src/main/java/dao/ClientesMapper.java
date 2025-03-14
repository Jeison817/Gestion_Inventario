package dao;

//----- Importamos lo sgte
import java.util.List;
import models.Clientes;

// Definimos el mapeo de la Interface
public interface ClientesMapper {
 // definimos todo los metodos 
	
	// ***** Definimos la una clase listar, para ver infirmaicon de la clase categorias *****
	List<Clientes> listarClientes();
}
