package com.examplmakecodeeasy.triviaaquizapp.module;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.examplmakecodeeasy.triviaaquizapp.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class quizmanager {


    private RequestQueue mRequestQueue;
    private String url;

    public quizmanager(Context context) {

        mRequestQueue = VolleySingleton.getInstance().getRequestQueue();
        url = "https://opentdb.com/api.php?amount=10&category=23&difficulty=medium&type=boolean";


    }

    public List<quizQuestion> getQuizQuestion()
    {

        List<quizQuestion> quizQuestions= new ArrayList<>();


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray results = response.getJSONArray("results");

                    for (int index =0;index < results.length(); index++)
                    {

                        JSONObject questionJsonObject = results.getJSONObject(index);

                        String  qusrionText = questionJsonObject.getString("question");
                        boolean questionAnswer = questionJsonObject.getBoolean("correct_answer");

                        quizQuestion myQuestion = new quizQuestion(qusrionText,questionAnswer);
                        quizQuestions.add(myQuestion);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        mRequestQueue.add(jsonObjectRequest);
        return quizQuestions;


    }
}
