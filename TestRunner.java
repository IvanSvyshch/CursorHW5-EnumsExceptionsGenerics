package CursorHomeWorkHW4EnumsExceptionsGenerics;

public class TestRunner {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("MyList array test:");
        System.out.println(list.largest());
        System.out.println(list.smallest());

        Double[] doubleArray = new Double[3];
        doubleArray[0] = 1.2;
        doubleArray[1] = 2.2;
        doubleArray[2] = 3.2;

        Integer[] integerArray = new Integer[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;

        String[] StringArray = new String[3];
        StringArray[0] = "1";
        StringArray[1] = "2";
        StringArray[2] = "3";

        MyNewList myNewDoubleList = new MyNewList(doubleArray);
        System.out.println("Double array test:");
        System.out.println(myNewDoubleList.largest());
        System.out.println(myNewDoubleList.smallest());

        MyNewList myNewIntegerList = new MyNewList(integerArray);
        System.out.println("Integer array test:");
        System.out.println(myNewIntegerList.largest());
        System.out.println(myNewIntegerList.smallest());

        MyNewList myNewStringList = new MyNewList(StringArray);
        System.out.println("String array test:");
        System.out.println(myNewStringList.largest());
        System.out.println(myNewStringList.smallest());
    }
}
