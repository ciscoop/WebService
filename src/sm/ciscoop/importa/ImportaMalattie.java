package sm.ciscoop.importa;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface = "sm.ciscoop.importa.IImportaMalattie")
public class ImportaMalattie implements IImportaMalattie {
	private String c_varGlobale = "Prova WebService: ";

	@Override
	public String importaMalattie(String name) {
		System.out.println( c_varGlobale + name );
		return c_varGlobale + name;
	}

	@Override
	public ArrayList<Malattia> importazione(Malattia malattia) {
		if( malattia.getProva() == null ) {
			return null;
		}
		if( malattia.getProva().equalsIgnoreCase("stop") ) {
			try {
				Thread.sleep(20000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Web service: "+malattia.getProva());
		ArrayList<Malattia> lista = new ArrayList<Malattia>();
		lista.add(malattia);
		return lista;
	}

	@Override
	public boolean isOnline() {
		return true;
	}

}
