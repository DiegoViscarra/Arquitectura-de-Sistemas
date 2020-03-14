package parrot;

public class AfricanParrot implements ParrotType{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return Math.max(0, parrot.getBaseSpeed() - parrot.getLoadFactor() * parrot.numberOfCoconuts);
	}

}
