package xmlProgram;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ModificarTitulo {

    public static void modificarNombreAnimePorCodigo() {
        try {
        	
        	File archivoXML = new File("nuevo_ejemplo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivoXML);
            doc.getDocumentElement().normalize();

            NodeList listaAnimes = doc.getElementsByTagName("anime");

            Scanner sc = new Scanner(System.in);
            
            
            for (int i = 0; i < listaAnimes.getLength(); i++) {
                Node nodoAnime = listaAnimes.item(i);

                if (nodoAnime.getNodeType() == Node.ELEMENT_NODE) {
                	System.out.println("Introduce el codigo del anime que desea modificar");
                	
                    Element elementoAnime = (Element) nodoAnime;
                    String codigo = elementoAnime.getElementsByTagName("codigo").item(0).getTextContent();

                    String codPel = sc.nextLine().trim();
                    
                    if (codigo.trim().equals(codPel.trim())) {
                    	String nuevoNombreAnime = "";
                        NodeList listaNombres = elementoAnime.getElementsByTagName("titulo");
                        Element elementoNombre = (Element) listaNombres.item(0);
                        System.out.println("Introduce el nuevo nombre del anime");
                        nuevoNombreAnime = sc.nextLine();
                        elementoNombre.setTextContent(nuevoNombreAnime);
                        break;
                    }
                }
            }

            // Guardar los cambios en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(archivoXML);
            transformer.transform(source, result);

            System.out.println("Nombre del anime modificado correctamente en el archivo XML.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}