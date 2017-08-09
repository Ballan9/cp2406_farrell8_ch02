package CodeInFigures;


import javax.swing.*;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        double KILOMETRES = 1.852, MILES = 1.150779 , Nautical =GetNauticalMile(),NautKm = Nautical * KILOMETRES, NautM = Nautical *MILES;
        JOptionPane.showMessageDialog(null, NautKm + " Kilometres " + NautM + " Miles " + Nautical + " Nautical Miles ");
    }
    public static double GetNauticalMile(){
        String NauticalString = JOptionPane.showInputDialog(null, "What Is the Nautical Miles");
        Double Nautical = Double.parseDouble(NauticalString);
    return Nautical;
    }

}
