package Control;
/** @author djze5 Classe controle de Calculadora. */
public class Control
{
    /** @controView = interface Controle para View.
     * @controlModel = interface Controle para Modelo. */
    private static CotrolView controView = new CotrolView();
    private static Control2Model controlModel = new Control2Model();
    
    /** Esse metodo inicializa o programa. */
    public static void main(String[] args)
    {
        controView.inicializarTela();
    }
    
    /** Metodo que recebe as teclas que foram precionadas. repassa para o model
     * exercer as regras de negocio.
     * @param tecla recebe a tecla precionada
     * @param bork indica se a tecla foi precionada via teclado ou interface
     *        gráfica. */
    public static void teclasPrecionadas(int tecla, boolean bork)
    {
        controlModel.teclasPressionadas(tecla, bork);
    }
    
    /** Envia uma string para tela.
     * @param toTela envia um resultado para tela. */
    public static void setStringTela(String toTela)
    {
        controView.setTela(toTela);
    }
    
    /** Pega o conteudo da tela.
     * @return retorna o conteudo da tela. */
    public static String getTela()
    {
        return controView.getTela();
    }
    
    /** Metodo para Salvar ultima informação da tela. */
    public static void salvar()
    {
        controlModel.salvar();
    }
    
    /** Metodo Para Carregar a ultima informação da tela. */
    public static void Carregar()
    {
        controlModel.carregar();
    }
}
