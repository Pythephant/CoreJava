package exception07;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.sun.istack.internal.logging.Logger;

public class LoggingImageViewer {
	public static void main(String[] args) {

	}
}

class ImageViewerFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;
	private JLabel label;
	private static final Logger logger = Logger.getLogger("exception07", null);

	public ImageViewerFrame() {
		logger.entering("ImageViewer", "<init>");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// set up menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("File");
		menuBar.add(menu);

		JMenuItem openItem = new JMenuItem("Open");
		menuBar.add(openItem);

		JMenuItem exitItem = new JMenuItem("Exit");
		menuBar.add(exitItem);

		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				logger.fine("Exiting.");
				System.exit(0);
			}
		});

		label = new JLabel();
		add(label);
		logger.exiting("ImageViewerFrame, <init>");
	}

	private class FileOpenListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event);

			// set up file chooser
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			// accept all files ending with .gif
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

				@Override
				public boolean accept(File f) {
					// TODO Auto-generated method stub
					return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
				}

				@Override
				public String getDescription() {
					// TODO Auto-generated method stub
					return "GIF Images";
				}

			});

			// show file chooser dialog
			int r = chooser.showOpenDialog(ImageViewerFrame.this);
			if (r == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				logger.log(Level.FINE, "Reading file {0}", name);
				label.setIcon(new ImageIcon(name));
			} else {
				logger.fine("File open dialog canceled!");
			}
			logger.exiting("ImageViewer.FileOpenListener : actionPerformed");

		}

	}
}

class WindowHandler extends StreamHandler {
	private JFrame frame;

	public WindowHandler() {
		frame = new JFrame();
		final JTextArea output = new JTextArea();
		output.setEditable(false);
		frame.setSize(200, 200);
		frame.add(new JScrollPane(output));
		frame.setFocusable(false);
		frame.setVisible(true);
		setOutputStream(new OutputStream() {

			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub

			}

			public void write(byte[] b, int off, int len) {
				output.append(new String(b, off, len));
			}
		});

	}

	public void publish(LogRecord record) {
		if (!frame.isVisible())
			return;
		super.publish(record);
		flush();
	}

}
