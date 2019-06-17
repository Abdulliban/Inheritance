package inheritanceexample;
/**
 * @author Abdul Liban Programming God
 */
public class Professor extends Person
{
   public Professor (String name)
   {
      super(name);
   }

   @Override
   public String goToClass ()
   {
      return "make sure mat is posted: " + super.goToClass();
   }

   //overload the gotoclass
   public String goToClass (boolean isExam)
   {
      if (isExam) {
         return "dont forget pen";
      }
      else {
         return goToClass();
      }

   }
}
