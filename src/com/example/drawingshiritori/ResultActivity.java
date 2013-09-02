package com.example.drawingshiritori;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.pictureshiritori.R;

import android.R.anim;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class ResultActivity extends Activity
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
	}
}

//	String[] words = new String[]
//			{
//				"aaa", "bbb", "ccc", "ddd"
//			};
//
//	int[] icon = new int[]
//			{
//				android.R.drawable.alert_dark_frame,
//				android.R.drawable.alert_light_frame,
//				android.R.drawable.arrow_down_float,
//				android.R.drawable.arrow_up_float
//			};
//
//	public void onCreate(Bundle savedInstanceState)
//	{
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.result);
//
//		// データを格納するためのArrayListを宣言
//		ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
//
//		// ArrayListに中身をセットする
//		for(int i = 0, n = words.length; i < n; ++i)
//		{
//			HashMap<String, Object> map = new HashMap<String, Object>();
//
//			// wordsをmapに代入
//			map.put("words", words[i]);
//
//			// アイコンを代入
//			map.put("icon", icon[i]);
//
//			// 作成したmapをdataに追加
//			data.add(map);
//		}
//
//		/*
//		 * 作成したdataとカスタマイズしたレイアウトrow.xmlを
//		 * 紐付けたCustomAdapterを作成する
//		 */
//		CustomAdapter ca = new CustomAdapter(this, data, R.layout.row,
//			new String[]{"words"},
//			new int[]{R.id.words}
//		);
//
//		// main.xmlのListViewにカスタムアダプタをセットします
//		ListView lv = (ListView)findViewById(R.id.result_list_view);
//		lv.setAdapter(ca);
//	}
//
//	// SimpleAdapterを継承したCustomAdapterを作成
//	public class CustomAdapter extends SimpleAdapter
//	{
//		LayoutInflater mLayoutInflater;
//
//		// コンストラクタ
//		public CustomAdapter(Context context, List<? extends Map<String, ?>> data,
//				int resource, String[] from, int[] to)
//		{
//			super(context, data, resource, from ,to);
//		}
//
//		@Override
//		public View getView(int position, View convertView, ViewGroup parent)
//		{
//			mLayoutInflater = LayoutInflater.from(getBaseContext());
//
//			// レイアウトに「row.xml」を紐付ける
//			convertView = mLayoutInflater.inflate(R.layout.row, parent, false);
//			ListView listView = (ListView)parent;
//
//			// 該当する位置のデータを取得する
//			Map<String, Object> data = (Map<String, Object>)listView.getItemAtPosition(position);
//
//			// TextViewにセットする
//			TextView words = (TextView)convertView.findViewById(R.id.words);
//
//			// アイコンをImageViewにセットする
//			ImageView icon = (ImageView)convertView.findViewById(R.id.icon);
//			icon.setImageResource((Integer)data.get("icon"));
//
//			return convertView;
//
//		}
//	}
//
//}
