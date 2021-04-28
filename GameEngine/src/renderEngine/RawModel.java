package renderEngine;

public class RawModel {
	
	private int vaoID;
	private int veretxCount;
	
	public RawModel(int vaoID,int vertexCount) {
		this.vaoID = vaoID;
		this.veretxCount = vertexCount;
	}

	public int getVaoID() {
		return vaoID;
	}

	public int getVeretxCount() {
		return veretxCount;
	}
	
}
