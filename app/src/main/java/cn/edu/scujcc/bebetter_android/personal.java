package cn.edu.scujcc.bebetter_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class personal extends AppCompatActivity {
    private LinearLayout ll_chat_self_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        getActionBar().hide();

        initView();
        initData();
    }
    private void initView() {
        // TODO Auto-generated method stub
        ll_chat_self_change = (LinearLayout)findViewById(R.id.ll_chat_self_change);
    }
    private void initData() {
        // TODO Auto-generated method stub
        ImageButton ib_back = (ImageButton) ll_chat_self_change.findViewById(R.id.icon);
        TextView tv_title = (TextView) ll_chat_self_change.findViewById(R.id.top);
        Button bt_save = (Button)ll_chat_self_change.findViewById(R.id.top);

        ib_back.setImageResource(R.drawable.touxiang);
        tv_title.setText("修改个人资料");
        tv_title.setTextSize(21);
        bt_save.setBackgroundResource(R.drawable.touxiang);
        bt_save.setVisibility(View.VISIBLE);
        bt_save.setText("保存");
    }
    }



