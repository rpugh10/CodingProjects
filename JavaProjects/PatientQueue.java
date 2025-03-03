public class PatientQueue
{
    private String name;
    private int severity;

    public PatientQueue(String name, int severity)
    {
        this.name = name;
        this.severity = severity;
    }

    public int getSeverity()
    {
        return severity;
    }

    public String toString()
    {
        return "Patients name is " + name + " pain severity " + severity;
    }
}

