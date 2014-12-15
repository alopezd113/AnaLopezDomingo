package modelo;

import java.util.Random;

public class Dado {

	private int cara ; 
	@SuppressWarnings("unused")
	private int testAleatorio[] =  { 0, 0, 0, 0, 0, 0, 0 };// int [] testAleatorio = new int [6];
	
	public int lanzarDado; //= (int) (Math.random()*6+1);

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	
	
	public int lanzarDado() {
	@SuppressWarnings("unused")
	Random random = new Random();
		cara = (int) (Math.random()*6+1); //random.nextInt(6) + 2; //= (int) (Math.random()*6+1);
		return cara;
	}

	public int getLanzarDado() {
		return lanzarDado;
	}

	public void setLanzarDado(int lanzarDado) {
		this.lanzarDado = lanzarDado;
	}

}
	
	
	
