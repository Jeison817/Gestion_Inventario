package models;

//import java.util.Date;

//---------------------------------------------------------
public class Clientes {
	
	// definimos los atributos de los objetos que se van usar de la clase Categorias
	
		private Integer idCliente;
		private String nombreCompañia;
		private String nombreContacto;
		private String cargoContacto;
		private String direccion;
	    private String ciudad;
	    private String region;
	    private String codPostal;
	    private String pais;
	    private String telefono;
	    
	    // definimos los getter and setter
		public Integer getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(Integer idCliente) {
			this.idCliente = idCliente;
		}
		public String getNombreCompañia() {
			return nombreCompañia;
		}
		public void setNombreCompañia(String nombreCompañia) {
			this.nombreCompañia = nombreCompañia;
		}
		public String getNombreContacto() {
			return nombreContacto;
		}
		public void setNombreContacto(String nombreContacto) {
			this.nombreContacto = nombreContacto;
		}
		public String getCargoContacto() {
			return cargoContacto;
		}
		public void setCargoContacto(String cargoContacto) {
			this.cargoContacto = cargoContacto;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public String getCodPostal() {
			return codPostal;
		}
		public void setCodPostal(String codPostal) {
			this.codPostal = codPostal;
		}
		public String getPais() {
			return pais;
		}
		public void setPais(String pais) {
			this.pais = pais;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}





}