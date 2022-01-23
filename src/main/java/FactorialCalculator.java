public class FactorialCalculator   {
    private final int value;

    public FactorialCalculator(int value) {

        this.value = value;
    }

    public long factorial() {
        long result= 1;
        for(long i=2;i<=value;i++)
        {
            result*=i;
        }
        return result;
    }


}