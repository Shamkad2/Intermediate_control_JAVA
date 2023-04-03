import java.util.PriorityQueue;

public class Toyken {
    PriorityQueue<ItemForToyken> items = new PriorityQueue<ItemForToyken>();
    
    public void add(Toy toy, Integer count) {
        for(int i = 0; i < count; i++) {
            this.items.add(new ItemForToyken(toy, count));
        }
    }

    public ItemForToyken get(){
        return this.items.poll();
    }
    
}
