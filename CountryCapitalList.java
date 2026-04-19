package lab5;

import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {

        // Create mapping of countries to capitals
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "Delhi");   // as per your requirement
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create list model
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Create JList
        countryList = new JList<>(listModel);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();

                    for (String country : selectedCountries) {
                        System.out.println(country + " → " + capitalMap.get(country));
                    }
                    System.out.println("----------------------");
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        setTitle("Country Capital List");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}