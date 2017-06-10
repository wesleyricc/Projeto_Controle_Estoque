package gets_sets;

public class Fornecedor {

    private String textoRazaoFornecedor;
    private String textoNomeFornecedor;
    private String textoEnderecoFornecedor;
    private int textoCNPJFornecedor;
    private String textoTelefoneFornecedor;
    private String textoEmailFornecedor;

    public String getTextoRazaoFornecedor() {
        return textoRazaoFornecedor;
    }

    public void setTextoRazaoFornecedor(String textoRazaoFornecedor) {
        this.textoRazaoFornecedor = textoRazaoFornecedor;
    }

    public String getTextoNomeFornecedor() {
        return textoNomeFornecedor;
    }

    public void setTextoNomeFornecedor(String textoNomeFornecedor) {
        this.textoNomeFornecedor = textoNomeFornecedor;
    }

    public String getTextoEnderecoFornecedor() {
        return textoEnderecoFornecedor;
    }

    public void setTextoEnderecoFornecedor(String textoEnderecoFornecedor) {
        this.textoEnderecoFornecedor = textoEnderecoFornecedor;
    }

    public int getTextoCNPJFornecedor() {
        return textoCNPJFornecedor;
    }

    public void setTextoCNPJFornecedor(int textoCNPJFornecedor) {
        this.textoCNPJFornecedor = textoCNPJFornecedor;
    }

    public String getTextoTelefoneFornecedor() {
        return textoTelefoneFornecedor;
    }

    public void setTextoTelefoneFornecedor(String textoTelefoneFornecedor) {
        this.textoTelefoneFornecedor = textoTelefoneFornecedor;
    }

    public String getTextoEmailFornecedor() {
        return textoEmailFornecedor;
    }

    public void setTextoEmailFornecedor(String textoEmailFornecedorFornecedor) {
        this.textoEmailFornecedor = textoEmailFornecedorFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{\n\n" + "textoRazaoFornecedor=" + textoRazaoFornecedor + ",\n textoNomeFornecedor=" + textoNomeFornecedor + ",\n textoEnderecoFornecedor=" + textoEnderecoFornecedor + ",\n textoCPFCNPJFornecedor=" + textoCNPJFornecedor + ",\n textoTelefoneFornecedor=" + textoTelefoneFornecedor + ",\n textoEmailFornecedor=" + textoEmailFornecedor + '}';
    }
    
}

    
    