public class Movie implements Comparable<Movie>{
  private String title;
  private int year;
  private double rating;

  public Movie(String title, int year, double rating)
  {
    this.title = title;
    this.year = year;
    this.rating = rating;
  }

  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  public double getRating()
  {
    return rating;
  }

  public String toString()
  {
    return "Title " + title + " year " + year + " rating " + rating;
  }

  public int compareTo(Movie name)
  {
    if(this.year < name.getYear())
    {
        return -1;
    }
    else if(this.year > name.getYear())
    {
        return 1;
    }
    else {
        if(this.rating > name.getRating())
        {
            return -1;
        }
        else if(this.rating < name.getRating())
        {
            return 1;
        }
    }
    return 0;
  }
}
