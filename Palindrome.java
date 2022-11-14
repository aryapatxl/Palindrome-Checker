/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name: Arya Patel & Shruti Gajjar
 *     username: aryaxrp & shrutiga
 */
   
public class Palindrome {
    public static boolean isPal(String s) {
        boolean tester = false;
        if (s.length() == 0 || s.length() ==  1){
            return true;
        }
        int len = s.length();
        
        LLStack<Object> stack = new LLStack<Object>();
        Queue<Object> stack1 = new LLQueue<Object>();


        for (int i = 0; i < len; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                stack1.insert(ch);
                stack.push(ch);
            }
        }

        while (stack1.peek() != null) {
            if (stack1.remove() == stack.pop()) {
                tester = true;
            }
            else {
                return false;

            }
        }

        return tester;
    }
 
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */


         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(1) Testing on \"A Toyota's a Toyota\"");
         try {
             boolean results = isPal("A Toyota's a Toyota");
             boolean expected = true;
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println(expected);
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == expected);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 



         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(2) Testing on \"Pull up if I pull up\"");
         try {
             boolean results = isPal("Pull up if I pull up");
             boolean expected = true;
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println(expected);
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == expected);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 


         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(3) Testing on \"WAS IT A CAR OR A CAT I SAW?\"");
         try {
             boolean results = isPal("WAS IT A CAR OR A CAT I SAW?");
             boolean expected = true;
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println(expected);
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == expected);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 

        
         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(4) Testing on \"Rats live on no evil star?\"");
         try {
             boolean results = isPal("Rats live on no evil star?");
             boolean expected = true;
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println(expected);
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == expected);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 
         
         System.out.println("--- Testing method isPal ---");
         System.out.println();
 
         System.out.println("(5) Testing on \"Never Odd Or Even\"");
         try {
             boolean results = isPal("Never Odd Or Even");
             boolean expected = true;
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println(expected);
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == expected);
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 
    }
}