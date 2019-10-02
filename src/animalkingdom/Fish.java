package animalkingdom;

public class Fish extends AbstractAnimal
{
	//fields

	//constructor
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	//methods
	@Override
	public String move()
	{
		return "The fish has moved via swimming.";
	}

	@Override
	public String breath()
	{
		return "The fish has breathed via its gills.";
	}

	@Override
	public String reproduce()
	{
		return "The fish has reproduced via eggs.";
	}
}