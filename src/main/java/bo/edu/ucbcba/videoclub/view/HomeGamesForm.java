package bo.edu.ucbcba.videoclub.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomeGamesForm extends JFrame {
    private JButton listingGamesButton;
    private JPanel rootPanel;
    private JButton addGameButton;
    private JButton homePageButton;

    public HomeGamesForm(JFrame parent) {
        super("Home");
        setContentPane(rootPanel);
        pack();
        setResizable(true);
        listingGamesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGames();
            }
        });
        addGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNewGame();
            }
        });

        homePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showHome();
            }
        });
    }

    public HomeGamesForm() {
        super("Home");
        setContentPane(rootPanel);
        pack();
        setResizable(true);
        listingGamesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGames();
            }
        });
        addGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNewGame();
            }
        });

        homePageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showHome();
            }
        });
    }

    public void showGames() {
        GamesForm form = new GamesForm(this);
        form.setVisible(true);
    }

    public void showNewGame() {
        RegisterGamesForm form = new RegisterGamesForm(this);
        form.setVisible(true);
        
    }

    public void showHome() {
        this.setVisible(false);
        InitialForm form = new InitialForm();
        form.setVisible(true);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        rootPanel.setLayout(new GridLayoutManager(3, 5, new Insets(50, 50, 50, 60), -1, -1));
        rootPanel.setBackground(new Color(-3090213));
        rootPanel.setForeground(new Color(-3090213));
        listingGamesButton = new JButton();
        listingGamesButton.setBackground(new Color(-12828863));
        listingGamesButton.setFont(new Font("Courier New", listingGamesButton.getFont().getStyle(), 18));
        listingGamesButton.setForeground(new Color(-4486332));
        listingGamesButton.setText("Listing Games");
        rootPanel.add(listingGamesButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addGameButton = new JButton();
        addGameButton.setBackground(new Color(-12828863));
        addGameButton.setFont(new Font("Courier New", addGameButton.getFont().getStyle(), 18));
        addGameButton.setForeground(new Color(-4486332));
        addGameButton.setText("Add Game");
        rootPanel.add(addGameButton, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        rootPanel.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        rootPanel.add(spacer3, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        rootPanel.add(spacer4, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setFont(new Font("Courier New", Font.BOLD, 22));
        label1.setForeground(new Color(-4486332));
        label1.setText("  Games");
        rootPanel.add(label1, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        homePageButton = new JButton();
        homePageButton.setBackground(new Color(-12828863));
        homePageButton.setFont(new Font("Courier New", homePageButton.getFont().getStyle(), 18));
        homePageButton.setForeground(new Color(-4486332));
        homePageButton.setText("Home Page");
        rootPanel.add(homePageButton, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
