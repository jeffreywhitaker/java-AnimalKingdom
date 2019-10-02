package animalkingdom;

public class Main
{
	public static void main(String[] args)
	{
		Mammal m1 = new Mammal("Panda", 1869);
		Mammal m2 = new Mammal("Zebra", 1778);
		Mammal m3 = new Mammal("Koala", 1816);
		Mammal m4 = new Mammal("Sloth", 1804);
		Mammal m5 = new Mammal("Armadillo", 1758);
		Mammal m6 = new Mammal("Raccoon", 1758);
		Mammal m7 = new Mammal("Bigfoot", 2021);

		Bird b1 = new Bird("Pigeon", 1837);
		Bird b2 = new Bird("Peacock", 1821);
		Bird b3 = new Bird("Toucan", 1758);
		Bird b4 = new Bird("Parrot", 1824);
		Bird b5 = new Bird("Swan", 1758);

		Fish f1 = new Fish("Salmon", 1758);
		Fish f2 = new Fish("Catfish", 1817);
		Fish f3 = new Fish("Perch", 1758);

		System.out.println(m2.reproduce());
	}
}