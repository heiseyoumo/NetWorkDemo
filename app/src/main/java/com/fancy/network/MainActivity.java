package com.fancy.network;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.fancy.network.bean.JsonBean;
import com.fancy.network.callback.HttpResponseCallback;
import com.fancy.network.util.HttpHelper;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    String url = "http://c.3g.163.com/photo/api/set/0001%2F2250173.json";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> hashMap = new HashMap<>();
                HttpHelper.getInstance().getUrl(url, hashMap, new HttpResponseCallback<JsonBean>() {
                    @Override
                    public void onSuccess(JsonBean jsonBean) {
                        textView.append(jsonBean.getDesc() + ",创造者:" + jsonBean.getCreator());
                    }

                    @Override
                    public void onFail(final String errorMsg) {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, errorMsg, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
            }
        });
    }
}
