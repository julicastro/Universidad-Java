package enumeraciones;

//clase PaisesContinentes
public enum PaisesContinentes {
    AFRICA("Marruecos", "Senegal", "Tunez"),
    EUROPA("España", "Inglaterra", "Italia"),
    ASIA("China", "India", "Tailandia"),
    AMERICA("Colombia", "Peru", "Mexico"),
    OCEANIA("New Zelanda");

    private final String[] paises;

    PaisesContinentes(String... paises) {
        this.paises = paises;
    }

    public String[] getPaises() {
        return paises;
    }

    @Override
    public String toString() {
        StringBuffer paises = new StringBuffer();
        for(var pais: this.paises){
            paises.append(pais).append(" ");
        }
        return "paises = " + paises.toString();
    }
}