// Last updated: 26/03/2026, 16:26:32
class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] arr = new int[num1.length+num2.length];
        int i,j=0,index,p;
        double res;

        for(i=0;i<num1.length+num2.length;i++)
        {
            if(i<num1.length)
            {
                arr[i]=num1[i];
            }
            else
            {
                arr[i]=num2[j++];
            }
        }

        Arrays.sort(arr);

        if(arr.length%2!=0)
        {
            index = arr.length/2;
            return arr[index];
        }

        else
        {
            int z = arr.length;
            res = arr[z/2]+arr[(z/2)-1];
            return res/2;
        }
        
    }
}