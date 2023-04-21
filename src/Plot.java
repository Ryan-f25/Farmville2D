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
        }
    }

}
