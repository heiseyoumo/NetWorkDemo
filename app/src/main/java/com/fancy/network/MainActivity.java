package com.fancy.network;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.fancy.network.bean.OrderCountBean;
import com.fancy.network.callback.HttpResponseCallback;
import com.fancy.network.util.HttpHelper;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpHelper.getInstance().getUrl("getUrl", new HttpResponseCallback<OrderCountBean>() {

                    @Override
                    public void onSuccess(OrderCountBean orderCountBean) {
                        OrderCountBean.DataBean data = orderCountBean.getData();
                        int dispatched = data.getDispatched();
                        int undelivered = data.getUndelivered();
                        Log.d("MainActivity", "dispatched=" + dispatched + ",undelivered=" + undelivered);
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
