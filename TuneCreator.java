
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Creat and initialise a TuneCreator
     */
    public TuneCreator()
    {
        player = new MidiPlayer();
    }
    
    /**
     * Create a new tune and play it
     */
    public void createAndPlay()
    {
        SimpleTune tune = new SimpleTune();
        
        tune.addNote("G4", 2);
        tune.addNote("G4", 2);
        tune.addNote("G4", 4);
        tune.addNote("G4", 2);
        tune.addNote("A4", 6);
        tune.addNote("E4", 4);
        tune.addNote("G4", 4);
        tune.addNote("G4", 4);
        tune.addNote("C5", 2);
        tune.addNote("D5", 6);
        
        tune.setInstrument(7);
        
        player.playTune(tune);
    
    }
    
}
