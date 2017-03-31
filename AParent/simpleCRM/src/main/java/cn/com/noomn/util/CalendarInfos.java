package cn.com.noomn.util;

public class CalendarInfos {
	private String title;
	private int startY;
	private int startM;
	private int startD;
	private int startH;
	private int startI;
	
	private int endY;
	private int endM;
	private int endD;
	private int endH;
	private int endI;
	
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getStartM() {
		return startM;
	}

	public void setStartM(int startM) {
		this.startM = startM;
	}

	public int getStartD() {
		return startD;
	}

	public void setStartD(int startD) {
		this.startD = startD;
	}

	public int getStartH() {
		return startH;
	}

	public void setStartH(int startH) {
		this.startH = startH;
	}

	public int getStartI() {
		return startI;
	}

	public void setStartI(int startI) {
		this.startI = startI;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	public int getEndM() {
		return endM;
	}

	public void setEndM(int endM) {
		this.endM = endM;
	}

	public int getEndD() {
		return endD;
	}

	public void setEndD(int endD) {
		this.endD = endD;
	}

	public int getEndH() {
		return endH;
	}

	public void setEndH(int endH) {
		this.endH = endH;
	}

	public int getEndI() {
		return endI;
	}

	public void setEndI(int endI) {
		this.endI = endI;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CalendarInfos [title=" + title + ", startY=" + startY
				+ ", startM=" + startM + ", startD=" + startD + ", startH="
				+ startH + ", startI=" + startI + ", endY=" + endY + ", endM="
				+ endM + ", endD=" + endD + ", endH=" + endH + ", endI=" + endI
				+ ", url=" + url + "]";
	}
	
}
