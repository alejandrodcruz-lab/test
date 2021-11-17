package parcial;

import java.util.ArrayList;

public class DiscoRigidos {
	
	private ArrayList<Archivo> archivoHDD;
	
	public DiscoRigidos() {
		super();
		this.archivoHDD = new ArrayList<Archivo>();
	}

	public void agregarArchivo(Archivo archivo) {
		
		if (archivoHDD.contains(archivo)) {
			archivoHDD.add(archivo);
		}
	}
	
	public void formatearHDD() {
		
		archivoHDD.clear();
	}

}
