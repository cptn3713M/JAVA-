//
//    import java.sql.*;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import java.util.*;
//
//    public class apahcedatabase extends JFrame implements ActionListener {
//        private Connection conn;
//        private Statement stmt;
//        private ResultSet rs;
//        private JTextArea textArea;
//        private JButton connectButton;
//        private JTextField urlField, usernameField, passwordField;
//        private JPanel connectPanel;
//
//        public apahcedatabase() {
//            super("Database Webpage");
//
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            setSize(600, 600);
//
//            // Create text area for displaying data
//            textArea = new JTextArea();
//            textArea.setEditable(false);
//
//            // Create connect button and fields for URL, username, and password
//            connectButton = new JButton("Connect");
//            connectButton.addActionListener(this);
//            urlField = new JTextField("jdbc:mysql://localhost:3306/mydatabase");
//            usernameField = new JTextField("root");
//            passwordField = new JPasswordField();
//
//            // Create panel for connect button and fields
//            connectPanel = new JPanel(new GridLayout(4, 2));
//            connectPanel.add(new JLabel("URL:"));
//            connectPanel.add(urlField);
//            connectPanel.add(new JLabel("Username:"));
//            connectPanel.add(usernameField);
//            connectPanel.add(new JLabel("Password:"));
//            connectPanel.add(passwordField);
//            connectPanel.add(new JLabel(""));
//            connectPanel.add(connectButton);
//
//            // Add components to frame
//            add(connectPanel, BorderLayout.NORTH);
//            add(new JScrollPane(textArea), BorderLayout.CENTER);
//
//            setVisible(true);
//        }
//
//        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == connectButton) {
//                String url = urlField.getText();
//                String username = usernameField.getText();
//                String password = passwordField.getText();
//
//                try {
//                    // Connect to database
//                    conn = DriverManager.getConnection(url, username, password);
//                    stmt = conn.createStatement();
//
//                    // Execute SQL query and display results in text area
//                    rs = stmt.executeQuery("SELECT * FROM mytable");
//                    ResultSetMetaData rsmd = rs.getMetaData();
//                    int numColumns = rsmd.getColumnCount();
//                    while (rs.next()) {
//                        for (int i = 1; i <= numColumns; i++) {
//                            textArea.append(rsmd.getColumnName(i) + ": " + rs.getString(i) + "\n");
//                        }
//                        textArea.append("\n");
//                    }
//
//                    // Display results in browser
//                    String html = "<html><body>" + textArea.getText() + "</body></html>";
//                    JEditorPane editorPane = new JEditorPane();
//                    editorPane.setContentType("text/html");
//                    editorPane.setText(html);
//                    editorPane.setEditable(false);
//                    editorPane.addHyperlinkListener(new HyperlinkListener() {
//                        public void hyperlinkUpdate(HyperlinkEvent e) {
//                            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
//                                try {
//                                    Desktop.getDesktop().browse(e.getURL().toURI());
//                                } catch (Exception ex) {
//                                    ex.printStackTrace();
//                                }
//                            }
//                        }
//                    });
//                    JScrollPane scrollPane = new JScrollPane(editorPane);
//                    JFrame frame = new JFrame("Database Results");
//                    frame.getContentPane().add(scrollPane);
//                    frame.setSize(600, 600);
//                    frame.setVisible(true);
//
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            new apahcedatabase();
//        }
//    }
//
//}
