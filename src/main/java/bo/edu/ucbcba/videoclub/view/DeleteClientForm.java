package bo.edu.ucbcba.videoclub.view;

import bo.edu.ucbcba.videoclub.controller.ClientController;
import bo.edu.ucbcba.videoclub.model.Client;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by privado on 18/05/2016.
 */
public class DeleteClientForm extends JFrame {
    private JTextField searchText;
    private JTable clientsTable;
    private JButton deleteButton;
    private JPanel rootPanel;
    private ClientController clientController;

    public DeleteClientForm(JFrame parent) {
        super("View Clients");
        setContentPane(rootPanel);
        setSize(600, 400);
        pack();
        setResizable(true);
        clientController = new ClientController();
        populateTable();
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteClient();
                populateTable("");
            }
        });
    }

    private void deleteClient() {
        if (clientController.deleteClient(searchText.getText())) {
            JOptionPane.showMessageDialog(this, "Client Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(this, "Invalid User CI ", "ERROR", JOptionPane.INFORMATION_MESSAGE);

    }


    private void populateTable() {
        List<Client> clients = clientController.searchClient(searchText.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CI");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Address");

        clientsTable.setModel(model);

        for (Client c : clients) {
            Object[] row = new Object[4];

            row[0] = c.getCi();
            row[1] = c.getFirstname();
            row[2] = c.getLastname();
            row[3] = c.getAddress();
            model.addRow(row);
        }
    }

    private void populateTable(String g) {
        List<Client> clients = clientController.searchClient(g);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CI");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Address");

        clientsTable.setModel(model);

        for (Client c : clients) {
            Object[] row = new Object[4];

            row[0] = c.getCi();
            row[1] = c.getFirstname();
            row[2] = c.getLastname();
            row[3] = c.getAddress();
            model.addRow(row);
        }
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(4, 6, new Insets(0, 0, 0, 0), -1, -1));
        searchText = new JTextField();
        rootPanel.add(searchText, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Delete Client");
        rootPanel.add(label1, new GridConstraints(0, 2, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clientsTable = new JTable();
        rootPanel.add(clientsTable, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(800, 300), null, 0, false));
        deleteButton = new JButton();
        deleteButton.setText("Delete");
        rootPanel.add(deleteButton, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("CI:");
        rootPanel.add(label2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, new Dimension(50, 50), null, new Dimension(50, 50), 0, false));
        final Spacer spacer2 = new Spacer();
        rootPanel.add(spacer2, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(50, 50), null, new Dimension(50, 50), 0, false));
        final Spacer spacer3 = new Spacer();
        rootPanel.add(spacer3, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, new Dimension(50, 50), null, new Dimension(50, 50), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
