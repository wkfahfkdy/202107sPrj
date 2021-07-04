package co.kjm.sprj.member.map;

import java.util.List;

import co.kjm.sprj.member.vo.MemberVO;

public interface MemberMapper {

	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
}
