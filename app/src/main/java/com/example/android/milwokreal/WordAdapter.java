package com.example.android.milwokreal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context,  ArrayList<Word> wordObjects, int mColorResourceId) {
        super(context, 0,wordObjects);
        this.mColorResourceId = mColorResourceId;
    }


    @NonNull
    @Override
    public View getView(int positionInArrList, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // 1)convert View - potential view, that we can reuse
        // 2)parent - ListView by itself
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_in_list, parent, false);
        }
        Word word = getItem(positionInArrList);

        TextView miwokTextView =  listItemView.findViewById(R.id.milwok_word);
        miwokTextView.setText(word.getMilwokTranslation());

        TextView englishTextView =  listItemView.findViewById(R.id.english_word);
        englishTextView.setText(word.getEnglishTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image_for_word_view);

        if (word.getImageID() != 0) {
            imageView.setImageResource(word.getImageID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
