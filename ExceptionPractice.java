public class ExceptionPractice
{
  public static void main(String[]args)
  {
    String a = "a";
    int index = 0;
    while(index<=2)
    {
      try
      {
        int b[]={1,2,3,4};
        int num = Integer.parseInt(a);
        if(index == 2)
	{
	  for(int i = 0; i <= b.length;i++)
	  {
	    System.out.println(b[i]);
	  }
	}
	for(int i = 0; i <= 1; i++)
        {
	  System.out.println(a.charAt(i));
          System.out.println(i);
        }
      }
      catch(NumberFormatException e)
      {
        System.err.println("Number format expcetion");
        a = "1";
      }
      catch(StringIndexOutOfBoundsException e)
      {
        System.err.println("String index is out of bounds");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.err.println("Array index out of bound");
	a = "12";
      }
      finally 
      {
        System.out.println(a);
      }
      index++;
    }
  }
}

