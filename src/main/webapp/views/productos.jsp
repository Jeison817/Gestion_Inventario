<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- iMPORTAMOS LAS LIBRERIAS QUE VAMOS A USAR -->
 <%@ page import="java.util.List" %>
 <%@ page import="models.Productos" %>
 <!-- forma en como se importa las librerias -->
    
<!DOCTYPE html>
<html>
<!-- CABEZA -->
<head>
    <meta charset="UTF-8">
    <title> Gestion de Inventario | SISE </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://unpkg.com/@tailwindcss/browser@4"></script>
</head>
<!-- CUERPO -->
<body>

   <!-- REplicamos todo lo que se encuentra en INDEX -->
   <!-- definimos las cabeceras  -->
   <!-- border border-white border-solid (marcar border que usamos en alguna imagen) -->
   <header>
      <div class="flex gap-4 bg-green-600 justify-center h-[50px] items-center">
         <a href="/Gestion_Inventario" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer "> Inicio </a>
         <a href="/Gestion_Inventario/Categorias" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer "> Categorias </a>
         <a href="/Gestion_Inventario/Clientes" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer "> Clientes </a>
         <a href="/Gestion_Inventario/Productos" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer border border-white border-solid"> Productos </a>
         <a href="/Gestion_Inventario/Proveedores" class="h-auto text-white hover:bg-green-700 p-2 rounded-md cursor-pointer "> Proveedores </a>
      </div>
   </header>
   
   
   <!--  Replicamos el main de index -->
   <main class="p-4">
   <h1 class="text-3xl font-bold mb-4 text-center">Algunos de nuestros Productos</h1>
        <div class="flex w-full justify-center p-4 gap-4 flex-wrap">  
          <%
          List<Productos> productos=(List<Productos>) request.getAttribute("productos");
             if(productos!=null && !productos.isEmpty()){
            	 for (Productos producto: productos){        
          %>
        
            <div class="flex bg-gray-200 w-[200px] justify-center flex-col p-4 gap-2 items-center rounded-md border border-gray-300 border-solid hover:border-green-600 cursor-pointer">
               <img class="rounded-sm" src="<%= producto.getDescripsionPrducto() %>" width="150px">
               
                                  
               <p class="text-center"> <%= producto.getNombrePrducto() %></p>
               <p class="text-center">Stock: <%= producto.getStockActual() %></p>
               <p class="text-center">Precio: <%= producto.getPrecioUnidad() %></p>
               
            </div>
          <% } %>
          <% }else{ %>
         <p>No se encontraron registros</p> 
         <% } %>
        
        </div>
        <div>Total Registros: <%=productos.size() %></div>        
   </main>  
</body>
</html>