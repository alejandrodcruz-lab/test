package parcial;

import java.util.Objects;

public class Archivo {
	
	private String nombre;
	private String extension;
	
	
	public Archivo(String nombre, String extension) {
		super();
		this.nombre = nombre;
		this.extension = extension;
	}


	@Override
	public int hashCode() {
		return Objects.hash(extension, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Archivo other = (Archivo) obj;
		return Objects.equals(extension, other.extension) && Objects.equals(nombre, other.nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}

	
	
}
