package com.example.show;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);
        txt3 = (TextView) findViewById(R.id.text3);
        txt4 = (TextView) findViewById(R.id.text4);
        txt5 = (TextView) findViewById(R.id.text5);
        txt6 = (TextView) findViewById(R.id.text6);
        // 请 求 接 口
//        sendRequestWithHttpURLConnection();


    }

//    // 请 求
//    public void sendRequestWithHttpURLConnection() {
//        // 开 启 线 程 发 起 网 络 请 求
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                HttpURLConnection conn = null;
//                BufferedReader reader = null;
//                try {
//                    // 使 用 和 风 接 口 创 建 URL 对 象
//                    URL url = new URL("http://192.168.1.100:8080/transportservice/type/jason/action/GetAllSense.do");
//                    //打 开 和 接 口 的 连 接
//                    conn = (HttpURLConnection) url.openConnection();
//                    // 设 置 请 求 方 法 、 连 接 时 间 和 读 取 时 间 等 参 数
//                    conn.setRequestMethod("POST");
//                    conn.setConnectTimeout(8000);
//                    conn.setReadTimeout(8000);
//                    conn.setDoOutput(true);
//                    conn.setDoInput(true);
//
//                    conn.setRequestProperty("Content-type", "text/plain;charset=utf-8");
//                    //设置请求体
//                    OutputStream outputStream = conn.getOutputStream();
//                    String str = "{CarId:1}";
//                    outputStream.write(str.getBytes("utf-8"));
//
//                    //从 连 接 处 获 得 输 入 流
//                    InputStream in = conn.getInputStream();
//                    //读 取 输 入 流 （ 和 风 天 气 返 回 的 数 据 都 在 输 入 流 中 ）
//                    reader = new BufferedReader(new InputStreamReader(in));
//                    // 创 建 字 符 串 构 建 对 象 ， 用 来 存 放 返 回 的 数 据
//                    StringBuilder respons = new StringBuilder();
//                    String line;
//                    // 将 输 入 流 中 的 数 据 一 行 行 读 取 放 入 line 中 ， 并 附 加 在respons 对 象 中
//
//                    while ((line = reader.readLine()) != null) {
//                        respons.append(line);
//                    }
//                    showResponseItem(respons.toString());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } finally {
//                    if (reader != null) {
//                        try {
//                            reader.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    if (conn != null) {
//                        conn.disconnect();
//                    }
//                }
//            }
//        }).start();
//    }
//
//    // 显 示 数 据
//    private void showResponseItem(final String response) {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    //打 印 返 回 的 数 据
//                    // 将 返 回 的 字 符 串 解 析 为 JSON 对 象
//                    JSONObject jsonObject = new JSONObject(response);
//                    String serverinfo = jsonObject.getString("serverinfo");
//                    int shou = serverinfo.indexOf("{");
//                    int wei = serverinfo.lastIndexOf("}");
//                    //去掉花括号
//                    String substring = serverinfo.substring(shou + 1, wei);
//                    //去掉逗号
//                    String[] str = substring.split(",");
//                    //定义一个Map集合
//                    Map<String, String> map = new HashMap<>();
//                    //遍历集合
//                    for (String s : str) {
//                        String key = s.split(":")[0];
//                        String value = s.split(":")[1];
//                        map.put(key, value);
//                    }
//                    //遍历map集合
//                    Set<String> setkey = map.keySet();
//                    for (String key : setkey) {
//                        if ("\"temperature\"".equals(key)) {
//                            txt1.setText(map.get(key));
//                        } else if ("\"humidity\"".equals(key)) {
//                            txt2.setText(map.get(key));
//                        } else if ("\"LightIntensity\"".equals(key)) {
//                            txt3.setText(map.get(key));
//                        } else if ("\"co2\"".equals(key)) {
//                            txt4.setText(map.get(key));
//                        } else if ("\"pm2.5\"".equals(key)) {
//                            txt5.setText(map.get(key));
//                        } else if ("\"temperature\"".equals(key)) {
//                            txt6.setText(map.get(key));
//                        }
//
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }

