package beans;

import javax.ejb.Remote;

@Remote
public interface HolaMundoEjbRemote {
    public int sumar(int a, int b);
}
