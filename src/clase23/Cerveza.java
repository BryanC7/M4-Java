package clase23;

public class Cerveza extends Botella {
    private int precio;

    public Cerveza(int precio) {
        this.precio = precio;
    }

    public Cerveza(String tipoBotella, String marca, int precio) {
        super(tipoBotella, marca);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Cerveza{" +
                "precio=" + precio +
                "} ";
    }
}
