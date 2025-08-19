public class Circulo { 
    double raio;
    
    public Circulo(double r){ 
        raio = r; 
    }

    public void setRaio(double raio){
        this.raio = raio;

    }

    public double getRaio() {
        return this.raio;

    }

    public double comprimento() {
        return (2 * 3.14 * raio);
    }

    public double area() {
        return (3.14 * raio * raio);
        }
    }