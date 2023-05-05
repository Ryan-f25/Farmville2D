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
        totalcarrots();
        averageNumberOfPlants();

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

    public void totalcarrots(){
        //how many total carrots are there
        int sumofcarrots = 0;

        for (int b =0; b<grid.length; b++){
            for(int c = 0; c<grid[b].length; c++){
                if(grid[b][c].plantname .equals("carrots")){
                    sumofcarrots += grid[b][c].numberofplants;
                }
            }
        }
        System.out.println("there are " + sumofcarrots + " carrots in the grid");
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole grid?
        int avgnumberofplants = 0;
        for (int a=0; a<grid.length; a++){
            for (int d=0; d<grid[a].length; d++) {
                avgnumberofplants += grid[a][d].sumofplants / grid[a][d].length;
            }
        }
    }



}