package com.cg.anno;

public class Sbu {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	
	public Sbu(int sbuId, String sbuName, String sbuHead) {
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBu [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
}
