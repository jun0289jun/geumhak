package com.geumhak.managementsystem.searching;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geumhak.managementsystem.category.service.CategoryService;
import com.geumhak.managementsystem.category.vo.CategoryVO;

@Service
public class SearchingUtils {

	 private final CategoryService categoryService;

	    @Autowired
	    public SearchingUtils(CategoryService categoryService) {
	        this.categoryService = categoryService;
	    }

	    public List<CategoryVO> searchCategories(String searchType, String keyword, int page, int perPageNum) throws Exception {
	        // 검색 쿼리를 실행하여 결과를 가져옴
	        List<CategoryVO> searchResult = categoryService.searchCategories(searchType, keyword, page, perPageNum);
	        return searchResult;
	    }
	}  