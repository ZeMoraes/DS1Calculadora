package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Model
{
    /** @operando = operando.
     * @operador = operador
     * @lastOperato = recebe a ultima operação realizada.
     * @toInterface = interface Modelo para Controle. */
    private static String operando = "";
    private static String operador = "";
    private static String lastOperato = "";
    private static Model2Control toInterface = new Model2Control();
    
    /** Metodo que recebe uma tecla pressionada e análisa a operação que deve
     * ser feita por ela.
     * @param tecla = recebe a tecla
     * @param bork = variavel para repassar se a tecla é digital ou fisica. */
    public void recebeTecla(int tecla, boolean bork)
    {
        switch (tecla)
        {
            case 1:
                if (operador.equals(""))
                {
                    operador = realizarOperações(operando, operador, lastOperato);
                }
                else
                {
                    operador = realizarOperações(operador, operando, lastOperato);
                }
                operando = operador;
                // window.textField.setText(operando);/// aqui tenho que se comunicar com a
                // interface....
                toInterface.setTela(operando);
                operador = "";
                lastOperato = "=";
                break;
            case 2:
                lastOperato = "+";
                if (operador.equals(""))
                {
                    operador = realizarOperações(operando, operador, "+");
                }
                else
                {
                    operador = realizarOperações(operador, operando, "+");
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '+';
                    toInterface.setTela(temp);
                }
                operando = "";
                break;
            case 3:
                lastOperato = "*";
                if (operador.equals(""))
                {
                    operador = realizarOperações(operando, operador, "*");
                }
                else
                {
                    operador = realizarOperações(operador, operando, "*");
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '*';
                    toInterface.setTela(temp);
                }
                operando = "";
                break;
            case 4:
                lastOperato = "/";
                if (operador.equals(""))
                {
                    operador = realizarOperações(operando, operador, "/");
                }
                else
                {
                    operador = realizarOperações(operador, operando, "/");
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '/';
                    toInterface.setTela(temp);
                }
                operando = "";
                break;
            case 5:
                lastOperato = "-";
                if (operador.equals(""))
                {
                    operador = realizarOperações(operando, operador, "-");
                }
                else
                {
                    operador = realizarOperações(operador, operando, "-");
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '-';
                    toInterface.setTela(temp);
                }
                operando = "";
                break;
            case 6:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '1';
                    toInterface.setTela(temp);
                }
                operando += '1';
                break;
            case 7:
                if (lastOperato.equals("="))
                {
                    // .textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '2';
                    toInterface.setTela(temp);
                }
                operando += '2';
                break;
            case 8:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '3';
                    toInterface.setTela(temp);
                }
                operando += '3';
                break;
            case 9:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '4';
                    toInterface.setTela(temp);
                }
                operando += '4';
                break;
            case 10:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '5';
                    toInterface.setTela(temp);
                }
                operando += '5';
                break;
            case 11:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '6';
                    toInterface.setTela(temp);
                }
                operando += '6';
                break;
            case 12:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '7';
                    toInterface.setTela(temp);
                }
                operando += '7';
                break;
            case 13:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '8';
                    toInterface.setTela(temp);
                }
                operando += '8';
                break;
            case 14:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '9';
                    toInterface.setTela(temp);
                }
                operando += '9';
                break;
            case 15:
                if (lastOperato.equals("="))
                {
                    // window.textField.setText("");
                    toInterface.setTela("");
                    lastOperato = "";
                    operando = "";
                }
                if (bork)
                {
                    String temp = toInterface.getTela() + '0';
                    toInterface.setTela(temp);
                }
                operando += '0';
                break;
            case 16:
                operador = "";
                operando = "";
                toInterface.setTela("");
                lastOperato = "";
                break;
            default:
                break;
        }
    }
    
    /** Metodo para somar dois valores.
     * @param num1 recebe o primeiro valor para soma.
     * @param num2 recebe o segundo valor para soma.
     * @return retorna o valor da soma. */
    private long somar(long num1, long num2)
    {
        return num1 + num2;
    }
    
    /** Metodo para multiplicar dois valores.
     * @param num1 primeiro valor para a multiplicaxão
     * @param num2 segundo valor para a multiplicaxão
     * @return retorna o resultado. */
    private long multiplicar(long num1, long num2)
    {
        return num1 * num2;
    }
    
    /** Metodo para dividir dois valores
     * @param num1 primeiro valor para a divisão
     * @param num2 primeiro valor para a divisão
     * @return retorna o resultado. */
    private long dividir(long num1, long num2)
    {
        return num1 / num2;
    }
    
    /** Metodo para subtrair dois valores
     * @param num1 primeiro valor para a subtração
     * @param num2 primeiro valor para a subtração
     * @return retorna o resultado. */
    private long subtrair(long num1, long num2)
    {
        return num1 - num2;
    }
    
    /** Metodo que realiza uma operação(multipli,divide,subtrai,soma)
     * @param num1 recebe o primeio valor da opração
     * @param num2 recebe o segundo valor da opração
     * @param operacao receber o timo de operação (* multipli, / divide, -
     *        subtrai, + soma)
     * @return retorna o resultado, em string. */
    public String realizarOperações(String num1, String num2, String operacao)
    {
        String resultado = "";
        if (operacao.equals("/"))
        {
            if (num2.equals("0"))
            {
                resultado = "Não é possivel dividir por 0";
            }
            else if (num2.equals(""))
            {
                resultado = num1;
            }
            else
            {
                long divisao = dividir(Long.parseLong(num1), Long.parseLong(num2));
                resultado += divisao;
            }
        }
        else if (operacao.equals("*"))
        {
            if (num2.equals(""))
            {
                resultado = num1;
            }
            else
            {
                long multiplicasao = multiplicar(Long.parseLong(num1), Long.parseLong(num2));
                resultado += multiplicasao;
            }
        }
        else if (operacao.equals("+"))
        {
            if (num2.equals(""))
            {
                resultado = num1;
            }
            else
            {
                long soma = somar(Long.parseLong(num1), Long.parseLong(num2));
                resultado += soma;
            }
        }
        else if (operacao.equals("-"))
        {
            if (num2.equals(""))
            {
                resultado += num1;
            }
            else
            {
                long subtrasao = subtrair(Long.parseLong(num1), Long.parseLong(num2));
                resultado += subtrasao;
            }
        }
        return resultado;
    }
    
    /** Metodo para salvar conteudo da tela em um txt. */
    public void saveFile()
    {
        try
        {
            File arquivo1 = new File("save.txt");
            FileWriter fileW = new FileWriter(arquivo1);
            BufferedWriter buffW = new BufferedWriter(fileW);
            buffW.write(toInterface.getTela());
            buffW.close();
        }
        catch (Exception e)
        {
            toInterface.setTela(e.toString());
            ;
        }
    }
    
    /** Metodo para ler conteudo da tela salvo em um txt. */
    public void readFile()
    {
        try
        {
            File arquivo1 = new File("save.txt");
            if (arquivo1.exists())
            {
                FileReader fileR = new FileReader(arquivo1);//arquivo ppara ser lido
                BufferedReader buffR = new BufferedReader(fileR);//arquivo buferizado
                while (buffR.ready())
                {
                    toInterface.setTela(buffR.readLine());
                }
                buffR.close();
            }
            else
            {
                arquivo1.createNewFile();
            }
        }
        catch (Exception e)
        {
            toInterface.setTela("Ops, houve um erro.");
        }
    }
}
