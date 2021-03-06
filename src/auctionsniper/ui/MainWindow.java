package auctionsniper.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MainWindow extends JFrame {
    public static final String SNIPER_STATUS_NAME = "sniper status";
    public static final String MAIN_WINDOW_NAME = "Sniper";
    public static final String STATUS_JOINING = "Joining";
    public static final String STATUS_LOST = "Lost";
    public static final String STATUS_BIDDING = "Bidding";
    private final JLabel sniperStatus = createLabel();

    public MainWindow() {
        super("Auction Sniper");
        setName(MAIN_WINDOW_NAME);
        add(sniperStatus);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static JLabel createLabel() {
        JLabel result = new JLabel(STATUS_JOINING);
        result.setName(SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }

    public void showStatus(String status) {
        sniperStatus.setText(status);
    }
}
