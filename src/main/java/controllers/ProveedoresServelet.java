package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Proveedores;
import services.ClientesService;
import services.ProveedoresService;
import services.impl.ProveedoresServiceImpl;


@WebServlet("/Proveedores")
public class ProveedoresServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// definimos una clase para tomar objetos, el cual es "Categoria"
				private final ProveedoresService proveedoresService;
    public ProveedoresServelet() {
        super();
     // Aqui utilizamos lo definido arriba, es decir inicializamos 
        proveedoresService= new ProveedoresServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// definimos la lista
		List <Proveedores> proveedores=proveedoresService.listarProveedores();
		request.setAttribute("proveedores", proveedores);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/views/proveedores.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
