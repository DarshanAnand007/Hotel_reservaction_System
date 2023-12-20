import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelReservationGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton reserveRoomButton;
    private JButton viewReservationsButton;
    private JButton getRoomNumberButton;
    private JButton updateReservationButton;
    private JButton deleteReservationButton;

    public HotelReservationGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Hotel Reservation System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        frame.add(panel, BorderLayout.CENTER);

        reserveRoomButton = new JButton("Reserve a Room");
        viewReservationsButton = new JButton("View Reservations");
        getRoomNumberButton = new JButton("Get Room Number");
        updateReservationButton = new JButton("Update Reservations");
        deleteReservationButton = new JButton("Delete Reservations");

        panel.add(reserveRoomButton);
        panel.add(viewReservationsButton);
        panel.add(getRoomNumberButton);
        panel.add(updateReservationButton);
        panel.add(deleteReservationButton);

        addActionListeners();

        frame.setVisible(true);
    }

    private void addActionListeners() {
        reserveRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Reserve Room button clicked!");
                // Add logic to reserve a room (e.g., show a dialog for user input and update the database)
            }
        });

        viewReservationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "View Reservations button clicked!");
                // Add logic to view reservations (e.g., fetch data from the database and display it)
            }
        });

        getRoomNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Get Room Number button clicked!");
                // Add logic to get room number (e.g., show a dialog for user input and query the database)
            }
        });

        updateReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Update Reservations button clicked!");
                // Add logic to update reservations (e.g., show a dialog for user input and update the database)
            }
        });

        deleteReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Delete Reservations button clicked!");
                // Add logic to delete reservations (e.g., show a dialog for user input and update the database)
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HotelReservationGUI();
            }
        });
    }
}
