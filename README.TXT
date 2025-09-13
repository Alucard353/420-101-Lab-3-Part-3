Project: midi-player
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.



***************************** Anwsers *****************************
Q41: Yes it would techincally be possible to play a piano tune using this
Q43: Yes you could play it repeatedly
Q45: An internal call would be the play sequence and an external call would be the show instrument
Q51:public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);

        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;

        int currentMinutes = (int) (seconds / 60 % 60);
        int currentHours = (int) (seconds / (60 * 60) % 24);

        hours.setValue(currentHours);
        minutes.setValue(currentMinutes);
    }


}
Q52: Yes it does give the same result as the previous example