package CursorHomeWorkHW4EnumsExceptionsGenerics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNewList <T extends Comparable>{
    private T[] genericArray;

    public MyNewList(T[] genericArray) {
        this.genericArray = genericArray;
    }

    public BigDecimal largest() {
        List<BigDecimal> bigDecimals = new ArrayList<>();
        for (T singleElement : genericArray) {
            BigDecimal bigDecimal = new BigDecimal(singleElement.toString());
            bigDecimals.add(bigDecimal);
        }
        return Collections.max(bigDecimals);
    }

    public BigDecimal smallest() {
        List<BigDecimal> bigDecimals = new ArrayList<>();
        for (T singleElement : genericArray) {
            BigDecimal bigDecimal = new BigDecimal(singleElement.toString());
            bigDecimals.add(bigDecimal);
        }
        return Collections.min(bigDecimals);
    }
}
