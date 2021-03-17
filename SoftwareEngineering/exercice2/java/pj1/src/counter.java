public class counter {
    private int cnt;
    public counter() {
        cnt = 0;
    }
    public void increment()
    {
        this.cnt +=1;
    }
    public int getValue()
    {
        return this.cnt;
    }
}
