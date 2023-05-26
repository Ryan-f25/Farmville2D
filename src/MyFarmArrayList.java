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
                printRowInfo();
                addSunflower();
                addCorn();
                printPlantNames();
                tomatoLocations();
                totalcarrots();
                averageNumberOfPlants();
                numberOfCarrotPlots();
                numberOfEmptyPlots();
                System.out.println("Changed needs water");
                everyOtherNeedsWater();
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
        for (int a=0; a<row.size(); a++) {
            System.out.print(a + ": " + row.get(a).plantname + "\t"); //\t creates a tab between the words
        }
        System.out.println();
    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (Plot a : row) {
            System.out.println("This row has " + a.numberofplants + " plants and it is a " +  a.plantname + ". It is "+ a.needswater + " that it needs water");
        }
    }

    public void addSunflower() {
        // add a sunflower plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot sunflower = new Plot();
        sunflower.plantname = "sunflower";
        sunflower.numberofplants = 42;
        sunflower.needswater = true;
        sunflower.printplot();
        row.add(sunflower);

    }

    public void addCorn(){
        // add a corn at index 3
        Plot corn = new Plot();
        corn.plantname = "corn";
        corn.numberofplants = 21;
        row.add(3, corn);
    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes

        for (int m = 0; m < row.size(); m++) {
            if (row.get(m).plantname.equals("tomato")) {
                System.out.println("The tomatos are in row " + m);
            }
        }
    }

    public void totalcarrots(){
        // how many total carrot plants are there?
        int sumofCarrots =0;
        for (Plot a: row){
            if(a.plantname.equals("carrots")) {
                sumofCarrots += a.numberofplants;
            }
        }
        System.out.println("There are " + sumofCarrots + " carrots in the row");
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int numofplants = 0;
        int totalplants = 0;
        int avgnumofplants = 0;
        for(int t=0;t<row.size(); t++){
            numofplants+= row.get(t).numberofplants;

        }
        avgnumofplants += numofplants/row.size();
        System.out.println("there is an average of " + avgnumofplants + " plants");
    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
        // call printPlantNames() method to check
        int numofcarrotplots = 0;
        for (int m = 0; m < row.size(); m++) {
            if (row.get(m).plantname.equals("carrots")) {
                numofcarrotplots +=1;

            }
        }
        System.out.println("There are " + numofcarrotplots + " plots with carrots");
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
        // call printPlantNames() method to check
        int numofemptyplots =0;
        for (int m = 0; m < row.size(); m++){
            if (row.get(m).plantname.equals("empty")){
                numofemptyplots +=1;
            }
        }
        System.out.println("There are " + numofemptyplots + " plots with nothing");
    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        int numberwater=0;
        for (int m = 0; m < row.size(); m++) {
            if(m % 2 == 1){//if when n is divided by 2 it equals 1, then...
                row.get(m).needswater = false;
            } else {
                row.get(m).needswater = true;
            }

        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }






}


