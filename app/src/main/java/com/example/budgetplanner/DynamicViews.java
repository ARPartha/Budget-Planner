package com.example.budgetplanner;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DynamicViews {
    Context context;

    public DynamicViews(Context context) {
        this.context = context;
    }

    public EditText descriptionTextView(Context context,String text)
    {
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final EditText editText = new EditText(context);
        int id = 0;
        editText.setId(id);
        editText.setMinEms(2);
        editText.setTextColor(Color.rgb(255,255,255));
        editText.setInputType(InputType.TYPE_CLASS_TEXT);

        return editText;
    }

    public EditText recievedQuantityEditText(Context context){
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final EditText editText = new EditText(context);
        int id = 0;
        editText.setId(id);
        editText.setMinEms(2);
        editText.setTextColor(Color.rgb(255,255,255));
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);

        return editText;
    }
}
