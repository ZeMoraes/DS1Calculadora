package Model;

import Control.Control;

public class Model2Control
{
    /** Seta um valor na tela.
     * @param operando = valor. */
    public void setTela(String operando)
    {
        Control.setStringTela(operando);
    }
    
    /** Retorna o valor na tela.
     * @return = valor. */
    public String getTela()
    {
        return Control.getTela();
    }
}
