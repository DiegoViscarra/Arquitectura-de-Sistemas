package parrot;

public class NorwegianParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return (parrot.isNailed) ? 0 : Math.min(24.0, parrot.voltage*12.0);
	}

}
