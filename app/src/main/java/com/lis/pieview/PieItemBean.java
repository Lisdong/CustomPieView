package com.lis.pieview;

/**
 * Created By LRD
 * on 2019/4/15  notes：
 */
public class PieItemBean {
	public String name;
	public float value;
	public int color;

	public PieItemBean(String name, float value, int color) {
		this.name = name;
		this.value = value;
		this.color = color;
	}
}
