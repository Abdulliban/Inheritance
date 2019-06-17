package inheritanceexample;

/**
 *
 * @author Abdul Liban Programing God
 */
public class InheritanceExample
{
   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      Person person = new Person("anny");
      Student student = new Student("fatty");
      Professor prof = new Professor("patty");

      System.out.println(person.goToClass());
      System.out.println(student.goToClass());
      System.out.println(prof.goToClass());
      System.out.println(prof.goToClass(true));
   }
}
