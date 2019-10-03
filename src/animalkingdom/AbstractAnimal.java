package animalkingdom;

public abstract class AbstractAnimal
{
	//fields 
	protected int number;
	protected String name;
	protected int yearDiscovered;

	//constructors
	private static int itemId = 0;
	public AbstractAnimal(String name, int yearDiscovered)
	{
		this.number = itemId;
		itemId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public String consumeFood()
	{
		return "This animal has consumed food.";
	}

	public String getName()
	{
		return name;
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}

	// abstract methods

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}