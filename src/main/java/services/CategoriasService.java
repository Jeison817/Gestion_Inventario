package services;

import java.util.List;

import models.Categorias;

public interface CategoriasService {

	// Definimos la interface Listar
	List<Categorias> listarCategorias();

	// Definimos la interface Insertar
	void insertarCategoria(Categorias categorias);
}
