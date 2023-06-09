package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.SOAP.InteractSoap;
import lt.viko.eif.vskuder.client.RemoveCategoryResponse;
import lt.viko.eif.vskuder.client.RemoveDeveloperRequest;
import lt.viko.eif.vskuder.client.RemoveDeveloperResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteDeveloperForm {
    private JTextField textField1;
    private JButton deleteDeveloperButton;
    private JPanel DeleteDeveloperPanel;
    private JFrame frame;
public DeleteDeveloperForm() {
    frame = new JFrame("DeleteDeveloperForm");
    frame.setContentPane(DeleteDeveloperPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    deleteDeveloperButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractSoap interactSoap = new InteractSoap();

            RemoveDeveloperRequest removeDeveloperRequest = new RemoveDeveloperRequest();
            removeDeveloperRequest.setDeveloperId(Integer.parseInt(textField1.getText()));

            RemoveDeveloperResponse removeCategoryResponse = interactSoap.removeDeveloper(removeDeveloperRequest);
            JOptionPane.showMessageDialog(null, removeCategoryResponse.getAnswer());
        }
    });
}
}
