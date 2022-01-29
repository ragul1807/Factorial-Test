public class FactorialCalculator   {
    private final int value;

    public FactorialCalculator(int value) {

        this.value = value;
    }

    public long factorial() {
        if(value<0)
            return -1;
        else {
            long result = 1;
            for (long i = 2; i <= value; i++) {
                result *= i;
            }
            return result;
        }
    }


}