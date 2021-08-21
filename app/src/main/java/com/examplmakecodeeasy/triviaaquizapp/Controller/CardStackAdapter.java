package com.examplmakecodeeasy.triviaaquizapp.Controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.examplmakecodeeasy.triviaaquizapp.R;
import com.examplmakecodeeasy.triviaaquizapp.View.filmViewHolder;
import com.examplmakecodeeasy.triviaaquizapp.module.quizQuestion;

import java.util.List;

public class CardStackAdapter extends RecyclerView.Adapter<filmViewHolder> {

    private Context mContext;
    private List<quizQuestion> mFilmQuestions;
    private LayoutInflater mLayoutInflater;

    public CardStackAdapter(Context context, List<quizQuestion> filmQuestions) {
        mContext = context;
        mFilmQuestions = filmQuestions;
       mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public filmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.history_view,parent,false);


        return new filmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull filmViewHolder holder, int position) {

        holder.getTxtFilmQuestion().setText(mFilmQuestions.get(position).getQuestiontext());

        holder.getImageButtonTrue().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "true is tapped", Toast.LENGTH_SHORT).show();

            }
        });

        holder.getImageButtonFalse().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "false is tapped", Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return mFilmQuestions.size();
    }
}
