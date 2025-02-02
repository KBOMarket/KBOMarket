package goods.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import goods.bean.GoodsDTO;
import goods.bean.ReviewDTO;
import goods.bean.ReviewPaging;
import goods.dao.GoodsDAO;
import goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDAO goodsDAO;
	@Autowired
	private ReviewPaging reviewPaging;
	
	@Override
	public List<GoodsDTO> getGoodsList(String teamId, String order) {
		String[] orderParts = order.split("_");
		String orderDirection;
		
		if (orderParts.length > 1) {
	        orderDirection = orderParts[1]; // e.g., 'asc' or 'desc'
	    } else {
	    	orderDirection = "asc"; // Default direction if not specified
	    }
		
		Map<String, Object> map = new HashMap<>();
		map.put("teamId", teamId);
		map.put("order", orderParts[0]);
		map.put("orderDirection", orderDirection);
		
		return goodsDAO.getGoodsList(map);
	}

	@Override
	public List<GoodsDTO> getGoodsList2(String teamId, String ctg, String order) {
		String[] orderParts = order.split("_");
		String orderDirection;
		
		if (orderParts.length > 1) {
	        orderDirection = orderParts[1]; // e.g., 'asc' or 'desc'
	    } else {
	    	orderDirection = "asc"; // Default direction if not specified
	    }
		
		System.out.println(orderParts[0] + ", " + orderDirection + ", " + teamId+", " + ctg);
		
		Map<String, Object> map = new HashMap<>();
		map.put("teamId", teamId);
		map.put("ctg", ctg);
		map.put("order", orderParts[0]);
		map.put("orderDirection", orderDirection);
		
		return goodsDAO.getGoodsList2(map);
	}

	@Override
	public int getTotalGoods(String teamId) {
		
		return goodsDAO.getTotalGoods(teamId);
	}

	@Override
	public int getTotalGoods2(String teamId, String ctg) {
		Map<String, Object> map = new HashMap<>();
		map.put("teamId", teamId);
		map.put("ctg", ctg);
		
		return goodsDAO.getTotalGoods2(map);
	}

	@Override
	public String getTeamName(String teamId) {
		return goodsDAO.getTeamName(teamId);
	}

	@Override
	public GoodsDTO getGoods(String prdNo) {
		return goodsDAO.getGoods(prdNo);
	}

	//리뷰(list, reviePagin, total)
	@Override
	public Map<String, Object> getReviewCount(String prdNo, String pg) {
		//1페이지 당 5개씩
		int endNum = 3; //개수
		int startNum = (Integer.parseInt(pg)-1) * endNum; //시작 위치
		
		Map<String, Object> map = new HashMap<>();
		map.put("endNum", endNum);
		map.put("startNum", startNum);
		map.put("prdNo", prdNo);
		
		List<ReviewDTO> list = goodsDAO.getReviewCount(map);
		
		//페이징처리
		int totalA = goodsDAO.goodsTotalA(prdNo);
		reviewPaging.setCurrentPage(Integer.parseInt(pg));
		reviewPaging.setPageBlock(3);
		reviewPaging.setPageSize(3);
		reviewPaging.setTotalA(totalA);
		reviewPaging.makePagingHTML();
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("list", list);
		map2.put("reviewPaging", reviewPaging);
		map2.put("total", totalA);
		return map2;
	}

	//리뷰 작성자 이름
	@Override
	public String getUserName(String userId) {
		return goodsDAO.getUserName(userId);
	}

	
	//조회수 증가
	@Override
	public void updateViews(String prdNo) {
		
		goodsDAO.updateViews(prdNo);
	}

	@Override
	public void reviewLike(int reviewNo) {
		goodsDAO.reviewLike(reviewNo);
	}
}
