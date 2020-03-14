package parrot;

public class AfricanParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return Math.max(0, 12.0 - 9.0 * parrot.numberOfCoconuts);
	}

}
