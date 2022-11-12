package Day5;

// import java.util.PriorityQueue;
import java.util.*;
public class findMedianFromDataStream {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    public void addNum(int num){
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian(){
        if (maxHeap.size()>minHeap.size()) return maxHeap.peek();
        return (minHeap.peek()+maxHeap.peek())/2.0d;
    }
}   
