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
		this.volumen = volumen;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	// Methods
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if(this.estado && 0 < this.canal && this.canal < 120 ) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.estado && 1 < this.canal && this.canal < 121) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.estado && -1 < this.volumen && this.volumen < 7) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.estado && 0 < this.volumen && this.volumen < 8) {
			this.volumen--;
		}
	}
}
