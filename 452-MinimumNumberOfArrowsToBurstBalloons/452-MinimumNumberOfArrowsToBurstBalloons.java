// Last updated: 26/03/2026, 16:19:40
class Solution {
    public int findMinArrowShots(int[][] points) {
        //Sravan
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int cnt = 0;
        boolean[] visited = new boolean[points.length];
        
        for(int i=0;i<points.length;i++){
            if(!visited[i]){
            for(int j=i+1;j<points.length;j++){
                int lr = points[i][1];
                int rl = points[j][0];
                if(!visited[j] && lr>=rl){
                    visited[j]=true;
                }
            }
            cnt++;
            visited[i]=true;
            }
        }
        return cnt;
    }
}