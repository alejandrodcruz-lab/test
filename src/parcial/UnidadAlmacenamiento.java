package parcial;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnidadAlmacenamiento { 
	
	Set <Archivo> archivos;
	Double capacidadMaxima;
	Character letra;
	

	public UnidadAlmacenamiento(Character letra, Double capacidadMaxima) {
		super();
		this.archivos = new HashSet<>();
		this.capacidadMaxima = capacidadMaxima;
		this.letra = letra;
	}

	public void agregarArchivo (Archivo archivo) throws capacidadExedidaException {
		if (this.archivos.size()<capacidadMaxima ) {
			archivos.add(archivo);
		}else {
			throw new capacidadExedidaException();
		}
	}
	
	public Set<Archivo> obtenerListaDeArchivosTipoJpgOrdenadosPorNombre(){
		
		Set <Archivo> archivosJpg = new TreeSet<>();
		
		for (Archivo archivo : archivos) {
			if (archivo.getExtension().equals("jpg")) {
				archivosJpg.add(archivo);
			};
		}
		return archivosJpg;
		
	}
	
	public Double calcularEspecioAlmacenado() {
		return (double) archivos.size();
		
	}
}
