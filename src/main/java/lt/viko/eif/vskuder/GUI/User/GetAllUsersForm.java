package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.SOAP.InteractSoap;
import lt.viko.eif.vskuder.client.GetUsersRequest;
import lt.viko.eif.vskuder.client.GetUsersResponse;

import javax.swing.*;

public class GetAllUsersForm {
    private JPanel GetAllUsersPanel;
    private JList list1;
    private JFrame frame;

    public GetAllUsersForm() {
        frame = new JFrame("GetAllUsersForm");
        frame.setContentPane(GetAllUsersPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        InteractSoap interactSoap = new InteractSoap();
        GetUsersRequest request = new GetUsersRequest();
        GetUsersResponse response = interactSoap.getUsers(request);
        String[] users = new String[response.getUsers().size()];
        for (int i = 0; i < response.getUsers().size(); i++) {
            users[i] = response.getUsers().get(i).getId() + " " + response.getUsers().get(i).getUsername() + " " + response.getUsers().get(i).getPassword();
        }
        list1.setListData(users);
    }
}
