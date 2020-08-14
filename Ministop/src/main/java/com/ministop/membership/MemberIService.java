package com.ministop.membership;

import java.util.List;
import java.util.Map;


public interface MemberIService {
	public String isExistID(Minimember memberq, Map<String, Object> sInfo);
	public void reqAuthNum(Map<String, Object> sInfo);
	public String authNumConfirm(Map<String, Object> sInfo, String reqAuthNum);
	public boolean memberProc(Minimember memberq, Map<String, Object> sInfo);
	public String findInfoProc(String email, String id);
	public boolean loginProc(Login login);
}