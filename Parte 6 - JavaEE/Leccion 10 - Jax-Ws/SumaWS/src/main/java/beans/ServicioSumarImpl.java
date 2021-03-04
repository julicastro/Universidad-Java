
package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless //ejb
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
    
    
    
    
    
    
}
