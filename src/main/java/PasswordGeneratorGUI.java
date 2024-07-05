import javax.swing.*;
import java.awt.*;

public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI(){
        super("Password Generator");

        setSize(540, 570);
        setResizable(true);
        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addGuiComponents();
    }

    private void addGuiComponents(){
        //Used for creating title text
        JLabel titleLabel = new JLabel("Password Generator");
        //We use it for increasing the font size and make it bold
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0, 10, 540, 39);
        add(titleLabel);

        // the result text area and it's customisation
        JTextArea passwordOutput = new JTextArea();
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));

        // scrollability in case output becomes too big
        JScrollPane passwordOutputPane = new JScrollPane();
        passwordOutputPane.setBounds(25, 97, 479, 70);

        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);

        // creating password length label
        JLabel passwordLengthLabel = new JLabel("Password Length: ");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 32));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);

        // creating toggle buttons
        // uppercase letter toggle
        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setBounds(25, 302, 225, 56 );
        add(uppercaseToggle);

        // lowercase letter toggle
        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setBounds(282, 302, 225, 56);
        add(lowercaseToggle);

        // numbers toggle
        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setBounds(25, 373, 225, 56);
        add(numbersToggle);

        //symbols toggle
        JToggleButton symbolsToggle = new JToggleButton("Symbols");
        symbolsToggle.setBounds(282, 373, 225, 56);
        add(symbolsToggle);

    }
}
