import java.util.ArrayList;
public class MyFarmArrayList {

    public ArrayList<Plot> row = new ArrayList<Plot>(); // this is an array list
    public Plot[] arr = new Plot[10]; // this is an array

    public MyFarmArrayList() {
        System.out.println("my farm using array lists");

        arr[0] = new Plot(); // add to an array
        //arr[0].printplot();


        for(int p=0; p<10; p++){
            System.out.println(row.size());
            row.add(new Plot()); // add to an array list
            row.get(p).printplot();
        }
        row.add(new Plot());
    }
}
