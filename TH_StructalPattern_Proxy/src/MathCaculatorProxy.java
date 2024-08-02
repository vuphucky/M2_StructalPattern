public class MathCaculatorProxy implements Caculator{
    private MathCaculator mathCaculator;

    public MathCaculatorProxy(){
        this.mathCaculator = new MathCaculator();
    }

    @Override
    public double add(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE / 2 ){
            throw  new RuntimeException("out of range");
        }
        if (first /2 + second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("out of range");
        }
        return mathCaculator.add(first,second);
    }

    @Override
    public double sub(double first, double second) {
        if (first /2 - second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("out of range");
        }
        if (first / 2 - second / 2 <= Double.MIN_VALUE / 2 ){
            throw new RuntimeException("out of range");
        }
        return mathCaculator.sub(first,second);
    }

    @Override
    public double mul(double first, double second) {
        double result = mathCaculator.mul(first, second);
        if (first != 0 && result / first != second){
            throw new RuntimeException("out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if (second == 0){
            throw new RuntimeException("cant divide by zero");
        }
        return div(first, second);
    }
}
