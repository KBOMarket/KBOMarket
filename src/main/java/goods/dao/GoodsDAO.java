package goods.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import goods.bean.GoodsDTO;
import goods.bean.ReviewDTO;

@Mapper
public interface GoodsDAO {

	public List<GoodsDTO> getGoodsList(Map<String, Object> map);

	public List<GoodsDTO> getGoodsList2(Map<String, Object> map);

	public int getTotalGoods(String teamId);

	public int getTotalGoods2(Map<String, Object> map);

	public String getTeamName(String teamId);

	public GoodsDTO getGoods(String prdNo);

	public List<ReviewDTO> getReviewCount(Map<String, Object> map);

	public String getUserName(String userId);

	public int goodsTotalA(String prdNo);

	public void updateViews(String prdNo);

	public void reviewLike(int reviewNo);

	public void goodsWrite(List<GoodsDTO> imageUploadList);

	public List<GoodsDTO> getAdminList();

	public String getImageFileName(int parseInt);

	public void deleteAdminList(List<String> list);

	public List<GoodsDTO> getIndexList();

	public GoodsDTO getAdminUpdateList(String prdNo);

	public void adminUpdate(GoodsDTO goodsDTO);

}
