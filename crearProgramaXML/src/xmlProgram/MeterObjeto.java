package xmlProgram;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MeterObjeto {
	public void MeterObjeto(Objeto persona) {
		try {
            // Cargar el archivo XML existente
            File archivoXML = new File("nuevo_ejemplo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivoXML);

            // Crear un nuevo elemento persona y establecer sus atributos y nodos hijos
            Element nuevaPersona = doc.createElement("persona");

            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode(persona.getNombre()));
            nuevaPersona.appendChild(nombre);

            Element edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode(String.valueOf(persona.getEdad())));
            nuevaPersona.appendChild(edad);

            Element direccion = doc.createElement("direccion");
            direccion.appendChild(doc.createTextNode(persona.getDireccion()));
            nuevaPersona.appendChild(direccion);

            // Añadir el nuevo elemento persona al elemento raíz del documento
            doc.getDocumentElement().appendChild(nuevaPersona);

            // Guardar los cambios en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(archivoXML);
            transformer.transform(source, result);

            System.out.println("Nueva persona agregada al archivo XML correctamente.");

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}