package View;

import Control.Control;

public class ViewControl
{
    /** Interface View para controle, retornando a tecla precionada e se for
     * fisica ou digital
     * @param tecla = tecla
     * @param bork = fisica = falso, ou digital = true. */
    public void teclaPrecionada(int tecla, boolean bork)
    {
        Control.teclasPrecionadas(tecla, bork);
    }
    
    public void salvar()
    {
        // TODO Auto-generated method stub
        Control.salvar();
    }
}
