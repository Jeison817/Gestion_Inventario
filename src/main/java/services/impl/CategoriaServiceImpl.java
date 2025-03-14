package services.impl;
import java.util.List;


// importamos la libreria para el inicio de sesion es decir una instancia
import org.apache.ibatis.session.SqlSession;
// importamos la libreria para la sincronizacion con la base de datos
import config.MyBatisUtil;
// importamos la libreria que sincroniza la base de datos con las variables definidas en el java
import dao.CategoriasMapper;
// importamos la libreria que tiene los atributos de la clase, para los distintos objetos que vamos a definir
import models.Categorias;
// importamos la libreria que define el estado service
import services.CategoriasService;

// definimos el metodo, con el cual vamos a generar las interface sincronizadas con lo metodos
public class CategoriaServiceImpl implements CategoriasService{

	//  vamos a usar esta interfaz solo para listar
	@Override
	public List<Categorias> listarCategorias() {
		// abrimos un try-catch para evitar errores
		try {
			
			// iniciamos sesion 
			 SqlSession session  = MyBatisUtil.getSqlSessionFactory().openSession();
			// mapeamos la ubicacion de la sincronizacion de los datos de la tabla categorias y los atriburtos definidos 
			 // en la clase categoria
			 CategoriasMapper categoriaMapper=session.getMapper(CategoriasMapper.class);
			 // retornamos la el resultado de la sincronizacion de la BD y los atributos definidos
			return categoriaMapper.listarCategorias();
			
		} 
		// mostramos el error y mantenemos la sesion de la pagina
		catch (Exception e) {
			System.out.println(e);
		}
	    return null;
	}

	
	// Todavia no lo vamos a usar
	@Override
	public void insertarCategoria(Categorias categorias) {
		// TODO Auto-generated method stub
		
	}}