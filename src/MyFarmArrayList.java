import java.util.ArrayList;
public class MyFarmArrayList {

    public ArrayList<Plot> row = new ArrayList<Plot>(); // this is an array list


    //public Plot[] arr = new Plot[10]; // this is an array

    public MyFarmArrayList() {
        System.out.println("my farm using array lists");

        //arr[0] = new Plot(); // add to an array
        //arr[0].printplot();


//        for (Plot a : row) {
//                row.add(new Plot()); // add to an array list
//                a.printplot();
//                System.out.println(row.size());
//            }



                for (int k = 0; k < 10; k++) {
                    row.add(new Plot()); // add to an array list
                    row.get(k).printplot();
                }
                row.remove(5);
                System.out.println(row.size());
                totalPlants();
                printPlantNames();
                printRowInfo();
        }

    public void totalPlants() {
        // how many total plants are there in the row?
        int sumofplants =0;
        for (Plot a : row) {
            sumofplants += a.numberofplants;
        }
        System.out.println("There are " + sumofplants + " plants in the grid");
    }

    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for (Plot a : row) {
            System.out.println("row: "  + a.plantname + " " + a);
        }
    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (Plot a : row) {
            System.out.println("This row has " + a.numberofplants + " plants and it is a " +  a.plantname + ". It is "+ a.needswater + " that it needs water");
        }
    }



}


