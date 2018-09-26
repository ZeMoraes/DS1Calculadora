package Control;

import java.awt.EventQueue;
import View.View;

public class CotrolView
{
    /** @window = Instancia da Interface */
    private static View window = new View();
    
    /** Inicializa a tela. */
    public void inicializarTela()
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    window.frmCalculadora.setVisible(true);
                    Control.Carregar();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /** Define um rsultado na tela.
     * @param operando = valor a ser repassado para tela. */
    public void setTela(String operando)
    {
        window.textField.setText(operando);
    }
    
    /** Obten o conteudo da tela.
     * @return retorna o conteudo da tela. */
    public String getTela()
    {
        return window.textField.getText();
    }
}
