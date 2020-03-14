package parrot;

public class EuropeanParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return parrot.getBaseSpeed();
	}

}
