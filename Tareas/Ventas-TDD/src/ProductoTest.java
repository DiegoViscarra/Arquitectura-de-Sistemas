import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void Deberia_devolver_50() {
		Producto auto = new Articulo(30,20);
		assertEquals(50,auto.calcularTarifa());
	}
	@Test
	void Deberia_devolver_600() {
		Producto auto = new Servicio(30,20);
		assertEquals(600,auto.calcularTarifa());
	}
	@Test
	void Deberia_devolver_650() {
		ArrayList<Producto> CosasaComprar = new ArrayList<Producto>();
		Producto prod1 = new Servicio(30,20);
		Producto prod2 = new Articulo(30,20);
		CosasaComprar.add(prod1);
		CosasaComprar.add(prod2);
		Venta ventas = new Venta(CosasaComprar);
		assertEquals(650,ventas.CalcularVentaTotal());
	}
}
