public class Complex <T extends Number> {
    T real;
    T imagine;

    Complex(T real,T imagine){
        this.real=real;
        this.imagine=imagine;
    }
    public void setreal(T real){
        this.real = real;
    }

    public void setImagine(T imagine){
        this.imagine=imagine;
    }

    public T getReal(){
        return real;
    }

    public T getImagine(){
        return imagine;
    }

    public Complex<T> add(Complex<T> c) {
        return new Complex<>(add(this.real, c.getReal()), add(this.imagine, c.getImagine()));
    }

    public Complex<T> subtrack(Complex<T> c) {
        return new Complex<>(subtrack(this.real, c.getReal()), subtrack(this.imagine, c.getImagine()));
    }

    private T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    private T subtrack(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }
    public void printComplex() {
        System.out.print(real);
        if(imagine.doubleValue()>0){
            System.out.print("+"+imagine+"j");
        }
        else if(imagine.doubleValue()<0){
            System.out.print(imagine+"j");
        }
        System.out.println();
    }
}
