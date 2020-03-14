package parrot;

public class NorwegianParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return parrot.getBaseSpeed(parrot.voltage);
	}

}
