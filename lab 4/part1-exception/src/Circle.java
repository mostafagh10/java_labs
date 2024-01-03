public class Circle {
    int x;
    int y;
    int division;
    int sqrt;

    public Circle(){
        x=0;
        y=0;
    }

    public void setx(int x){
        this.x=x;
    }

    public void sety(int y){
        this.y=y;
    }

    public int makeDivision() throws NewExcpetion {
        if(y == 0){
            throw new NewExcpetion("you cannot divide by zero");
        }else{
        return x/y;
        }
    }

    public double makeSqrt() throws NewExcpetion {
        if((x*y)<0){
            throw new NewExcpetion("you cannot make sqrt for negative number");
        }else {
            return Math.sqrt(x*y);
        }
    }

    public int makeDiffrence() throws NewExcpetion {
        if(x == y){
            throw new NewExcpetion("the numbers must not equal each other ...");
        }else {
            if(x>y) {
                return x - y;
            }else{
                return y-x;
            }
        }
    }



}
