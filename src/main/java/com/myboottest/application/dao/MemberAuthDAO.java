package com.myboottest.application.dao;

import java.util.List;
import java.util.Map;

public interface MemberAuthDAO {
	public List<Map<String, Object>> getMemberInfo(Map<String, Object> params);
}
