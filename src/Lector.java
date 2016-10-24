
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*Josué Cifuentes 15275
*Pablo Muñoz 15258
*/
/**
 *
 * @author Josue
 */
public class Lector {
    private String doc;
    private int lineas;
    private String operacion;
    
    /**
     *
     * @param archivo
     */
    public Lector (String archivo){
        doc = archivo;
    }
    
    /**
     *
     * @return
     * @throws IOException
     */
    public int countLines() throws IOException{
        FileReader line = new FileReader(doc);
        BufferedReader lines = new BufferedReader(line);
        int numLines = 0;
        String text;
        while ((text = lines.readLine()) != null)
            numLines++;
        lines.close();
        lineas = numLines;
        return numLines;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public String[] openFile() throws IOException{
        FileReader line = new FileReader(doc);
        BufferedReader lines = new BufferedReader(line);
        int numLines = countLines();
        String[] info = new String[numLines];
        for (int i = 0; i < numLines; i++)
            info[i] = lines.readLine();
        lines.close();
        operacion = info[0];
        
        return info;
    }
    
    /**
     *
     * @return
     */
    public int getLineas() {
        return lineas;
    }

    /**
     *
     * @param lineas
     */
    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    /**
     *
     * @return
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     *
     * @param operacion
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    
            
}
