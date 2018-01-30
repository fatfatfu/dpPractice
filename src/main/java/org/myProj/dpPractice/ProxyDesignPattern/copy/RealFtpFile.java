package org.myProj.dpPractice.ProxyDesignPattern.copy;

public class RealFtpFile implements FtpFile {
	private String fileName;

	public RealFtpFile(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void unzip() {
		System.out.println("unzip==="+fileName);
	}

	public void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName + " from disk");
	}

}
