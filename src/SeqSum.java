public class SeqSum extends Seq {
    public SeqSum(int size){
        super(size);
    }
    public int getSum(){
        return sum;
    }
    public void setAt(int i, int x){
        int newSum=sum+x-getAt(i);
        super.setAt(i, x);
        sum = newSum;
    }
    public void addTo(int i, int x){
        int newSum = sum + x;
        super.addTo(i, x);
        sum = newSum;
    }
    public void addToAll(int x){
        super.addToAll(x);
        sum += getSize() * x;
    }
    private int sum = 0;
}
