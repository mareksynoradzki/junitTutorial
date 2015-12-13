package com.synoradzki.JunitTutorial.rule;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class FolderRuleTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		File createdFile = folder.newFile("myfile.txt");
		File createdFolder = folder.newFolder("mysubfolder");

	}
}
