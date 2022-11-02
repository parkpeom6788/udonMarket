package org.kosta.udonmarket.model;

import java.io.Serializable;

public class MemberVO implements Serializable {
	
	private static final long serialVersionUID = 7702564200827674964L;
	private String id;
	private String password;
	private String name;
	private String memberNo;
	private String address;
	private String tel;
	private String type;
	
	public MemberVO() {
		super();
	}
	public MemberVO(String id, String password, String name, String memberNo, String address, String tel, String type) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.memberNo = memberNo;
		this.address = address;
		this.tel = tel;
		this.type = type;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", memberNo=" + memberNo
				+ ", address=" + address + ", tel=" + tel + ", type=" + type + "]";
	}
}
