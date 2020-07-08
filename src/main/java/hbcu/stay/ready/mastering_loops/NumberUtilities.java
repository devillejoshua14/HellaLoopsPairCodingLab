package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String range = " ";
        Integer i = 0;

        for (i = start; i <stop; i++)
        {
            if (i % 2 == 1)
            {
                range = range + i.toString();
            }
        }
        return range.trim();
    }


    public static String getOddNumbers(int start, int stop) {
        String range = " ";
        Integer i = 0;

        for (i = start; i < stop; i++)
        {
            if (i % 2 == 0)
            {
                range = range + i.toString();
            }
        }
        return range.trim();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String range = " "; 
        Integer i = 0;

        for (i = start; i < stop; i++)
        {
            Double a = i.doubleValue(); 
            a = Math.pow(a, 2);
            Integer l = a.intValue();
            range = range + l.toString();
        }
        
        return range.trim();
    }

    public static String getRange(int stop) {
        String range = "";
        Integer i = 0;
        for(i=0; i<stop; i++)
        {
            range= range + i.toString();
        }

        return range;
    }

    public static String getRange(int start, int stop) {

        String range = "";
        Integer i = 0;
        for(i=start; i<stop; i++)
        {
            range= range + i.toString();
        }
        return range; 
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        Integer i = 0;
        for(i=start; i<stop; i+=step)
        {
            range= range + i.toString();
        }
        return range.trim();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String range = "";
        Integer i =0; 
        Integer product = 1; 
        for (i = start; i<stop; i+=step)
        {
            product = Math.pow(i, exponent);
            Integer intProduct = product.intValue();
            range = range + intProduct.toString();
        }
        return range.trim();
    }
}
