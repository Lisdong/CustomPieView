# CustomPieView
自定义饼状图   点击特效

![Xnip.png](https://github.com/Lisdong/CustomPieView/blob/master/Screenshot/Xnip.png)


# 使用方式
```
<com.lis.view.PieView
        android:id="@+id/pieView"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        tools:ignore="MissingConstraints" />
```
 ```
 List<PieItemBean> pieEntries = new ArrayList<>();
		pieEntries.add(new PieItemBean("Froyo",12f, Color.rgb(59 ,113 ,175)));
		pieEntries.add(new PieItemBean("Ginger",3.8f, Color.rgb(126, 45 ,107)));
		pieEntries.add(new PieItemBean("Ice",6.4f,Color.rgb(117 ,180 ,199) ));
		pieEntries.add(new PieItemBean("Jelly",18f,Color.rgb(59 ,132 ,64)));
		pieEntries.add(new PieItemBean("KitKat",35f,Color.rgb(235 ,84 ,71)));
		pieEntries.add(new PieItemBean("Loll",20f,Color.rgb(245, 243 ,128)));
		pieEntries.add(new PieItemBean("Mars",5f,Color.rgb(131 ,177 ,184)));
		pieView.setData(pieEntries);
    
    pieView.setPieViewOnClickListener(new PieView.OnClickListener() {
			@Override
			public void onClick(PieItemBean pieItemBean) {
				Toast.makeText(MainActivity.this,pieItemBean.name,Toast.LENGTH_LONG).show();
			}
		});
 ```
