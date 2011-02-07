package sm.ciscoop.importa;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface IImportaMalattie {

	@WebMethod 
	public boolean isOnline();
	
	@WebMethod 
	public String importaMalattie(String name);
	
	@WebMethod
	public List<Malattia> importazione(Malattia malattia);
}
