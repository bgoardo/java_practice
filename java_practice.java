
public class java_practice
{
public static void main(String[] args)
{
    if (args.length > 0)
    {
        if (args[0].equals("sleepIn"))
        {
            
        }
    }
}
//The parameter weekday is true if it is a weekday,
// and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
public boolean sleepIn(boolean weekday, boolean vacation) {
    if ((weekday == false)||(vacation == true))
    {
        return true;
    }
    else
    return false;
  
}
}
