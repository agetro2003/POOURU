package POOURU;

public class Camioneta {


	private int ancho; 
	
	private int largo; 
	
	private int pesoInicial;
	
	private int capacidad_de_carga;
	
	private boolean traccionAutomatica, climatizador, traccion_4_ruedas, asientoCuero;

	private String color;
	
	private int asientos;
	
	private int peso_total;
	
	private int precioInicial;
	


	// Metodo constructor
	
	public Camioneta() {
		
		ancho = 1000;
		largo = 3000;
		pesoInicial = 2500;
		capacidad_de_carga = 750;
		precioInicial = 15000;
}

	public String DimeCaracteristicasGenerales () {
		return "La camioneta tiene unas medidas de "+ancho/1000+" metros de ancho y "
		+largo/1000+" metros de largo. Tiene un peso de "+pesoInicial+" kg y una capacidad de carga de "+capacidad_de_carga+"  kg";
	}
	
	public void EstablecerColor(String colorCamioneta) {
		color = colorCamioneta;
	}
	public String DimeColor() {
		return "El color de la camioneta es " +color;
	}
	
	public void EstablecerAsientos (int asientosCamioneta) {
		asientos = asientosCamioneta;
}
	public String DimeAsientos () {
		return "La cantidad de asientos es " +asientos; 
	}
	
	public void ConfigurarTraccionAutomatica (String traccionAutomatica){
		
		if (traccionAutomatica.equalsIgnoreCase("si")) {
			this.traccionAutomatica = true;
		}
		else {
			this.traccionAutomatica = false;
		}
	
	}
	
	public String DimeTraccionAutomatica() {
		if (traccionAutomatica == true) {
			return "La camioneta es automatica";
		}
		else {
			return "La camioneta es sincronica";
		}
	}
	
	 public void ConfigurarClimatizador(String climatizador) {
	       
	        if(climatizador.equalsIgnoreCase("si")) {
	           
	            this.climatizador =true;
	           
	        }else {
	           
	            this.climatizador= false;
	        }
	       
	    }
	 
	 public String DimeClimatizador() {
	       
	        if(climatizador==true) {
	           
	            return "La camioneta tiene climatizador";
	           
	        }else {
	           
	            return "La camioneta lleva aire acondicionado";
	        }
	    }
	 
	 public void ConfigurarTraccionRuedas(String traccion_4_ruedas) {
	       
	        if(traccion_4_ruedas.equalsIgnoreCase("si")) {
	           
	            this.traccion_4_ruedas =true;
	           
	        }else {
	           
	            this.traccion_4_ruedas= false;
	        }
	       
	    }
	 public String DimeTraccionRuedas() {
	       
	        if(traccion_4_ruedas==true) {
	           
	            return "La camioneta tiene traccion a 4 ruedas";
	           
	        }else {
	           
	            return "La camioneta no tiene traccion a 4 ruedas";
	        }
	    }
	   
	 public void ConfigurarAsientoCuero(String asientoCuero) {

	        if(asientoCuero.equalsIgnoreCase("si")) {
	           
	            this.asientoCuero= true;
	           
	        }else {
	           
	            this.asientoCuero= false;
	        }
	    }
	   
	    public String DimeAsientoCuero() {
	       
	        if(asientoCuero == true) {
	           
	            return "La camioneta tiene asientos de cuero";
	           
	        }else {
	           
	            return "La camioneta tiene asientos serie";
	        }
	    }
	
	public String DimePesoCamioneta() {
		
		peso_total = pesoInicial;
		
		if(asientoCuero == true) {
			peso_total += 50;
		}
		
		if(climatizador == true) {
	           
            peso_total += 20;
		
	}
		if (traccion_4_ruedas == true) {
			peso_total += 20;
		}
		return "El peso del coche es " + peso_total + " kg"; 
}
	
	public String CalcularPrecioCamioneta() {
	       
        int precioFinal = precioInicial;
       
        if(asientoCuero) {
           
            precioFinal+=2000;
        }
       
        if(climatizador) {
            precioFinal+=1500;
        }
       if(traccion_4_ruedas == true) {
    	   precioFinal+= 1500;
       }
       if(traccionAutomatica == true) {
    	   precioFinal+=1000;
       }
       
       precioFinal+= asientos*100;
       
        return "El precio final es "+ precioFinal;
    }
	
	
}

	    
