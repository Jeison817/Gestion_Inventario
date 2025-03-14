package models;

//import java.util.Date;

//---------------------------------------------------------
public class Productos {
	
	// definimos los atributos de los objetos que se van usar de la clase Categorias
	
		private Integer idPrducto;
		private String nombrePrducto;
		private String descripsionPrducto;
		private String cantidadUnida;
		private Double precioUnidad;
	    private Integer stockActual;
	    private Integer stockMinimo;
	    private Integer stockPedido;
	    private Integer idProveedor;
	    private Integer idCategoria;
	    
	    // generamos los getters and setters
		public Integer getIdPrducto() {
			return idPrducto;
		}
		public void setIdPrducto(Integer idPrducto) {
			this.idPrducto = idPrducto;
		}
		public String getNombrePrducto() {
			return nombrePrducto;
		}
		public void setNombrePrducto(String nombrePrducto) {
			this.nombrePrducto = nombrePrducto;
		}
		public String getDescripsionPrducto() {
			return descripsionPrducto;
		}
		public void setDescripsionPrducto(String descripsionPrducto) {
			this.descripsionPrducto = descripsionPrducto;
		}
		public String getCantidadUnida() {
			return cantidadUnida;
		}
		public void setCantidadUnida(String cantidadUnida) {
			this.cantidadUnida = cantidadUnida;
		}
		public Double getPrecioUnidad() {
			return precioUnidad;
		}
		public void setPrecioUnidad(Double precioUnidad) {
			this.precioUnidad = precioUnidad;
		}
		public Integer getStockActual() {
			return stockActual;
		}
		public void setStockActual(Integer stockActual) {
			this.stockActual = stockActual;
		}
		public Integer getStockMinimo() {
			return stockMinimo;
		}
		public void setStockMinimo(Integer stockMinimo) {
			this.stockMinimo = stockMinimo;
		}
		public Integer getStockPedido() {
			return stockPedido;
		}
		public void setStockPedido(Integer stockPedido) {
			this.stockPedido = stockPedido;
		}
		public Integer getIdProveedor() {
			return idProveedor;
		}
		public void setIdProveedor(Integer idProveedor) {
			this.idProveedor = idProveedor;
		}
		public Integer getIdCategoria() {
			return idCategoria;
		}
		public void setIdCategoria(Integer idCategoria) {
			this.idCategoria = idCategoria;
		}
	    


}