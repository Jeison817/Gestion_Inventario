package services.impl;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import config.MyBatisUtil;
import dao.ProductosMapper;
import models.Productos;
import services.ProductosService;

public class ProductosServiceImpl implements ProductosService{

	@Override
	public List<Productos> listarProductos() {
		// abrimos un try-catch para evitar errores
				try {
					
					// iniciamos sesion 
					 SqlSession session  = MyBatisUtil.getSqlSessionFactory().openSession();
					//  mapeamos la ubicacion de la sincronizacion de los datos de la tabla categorias y
					 // los atriburtos definidos en la clase categoria
					 // Asi que definimos una clase y respectivo objeto
					 ProductosMapper productosMapper=session.getMapper(ProductosMapper.class);
					 // retornamos la el resultado de la sincronizacion de la BD y los atributos definidos
					return productosMapper.listarProductos();
					
				} 
				// mostramos el error y mantenemos la sesion de la pagina
				catch (Exception e) {
					System.out.println(e);
				}
			    return null;
	}

	@Override
	public void insertarCategoria(Productos productos) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}