package com.doomdagger.jextractor.support;

/**
 * 封装了标签选择器的附加筛选条件
 * @author Li He
 *
 */
public class TagSelectorPair {
	/**
	 * 属性key为...
	 */
	private String key;
	/**
	 * 属性value为...
	 */
	private String value;
	/**
	 * 属性附加筛选条件为...
	 */
	private String extra;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public TagSelectorPair(String key, String value, String extra) {
		super();
		this.key = key;
		this.value = value;
		this.extra = extra;
	}
	public TagSelectorPair() {}
	
}
