package com.johnmalc.aplikace;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

/**
 * @author  John Malc
 * @version 
 *
 */
public class Console {

	private JTextArea textComponent;

		public static void sendTo(JTextArea textComponent) {
				new Console(textComponent).redirectSystemStreams();
			}

		/**
		 * @wbp.parser.entryPoint
		 */
		private Console(JTextArea textComponent) {
				this.textComponent = textComponent;
			}

		private void updateTextComponent(final String text) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					Document doc = textComponent.getDocument();
					try {
						doc.insertString(doc.getLength(), text, null);
					} catch (BadLocationException e) {
						throw new RuntimeException(e);
					}
					textComponent.setCaretPosition(doc.getLength() - 1);
				}
			});
		}

		private void redirectSystemStreams() {
			OutputStream out = new OutputStream() {
				@Override
				public void write(final int b) throws IOException {
					updateTextComponent(String.valueOf((char) b));
				}
					@Override
				public void write(byte[] b, int off, int len) throws IOException {
					updateTextComponent(new String(b, off, len));
				}
					@Override
				public void write(byte[] b) throws IOException {
					write(b, 0, b.length);
				}
			};
				System.setOut(new PrintStream(out, true));
				System.setErr(new PrintStream(out, true));
		}
}		
		
