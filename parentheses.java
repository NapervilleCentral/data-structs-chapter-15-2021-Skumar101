import java.util.*;
/**
 * change the class name to your firstlast_parentheses
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class parentheses
{

    /**
     * Name: Sahil Kumar
     * Date: 10/3/2022
     * Period: 4
     * 
     * A quiz
     * Exam whether an expression is correctly formed with Parentheses
     * thus are balanced
     *
     * Use a queue or a stack to push and pop parenthesis from a String
     * If the opening and closing parentheses don't match
     *      The parentheses are unbalanced. Exit
     * If at the end the stack/queue is empty
     *      The parentheses are balanced.
     * Else
     *      The parentheses are not balanced
     *
     * Write the code to test the the strings below
     * You should create at least one test of your own
     */
    public static void  main(String args[])
    {
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced
        
        String myQuiz = "(lol)+(hello] - okay(today)";//unbalanced
        
        String myQuiz2 = "(lol)+(hello) - okay(today)";//balanced
        
        test(quiz1);
        System.out.println("Expected: balanced");
        test(quiz2);
        System.out.println("Expected: balanced");
        test(quiz3);
        System.out.println("Expected: unbalanced");
        test(quiz4);
        System.out.println("Expected: unbalanced");
        test(myQuiz);
        System.out.println("Expected: unbalanced");
        test(myQuiz2);
        System.out.println("Expected: balanced");
    }
    public static void test(String word)
    {
        Stack<String> letters = new Stack<>();
        
        
        for(int i = 0; i<word.length(); i++)
        {
            if(i==word.length()-1)
                letters.add(word.substring(i));
            else
                letters.add(word.substring(i,i+1));
        }
        int LeftOccurence = 0;
        int RightOccurence = 0;
        int size = letters.size();
        String first = "";
        String last = "";
        boolean balanced = true;
        for(int i = 0; i<size; i++)
        {
            String letter = letters.pop();
            if(letter.equals("("))
                {
                    if(LeftOccurence==0&&RightOccurence==0)
                        last = "Left";
                    
                    first = "Left";//Stack pops backward
                    LeftOccurence++;
                }
            else if(letter.equals(")"))
                {
                    if(LeftOccurence==0&&RightOccurence==0)
                        last = "Right";
                    first = "Right";//Stack pops backward
                    RightOccurence++;
                }
        }
        if(RightOccurence != LeftOccurence)
            balanced = false;
        if(!(last.equals("Right")&&first.equals("Left")))
            balanced = false;
        
        if(balanced)
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }
}
