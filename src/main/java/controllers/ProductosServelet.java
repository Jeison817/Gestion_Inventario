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
import models.Productos;
import services.ProductosService;
import services.impl.ProductosServiceImpl;

/**
 * Servlet implementation class ProductosServelet
 */
@WebServlet("/Productos")
public class ProductosServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// definimos una clase para tomar objetos, el cual es "Categoria"
				private final ProductosService productosService;
    public ProductosServelet() {
        super();
     // Aqui utilizamos lo definido arriba, es decir inicializamos 
        productosService= new ProductosServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// definimos la lista
		List <Productos> productos=productosService.listarProductos();
		request.setAttribute("productos", productos);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/views/productos.jsp");
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
