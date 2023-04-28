public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
    }


    public Plot[][] grid;
    public MyFarm() {
        System.out.println("hello");
        Plot wick = new Plot();
        wick.printplot();

        grid = new Plot[4][3];
        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new Plot();
                grid[p][h].printplot();
            }
        }
        totalplants();

    }

    //call methods here

    public void totalplants() {
        // how many total plants are there in the row?
        grid.numberofplants();
    }

}