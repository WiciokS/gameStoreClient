package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.SOAP.InteractSoap;
import lt.viko.eif.vskuder.client.Game;
import lt.viko.eif.vskuder.client.GetGamesRequest;
import lt.viko.eif.vskuder.client.GetGamesResponse;

import javax.swing.*;
import java.util.List;

public class GetAllGamesForm {
    private JPanel GetAllGamesPanel;
    private JList list1;
    private JFrame frame;

    public GetAllGamesForm() {
        frame = new JFrame("GetAllGamesForm");
        frame.setContentPane(GetAllGamesPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        InteractSoap interactSoap = new InteractSoap();
        GetGamesRequest getGamesRequest = new GetGamesRequest();
        GetGamesResponse getGamesResponse = interactSoap.getGames(getGamesRequest);
        //using loop add all games to list
        List<Game> games = getGamesResponse.getGames();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Game game : games) {
            model.addElement(
                    game.getId() + " " +
                            game.getTitle() + " " +
                            game.getPrice() + " " +
                            game.getDeveloper().getName() + " " +
                            game.getCategory().getName());
        }
        list1.setModel(model);

    }
}
