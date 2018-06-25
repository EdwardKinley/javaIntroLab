import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer1;
    Printer printer2;

    @Before
    public void before(){
        printer1 = new Printer(80,50, 22);
        printer2 = new Printer(60,10, 13);
    }

    @Test
    public void getPaperCapacity80(){
        assertEquals(80, printer1.getPaperCapacity());
    }

    @Test
    public void getPaperCapacity60(){
        assertEquals(60, printer2.getPaperCapacity());
    }

    @Test
    public void getPaperLeft50(){
        assertEquals(50, printer1.getPaperLeft());
    }

    @Test
    public void getPaperLeft10(){
        assertEquals(10, printer2.getPaperLeft());
    }

    @Test
    public void printOkay(){
        printer1.print(5,4);
        assertEquals(30, printer1.getPaperLeft());
    }

    @Test
    public void printInsufficientPaper(){
        printer2.print(4, 3);
        assertEquals(10, printer2.getPaperLeft());
    }

    @Test
    public void printAsManyAsCanCan(){
        printer1.printAsManyAsCan(10,3);
        assertEquals(20, printer1.getPaperLeft());
    }

    @Test
    public void printAsManyAsCanCannot(){
        printer2.printAsManyAsCan(5,4);
        assertEquals(0, printer2.getPaperLeft());
    }

    @Test
    public void refill80(){
        printer1.refill();
        assertEquals(80, printer1.getPaperLeft());
    }

    @Test
    public void refill60(){
        printer2.refill();
            assertEquals(60, printer2.getPaperLeft());
    }

    @Test
    public void getTonerVolume12(){
        printer1.print(5, 2);
        assertEquals(12, printer1.getTonerVolume());
    }

    @Test
    public void getTonerVolume3(){
        printer2.printAsManyAsCan(20,20);
        assertEquals(3, printer2.getTonerVolume());
    }


}
