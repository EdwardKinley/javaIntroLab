public class Printer {
    private int paper_capacity;
    private int paper_left;
    private int toner_volume;

    public Printer(int paper_capacity, int paper_left, int toner_volume){
        this.paper_capacity = paper_capacity;
        this.paper_left = paper_left;
        this.toner_volume = toner_volume;
    }

    public int getPaperCapacity(){
        return paper_capacity;
    }

    public int getPaperLeft(){
        return paper_left;
    }

    public void print(int numPages, int numCopies){
        if (this.paper_left >= numPages * numCopies) {
            this.paper_left -= numPages * numCopies;
            this.toner_volume -= numPages * numCopies;
        }
    }

    public void printAsManyAsCan(int numPages, int numCopies){
        if (this.paper_left >= numPages * numCopies)
            {this.paper_left -= numPages * numCopies;
            this.toner_volume -= numPages * numCopies;}
        else
            {this.toner_volume -= this.paper_left;
            this.paper_left = 0;}
    }

    public void refill(){
        this.paper_left = this.paper_capacity;
    }

    public int getTonerVolume(){
            return toner_volume;
        }


}

//nb. we are assuming the toner does not run out (before the paper)
