package parcial;

import java.util.ArrayList;

public class DVD {
	
	private ArrayList<Archivo> archivoDVD;
	
	private Boolean cerrado;

	public DVD() {
		super();
		this.archivoDVD = new ArrayList<Archivo>();
		this.cerrado = false;
	}

	public void agregarArchivo(Archivo archivo) {
		
		if (archivoDVD.contains(archivo) && cerrado!=true) {
			archivoDVD.add(archivo);
		}
	}

}
