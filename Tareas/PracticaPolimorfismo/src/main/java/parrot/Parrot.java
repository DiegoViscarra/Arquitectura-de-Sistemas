package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    public boolean isNailed;
    public int numberOfCoconuts;
    public double voltage;
    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts=numberOfCoconuts;
        this.voltage=voltage;
        this.isNailed=isNailed;
    }

    public double getSpeed() {
    	double speed = 0;
    	ParrotType parrottype = createParrotType();
    	speed = parrottype.calculateSpeed(this);
    	return speed;
    }

    private ParrotType createParrotType() {
    	switch(type) {
        case EUROPEAN:
        	return new EuropeanParrot();//getbasespped()
        case AFRICAN:
        	return new AfricanParrot();//eturn Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
        case NORWEGIAN_BLUE:
        	return new NorwegianParrot();//return (isNailed) ? 0 : getBaseSpeed(voltage);
    	}
    	throw new RuntimeException("Should be unreachable");
	}

	public double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    public double getLoadFactor() {
        return 9.0;
    }

    public double getBaseSpeed() {
        return 12.0;
    }


}
