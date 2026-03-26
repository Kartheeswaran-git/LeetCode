// Last updated: 26/03/2026, 16:20:41
class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(max.isEmpty())max.add(num);
        else if(num<=max.peek()){
            max.add(num);
            if(max.size()-min.size()==2)min.add(max.poll());
        }else{
            min.add(num);
            if(min.size()-max.size()==2)max.add(min.poll());
        }
    }
    
    public double findMedian() {
        int minSize=min.size();
        int maxSize=max.size();
        if(min.isEmpty() && maxSize==1)return max.peek();
        if(max.isEmpty() && minSize==1)return min.peek();
        if((minSize+maxSize)%2==0){
            return (double)(min.peek()+max.peek())/2;
        }else{
            if(minSize>maxSize)return  min.peek();
            else return max.peek();
        }
    }
}