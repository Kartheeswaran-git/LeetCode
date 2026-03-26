// Last updated: 26/03/2026, 16:16:35
class Solution {
    public int accountBalanceAfterPurchase(int a) {
        if(a%10>=5){
        return (100-(10-a%10)-a);
        }
        else {
        return (100-(10-a%10)-a+10);
        }
    }
}
