package co.kjm.sprj.member.service;

import java.util.List;

import co.kjm.sprj.member.vo.MemberVO;

public interface MemberService {
	
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
}
