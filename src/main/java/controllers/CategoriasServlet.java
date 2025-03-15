package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Categorias;
import services.CategoriasService;
import services.impl.CategoriaServiceImpl;

@WebServlet("/Categorias")
public class CategoriasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// definimos una clase para tomar objetos, el cual es "Categoria"
		private final CategoriasService categoriasService; 
	
    public CategoriasServlet() {
        super();
     // Aqui utilizamos lo definido arriba, es decir inicializamos 
        categoriasService= new CategoriaServiceImpl();
    }

    
    // Como solo vamos a listar, nesecitamos solo el get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// definimos la lista
		List <Categorias> categorias=categoriasService.listarCategorias();
		request.setAttribute("categorias", categorias);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/views/categorias.jsp");
        dispatcher.forward(request, response);
	}



}