package com.robertabreu;

public class Main {

    public static void main(String[] args) {

    Lexmark lexmark220 = new Lexmark(false, false, "220", 200, 100);


        lexmark220.getPagesPrinted();
        lexmark220.addToner(30);
        lexmark220.print("Weedus", 20);
        lexmark220.print("Mega", 41);
        lexmark220.print("Super", 40);
        lexmark220.print("Weedus", 20);
        lexmark220.print("Weedus", 20);
        lexmark220.print("Weedus", 20);
        lexmark220.print("Super", 40);
        lexmark220.print("Super", 40);
        lexmark220.getPagesPrinted();
        lexmark220.print("Super", 40);
        lexmark220.print("tiny", 10);

        lexmark220.getPagesPrinted();
        lexmark220.addPaper(250);


    }
}
