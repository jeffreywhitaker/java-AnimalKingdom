package animalkingdom;

import java.util.*;

public class Main
{
	public static ArrayList<AbstractAnimal> filteredList = new ArrayList<AbstractAnimal>();

	public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
	{
		filteredList.clear();

		for (AbstractAnimal a : animals)
		{
			if (tester == null || tester.test(a))
			{
				System.out.println(a.getName() + " was discovered in year " + a.getYearDiscovered());
				filteredList.add(a);
			}
		}
	}

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

		ArrayList<AbstractAnimal> animalArrayList = new ArrayList<AbstractAnimal>();
		animalArrayList.add(m1);
		animalArrayList.add(m2);
		animalArrayList.add(m3);
		animalArrayList.add(m4);
		animalArrayList.add(m5);
		animalArrayList.add(m6);
		animalArrayList.add(m7);
		animalArrayList.add(b1);
		animalArrayList.add(b2);
		animalArrayList.add(b3);
		animalArrayList.add(b4);
		animalArrayList.add(b5);
		animalArrayList.add(f1);
		animalArrayList.add(f2);
		animalArrayList.add(f3);

		// list all the animals in descending order by year named
		System.out.println();
		animalArrayList.sort((v1, v2) -> v1.getYearDiscovered() - v2.getYearDiscovered());
		printAnimals(animalArrayList, null);

		// list all the animals alphabetically
		System.out.println();
		animalArrayList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		printAnimals(animalArrayList, null);

		// list all the animals in order by how they move
		System.out.println();
		animalArrayList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
		printAnimals(animalArrayList, null);

		// list all the animals that breath with lungs
		System.out.println();
		printAnimals(animalArrayList, a -> a.breath() == "lungs");

		// list only those animals that breath with lungs and wer enamed in 1758
		System.out.println();
		printAnimals(animalArrayList, a -> a.getYearDiscovered() == 1758);

		// list only those animals that lay eggs and breath with lungs
		System.out.println();
		printAnimals(animalArrayList, a -> a.breath() == "lungs" && a.reproduce() == "eggs");

		// list alphabetically only those animals that were named in 1758
		System.out.println();
		animalArrayList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		printAnimals(animalArrayList, a -> a.getYearDiscovered() == 1758);

		// stretch
		System.out.println();
		animalArrayList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		printAnimals(animalArrayList, a -> a.move() == "walking");
	}

	// javac animalkingdom/*.java
	// jar cvfe AnimalKingdom.jar animalkingdom.Main animalkingdom/*.class
	// java -jar AnimalKingdom.jar
}