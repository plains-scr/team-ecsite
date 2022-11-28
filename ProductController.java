package jp.co.internous.topaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.topaz.model.domain.MstProduct;
import jp.co.internous.topaz.model.mapper.MstProductMapper;
import jp.co.internous.topaz.model.session.LoginSession;


//商品情報の詳細に関する処理を行うコントローラー

@Controller
@RequestMapping("/topaz/product")
public class ProductController {
	
	//MstProductMapperをインスタンス化
	@Autowired
	private MstProductMapper productMapper;
	
	//LoginSessionをインスタンス化
	@Autowired
	private LoginSession loginSession;
	
	//リクエストされるURLとメソッド(クラス)をマッピング
	@RequestMapping("/{id}")
	public String index(@PathVariable("id") int id, Model m) {
		
		//idを使用しMstProductMapper.javaから該当商品のデータを受け取る
		MstProduct product = productMapper.findById(id);
		m.addAttribute("product", product);
		
		//page_header.htmlでsessionの変数を表示させている為、loginSessionも画面に送る。
		m.addAttribute("loginSession", loginSession);
		   
		 //該当商品の詳細ページを表示
		return "product_detail";	
		
	}
}
