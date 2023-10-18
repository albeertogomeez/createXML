package xmlProgram;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import java.io.File;
import java.util.ArrayList;

public class MeterObjeto {
	public void guardarObjetoEnXML(Objeto objeto, String nombreArchivo) {
		try {
            // Crea un contexto JAXB para la clase Objetos
            JAXBContext context = JAXBContext.newInstance(Objetos.class);

            // Crea un objeto Unmarshaller para leer el archivo XML existente
            Unmarshaller unmarshaller = context.createUnmarshaller();
            File archivoXML = new File(nombreArchivo);

            Objeto objetos;

            // Si el archivo XML existe, lee el contenido y conviértelo en un Objetos
            if (archivoXML.exists()) {
                objetos = (Objeto) unmarshaller.unmarshal(archivoXML);
            } else {
                // Si el archivo no existe, crea un nuevo objeto Objetos
                objetos = new Objeto();
                objetos.setObjetos(new ArrayList<>());
            }

            // Agrega el nuevo objeto a la lista existente de objetos
            objetos.getObjetos().add(objeto);

            // Crea un objeto Marshaller
            Marshaller marshaller = context.createMarshaller();

            // Configura el marshaller para el formato de salida (opcional)
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshaliza el objeto Objetos en el archivo XML existente
            marshaller.marshal(objetos, archivoXML);

            System.out.println("Objeto añadido al archivo XML correctamente en " + archivoXML.getAbsolutePath());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}