// Last updated: 27/03/2026, 01:22:13
1class MinStack {
2
3    Stack <Integer> st;
4    Stack <Integer> mst=new Stack<>();
5
6    public MinStack() {
7        st=new Stack<>();
8    }
9    
10    public void push(int val) {
11    
12            st.push(val);
13
14        if(mst.isEmpty())
15        {
16            mst.push(val);
17        }
18        else
19           mst.push(Math.min(mst.peek(),val));
20    }
21    
22    public void pop() {
23        st.pop();
24        mst.pop();
25    }
26    
27    public int top() {
28        return st.peek();
29
30    }
31    
32    public int getMin() {
33        return mst.peek();
34    }
35}
36
37/**
38 * Your MinStack object will be instantiated and called as such:
39 * MinStack obj = new MinStack();
40 * obj.push(val);
41 * obj.pop();
42 * int param_3 = obj.top();
43 * int param_4 = obj.getMin();
44 */