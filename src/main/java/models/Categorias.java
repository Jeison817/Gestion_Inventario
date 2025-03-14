package models;

import java.util.Date;

//---------------------------------------------------------
public class Categorias {
	
	// definimos los atributos de los objetos que se van usar de la clase Categorias
	
		private Integer idCategoria;
		private String nombre;
		private String imagenUrl;
		private String estadoAuditoria;
	    private Date fechaCreacion;
	    private String descripsion;
	    
	    
	    // Realizamos los respectivos Getter y Setter de los atributos, definidos.
		public Integer getIdCategoria() {
			return idCategoria;
		}
		public void setIdCategoria(Integer idCategoria) {
			this.idCategoria = idCategoria;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getImagenUrl() {
			return imagenUrl;
		}
		public void setImagenUrl(String imagenUrl) {
			this.imagenUrl = imagenUrl;
		}
		public String getEstadoAuditoria() {
			return estadoAuditoria;
		}
		public void setEstadoAuditoria(String estadoAuditoria) {
			this.estadoAuditoria = estadoAuditoria;
		}
		public Date getFechaCreacion() {
			return fechaCreacion;
		}
		public void setFechaCreacion(Date fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}
		public String getDescripsion() {
			return descripsion;
		}
		public void setDescripsion(String descripsion) {
			this.descripsion = descripsion;
		}
	
	
	
}