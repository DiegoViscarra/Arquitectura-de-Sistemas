package parrot;

public class NorwegianParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return (parrot.isNailed) ? 0 : parrot.getBaseSpeed(parrot.voltage);
	}

}
