package POOURU;

public class Coche {
   
    private int ruedas;
   
    private int largo;
   
    private int ancho;
   
    private int motor;
   
    private int peso;
   
    private String color;
   
    private int pesoTotal;
   
    private int pesoPlataforma;
   
    private boolean asientoCuero, climatizador;

   
    // Metodo constructor ,para dar un estado inicial a los objetos
   
    public Coche() {
       
        ruedas= 4;
        largo = 2000;
        ancho = 300;
        motor =1600;
        peso= 500;
        pesoPlataforma= 500;
       
    }
   
    public String DimeTadosGenerales() {//Getter
        return "La plataforma del vehiculo tiene " + ruedas+ " ruedas"+
            ". Mide "+largo/1000 + " metros y de ancho " + ancho +
            " cm, con un peso de plataforma "+
        pesoPlataforma + " Kg";
    }

    public void estableceColor(String colorCoche) { //Setter
        color = colorCoche ;
    }
   
    public String dimeColor() {//Getter
        return "El color del coche es " +color;
    }
   
    public void cofiguraAsientos(String asientoCuero) {//Setter

        if(asientoCuero.equalsIgnoreCase("si")) {
           
            this.asientoCuero= true;
           
        }else {
           
            this.asientoCuero= false;
        }
    }
   
    public String dimeAsientos() {
       
        if(asientoCuero == true) {
           
            return "El coche tiene asientos de cuero";
           
        }else {
           
            return "El coche tiene asientos serie";
        }
       
    }
   
    public void cofiguraClimatizador(String climatizador) {//Setter
       
        if(climatizador.equalsIgnoreCase("si")) {
           
            this.climatizador =true;
           
        }else {
           
            this.climatizador= false;
        }
       
    }
   
    public String dimeClimatizador() {//Getter
       
        if(climatizador==true) {
           
            return "El coche tiene climatizador";
           
        }else {
           
            return "El coche lleva aire acondicionado";
        }
    }
   
    public String dimePesoCoche() {//Setter y Getter
       
        int pesoCarroceria = 500;
       
        pesoTotal = pesoPlataforma + pesoCarroceria;
       
        if(asientoCuero == true) {
             
            pesoTotal = pesoTotal + 50;
        }
       
        if(climatizador ==true) {
           
            pesoTotal = pesoTotal +20 ;
        }
       
        return "El peso de coche es "+ pesoTotal;
       
    }
   
    public int precioCoche() {
       
        int precioFinal =10000;
       
        if(asientoCuero) {
           
            precioFinal+=2000;
        }
       
        if(climatizador) {
            precioFinal+=1500;
        }
       
        return precioFinal;
    }
   
   
}