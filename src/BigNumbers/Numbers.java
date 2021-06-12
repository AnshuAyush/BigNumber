package BigNumbers;
import java.math.BigDecimal;
import java.math.MathContext;

/*
"""
Using the Power of BigDecimal class of java
to compute the arithmetic operation of the huge
numbers with some more features in it that can
be used in some real life problem.
"""
*/



public class Numbers {
    BigDecimal r;
    public BigDecimal add(String x , String y){
    try {

        BigDecimal b = new BigDecimal(x);
        BigDecimal c = new BigDecimal(y);
        r = b.add(c);
    }
    catch (Exception e){
        System.out.println("WrongNumberFormat !!!");
    }
             return r;



    }
    public BigDecimal sub(String a , String b){
        BigDecimal i = null;
        try {
            BigDecimal v = new BigDecimal(a);
            BigDecimal x = new BigDecimal(b);
            i = v.subtract(x);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        BigDecimal v = new BigDecimal(a);
        BigDecimal x = new BigDecimal(b);
        return i;
    }

    public BigDecimal mul(String  a , String b){
        BigDecimal r = null;
        try{
            BigDecimal i = new BigDecimal(a);
            BigDecimal j = new BigDecimal(b);
            r = i.multiply(j);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }
    public BigDecimal div(String a , String b){
        BigDecimal r = null;
        try{
            BigDecimal i = new BigDecimal(a);
            BigDecimal j = new BigDecimal(b);
            r = i.divide(j);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }

    public BigDecimal modules(String  a ,String b){
        BigDecimal r = null;
        try{
            BigDecimal i = new BigDecimal(a);
            BigDecimal j = new BigDecimal(b);
            r = i.remainder(j);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }
    public BigDecimal pow(String  a ,int b){
        System.out.println("Calculating..");
        BigDecimal r = null;

        try{
            BigDecimal i = new BigDecimal(a);
            r = i.pow(b);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }

    public BigDecimal max(String a , String  b){

        BigDecimal r = null;

        try{
           BigDecimal i = new BigDecimal(a);
           BigDecimal j = new BigDecimal(b);

           r = i.max(j);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }


    public BigDecimal min(String a , String  b){
        BigDecimal r = null;

        try{
            BigDecimal i = new BigDecimal(a);
            BigDecimal j = new BigDecimal(b);
            r = i.min(j);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }


    public BigDecimal abs(String a){
        BigDecimal r = null;

        try{
            BigDecimal i = new BigDecimal(a);
            r = i.abs();
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }

    public BigDecimal sqrt(String a){
        BigDecimal r = null;
        MathContext m = new MathContext(10);
        try{
            BigDecimal i = new BigDecimal(a);
            r = i.sqrt(m);
        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }
    public boolean equals(String a , String b){
        boolean r = false;

        try{
            BigDecimal i = new BigDecimal(a);
            BigDecimal j = new BigDecimal(b);
            r = i.equals(j);

        }
        catch (Exception e){
            System.out.println("WrongNumberFormat !!!");
        }
        return r;
    }



    public static void main(String[] args)  {
        Numbers n = new Numbers();
        String a = "25378246237846374623745";
        String b = "2";
        System.out.println(n.equals(a , b));


    }
}
