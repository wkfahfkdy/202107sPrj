package co.kjm.sprj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kjm.sprj.member.map.MemberMapper;
import co.kjm.sprj.member.service.MemberService;
import co.kjm.sprj.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper map;
	
	@Override
	public List<MemberVO> memberSelectList() {
		
		return null;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
