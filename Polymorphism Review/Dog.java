public class Dog extends Pet implements Comparable<Pet>{

    private double preferenceLevel;

    public Dog(String species, int age, double preferenceLevel)
    {
        super(species, age);
        this.preferenceLevel = preferenceLevel;
    }

    public String toString()
    {
        return super.toString() + "preference level " + preferenceLevel;
    }

    public double getPreference()
    {
        return preferenceLevel;
    }

    public int compareTo(Pet other)
    {
        if(this.preferenceLevel < other.getPreference())
        {
            return -1;
        }
        else if(this.preferenceLevel > other.getPreference())
        {
            return 1;
        }
        else 
        return 0;
    }
}

