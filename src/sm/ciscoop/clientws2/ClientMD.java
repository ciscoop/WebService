package sm.ciscoop.clientws2;

import java.util.List;






public class ClientMD {
	
	/** Client con Manager-Delegate */
	public static void main(String[] args) throws Exception {
		ImportaMalattieService servizio = new ImportaMalattieService();
		IImportaMalattie importaMalattie = servizio.getImportaMalattiePort();
		Malattia malattia = new Malattia();
		malattia.setProva(args[0]);
		
		List<Malattia> lista = importaMalattie.importazione(malattia);
		System.out.println("Finito");
	}
}
