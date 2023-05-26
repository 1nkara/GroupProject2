public class Task5 {/*Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
    For example, in the string "abracadabra", the first non-repeating character is 'c'.*/
    public static void main(String[] args) {


                String input ="abracadabra";

                for(char i :input.toCharArray()){
                    if ( input.indexOf(i) == input.lastIndexOf(i)) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }

