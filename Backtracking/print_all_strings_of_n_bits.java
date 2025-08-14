import java.util.*;

class Solve
{
      // The first argument is the number of bits. You need to save all binary strings in the ArrayList passed as 4th argument named strs.
    // Dont print the strings as they will be printed after needed processing (sorting in ascending order) at back end.
      // i is initially passed as 0, currStr is a char array to store the current String.
    void generateAllStrings(int n, int i, char[] currStr, ArrayList<String> strs){ 
        // base case
        if(i == n){
            strs.add(new String(currStr));
            return;
        }
        currStr[i]= '0';
        generateAllStrings(n, i+1, currStr, strs);
        currStr[i]= '1';
        generateAllStrings(n, i+1, currStr, strs);
    } 
}