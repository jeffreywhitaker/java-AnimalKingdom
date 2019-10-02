package animalkingdom;

public class Mammal extends AbstractAnimal
{
	//fields

	//constructor
	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	//methods
	@Override
	public String move()
	{
		return "The " + this.name + " has moved via walking.";
	}

	@Override
	public String breath()
	{
		return "The " + this.name + " has breathed via its lungs.";
	}

	@Override
	public String reproduce()
	{
		return "The " + this.name + " has reproduced via live birth.";
	}
}