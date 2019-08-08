package com.robertabreu;

/**
 * Created by robertabreu on 1/24/16.
 */
public class Printer {
    private boolean isLaser;
    private boolean isDuplex;
    private int pagesPrinted;

    public Printer(boolean isLaser, boolean isDuplex, int pagesPrinted) {
        this.isLaser = isLaser;
        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isLaser() {
        return isLaser;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void changePageCount(int change){
        this.pagesPrinted += change;
    }

    public int getPagesPrinted() {
        System.out.println("Total pages printed: " + pagesPrinted);
        return pagesPrinted;
    }




}

