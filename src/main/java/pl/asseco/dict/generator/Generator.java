package pl.asseco.dict.generator;

import java.io.File;

import javax.swing.JFileChooser;

public class Generator {

	private JFileChooser fc;
	
	public Generator(){
		fc = new JFileChooser();
		
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		fc.setCurrentDirectory(new File("S:\\"));
		fc.showOpenDialog(null);
		
	
	}
}
