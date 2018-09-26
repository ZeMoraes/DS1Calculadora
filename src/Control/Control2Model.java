package Control;

import Model.Model;

/** @author djze5 Interface Controle para Modelo */
public class Control2Model
{
    /** @calculadora = intancia do modelo. A calculadora de fato. */
    private static Model calculadora = new Model();
    
    /** Metodo que repassa uma tecla pressionada
     * @param tecla = recebe a tecla
     * @param bork = variavel para repassar se a tecla é digital ou fisica. */
    public void teclasPressionadas(int tecla, boolean bork)
    {
        calculadora.recebeTecla(tecla, bork);
    }
    
    public void salvar()
    {
        calculadora.saveFile();
    }
    
    public void carregar()
    {
        calculadora.readFile();
    }
}
