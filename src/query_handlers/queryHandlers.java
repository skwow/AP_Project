
package query_handlers;

/**
 * Created by skwow on 11/29/2016.
 * saurabh kumar 2015088
 * prashant 2015072
 */

///template pattern.  for all the 3 queryHandlers
public abstract class queryHandlers
{
    abstract void doWork();
    abstract void showResult();
    //abstract void print();
    ///skeleton
    public final void perform()
    {
        doWork();
        showResult();
        //print();
    }
}
