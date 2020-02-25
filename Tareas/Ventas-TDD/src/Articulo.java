
public class Articulo extends Producto {
	public int precio;
	public int saldo;
	Articulo(int precio, int saldo)
	{
		this.precio=precio;
		this.saldo=saldo;
	}
	@Override
	public int calcularTarifa() {
		int totalPago;
		totalPago=precio+saldo;
		return totalPago;
	}
}
