import java.util.ArrayList;

public class Venta {
	public int totalventa=0;
	ArrayList<Producto> CosasaComprar = new ArrayList<Producto>();
	Venta(ArrayList<Producto> CosasaComprar){
		this.CosasaComprar=CosasaComprar;
	}
	public int CalcularVentaTotal() {
		for (Producto productos : CosasaComprar)
        { 
			totalventa=totalventa+productos.calcularTarifa();
        }
		return totalventa;
	}
}
