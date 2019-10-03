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
		return "flying";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}
}