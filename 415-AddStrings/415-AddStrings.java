// Last updated: 26/03/2026, 16:19:48
import java.math.*;
class Solution {
    public String addStrings(String n1, String n2) {
        BigInteger a=new BigInteger(n1);        
        BigInteger b=new BigInteger(n2);
        return a.add(b)+"";
    }
}