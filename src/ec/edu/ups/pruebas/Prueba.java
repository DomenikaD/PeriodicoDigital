/*
 * 
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.MultiMedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public class Prueba {
    
    public static void main (String[] args){
        
        System.out.println("****************");
        System.out.println(" Redes Sociales ");
        System.out.println("****************");
        System.out.println(" ");
            
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
 
        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);
        
        String nom = facebook.getNombre();
        System.out.println("Nombre: " + nom);
        
        String ur = facebook.getUrl();
        System.out.println("URL: " + ur);
        
         
        System.out.println(" ");
        System.out.println("***********");
        System.out.println("  Seccion  ");
        System.out.println("***********");
        System.out.println(" ");
        
        Seccion seccion = new Seccion();
        seccion.setNombre("Comida");

        String nombre = seccion.getNombre();
        System.out.println("Nombre:" + nombre);
        
        
        System.out.println(" ");
        System.out.println("********************");
        System.out.println("Estructura Periodico");
        System.out.println("********************");
        System.out.println(" ");
        
        EstructuraPeriodico ep = new EstructuraPeriodico();
        ep.setNombrePeriodico("El Comercio");
        ep.setUbicacion("Quito");
        
        String nombreP =ep.getNombrePeriodico();
        System.out.println("Nombre del Periodico: "+ nombreP);
        
        String ubicacion = ep.getUbicacion();
        System.out.println("Ubicacion: "+ ubicacion );
        
        
       System.out.println(" ");
       System.out.println("**************");
       System.out.println("   Noticias   ");
       System.out.println("**************");
       System.out.println(" ");
        
       Noticia n = new Noticia();
       n.setTituloNoticia("Perros & Gatos");
       n.setAutor("Sofia Delgado");
       n.setLugar("Cuenca");
      n.setContenido("Perros & Gatos son bonitos");
        
       String tituloN = n.getTituloNoticia();
       System.out.println("Titulo de Noticia: " + tituloN);
       
       String contenido = n.getContenido();
       System.out.println("Contenido: " + contenido);
   
       String autor = n.getAutor();
       System.out.println("Autor: " + autor);
        
       String lugar = n.getLugar();
       System.out.println("Lugar: "+ lugar);
       
       
        System.out.println(" ");
        System.out.println("****************");
        System.out.println("   MultiMedia   ");
        System.out.println("****************");
        System.out.println(" ");
        
        MultiMedia mm = new MultiMedia();
        mm.setNombre("Verano 2016");
        mm.setTamanoByte(126);
        mm.setPath("C:/Users/Domenika Delgado/Desktop");
        
        String nombreM = mm.getNombre();
        System.out.println("Nombre: " + nombreM);
        
        int tamanoByte = mm.getTamanoByte();
        System.out.println("Tamaño de Byte: " + tamanoByte);
        
        String path = mm.getPath();
        System.out.println("Ubicacion: "+ path);
        
       
        
             
    }
    
    
    
}
