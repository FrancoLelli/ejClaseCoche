public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private String combustible;
    private int cantidadDeCombustible;
    private boolean encendido;

    public Coche(String color,String marca,String modelo,String combustible, int cantidad){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.cantidadDeCombustible = cantidad;
        this.encendido = false;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCombustible(){
        return combustible;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getCantidadDeCombustible() {
        return cantidadDeCombustible;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void llenarDeposito(String tipoDeCombustible){
        if(tipoDeCombustible == "Nafta"){
            System.out.println("El valor es de $100");

        }else{
            System.out.println("El valor es de $50");
        }
        System.out.println("Se ha llenado el deposito. Gracias!");
    }

    public void tocarClaxon(){
        System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEEE(Sonidito)");
    }

    public Boolean acelerar(){
        if(cantidadDeCombustible > 0){
            this.cantidadDeCombustible -= 1;
            return true;
        }else{
            System.out.println("BUM. Nos quedamos sin combustible!");
            this.encendido = false;
            return false;
        }
    }

    public String frenar(){
        return "Auto frenado";
    }

    public boolean arrancarMotor(){
        this.encendido = true;
        return true;
    }

    public boolean apagarAuto(){
        this.encendido = false;
        return false;
    }
}
