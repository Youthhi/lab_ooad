import javax.swing.*;

import java.awt.Component;
//import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class Register extends JFrame {
    
JTextField name = new JTextField(25);
JTextField title = new JTextField(25);
JTextField supervisor_name = new JTextField(25);
JTextArea abstractcontent = new JTextArea(3,25);
JRadioButton oralBtn = new JRadioButton("Oral");
JRadioButton posterBtn = new JRadioButton("Poster");

ButtonGroup presentationGroup = new ButtonGroup();

JButton button = new JButton("Register as Student");


Register(){

       presentationGroup.add(oralBtn);
       presentationGroup.add(posterBtn);

       
        oralBtn.setSelected(true);

        JPanel presentation_type = new JPanel(new FlowLayout(FlowLayout.LEFT));
presentation_type.add(oralBtn);
presentation_type.add(posterBtn);


    this.setSize(700,350);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        main.add(formRow("Name", name));
        main.add(formRow("Research Title", title));
        main.add(formRow("Abstract", new JScrollPane(abstractcontent)));
        main.add(formRow("Supervisor", supervisor_name));
        main.add(formRow("Presentation Type", presentation_type));

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(button);

        main.add(Box.createVerticalStrut(20));
        main.add(btnPanel);

        add(main);

        abstractcontent.setLineWrap(true);
        abstractcontent.setWrapStyleWord(true);



    

}

 private JPanel formRow(String label, Component field) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel l = new JLabel(label + ":");
        l.setPreferredSize(new Dimension(130, 25));
        row.add(l);
        row.add(field);
        row.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        return row;
    }


}
