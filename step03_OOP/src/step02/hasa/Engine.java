package step02.hasa;

public class Engine {
	String engineName = "파워 엔진";  //이건 객체다
	int cc = 100;
	
	
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public int getCc() {
		return cc;
	}
	
	public int getPowerCc() {
		return cc +1000;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
