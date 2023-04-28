public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
    }


    public Plot[][] grid;
    public MyFarm() {
        System.out.println("hello");
        Plot wick = new Plot();




        grid = new Plot[6][6];
        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new Plot();
                grid[p][h].printplot();
            }
        }
        totalplants();
        printPlantNames();

    }

    //call methods here

    public void totalplants() {
        // how many total plants are there in the row?
        int sumofplants = 0;

        for(int e=0;e<grid.length;e++ ){
            for(int c =0; c<grid[e].length; c++){
                sumofplants += grid[e][c].numberofplants;


            }
        }
        System.out.println(sumofplants);
    }

    public void printPlantNames() {
        // print the name of each plant in each row and column and its indexes
        for (int y=0; y <grid.length; y++) {
            for(int x = 0; x<grid.length; x++) {
                System.out.println("row: " + y + "col: " + x + grid[y][x].plantname);
            }
        }

    }


}