package com.lis.pieview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lis.view.PieView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private PieView pieView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pieView = findViewById(R.id.pieView);

		initData();
		initListener();
	}

	private void initListener() {
		pieView.setPieViewOnClickListener(new PieView.OnClickListener() {
			@Override
			public void onClick(PieItemBean pieItemBean) {
				Toast.makeText(MainActivity.this,pieItemBean.name,Toast.LENGTH_LONG).show();
			}
		});
	}

	private void initData() {
		List<PieItemBean> pieEntries = new ArrayList<>();
		pieEntries.add(new PieItemBean("Froyo",12f, Color.rgb(59 ,113 ,175)));
		pieEntries.add(new PieItemBean("Ginger",3.8f, Color.rgb(126, 45 ,107)));
		pieEntries.add(new PieItemBean("Ice",6.4f,Color.rgb(117 ,180 ,199) ));
		pieEntries.add(new PieItemBean("Jelly",18f,Color.rgb(59 ,132 ,64)));
		pieEntries.add(new PieItemBean("KitKat",35f,Color.rgb(235 ,84 ,71)));
		pieEntries.add(new PieItemBean("Loll",20f,Color.rgb(245, 243 ,128)));
		pieEntries.add(new PieItemBean("Mars",5f,Color.rgb(131 ,177 ,184)));
		pieView.setData(pieEntries);
	}
}
