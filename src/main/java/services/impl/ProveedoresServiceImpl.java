package services.impl;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import config.MyBatisUtil;

import dao.ProveedoresMapper;
import models.Proveedores;
import services.ProveedoresService;

public class ProveedoresServiceImpl implements ProveedoresService{

	@Override
	public List<Proveedores> listarProveedores() {
		// abrimos un try-catch para evitar errores
				try {
					
					// iniciamos sesion 
					 SqlSession session  = MyBatisUtil.getSqlSessionFactory().openSession();
					// mapeamos la ubicacion de la sincronizacion de los datos de la tabla categorias y los atriburtos definidos 
					 // en la clase categoria
					 ProveedoresMapper proveedoresMapper=session.getMapper(ProveedoresMapper.class);
					 // retornamos la el resultado de la sincronizacion de la BD y los atributos definidos
					return proveedoresMapper.listarProveedores();
					
				} 
				// mostramos el error y mantenemos la sesion de la pagina
				catch (Exception e) {
					System.out.println(e);
				}
			    return null;
	}

	@Override
	public void insertarCategoria(Proveedores proveedores) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}