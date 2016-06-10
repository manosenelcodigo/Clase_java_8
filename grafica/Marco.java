
package graficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Marco extends JFrame 
{
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    public void getVentana()
    {
        //setSize(1024,768);
        //setLocation(200,100);
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle(this.titulo);
        setResizable(true);
        setLocationRelativeTo(null);
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Image image=mipantalla.getImage("src/images/logo.png");
        setIconImage(image);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void getVentanaCentrada()
    {
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension dimension=mipantalla.getScreenSize();
        setSize(dimension.width/2,dimension.height/2);
        setLocation(dimension.width/4,dimension.height/4);
        
        setVisible(true);
        setTitle(this.titulo);
        setResizable(true);
        
        Image image=mipantalla.getImage("src/images/logo.png");
        setIconImage(image);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
