package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow
{
    public JFrame frmCalculadora;
    public JTextField textField;
    ViewControl toControler = new ViewControl();
    
    /** Cria a Tela. */
    public MainWindow()
    {
        initialize();
    }
    
    /** Inicializa os conteudos da tela. */
    private void initialize()
    {
        frmCalculadora = new JFrame();
        frmCalculadora.setFont(new Font("DialogInput", Font.PLAIN, 20));
        frmCalculadora.setForeground(Color.BLUE);
        frmCalculadora.setTitle("Calculadora");
        frmCalculadora.setBackground(Color.BLUE);
        frmCalculadora.setBounds(100, 100, 339, 425);
        frmCalculadora.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCalculadora.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosed(WindowEvent arg0)
            {
                // TODO Auto-generated method stub
                toControler.salvar();
                super.windowClosed(arg0);
            }
        });
        JPanel panel = new JPanel();
        frmCalculadora.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill][][grow,fill][grow,fill][grow,fill][grow,fill]"));
        textField = new JTextField();
        textField.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 21));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(textField, "cell 0 0,grow");
        textField.setColumns(10);
        textField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent arg0)
            {
                if (arg0.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    toControler.teclaPrecionada(1, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_ADD)
                {
                    toControler.teclaPrecionada(2, false);
                }
                if (arg0.getKeyCode() == 106)
                {
                    toControler.teclaPrecionada(3, false);
                }
                if (arg0.getKeyCode() == 111)
                {
                    toControler.teclaPrecionada(4, false);
                }
                if (arg0.getKeyCode() == 109)
                {
                    toControler.teclaPrecionada(5, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD1)
                {
                    toControler.teclaPrecionada(6, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD2)
                {
                    toControler.teclaPrecionada(7, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD3)
                {
                    toControler.teclaPrecionada(8, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD4)
                {
                    toControler.teclaPrecionada(9, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD5)
                {
                    toControler.teclaPrecionada(10, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD6)
                {
                    toControler.teclaPrecionada(11, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD7)
                {
                    toControler.teclaPrecionada(12, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD8)
                {
                    toControler.teclaPrecionada(13, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD9)
                {
                    toControler.teclaPrecionada(14, false);
                }
                if (arg0.getKeyCode() == KeyEvent.VK_NUMPAD0)
                {
                    toControler.teclaPrecionada(15, false);
                }
            }
        });
        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(16, true);
            }
        });
        panel.add(btnC, "flowx,cell 0 1,grow");
        // NUMEROS 1 a 0
        JButton button_5 = new JButton("1");
        button_5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(6, true);
            }
        });
        panel.add(button_5, "flowx,cell 0 4,grow");
        JButton button_6 = new JButton("2");
        button_6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(7, true);
            }
        });
        panel.add(button_6, "cell 0 4,grow");
        JButton button_7 = new JButton("3");
        button_7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(8, true);
            }
        });
        panel.add(button_7, "cell 0 4,grow");
        JButton btnNewButton = new JButton("4");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(9, true);
            }
        });
        panel.add(btnNewButton, "flowx,cell 0 3,grow");
        JButton button_2 = new JButton("5");
        button_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(10, true);
            }
        });
        panel.add(button_2, "cell 0 3,grow");
        JButton button_3 = new JButton("6");
        button_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(11, true);
            }
        });
        panel.add(button_3, "cell 0 3,grow");
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(12, true);
            }
        });
        panel.add(button7, "flowx,cell 0 2,grow");
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(13, true);
            }
        });
        panel.add(button8, "cell 0 2,grow");
        JButton button = new JButton("9");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(14, true);
            }
        });
        panel.add(button, "cell 0 2,grow");
        ////////////////////////////////////////////////
        JButton button_8 = new JButton("+");
        button_8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(2, true);
            }
        });
        panel.add(button_8, "cell 0 4,grow");
        JButton button_10 = new JButton("+/-");
        button_10.setEnabled(false);
        button_10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });
        panel.add(button_10, "flowx,cell 0 5,grow");
        JButton button_9 = new JButton("0");
        button_9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(15, true);
            }
        });
        panel.add(button_9, "cell 0 5,grow");
        JButton button_11 = new JButton(",");
        button_11.setEnabled(false);
        button_11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });
        panel.add(button_11, "cell 0 5,grow");
        JButton button_12 = new JButton("=");
        button_12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(1, true);
            }
        });
        panel.add(button_12, "cell 0 5,grow");
        JButton button_13 = new JButton("<-");
        button_13.setEnabled(false);
        button_13.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
            }
        });
        panel.add(button_13, "cell 0 1,grow");
        JButton button_14 = new JButton("-");
        button_14.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(5, true);
            }
        });
        panel.add(button_14, "cell 0 1,grow");
        JButton button_4 = new JButton("*");
        button_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(3, true);
            }
        });
        panel.add(button_4, "cell 0 3,grow");
        JButton button_1 = new JButton("/");
        button_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                toControler.teclaPrecionada(4, true);
            }
        });
        panel.add(button_1, "cell 0 2,grow");
    }
}
