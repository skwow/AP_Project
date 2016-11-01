import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by skwow on 10/18/2016.
 *
 */


public class query1aHandler extends DefaultHandler {

    private boolean authorbool = false,overall=false, titlebool = false, yearbool = false, urlbool = false,volume=false,pages=false,journal=false;
    private int sortby,from,to;
    private String name_title;
    int c=0;
    private publishables x;

    public query1aHandler(int _sortby,String _name_title,int _from,int _to)
    {
        sortby=_sortby;
        name_title=_name_title;
        from=_from;
        to=_to;
    }


    @Override
    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException {
         if (qName.equalsIgnoreCase("author")) {
            authorbool = true;
        } else if (qName.equalsIgnoreCase("title")) {
            titlebool = true;
        } else if (qName.equalsIgnoreCase("year")) {
            yearbool = true;
        } else if (qName.equalsIgnoreCase("url")) {
            urlbool = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("article")) {
            overall=false;
            //System.out.println();
            ++c;
            if(c%1000==0)
            {
                System.out.println(c);
            }
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if (authorbool) {
            String temp=new String(ch, start, length);
            if(name_title.equals(temp))
            {
                overall = true;
                System.out.println("Author: " + new String(ch, start, length));
            }
            authorbool = false;
        } else if (titlebool&& overall) {
            System.out.println("Title: " + new String(ch, start, length));
            titlebool = false;
        } else if (yearbool&& overall) {
            System.out.println("Year: " + new String(ch, start, length));
            yearbool = false;
        } else if (urlbool&& overall) {
            System.out.println("Url: " + new String(ch, start, length));
            urlbool = false;
        }
    }
}