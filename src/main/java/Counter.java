public class Counter {

    public static int totalCount = 0;

    protected int instanceCount;

    public Counter (){
        this.instanceCount = 0;
    }

    public void incrementInstanceCount(){
         this.instanceCount++;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                '}';
    }


}
