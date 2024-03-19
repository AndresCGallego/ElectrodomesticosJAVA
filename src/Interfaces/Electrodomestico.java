package Interfaces;

import Enumerados.Color;
import Enumerados.Consumo;

public interface Electrodomestico {
	
	public Double getPrecioBase();
	public Double getPeso();
	public Consumo getConsumo();
	public Color getColor();
	public void setPrecioBase(Double precioBase);
	public void setPeso(Double peso);
	public void setConsumo(Consumo consumo);
	public void setColor(Color color);
	public Double calculaPrecioBlackFriday(Double a);
	public Boolean esEficiente();
	public Boolean tieneGastosEnvioGratis();
	public Double calcularPrecioTotal();
	public String toString();
	public Double sumaPrecios(Electrodomestico x);
	public Boolean esMuyPesado(Electrodomestico c);
	public Boolean esElectrodomesticoMenosPesado(double peso);
	public Boolean precioEnRango(Double precioInferior, Double precioSuperior);
	public Boolean tieneColorYPrecioIgualoInferior(Color color, Double precio);
	public Boolean tieneCertificadoEnergetico(Consumo consumo, Double valor);
	
	

}
