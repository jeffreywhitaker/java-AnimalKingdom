package animalkingdom;

public class Bird extends AbstractAnimal
{
	//fields

	//constructor
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	//methods
	@Override
	public String move()
	{
		return "The bird has moved via flying.";
	}

		@Override
	public String breath()
	{
		return "The bird has breathed via its lungs.";
	}

	@Override
	public String reproduce()
	{
		return "The bird has reproduced via eggs.";
	}
}