package co.kjm.sprj.member.vo;

public class MemberVO {

	private String id;			// 아이디
	private String password;	// 비밀번호
	private String tel;			// 연락처
	private String email;		// 이메일
	private String address;		// 주소
	private String icon;		// 유저 아이콘
	private String icon_uuid;	// 유저 아이콘 UUID
	private String hobby;		// 취미? 가입 시 선택 사항
	private String bye;			// 탈퇴 여부
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon_uuid() {
		return icon_uuid;
	}
	public void setIcon_uuid(String icon_uuid) {
		this.icon_uuid = icon_uuid;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getBye() {
		return bye;
	}
	public void setBye(String bye) {
		this.bye = bye;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", tel=" + tel + ", email=" + email + ", address="
				+ address + ", icon=" + icon + ", icon_uuid=" + icon_uuid + ", hobby=" + hobby + ", bye=" + bye + "]";
	}
	
}
