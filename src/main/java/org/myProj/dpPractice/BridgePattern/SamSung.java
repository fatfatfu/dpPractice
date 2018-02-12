package org.myProj.dpPractice.BridgePattern;

public class SamSung extends MobileBrand {
	private String softwareName;

	public SamSung(String name ,MobileSoftware software) {
		super(software);
		this.softwareName = name;
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getSimpleName());
		software.execute(softwareName);
	}

}
