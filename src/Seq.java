public class Seq {
    public Seq(int size){
        a = new int[size]; // all initialized to 0
    }
    public int getSize(){
        return a.length;
    }
    public int getAt(int i){
        return a[i];
    }
    public void setAt(int i, int x){
        a[i]=x;
    }
    public void addTo(int i, int x){
        a[i]+=x;
    }
    public void addToAll(int x){
        for (int i=0; i<a.length; i++)
            a[i]+=x;
    }
    public void print(){
        for(int i=0; i < a.length; i++) {
            System.out.println(getAt(i));
        }
    }
    private int[] a;

}
