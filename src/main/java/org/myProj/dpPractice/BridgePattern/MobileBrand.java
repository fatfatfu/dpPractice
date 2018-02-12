package org.myProj.dpPractice.BridgePattern;

public abstract class MobileBrand {
	   protected MobileSoftware software;
	   
	   protected MobileBrand(MobileSoftware software){
	      this.software = software;
	   }
	   public abstract void run();
}
