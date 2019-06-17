package inheritanceexample;
/**
 * @author Abdul Liban Programming God
 */
public class Student extends Person
{
   public Student (String name)
   {
      super(name);
   }

   @Override
   public String goToClass ()
   {
      return "running late, better run!";
   }
}
