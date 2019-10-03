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
		return "walking";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live birth";
	}
}