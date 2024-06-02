import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{

    JTextField saida;

    // Construtor
    Calculadora(){
        
        // Campo de texto
        saida = new JTextField();
        saida.setBackground(new Color(0xe29cae));
        saida.setPreferredSize(new Dimension(300, 80));
        saida.setFont(new Font("Comic Sans",Font.BOLD ,32));
        saida.setForeground(new Color(0x802c54));
        saida.setEditable(false);

        // Botões
            // Números
        JButton botao1 = new JButton();
        botao1.setBackground(new Color(0xffcbd7));
        botao1.setText("2");
        botao1.setForeground(new Color(0x802c54));
        botao1.setFocusable(false);
        botao1.addActionListener(e -> saida.setText(saida.getText() + "2"));

        JButton botao2 = new JButton();
        botao2.setBackground(new Color(0xffcbd7));
        botao2.setForeground(new Color(0x802c54));
        botao2.setText("3");
        botao2.setFocusable(false);
        botao2.addActionListener(e -> saida.setText(saida.getText() + "3"));

        JButton botaoVirgula = new JButton();
        botaoVirgula.setBackground(new Color(0xffcbd7));
        botaoVirgula.setForeground(new Color(0x802c54));
        botaoVirgula.setText(".");
        botaoVirgula.setFocusable(false);
        botaoVirgula.addActionListener(e -> saida.setText(saida.getText() + "."));

        JButton botao5 = new JButton();
        botao5.setBackground(new Color(0xffcbd7));
        botao5.setForeground(new Color(0x802c54));
        botao5.setText("7");
        botao5.setFocusable(false);
        botao5.addActionListener(e -> saida.setText(saida.getText() + "7"));

        JButton botao6 = new JButton();
        botao6.setBackground(new Color(0xffcbd7));
        botao6.setForeground(new Color(0x802c54));
        botao6.setText("8");
        botao6.setFocusable(false);
        botao6.addActionListener(e -> saida.setText(saida.getText() + "8"));

        JButton botao7 = new JButton();
        botao7.setBackground(new Color(0xffcbd7));
        botao7.setForeground(new Color(0x802c54));
        botao7.setText("9");
        botao7.setFocusable(false);
        botao7.addActionListener(e -> saida.setText(saida.getText() + "9"));

        JButton botao9 = new JButton();
        botao9.setBackground(new Color(0xffcbd7));
        botao9.setForeground(new Color(0x802c54));
        botao9.setText("4");
        botao9.setFocusable(false);
        botao9.addActionListener(e -> saida.setText(saida.getText() + "4"));

        JButton botao10 = new JButton();
        botao10.setBackground(new Color(0xffcbd7));
        botao10.setForeground(new Color(0x802c54));
        botao10.setText("5");
        botao10.setFocusable(false);
        botao10.addActionListener(e -> saida.setText(saida.getText() + "5"));

        JButton botao11 = new JButton();
        botao11.setBackground(new Color(0xffcbd7));
        botao11.setForeground(new Color(0x802c54));
        botao11.setText("6");
        botao11.setFocusable(false);
        botao11.addActionListener(e -> saida.setText(saida.getText() + "6"));

        JButton botao13 = new JButton();
        botao13.setBackground(new Color(0xffcbd7));
        botao13.setForeground(new Color(0x802c54));
        botao13.setText("1");
        botao13.setFocusable(false);
        botao13.addActionListener(e -> saida.setText(saida.getText() + "1"));

        JButton botao14 = new JButton();
        botao14.setBackground(new Color(0xffcbd7));
        botao14.setForeground(new Color(0x802c54));
        botao14.setText("0");
        botao14.setFocusable(false);
        botao14.addActionListener(e -> saida.setText(saida.getText() + "0"));

            // Operadores
        JButton botaoAdicao = new JButton();
        botaoAdicao.setBackground(new Color(0xffcbd7));
        botaoAdicao.setForeground(new Color(0x802c54));
        botaoAdicao.setText("+");
        botaoAdicao.setFocusable(false);
        botaoAdicao.addActionListener(e -> saida.setText(saida.getText() + "+"));

        JButton botaoDiferenca = new JButton();
        botaoDiferenca.setBackground(new Color(0xffcbd7));
        botaoDiferenca.setForeground(new Color(0x802c54));
        botaoDiferenca.setText("-");
        botaoDiferenca.setFocusable(false);
        botaoDiferenca.addActionListener(e -> saida.setText(saida.getText() + "-"));

        JButton botaoProduto = new JButton();
        botaoProduto.setBackground(new Color(0xffcbd7));
        botaoProduto.setForeground(new Color(0x802c54));
        botaoProduto.setText("×");
        botaoProduto.setFocusable(false);
        botaoProduto.addActionListener(e -> saida.setText(saida.getText() + "×"));

        JButton botaoDivisao = new JButton();
        botaoDivisao.setBackground(new Color(0xffcbd7));
        botaoDivisao.setForeground(new Color(0x802c54));
        botaoDivisao.setText("÷");
        botaoDivisao.setFocusable(false);
        botaoDivisao.addActionListener(e -> saida.setText(saida.getText() + "÷"));
        

        JButton botaoIgual = new JButton();
        botaoIgual.setBackground(new Color(0xffcbd7));
        botaoIgual.setForeground(new Color(0x802c54));
        botaoIgual.setText("=");
        botaoIgual.setFocusable(false);
        botaoIgual.addActionListener(this);

            // Extras
        JButton botaoDeletar = new JButton();
        botaoDeletar.setBackground(new Color(0xffcbd7));
        botaoDeletar.setForeground(new Color(0x802c54));
        botaoDeletar.setText("⌫");
        botaoDeletar.setFocusable(false);
        botaoDeletar.addActionListener(e -> saida.setText(saida.getText().substring(0, saida.getText().length() - 1)));

        JButton botaoC = new JButton();
        botaoC.setBackground(new Color(0xffcbd7));
        botaoC.setForeground(new Color(0x802c54));
        botaoC.setText("C");
        botaoC.setFocusable(false);
        botaoC.addActionListener(e -> saida.setText(""));

        JButton botaoPI = new JButton();
        botaoPI.setBackground(new Color(0xffcbd7));
        botaoPI.setForeground(new Color(0x802c54));
        botaoPI.setText("π");
        botaoPI.setFocusable(false);
        botaoPI.addActionListener(e -> saida.setText(saida.getText() + "3.14"));

        JButton botaoFatorial = new JButton();
        botaoFatorial.setBackground(new Color(0xffcbd7));
        botaoFatorial.setForeground(new Color(0x802c54));
        botaoFatorial.setText("!");
        botaoFatorial.setFocusable(false);
        botaoFatorial.addActionListener(e -> saida.setText(new Operacoes().fatorial(saida.getText())));
        
        // Imagens
        ImageIcon logo = new ImageIcon("C:/Users/Davi/Documents/programas/Java/exercícios/ex79/calculator.png");

        // Organizacao
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(new Color(0xffdde4));
        painelBotoes.setPreferredSize(new Dimension(200, 100));
        painelBotoes.setLayout(new GridLayout(5, 4, 5, 5));
        painelBotoes.add(botaoFatorial);
        painelBotoes.add(botaoPI);
        painelBotoes.add(botaoC);
        painelBotoes.add(botaoDivisao);
        painelBotoes.add(botao5);
        painelBotoes.add(botao6);
        painelBotoes.add(botao7);
        painelBotoes.add(botaoProduto);
        painelBotoes.add(botao9);
        painelBotoes.add(botao10);
        painelBotoes.add(botao11);
        painelBotoes.add(botaoDiferenca);
        painelBotoes.add(botao13);
        painelBotoes.add(botao1);
        painelBotoes.add(botao2);
        painelBotoes.add(botaoAdicao);
        painelBotoes.add(botaoVirgula);
        painelBotoes.add(botao14);
        painelBotoes.add(botaoDeletar);
        painelBotoes.add(botaoIgual);

            // Painel da saída

        JPanel painelSaida = new JPanel();
        painelSaida.setBackground(new Color(0xffdde4));
        painelSaida.setPreferredSize(new Dimension(300, 100));
        painelSaida.setLayout(new FlowLayout());
        painelSaida.add(saida);

        // Objeto em si
        this.setTitle("Calculadora");
        this.setSize(350, 550);
        this.setResizable(false);
        this.setIconImage(logo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(painelSaida, BorderLayout.NORTH);
        this.add(painelBotoes, BorderLayout.CENTER);
        

    }

    @Override
    public void actionPerformed(ActionEvent e){

        String xs = "";
        String ys = "";

        String caixa = this.saida.getText();
        String operadores = "+-÷×";
        String termo;

        int contador = 0;

        while (!operadores.contains(termo = "" + caixa.charAt(contador))){

            xs += termo;
            contador++;

        }

        contador++;

        while (contador < caixa.length()){

            ys += caixa.charAt(contador);
            contador++;

        }

        double x = Double.parseDouble(xs);
        double y = Double.parseDouble(ys);

        Operacoes calculo = new Operacoes();
        double resultado = calculo.Operacao(caixa, x, y);
        String resultadoString = "" + resultado;

        saida.setText(resultadoString);

    }
    
}
