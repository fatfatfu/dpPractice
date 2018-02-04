package org.myProj.dpPractice.ProxyDesignPattern;

public class ProxyFtpFile implements FtpFile {
	private String fileName;
	private RealFtpFile realFtpFile;

	public ProxyFtpFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void unzip() {
		if (realFtpFile == null) {
			System.out.println("LOAD");
			realFtpFile = new RealFtpFile(fileName);
		}
		realFtpFile.unzip();
	}

}
