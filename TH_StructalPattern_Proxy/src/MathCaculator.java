public class MathCaculator implements Caculator{
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double sub(double first, double second) {
        return first - second;
    }

    @Override
    public double mul(double first, double second) {
        return first * second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
