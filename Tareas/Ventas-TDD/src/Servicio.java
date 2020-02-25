
public class Servicio extends Producto {
	public int precio;
	public int saldo;
	Servicio(int precio, int saldo)
	{
		this.precio=precio;
		this.saldo=saldo;
	}
	@Override
	public int calcularTarifa() {
		int totalPago;
		totalPago=precio*saldo;
		return totalPago;
	}
}
