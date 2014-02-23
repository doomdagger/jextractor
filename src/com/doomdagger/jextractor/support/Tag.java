package com.doomdagger.jextractor.support;

/**
 * 封装一个html的标签对象
 * @author apple
 *
 */
public class Tag {
	
	private String tag;
	private String tagName;
	private boolean isEnd;
	private int tagEndIndex;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public boolean isEnd() {
		return isEnd;
	}
	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
	public Tag(String tag, String tagName, boolean isEnd, int tagEndIndex) {
		super();
		this.tag = tag;
		this.tagName = tagName;
		this.isEnd = isEnd;
		this.tagEndIndex = tagEndIndex;
	}
	
	public int getTagEndIndex() {
		return tagEndIndex;
	}
	public void setTagEndIndex(int tagEndIndex) {
		this.tagEndIndex = tagEndIndex;
	}
	public Tag() {}
}
