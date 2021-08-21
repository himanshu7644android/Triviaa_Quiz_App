package com.examplmakecodeeasy.triviaaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.examplmakecodeeasy.triviaaquizapp.Controller.CardStackAdapter;
import com.examplmakecodeeasy.triviaaquizapp.module.quizQuestion;
import com.examplmakecodeeasy.triviaaquizapp.module.quizmanager;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;

import org.json.JSONObject;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RequestQueue mRequestQueue;

    private String url;
    private CardStackView mCardStackView;
    private quizmanager mQuizmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuizmanager = new quizmanager(getApplicationContext());

        mCardStackView = findViewById(R.id.myCardStackView);
        mCardStackView.setLayoutManager(new CardStackLayoutManager(this));
        List<quizQuestion> myQuizQuestion = mQuizmanager.getQuizQuestion();


        mCardStackView.setAdapter(new CardStackAdapter(this, myQuizQuestion));


    }
}