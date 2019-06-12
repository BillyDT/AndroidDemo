package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpandableListViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view_test);
        ExpandableListView list = findViewById(R.id.ExpandableListView2_5_5);

        ExpandableListAdapter adapter = new BaseExpandableListAdapter() {

            int[] logos = new int[]{
                    R.drawable.p,
                    R.drawable.z,
                    R.drawable.t,R.drawable.p,
                    R.drawable.z,
                    R.drawable.t,R.drawable.p,
                    R.drawable.z,
                    R.drawable.t,R.drawable.p,
                    R.drawable.z,
                    R.drawable.t,R.drawable.p,
                    R.drawable.z,
                    R.drawable.t,
            };

            private String[] armTypes = {
                    "神族兵种", "虫族兵种", "人族兵种",
                    "神族兵种", "虫族兵种", "人族兵种",
                    "神族兵种", "虫族兵种", "人族兵种",
                    "神族兵种", "虫族兵种", "人族兵种",
                    "神族兵种", "虫族兵种", "人族兵种",
            };

            private String[][] arms = new String[][]{
                    {"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "护士MM", "幽灵"},{"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "护士MM", "幽灵"},{"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "护士MM", "幽灵"},{"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "护士MM", "幽灵"}, {"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "护士MM", "幽灵"},
            };

            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {
                return arms[groupPosition].length;
            }

            //获得指定位置处的组数据
            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            //获取指定位置、指定子列表项处的子列表项数据
            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return groupPosition;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            //该方法决定每个组选项的外观
            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView,
                                     ViewGroup parent) {
                LinearLayout ll = new LinearLayout(ExpandableListViewTest.this);
                ll.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo = new ImageView(ExpandableListViewTest.this);
                logo.setImageResource(logos[groupPosition]);
                ll.addView(logo);
                TextView textView = getTextView();
                textView.setTextSize(20);
                textView.setPadding(0, 0, 0, 0);
                textView.setText(getGroup(groupPosition).toString());
                ll.addView(textView);

                return ll;
            }

            //该方法决定每个子选项的外观
            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                                     View convertView, ViewGroup parent) {

                TextView textView = getTextView();
                textView.setText(getChild(groupPosition, childPosition).toString());
                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }

            private TextView getTextView() {
                AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams
                        .MATCH_PARENT, 64);
                TextView textView = new TextView(ExpandableListViewTest.this);
                textView.setLayoutParams(lp);
                textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
                textView.setPadding(100, 0, 0, 0);
                textView.setTextSize(20);

                return textView;
            }
        };
        list.setAdapter(adapter);
    }
}
