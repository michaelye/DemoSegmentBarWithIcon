package com.michael.widget.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.michael.widget.SegmentBar;
import com.michael.widget.SegmentBar.OnSegmentBarChangedListener;
import com.michael.widget.segmentbarwithicon.R;

/**
 * This class shows how to use the custom widget some like the widget of SegmentBar with Icon.
 * 
 * 这个类展示的是如何使用制作类似iPhone的并且带有图标的SegmentBar控件
 * 
 * @author MichaelYe
 * @since 2012-9-5
 * */
public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView textView = (TextView)findViewById(R.id.tv_show);
        SegmentBar segmentBar = (SegmentBar)findViewById(R.id.ll_segment_bar);  
        segmentBar.setValue(MainActivity.this, new String[]{"Item0", "Item1", "Item2", "Item3"});  
        segmentBar.setTextSize(13);  
        segmentBar.setTextColor(this.getResources().getColor(R.color.title_color_white));  
        segmentBar.setOnSegmentBarChangedListener(new OnSegmentBarChangedListener()  
        {  
            public void onBarItemChanged(int segmentItemIndex)   
            {  
                textView.setText(segmentItemIndex+"");  
            }  
        });  
        segmentBar.setDefaultBarItem(0);  
    }

}
