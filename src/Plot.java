public class Plot {
    public String plantname;
    public int numberofplants;
    public boolean needswater;

    public Plot() {
        plantname = "basil";
        needswater = false;
        numberofplants = (int) (Math.random() * 100) + 10;
        int num = (int) (Math.random() * 5);
        if (num==0){
            plantname = "sunflower";
        } else if (num==1){
            plantname = "corn";
        } else if (num==2){
            plantname="carrots";
        }else if (num ==3){
            plantname = "tomato";
        } else {
            plantname= "empty";
            numberofplants = 0;
        }


    }

    public void printplot() {
        System.out.println("The plot has " + numberofplants + " " + plantname + " and it is " + needswater + " that it needs water");
    }
}
