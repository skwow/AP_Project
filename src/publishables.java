import java.util.ArrayList;

/**
 * Created by skwow on 10/14/2016.
 */

public class publishables implements Comparable
{
    private String title;
    private int year;
    private String volume;
    private String pages;
    private String journal_booktitle;
    private ArrayList<String> authors;
    private ArrayList<String> url;

    public publishables()
    {
        title="NA";
        volume="NA";
        pages="NA";
        journal_booktitle="NA";
        authors= new ArrayList<>();
        url= new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setJournal_booktitle(String journal_booktitle) {
        this.journal_booktitle = journal_booktitle;
    }


    public void addAuthor(String _author) {
        authors.add(_author);
    }

    public void addUrl(String _url) {
        url.add(_url);
    }


    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getVolume() {
        return volume;
    }

    public String getPages() {
        return pages;
    }

    public String getJournal_booktitle() {
        return journal_booktitle;
    }



    @Override
    public int compareTo(Object o) {
        int temp= ((publishables) o).year;
        return temp-this.year;
    }

    public String toString()
    {
        return authors+" "+title+" "+pages+" "+volume+" "+journal_booktitle+" "+year+" "+url;
    }
}
