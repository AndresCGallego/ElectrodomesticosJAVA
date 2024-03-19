package test;

import Enumerados.Consumo;
import Enumerados.Color;
import Interfaces.Electrodomestico;
import Electrodomestico.ElectrodomesticoImpl;

import java.util.Scanner;
public class test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Electrodomestico e1= new ElectrodomesticoImpl(250.0, 200.0,Color.GRIS, Consumo.A);
		System.out.println("introduce un precio para el electrodomestico");
		Double precioE2ingreso= sc.nextDouble();
		System.out.println("introduce un peso para el electrodomestico");
		Double pesoE2ingreso= sc.nextDouble();
		Electrodomestico e2= new ElectrodomesticoImpl(pesoE2ingreso, precioE2ingreso);
		
		System.out.println("introduce un peso para el electrodomestico e3");
		Double pesoE3ingreso= sc.nextDouble(); 
		System.out.println("introduce un precio para el electrodomestico e3");
		Double precioE3ingreso= sc.nextDouble(); 
		
		System.out.println("introduce un color para el electrodomestico e3, BLANCO, NEGRO, ROJO, AZUL ó GRIS");
		String colorE3ingreso= scString.nextLine();
		
		System.out.println("introduce un consumo para el electrodomestico e3, A, B, C, D, E ó F");
		String consumoE3ingreso= scString.nextLine(); 
		
		Electrodomestico e3= new ElectrodomesticoImpl(pesoE3ingreso, precioE3ingreso, colorE3ingreso, consumoE3ingreso);
		
		
		//18. calcula el precio de e1 con el descuento de black friday//
		System.out.println("calculo de precio con Black Friday : " + e1.calculaPrecioBlackFriday(200.0));
		
		//19. muestre si e2 tiene envio gratis//
		System.out.println("tiene gastos de envio gratis: " + e2.tieneGastosEnvioGratis());
		
		//20. e1 y e2 eficientes?//
		System.out.println("son eficientes e1: " + e1.esEficiente() + " y e2 : " + e2.esEficiente());
		
		//blackfriday cambiado a 25% para e2//
		System.out.println("calculo de precio con Black Friday : " + e2.calculaPrecioBlackFriday(200.0));
		
	
		//22.mostrar formato cadena de e1 y e2//
		System.out.println("e1: "+e1.toString() + "e2 : " +e2.toString());
		
		//  mostrar por pantalla si e2 tiene gastos de envio gratis  //
		System.out.println("tiene gastos de envio gratis?" + e2.tieneGastosEnvioGratis());
		
		// 23.  ha habido error en e 1 y e 1 consumo energetico es B, cambiar el valor y ver si es eficiente o no//
		
		e1.setConsumo(Consumo.B);
		System.out.println("es eficiente e1?" + e1.esEficiente());
		
		//24)lola quiere saber  cuanto costaria e1 y e3 juntos//
		
		System.out.println("EL precio sumado de ambos es: " + e1.sumaPrecios(e3));
		
		//25)e3 es muy  pesado? es superior de 250kg?//
		
		System.out.println ("es muy pesado? : " + e3.esMuyPesado(e1));
		
		
		//26) E1 PESO INFERIOR A 300? //
		
		System.out.println ("e1 con peso inferior a 300? : " + e1.esElectrodomesticoMenosPesado(300));
		
		
		//27 QUE ELECTRODOMESTICO PUEDE COMPRAR
		
		
		System.out.println ("lola puede comprar el electrodomestico e1? : " + e1.precioEnRango(100.0, 200.0) );
		System.out.println ("lola puede comprar el electrodomestico e2?: " + e2.precioEnRango(100.0, 200.0) );
		System.out.println ("lola puede comprar el electrodomestico e3?: " + e3.precioEnRango(100.0, 200.0) );
		
		//28) electrodomestico GRIS por menos de 30 ó 30 euros
		e1.precioEnRango(0.0, 30.0);
		e2.precioEnRango(0.0, 30.0);
		e3.precioEnRango(0.0, 30.0);
		
		System.out.println ("lola puede comprar el electrodomestico E1 : " +Color.GRIS + e1.precioEnRango(0.0, 30.0));
		System.out.println ("lola puede comprar el electrodomestico E2 : " +Color.GRIS + e2.precioEnRango(0.0, 30.0));
		System.out.println ("lola puede comprar el electrodomestico E3 : " +Color.GRIS + e3.precioEnRango(0.0, 30.0));
		
		//29) rafa compra electrodomestico certificacion A y por menos de 200euros
		e1.tieneCertificadoEnergetico(Consumo.A, 199.99);
		e2.tieneCertificadoEnergetico(Consumo.A, 199.99);
		e3.tieneCertificadoEnergetico(Consumo.A, 199.99);
		System.out.println ("Rafa puede comprar el electrodomestico E1: " +e1.tieneCertificadoEnergetico(Consumo.A, 199.99));
		System.out.println ("Rafa puede comprar el electrodomestico E2: " +e2.tieneCertificadoEnergetico(Consumo.A, 199.99));
		System.out.println ("Rafa puede comprar el electrodomestico E3: " +e3.tieneCertificadoEnergetico(Consumo.A, 199.99));
	}

}
