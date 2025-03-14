package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import models.Clientes;
import services.ClientesService;
import services.impl.ClientesServiceImpl;


// definimos una direccion mas directa "Clientes"
@WebServlet("/Clientes")
public class ClientesServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// definimos una clase para tomar objetos, el cual es "Categoria"
			private final ClientesService clientesService;
    public ClientesServelet() {
        super();
     // Aqui utilizamos lo definido arriba, es decir inicializamos 
        clientesService= new ClientesServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// definimos la lista
				List <Clientes> clientes=clientesService.listarClientes();
				request.setAttribute("clientes", clientes);
		        RequestDispatcher dispatcher=request.getRequestDispatcher("/views/clientes.jsp");
		        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
