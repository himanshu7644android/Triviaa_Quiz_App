package com.examplmakecodeeasy.triviaaquizapp.View;

import android.media.Image;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.examplmakecodeeasy.triviaaquizapp.R;

import org.w3c.dom.Text;

public class filmViewHolder extends RecyclerView.ViewHolder {
    private TextView txtFilmQuestion;
    private ImageButton mImageButtonTrue;
    private ImageButton mImageButtonFalse;

    public filmViewHolder(@NonNull View itemView) {
        super(itemView);

        txtFilmQuestion = itemView.findViewById(R.id.film_question_text);
        mImageButtonTrue = itemView.findViewById(R.id.trueButton);
        mImageButtonFalse = itemView.findViewById(R.id.falseButton);




    }

    public TextView getTxtFilmQuestion() {
        return txtFilmQuestion;
    }

    public void setTxtFilmQuestion(TextView txtFilmQuestion) {
        this.txtFilmQuestion = txtFilmQuestion;
    }

    public ImageButton getImageButtonTrue() {
        return mImageButtonTrue;
    }

    public void setImageButtonTrue(ImageButton imageButtonTrue) {
        mImageButtonTrue = imageButtonTrue;
    }

    public ImageButton getImageButtonFalse() {
        return mImageButtonFalse;
    }

    public void setImageButtonFalse(ImageButton imageButtonFalse) {
        mImageButtonFalse = imageButtonFalse;
    }
}
