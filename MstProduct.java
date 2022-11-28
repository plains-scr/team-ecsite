package jp.co.internous.topaz.model.domain;

import java.sql.Timestamp;

//データベーステーブル(mst_product)とマッピングする
public class MstProduct {
	//商品ID
	private int id;
	//商品名
	private String productName;
	//商品名(ふりがな)
	private String productNameKana;
	//商品説明
	private String productDescription;
	//カテゴリーID
	private int categoryId;
	//価格
	private int price;
	//商品画像
	private String imageFullPath;
	//発売年月日
	private String releaseDate;
	//発売元
	private String releaseCompany;
	//登録日時
	private Timestamp createdAt;
	//更新日時
	private Timestamp updatedAt;
	
	
	//各データを取得・設定
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageFullPath() {
		return imageFullPath;
	}
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
