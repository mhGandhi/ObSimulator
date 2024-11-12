import java.util.Arrays;

public class IntVector {

    private final int[] values;
    public IntVector(int pDims){
        this(pDims,0);
    }
    public IntVector(int pDims, int pFill){
        this.values = new int[pDims];
        Arrays.fill(values, pFill);
    }
    public IntVector(int[] pValues){
        this.values = Arrays.copyOf(pValues, pValues.length);
    }

    public int getDimensions(){
        return getValues().length;
    }

    public int[] getValues(){
        return this.values;
    }


    public int[] add(int[]){

    }
    public int[] Add(){

    }
}
