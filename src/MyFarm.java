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
        numberOfTomatoPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plotWithMaxNumber();
        plantWithMaxNumber();


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
        int numofplants =0;
        int totalplants=0;
        for (int a=0; a<grid.length; a++){
            for (int d=0; d<grid[a].length; d++) {
                numofplants += grid[a][d].numberofplants;
                totalplants =a*d;
            }
        }
        System.out.println("the average number of plants on the plot is " + numofplants/totalplants);
    }

    public void numberOfTomatoPlots() {
        // how many plots have tomatoes on them
        int numoftomatoplots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int j = 0; j < grid[h].length; j++) {
                if(grid[h][j].plantname .equals("tomato")){
                    numoftomatoplots += 1;

                }
            }
        }
        System.out.println("there are " + numoftomatoplots + " number of tomato plots in the grid.");
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
        int numofemptyplots =0;
        for (int q=0; q<grid.length; q++){
            for (int l=0; l<grid[q].length; l++){
                if(grid[q][l].plantname .equals("empty")){
                    numofemptyplots =1;
                }
            }
        }
        System.out.println("there are " + numofemptyplots + " number of empty plots in the grid.");
    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        // print the value of needs water for all plots row by row
        int numwater = 0;
        for (int t= 0; t<grid.length; t++) {
            for (int r = 0; r < grid[t].length; r++) {
                numwater = numwater * -1;
                if (numwater == 1) {
                    grid[t][r].needswater = true;
                }
                if (numwater == -1) {
                    grid[t][r].needswater = false;
                }
            }
        }
    }

    public void plotWithMaxNumber() {
        // which plant type has the most total plants?
        int maxnumber = grid[0][0].numberofplants;
        String name = grid[0][0].plantname;
        for (int w=0;w<grid.length; w++){
            for (int e=0; e<grid[w].length; e++){
                if(grid[w][e].numberofplants>maxnumber){
                    maxnumber = grid[w][e].numberofplants;
                    name = grid[w][e].plantname;
                }
            }
        }
        System.out.println("the max number of plants is " + maxnumber + " and it is a " + name);
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int numcorn =0;
        int numtomato =0;
        int numcarrot =0;
        int numsunflower =0;

        for(int c=0;c< grid.length;c++){
            for(int v=0; v<grid[c].length; v++){
                switch(grid[c][v].plantname){
                    case "corn":
                        numcorn +=grid[c][v].numberofplants;
                        break;
                    case "sunflower":
                        numsunflower+=grid[c][v].numberofplants;
                        break;
                    case "carrot":
                        numcarrot+=grid[c][v].numberofplants;
                        break;
                    default:
                        numtomato+=grid[c][v].numberofplants;
                        break;

                }
            }
        }
        if(numcorn > numcarrot && numcorn > numsunflower && numcorn > numtomato){
            System.out.println("Corn has the most plant with " + numcorn + " plants");
        }
        if(numtomato > numcarrot && numtomato > numsunflower && numtomato > numcorn){
            System.out.println("Tomato has the most plant with " + numtomato + " plants");
        }
        if(numcarrot > numcorn && numcarrot > numsunflower && numcarrot > numtomato){
            System.out.println("Carrot has the most plant with " + numcarrot + " plants");
        }
        if(numsunflower > numcarrot && numsunflower > numcorn && numsunflower > numtomato){
            System.out.println("Sunflower has the most plant with " + numsunflower + " plants");
        }
    }






}