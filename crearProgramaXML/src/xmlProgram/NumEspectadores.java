package xmlProgram;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class NumEspectadores {

	public static void NumEspec() {
		
        try {
            // Crear un objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Crear un objeto DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML
            Document document = builder.parse("nuevo_ejemplo.xml");

            // Obtener la lista de elementos 'anime'
            NodeList listaAnime = document.getElementsByTagName("anime");

            // Iterar a través de la lista de animes
            for (int i = 0; i < listaAnime.getLength(); i++) {
                Element anime = (Element) listaAnime.item(i);
                String codigo = anime.getElementsByTagName("codigo").item(0).getTextContent();
                String titulo = anime.getElementsByTagName("titulo").item(0).getTextContent();
                String autor = anime.getElementsByTagName("autor").item(0).getTextContent();

                // Verificar si existe el nodo "espectadores"
                NodeList listaEspectadores = anime.getElementsByTagName("espectadores");
                if (listaEspectadores.getLength() > 0) {
                    Element espectadores = (Element) listaEspectadores.item(0);
                    
                    // Verificar si existe el nodo "meses" dentro de "espectadores"
                    NodeList listaMeses = espectadores.getElementsByTagName("meses");
                    if (listaMeses.getLength() > 0) {
                Element meses = (Element) listaMeses.item(0);
                String enero = meses.getElementsByTagName("enero").item(0).getTextContent();
                String febrero = meses.getElementsByTagName("febrero").item(0).getTextContent();
                String marzo = meses.getElementsByTagName("marzo").item(0).getTextContent();
                String abril = meses.getElementsByTagName("abril").item(0).getTextContent();
                String mayo = meses.getElementsByTagName("mayo").item(0).getTextContent();
                String junio = meses.getElementsByTagName("junio").item(0).getTextContent();
                String julio = meses.getElementsByTagName("julio").item(0).getTextContent();
                String agosto = meses.getElementsByTagName("agosto").item(0).getTextContent();
                String septiembre = meses.getElementsByTagName("septiembre").item(0).getTextContent();
                String octubre = meses.getElementsByTagName("octubre").item(0).getTextContent();
                String noviembre = meses.getElementsByTagName("noviembre").item(0).getTextContent();
                String diciembre = meses.getElementsByTagName("diciembre").item(0).getTextContent();

                int numEnero = Integer.parseInt(enero);
                int numFebrero = Integer.parseInt(febrero);
                int numMarzo = Integer.parseInt(marzo);
                int numAbril = Integer.parseInt(abril);
                int numMayo = Integer.parseInt(mayo);
                int numJunio = Integer.parseInt(junio);
                int numJulio = Integer.parseInt(julio);
                int numAgosto = Integer.parseInt(agosto);
                int numSeptiembre = Integer.parseInt(septiembre);
                int numOctubre = Integer.parseInt(octubre);
                int numNoviembre = Integer.parseInt(noviembre);
                int numDiciembre = Integer.parseInt(diciembre);
                
                int total= numEnero+numFebrero+numMarzo+numAbril+numMayo+numJunio+numJulio+numAgosto+numSeptiembre+numOctubre+numNoviembre+numDiciembre;
                
                System.out.println("Código: " + codigo);
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Espectadores enero: " + enero);
                System.out.println("Espectadores febrero: " + febrero);
                System.out.println("Espectadores marzo: " + marzo);
                System.out.println("Espectadores abril: " + abril);
                System.out.println("Espectadores mayo: " + mayo);
                System.out.println("Espectadores junio: " + junio);
                System.out.println("Espectadores julio: " + julio);
                System.out.println("Espectadores agosto: " + agosto);
                System.out.println("Espectadores septiembre: " + septiembre);
                System.out.println("Espectadores octubre: " + octubre);
                System.out.println("Espectadores noviembre: " + noviembre);
                System.out.println("Espectadores diciembre: " + diciembre);
                System.out.println("Espectadores totales al anio: " + total);
                System.out.println("----------------------");
                
                    } else {
                    	System.out.println("No hay datos de meses para este anime");
                    }
            } else {
            	System.out.println("No hay datos de espectadores para este anime");
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
