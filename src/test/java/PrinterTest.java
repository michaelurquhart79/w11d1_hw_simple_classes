import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    Printer printer2;

    @Before
    public void before(){
        printer = new Printer(50, 1000);
        printer2 = new Printer(1000, 40);
    }

    @Test
    public void printerHasSheets(){
//        Printer printer = new Printer(50);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void printerHasEnoughPaperToPrint() {
        printer.print(10, 4);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void printerDoesNotHaveEnoughPaperToPrint() {
        printer.print(8,9);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void printerHasTonerVolume(){
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void printerTonerVolumeReducesWhenSufficientPaper(){
        printer.print(8,4);
        assertEquals(968, printer.getTonerVolume());
    }

    @Test
    public void printerTonerVolumeDoesNotReduceWhenInsufficientPaper(){
        printer.print(20,4);
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void printerTonerVolumeDoesNotReduceWhenInsufficientToner(){
        printer2.print(10,5);
        assertEquals(40, printer2.getTonerVolume());
    }

    @Test
    public void printerPaperDoesNotReduceWhenInsufficientToner() {
        printer2.print(10, 5);
        assertEquals(1000, printer2.getSheets());
    }


}




//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.