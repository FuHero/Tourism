package cn.magicbeans.tourism.model.impl;

public class AppDef {
	
	private long id;
    private String appKey;
    private String publicKey;
    private String privateKey;
    private String customPublicKey;
    private String description;
    private String name;
    private int type;
    
    public AppDef () {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getCustomPublicKey() {
		return customPublicKey;
	}

	public void setCustomPublicKey(String customPublicKey) {
		this.customPublicKey = customPublicKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
    
    
}
