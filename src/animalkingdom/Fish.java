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
		return "swimming";
	}

	@Override
	public String breath()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}
}