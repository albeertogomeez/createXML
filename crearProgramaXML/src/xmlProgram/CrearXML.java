package xmlProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearXML {

	public static void crearXML() throws ParserConfigurationException {
		
		 try {
			    // Crea un objeto DocumentBuilderFactory
			    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			    
			    // Crea un objeto DocumentBuilder
			    DocumentBuilder builder = factory.newDocumentBuilder();
			    
			    // Crea un nuevo documento XML
			    Document document = builder.newDocument();
			    
			    // Crea el elemento raíz
			    Element raiz = document.createElement("crunchyroll");
			    
			    // Agrega el elemento raíz al documento
			    document.appendChild(raiz);

			    // Crea elementos y atributos
			    
			    Element categ1 = document.createElement("categoria");
			    raiz.appendChild(categ1);
			    Element shonen = document.createElement("shonen");
			    categ1.appendChild(shonen);
			    Element gore = document.createElement("gore");
			    categ1.appendChild(gore);
			    
			    Element anime1 = document.createElement("anime01");
			    Element titulo1 = document.createElement("titulo");
			    titulo1.appendChild(document.createTextNode("Shingeki no Kyojin"));
			    Element autor1 = document.createElement("autor");
			    autor1.appendChild(document.createTextNode("Hajime Isayama"));
			    Element codigo1 = document.createElement("codigo");
			    codigo1.appendChild(document.createTextNode("01"));
			    Element espect1 = document.createElement("espectadores");
			    Element meses1 = document.createElement("meses");
			    espect1.appendChild(meses1);
			    Element mes1 = document.createElement("enero");
			    mes1.appendChild(document.createTextNode("1000"));
			    Element mes2 = document.createElement("febrero");
			    mes2.appendChild(document.createTextNode("1000"));
			    Element mes3 = document.createElement("marzo");
			    mes3.appendChild(document.createTextNode("1000"));
			    Element mes4 = document.createElement("abril");
			    mes4.appendChild(document.createTextNode("1000"));
			    Element mes5 = document.createElement("mayo");
			    mes5.appendChild(document.createTextNode("1000"));
			    Element mes6 = document.createElement("junio");
			    mes6.appendChild(document.createTextNode("1000"));
			    Element mes7 = document.createElement("julio");
			    mes7.appendChild(document.createTextNode("1000"));
			    Element mes8 = document.createElement("agosto");
			    mes8.appendChild(document.createTextNode("1000"));
			    Element mes9 = document.createElement("septiembre");
	    		mes9.appendChild(document.createTextNode("1000"));
			    Element mes10 = document.createElement("octubre");
			    mes10.appendChild(document.createTextNode("1000"));
			    Element mes11 = document.createElement("noviembre");
	    		mes11.appendChild(document.createTextNode("1000"));
			    Element mes12 = document.createElement("diciembre");
			    mes12.appendChild(document.createTextNode("1000"));


			    anime1.appendChild(titulo1);
			    anime1.appendChild(autor1);
			    anime1.appendChild(codigo1);
			    anime1.appendChild(espect1);
			    meses1.appendChild(mes1);
			    meses1.appendChild(mes2);
			    meses1.appendChild(mes3);
			    meses1.appendChild(mes4);
			    meses1.appendChild(mes5);
			    meses1.appendChild(mes6);
			    meses1.appendChild(mes7);
			    meses1.appendChild(mes8);
			    meses1.appendChild(mes9);
			    meses1.appendChild(mes10);
			    meses1.appendChild(mes11);
			    meses1.appendChild(mes12);
			    shonen.appendChild(anime1);
			    
			    Element anime2 = document.createElement("anime02");
			    Element titulo2 = document.createElement("titulo");
			    titulo2.appendChild(document.createTextNode("One Piece"));
			    Element autor2 = document.createElement("autor");
			    autor2.appendChild(document.createTextNode("Eiichiro Oda"));
			    Element codigo2 = document.createElement("codigo");
			    codigo2.appendChild(document.createTextNode("02"));
			    Element espect2 = document.createElement("espectadores");
			    Element meses2 = document.createElement("meses");
			    espect2.appendChild(meses2);
			    Element mes2_1 = document.createElement("enero");
			    mes2_1.appendChild(document.createTextNode("1000"));
			    Element mes2_2 = document.createElement("febrero");
			    mes2_2.appendChild(document.createTextNode("1000"));
			    Element mes2_3 = document.createElement("marzo");
			    mes2_3.appendChild(document.createTextNode("1000"));
			    Element mes2_4 = document.createElement("abril");
			    mes2_4.appendChild(document.createTextNode("1000"));
			    Element mes2_5 = document.createElement("mayo");
			    mes2_5.appendChild(document.createTextNode("1000"));
			    Element mes2_6 = document.createElement("junio");
			    mes2_6.appendChild(document.createTextNode("1000"));
			    Element mes2_7 = document.createElement("julio");
			    mes2_7.appendChild(document.createTextNode("1000"));
			    Element mes2_8 = document.createElement("agosto");
			    mes2_8.appendChild(document.createTextNode("1000"));
			    Element mes2_9 = document.createElement("septiembre");
			    mes2_9.appendChild(document.createTextNode("1000"));
			    Element mes2_10 = document.createElement("octubre");
			    mes2_10.appendChild(document.createTextNode("1000"));
			    Element mes2_11 = document.createElement("noviembre");
			    mes2_11.appendChild(document.createTextNode("1000"));
			    Element mes2_12 = document.createElement("diciembre");
			    mes2_12.appendChild(document.createTextNode("1000"));
			    
			    anime2.appendChild(titulo2);
			    anime2.appendChild(autor2);
			    anime2.appendChild(codigo2);
			    anime2.appendChild(espect2);
			    meses2.appendChild(mes2_1);
			    meses2.appendChild(mes2_2);
			    meses2.appendChild(mes2_3);
			    meses2.appendChild(mes2_4);
			    meses2.appendChild(mes2_5);
			    meses2.appendChild(mes2_6);
			    meses2.appendChild(mes2_7);
			    meses2.appendChild(mes2_8);
			    meses2.appendChild(mes2_9);
			    meses2.appendChild(mes2_10);
			    meses2.appendChild(mes2_11);
			    meses2.appendChild(mes2_12);
			    shonen.appendChild(anime2);
			    
			    Element anime3 = document.createElement("anime01");
			    Element titulo3 = document.createElement("titulo");
			    titulo3.appendChild(document.createTextNode("One Piece"));
			    Element autor3 = document.createElement("autor");
			    autor3.appendChild(document.createTextNode("Eichiro Oda"));
			    Element codigo3 = document.createElement("codigo");
			    codigo3.appendChild(document.createTextNode("02"));
			    Element espect3 = document.createElement("espectadores");
			    Element meses3 = document.createElement("meses");
			    espect3.appendChild(meses3);
			    Element mes3_1 = document.createElement("enero");
			    mes3_1.appendChild(document.createTextNode("1000"));
			    Element mes3_2 = document.createElement("febrero");
			    mes3_2.appendChild(document.createTextNode("1000"));
			    Element mes3_3 = document.createElement("marzo");
			    mes3_3.appendChild(document.createTextNode("1000"));
			    Element mes3_4 = document.createElement("abril");
			    mes3_4.appendChild(document.createTextNode("1000"));
			    Element mes3_5 = document.createElement("mayo");
			    mes3_5.appendChild(document.createTextNode("1000"));
			    Element mes3_6 = document.createElement("junio");
			    mes3_6.appendChild(document.createTextNode("1000"));
			    Element mes3_7 = document.createElement("julio");
			    mes3_7.appendChild(document.createTextNode("1000"));
			    Element mes3_8 = document.createElement("agosto");
			    mes3_8.appendChild(document.createTextNode("1000"));
			    Element mes3_9 = document.createElement("septiembre");
			    mes3_9.appendChild(document.createTextNode("1000"));
			    Element mes3_10 = document.createElement("octubre");
			    mes3_10.appendChild(document.createTextNode("1000"));
			    Element mes3_11 = document.createElement("noviembre");
			    mes3_11.appendChild(document.createTextNode("1000"));
			    Element mes3_12 = document.createElement("diciembre");
			    mes2_12.appendChild(document.createTextNode("1000"));
			    
			    anime3.appendChild(titulo3);
			    anime3.appendChild(autor3);
			    anime3.appendChild(codigo3);
			    anime3.appendChild(espect3);
			    meses3.appendChild(mes3_1);
			    meses3.appendChild(mes3_2);
			    meses3.appendChild(mes3_3);
			    meses3.appendChild(mes3_4);
			    meses3.appendChild(mes3_5);
			    meses3.appendChild(mes3_6);
			    meses3.appendChild(mes3_7);
			    meses3.appendChild(mes3_8);
			    meses3.appendChild(mes3_9);
			    meses3.appendChild(mes3_10);
			    meses3.appendChild(mes3_11);
			    meses3.appendChild(mes3_12);
			    gore.appendChild(anime3);
//			    
//			    Element titulo3 = document.createElement("titulo");
//			    titulo3.appendChild(document.createTextNode("Dragon Ball"));
//			    Element autor3 = document.createElement("autor");
//			    autor1.appendChild(document.createTextNode("Akira Toriyama"));
//			    Element anio3 = document.createElement("anio");
//			    anio1.appendChild(document.createTextNode("1992"));
//			    
//			    Element titulo4 = document.createElement("titulo");
//			    titulo4.appendChild(document.createTextNode("Chainsaw Man"));
//			    Element autor4 = document.createElement("autor");
//			    autor1.appendChild(document.createTextNode("Tatsuya Endo"));
//			    Element anio4 = document.createElement("anio");
//			    anio1.appendChild(document.createTextNode("2022"));

			    // Crea un objeto Transformer para escribir el archivo XML
			    TransformerFactory transformerFactory = TransformerFactory.newInstance();
			    Transformer transformer = transformerFactory.newTransformer();
			    
			    // Crea un objeto DOMSource para el documento
			    DOMSource source = new DOMSource(document);
			    
			    // Crea un objeto StreamResult para el archivo XML de salida
			    File archivoXML = new File("nuevo_ejemplo.xml");
			    StreamResult result = new StreamResult(archivoXML);
			    
			    // Transforma el documento a un archivo XML
			    transformer.transform(source, result);
			    
			    System.out.println("Archivo XML creado correctamente en " + archivoXML.getAbsolutePath());
			    
			    
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	
}
