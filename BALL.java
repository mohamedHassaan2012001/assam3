package ASSIGINMENT;
public abstract class BALL implements TOSSABLE
{
    protected String brandName;
    public void toss()
    {
        
    }
      public abstract void bounce();
      
      public BALL(String brandName)
      {  
          
      }
          public String GetBrandName()
    {
        return brandName;
    }
}