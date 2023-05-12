package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.SOAP.InteractSoap;
import lt.viko.eif.vskuder.client.GetDeveloperRequest;
import lt.viko.eif.vskuder.client.GetDeveloperResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GetDeveloperForm {
    private JPanel GetDeveloperPanel;
    private JTextField textField1;
    private JButton getDeveloperButton;
    private JFrame frame;
public GetDeveloperForm() {
    frame = new JFrame("GetDeveloperForm");
    frame.setContentPane(GetDeveloperPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getDeveloperButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractSoap interactSoap = new InteractSoap();

            GetDeveloperRequest getDeveloperRequest = new GetDeveloperRequest();
            getDeveloperRequest.setDeveloperId(Integer.parseInt(textField1.getText()));

            GetDeveloperResponse getDeveloperResponse = interactSoap.getDeveloper(getDeveloperRequest);
            JOptionPane.showMessageDialog(null, getDeveloperResponse.getDeveloper().getName());
        }
    });
}
}
