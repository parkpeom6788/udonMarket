package org.kosta.udonmarket.model;

public class CommentVO {
	private long commentNo;
	private String commentContent;
	private String commentTimePosted;
	private MemberVO memberVO;
	
	public CommentVO() {
		super();
	}
	public CommentVO(long commentNo, String commentContent, String commentTimePosted, MemberVO memberVO) {
		super();
		this.commentNo = commentNo;
		this.commentContent = commentContent;
		this.commentTimePosted = commentTimePosted;
		this.memberVO = memberVO;
	}
	public long getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(long commentNo) {
		this.commentNo = commentNo;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentTimePosted() {
		return commentTimePosted;
	}
	public void setCommentTimePosted(String commentTimePosted) {
		this.commentTimePosted = commentTimePosted;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	@Override
	public String toString() {
		return "CommentVO [commentNo=" + commentNo + ", commentContent=" + commentContent + ", commentTimePosted="
				+ commentTimePosted + ", memberVO=" + memberVO + "]";
	}
}
