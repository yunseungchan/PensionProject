package com.pension.dto;

import org.apache.ibatis.type.Alias;

/**
 * @author YMN
 *
 */
@Alias("notice")
public class NoticeDTO {
	private int noticeNo;
	private String noticeWriter;
	private String noticeTitle;
	private String noticeDate;
	private String noticeContent;
	private int noticeCount;
	
	public NoticeDTO() {	}

	public NoticeDTO(int noticeNo, String noticeWriter, String noticeTitle, String noticeDate, String noticeContent,
			int noticeCount) {
		super();
		this.noticeNo = noticeNo;
		this.noticeWriter = noticeWriter;
		this.noticeTitle = noticeTitle;
		this.noticeDate = noticeDate;
		this.noticeContent = noticeContent;
		this.noticeCount = noticeCount;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeWriter() {
		return noticeWriter;
	}

	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public int getNoticeCount() {
		return noticeCount;
	}

	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}

	@Override
	public String toString() {
		return "NoticeDTO [noticeNo=" + noticeNo + ", noticeWriter=" + noticeWriter + ", noticeTitle=" + noticeTitle
				+ ", noticeDate=" + noticeDate + ", noticeContent=" + noticeContent + ", noticeCount=" + noticeCount
				+ "]";
	}
	
	

	
}
