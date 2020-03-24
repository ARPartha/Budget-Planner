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
        editText.setBackgroundResource(R.drawable.edittextbackground);
        editText.setMinEms(5); //changes width of the input box
        editText.setTextColor(Color.rgb(0,0,0));
        editText.setTextSize(20);
        editText.setInputType(InputType.TYPE_CLASS_TEXT);

        return editText;
    }

    public EditText recievedQuantityEditText(Context context){
        final ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        final EditText editText = new EditText(context);
        int id = 0;
        editText.setId(id);
        editText.setBackgroundResource(R.drawable.edittextbackground);
        editText.setMinEms(4);
        editText.setTextColor(Color.rgb(0,0,0));
        editText.setTextSize(20);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);

        return editText;
    }
}
