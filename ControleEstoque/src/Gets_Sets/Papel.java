package Gets_Sets;

public class Papel {

    private String textoTipopapel;
    private String textoCodpapel;
    private String textoFabricantepapel;
    private String textoGramaturapapel;
    private String textoFormatopapel;
    private String textoEstoquepapel;

    public String getTextoTipopapel() {
        return textoTipopapel;
    }

    public void setTextoTipopapel(String textoTipopapel) {
        this.textoTipopapel = textoTipopapel;
    }

    public String getTextoCodpapel() {
        return textoCodpapel;
    }

    public void setTextoCodpapel(String textoCodpapel) {
        this.textoCodpapel = textoCodpapel;
    }

    public String getTextoFabricantepapel() {
        return textoFabricantepapel;
    }

    public void setTextoFabricantepapel(String textoFabricantepapel) {
        this.textoFabricantepapel = textoFabricantepapel;
    }

    public String getTextoGramaturapapel() {
        return textoGramaturapapel;
    }

    public void setTextoGramaturapapel(String textoGramaturapapel) {
        this.textoGramaturapapel = textoGramaturapapel;
    }

    public String getTextoFormatopapel() {
        return textoFormatopapel;
    }

    public void setTextoFormatopapel(String textoFormatopapel) {
        this.textoFormatopapel = textoFormatopapel;
    }

    public String getTextoEstoquepapel() {
        return textoEstoquepapel;
    }

    public void setTextoEstoquepapel(String textoEstoqueCodpapel) {
        this.textoEstoquepapel = textoEstoqueCodpapel;
    }

    @Override
    public String toString() {
        return "Papel\n\n{" + "textoTipopapel=" + textoTipopapel + ",\n textoCodpapel=" + textoCodpapel + ",\n textoFabricantepapel=" + textoFabricantepapel + ",\n textoGramaturapapel=" + textoGramaturapapel + ",\n textoFormatopapel=" + textoFormatopapel + ",\n textoEstoquepapel=" + textoEstoquepapel + '}';
    }
    
    
}
