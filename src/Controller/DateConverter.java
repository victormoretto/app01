package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.principal;

public class DateConverter {
    
    public Date converteData(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date novadata = null;
        try {
            novadata = sdf.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERRO NA DATA!!");
        }
        return novadata;
    }
    
}
