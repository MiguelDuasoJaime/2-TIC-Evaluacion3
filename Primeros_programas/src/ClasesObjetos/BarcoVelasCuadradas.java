package ClasesObjetos;

public class BarcoVelasCuadradas extends Barco	{
	private boolean hasVelasCuadradas;
	public BarcoVelasCuadradas(String nom, int size, int nPal) {
		super(nom, size, nPal);
		this.setHasVelasCuadradas(true);
		// TODO Auto-generated constructor stub
	}
	public boolean isHasVelasCuadradas() {
		return hasVelasCuadradas;
	}
	public void setHasVelasCuadradas(boolean h) {
		this.hasVelasCuadradas = h;
	}
	
}
