package com.example.litepaltest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //操作数据表
                LitePal.getDatabase();


            }
        });

        Button addData = (Button) findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击一次增加一次
                Book book = new Book();
                book.setName("The Da Vinci Code");
                book.setAuthor("Dan Brown");
                book.setPages(454);
                book.setPrice(16.59);
                book.setPress("Unknow");
                book.save();
            }
        });
        Button updateData = (Button) findViewById(R.id.update_data);
        updateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName("The Lost Symbol");
                book.setAuthor("Dan Brown");
                book.setPages(519);
                book.setPrice(19.95);
                book.setPress("Unknow");
                book.save();
                book.setPrice(14.95);
                book.setPress("Anchor");
                //通过约束索引，找到对应的数据
                book.updateAll("name = ? and author = ? ", "The Lost Symbol", "Dan Brown");
                book.save();
            }
        });
        Button deleteButton = (Button) findViewById(R.id.delete_data);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Book.class, "price <  ?", "15");
            }
        });

        Button queryButton = (Button)findViewById(R.id.query_data);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过列表集合查询，遍历集合打印结果
                List<Book> books = DataSupport.findAll(Book.class);
                for (Book book:books){
                    Log.d("MainActivity", "book name is  "+book.getName());
                    Log.d("MainActivity", "book quthor is  "+book.getAuthor());
                    Log.d("MainActivity", "book pages is  "+book.getPages());
                    Log.d("MainActivity", "book price is  "+book.getPrice());
                    Log.d("MainActivity", "book press is  "+book.getPress());
                }
            }
        });
    }

}