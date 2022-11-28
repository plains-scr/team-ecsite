package jp.co.internous.topaz.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.topaz.model.domain.MstProduct;


//mst_productにアクセスするマッパー
@Mapper
public interface MstProductMapper {
	
	//商品情報を取得
	@Select("SELECT * FROM mst_product")
	List<MstProduct> find();
	
	//キーワード（商品名）を条件に商品情報を取得
	List<MstProduct> findByProductName(@Param("keywords") String[] keywords);
	
	//カテゴリとキーワード（商品名）を条件に商品情報を取得
	List<MstProduct> findByCategoryAndProductName(@Param("category") int category, @Param("keywords") String[] keywords);
	
	//商品IDを条件に商品情報を取得
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(int id);
	
}

