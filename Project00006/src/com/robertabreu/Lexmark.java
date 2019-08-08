package com.robertabreu;

/**
 * Created by robertabreu on 1/24/16.
 */
public class Lexmark extends Printer {
    private String model;
    private int pages = 250;
    private int toner = 100;
    private static final int MAX_PAGE = 250;

    public Lexmark(boolean isLaser, boolean isDuplex, String model, int pages, int toner) {
        super(isLaser, isDuplex, 0);
        this.model = model;
        if(pages > 0 && pages <=250) {
            this.pages = pages;
        }
        if(toner > 0 && toner <= 100) {
            this.toner = toner;
        }
    }

    public String getModel() {
        return this.model;
    }

    public int getPages() {
        return this.pages;
    }

    public int getToner() {
        return this.toner;
    }

//    public boolean getIsDuplex() {
//        return isDuplex();
//    }

    public void pageCountChange(int change) {
        this.pages -= change;
        if(pages <= 15 && pages >= 1) {
            System.out.println("Warning: Paper count low: " + pages);
        }
        else if(pages <= 0)
        {
            System.out.println("Warning: Paper count critical: " + pages);
        } else {
            System.out.println("Page count: " + pages);
        }
    }

    public void depleteToner(int change) {
        this.toner -= change;
        if(this.toner <= 15 && this.toner >= 1) {
            System.out.println("Warning: toner low: " + this.toner + "%");
        }
        else if(this.toner <= 0)
        {
            System.out.println("Warning: toner critical: " + this.toner);
        } else {
            System.out.println("Toner levels: " + this.toner + "%");
        }
    }

    public void addToner(int toner) {
        if(toner > 0 && toner <= 100 && getToner() + toner <= 100) {
            this.toner += toner;
            System.out.println("Toner level: " + this.toner + "%");
        } else if (toner > 100 || getToner() + toner > 100) {
            System.out.println("Cannot overfill toner cartridge.");
        } else if (toner < 0) {
            System.out.println("You cannot subtract toner.");
        } else {
            System.out.println("Invalid entry.");
        }

    }

    public void addPaper(int paper) {
        if(paper > 0 && paper <= MAX_PAGE && getPages() + paper <= MAX_PAGE){
            this.pages += paper;
            System.out.println(paper + " sheets of paper added to printer.");
        } else if (paper > MAX_PAGE || getPages() + paper > MAX_PAGE) {
            System.out.println("You cannot overfill paper tray.");
        } else if (paper < 0) {
            System.out.println("You have to ADD paper.");
        } else {
            System.out.println("Invalid entry");
        }
    }



    public void print(String fileName, int fileSizeMB) {
        int pagesPrinted;
        int tonerChange;
        if(!isDuplex() && fileSizeMB > 0 && fileSizeMB <= 10 && getPages() >= 8 && getToner() >= 4) {
            pagesPrinted = 8;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(isDuplex() && fileSizeMB > 0 && fileSizeMB <= 10 && getPages() >= 4 && getToner() >= 2) {
            pagesPrinted = 4;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(!isDuplex() && fileSizeMB >= 11 && fileSizeMB <= 20 && getPages() >= 16 && getToner() >= 8) {
            pagesPrinted = 16;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(isDuplex() && fileSizeMB >= 11 && fileSizeMB <= 20 && getPages() >= 8 && getToner() >= 4) {
            pagesPrinted = 8;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(!isDuplex() && fileSizeMB >= 21 && fileSizeMB <= 30 && getPages() >= 24 && getToner() >= 12) {
            pagesPrinted = 24;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(isDuplex() && fileSizeMB >= 21 && fileSizeMB <= 30 && getPages() >= 12 && getToner() >= 6) {
            pagesPrinted = 12;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }else if(!isDuplex() && fileSizeMB >= 31 && fileSizeMB <= 40 && getPages() >= 32 && getToner() >= 16) {
            pagesPrinted = 32;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        }
        else if(isDuplex() && fileSizeMB >= 31 && fileSizeMB <= 40 && getPages() >= 16 && getToner() >= 8) {
            pagesPrinted = 16;
            tonerChange = pagesPrinted / 2;
            System.out.println("Printing file: " + fileName + ". Number of pages used " + pagesPrinted);
            changePageCount(pagesPrinted);
            pageCountChange(pagesPrinted);
            depleteToner(tonerChange);
        } else if(fileSizeMB >= 41){
            System.out.println("File too large");
        }
        else {
            System.out.println("           **Printer Error!** ");
            System.out.println("Please load more paper into printer");
        }


    }






}
