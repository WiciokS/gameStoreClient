package lt.viko.eif.vskuder.GUI.Category;

import lt.viko.eif.vskuder.SOAP.InteractSoap;
import lt.viko.eif.vskuder.client.Category;
import lt.viko.eif.vskuder.client.GetCategoriesRequest;
import lt.viko.eif.vskuder.client.GetCategoriesResponse;

import javax.swing.*;
import java.util.List;

public class GetAllCategoriesForm {
    private JPanel getAllCategoriesPanel;
    private JList list1;
    private JFrame frame;

    public GetAllCategoriesForm() {
        frame = new JFrame("GetAllCategoriesForm");
        frame.setContentPane(getAllCategoriesPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        InteractSoap interactSoap = new InteractSoap();
        GetCategoriesRequest getCategoriesRequest = new GetCategoriesRequest();
        GetCategoriesResponse getCategoriesResponse = interactSoap.getCategories(getCategoriesRequest);
        //using loop add all categories to list
        List<Category> categories = getCategoriesResponse.getCategories();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Category category : categories) {
            model.addElement(category.getId() + " " + category.getName());
        }
        list1.setModel(model);
    }
}
