package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	// Getters
	public Marca getMarca() {
		return this.marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	
	// Setters
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if(-1 < volumen && volumen < 8) {
			this.volumen = volumen;
		}
	}
	
	public void setCanal(int canal) {
		if(0 < canal && canal < 121) {
			this.canal = canal;
		}
	}
	
	public static void setNumTV(int newNumTV) {
		numTV = newNumTV;
	}
	
	// Methods
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		setCanal(this.canal+1);
	}
	
	public void canalDown() {
		setCanal(this.canal-1);
	}
	
	public void volumenUp() {
		setVolumen(this.volumen+1);
	}
	
	public void volumenDown() {
		setVolumen(this.volumen-1);
	}
}
