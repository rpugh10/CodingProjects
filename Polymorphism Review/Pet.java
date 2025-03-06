
public abstract class Pet
{
  protected String species;
  protected int age;

  public Pet(String species, int age)
  {
    this.species = species;
    this.age = age;
  }

  public abstract double getPreference();

  public String toString()
  {
    return "Species " + species + " age " + age;
  }
}



 
