


public class Cat extends Pet implements Comparable<Pet>
{
    private double preferenceLevel;

    public Cat(String species, int age, double preferenceLevel)
    {
        super(species, age);
        this.preferenceLevel = preferenceLevel;
    }

    public double getPreferenceLevel()
    {
        return preferenceLevel;
    }

    public String toString()
    {
        return super.toString() + " preference level " + preferenceLevel;
    }

    public double getPreference()
    {
        return preferenceLevel;
    }

    public int compareTo(Pet name)
    {
        if(this.preferenceLevel < name.getPreference())
        {
            return -1;
        }
        else if(this.preferenceLevel > name.getPreference())
        {
            return 1;
        }
        else 
        return 0;
    }
}
    
