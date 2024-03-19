package Electrodomestico;

import Enumerados.Consumo;
import Enumerados.Color;
import Interfaces.Electrodomestico;

public class ElectrodomesticoImpl implements Electrodomestico{

	// --------VARIABLES -------- //
		private Double precioBase;
		private Color color;
		private Consumo consumo;
		private Double peso;
		
		//----CONSTANTES-----//

		private final Double GASTOS_ENVIO= 19.9;
		private final Double DESCUENTO = 0.25;
		

		// --------CONSTRUCTORES-------- //
		public ElectrodomesticoImpl() {
			precioBase = 150.00;
			color = Color.BLANCO;
			consumo = Consumo.C;
			peso = 100.00;
		}
		public ElectrodomesticoImpl(Double peso, Double precioBase) {
			this.precioBase = precioBase;
			this.peso = peso;
			consumo = consumo.C;
			color = color.BLANCO;
		}

		public ElectrodomesticoImpl(Double peso, Double precioBase, Color color, Consumo consumo) {
			this.precioBase = precioBase;
			this.peso = peso;
			this.consumo = consumo;
			this.color = color;
		}

		public ElectrodomesticoImpl(Double peso, Double precioBase, String color, String consumo) {
			this.precioBase = precioBase;
			this.peso = peso;
			this.consumo = Consumo.valueOf(consumo.toUpperCase());
			this.color = Color.valueOf(color.toUpperCase());
		}
		// --------GETTERS & SETTERS---metodos----- //
		public Double getPrecioBase() {
			return precioBase;
		}
		public Double getPeso() {
			return peso;
		}
		public Consumo getConsumo() {
			return consumo;
		}
		public Color getColor() {
			return color;
		}
		public void setPrecioBase(Double precioBase) {
			this.precioBase = precioBase;
		}
		public void setPeso(Double peso) {
			this.peso = peso;
		}
		public void setConsumo(Consumo consumo) {
			this.consumo = consumo;
		}
		public void setColor(Color color) {
			this.color = color;
			
		}
		// --------METODOS-------- //
	public Double calculaPrecioBlackFriday(Double a) {
		a = a - (DESCUENTO * a);
		return a;                              
			}
	 public Boolean esEficiente() { // ejercicio 6
	        Boolean a = false;
	        if (this.getConsumo().equals(Consumo.A)) {
	            a = true;
		}
			return a;
	 }

	    public Boolean tieneGastosEnvioGratis() {

	        return this.getPeso() < 8 || this.getPeso() > 200;
	    }

	    public Double calcularPrecioTotal() {
	    	 
	        return this.getPrecioBase() + GASTOS_ENVIO;
	    }
	    public String toString() {

	        return "precio: " + this.precioBase.toString() + ", " + this.color.toString() + ", " + this.consumo.toString()
	                + ", " + "peso: " + this.peso.toString();
	    }
	    public Double sumaPrecios(Electrodomestico electrodomestico) {

	        return this.getPrecioBase() + electrodomestico.getPrecioBase();
	    }

	    public Boolean esMuyPesado(Electrodomestico electrodomestico) {

	        return this.getPeso() > electrodomestico.getPeso() || this.getPeso() >= 250;
	    }

	    public Boolean esElectrodomesticoMenosPesado(Double peso) {

	        return this.getPeso() < peso;
	        // o de esta manera //
	        
	        /*    if(this.getPeso ()< peso){
	        		res=true 
	        		}
	    			return res;
				}*/
	        
	    }

	    public Boolean precioEnRango(Double precioInferior, Double precioSuperior) {
	        return this.getPrecioBase() >= precioInferior && this.getPrecioBase() <= precioSuperior;
	    }

	    public Boolean tieneColorYPrecioIgualoInferior(Color color, Double precio) {
	        return this.getColor().equals(color) && this.getPrecioBase() <= precio;
	    }

	    public Boolean tieneCertificadoEnergetico(Consumo consumo, Double valor) {
	        return this.calculaPrecioBlackFriday(valor) <= valor && this.getConsumo().equals(consumo);
	        /* if (this.calculaPrecioBlackFriday(valor) <= valor && this.getConsumo().equals(consumo)){
	         * res=true;
	         * }
	         * return= res;
	         * }
	         * 
	         */
	         
	
	    
		}
		@Override
		public Boolean esElectrodomesticoMenosPesado(double peso) {
			// TODO Auto-generated method stub
			return null;
		}
		
		}
		

   

