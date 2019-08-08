package com.twiserandom.whatisaddview;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WhatIsaddViewActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView;
    LinearLayout.LayoutParams linearLayoutLayoutPrams;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * create a linearLayout
         * set its orientation to vertical
         * */
        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);



        /*create a   first TextView*/
        textView = new TextView(this);
        textView.setText("View added by setting the layout parameter in the view, no position specified so added at position -1");
        textView.setTextSize(22.f);
        textView.setTypeface(Typeface.DEFAULT , Typeface.BOLD);
        textView.setTextColor(Color.WHITE);
        textView.setPadding(0,20,0,20);
        textView.setBackgroundColor(Color.MAGENTA);


        //create a LinearLayout.LayoutParams
        // width is set to match parent
        // height is set to wrap content
        linearLayoutLayoutPrams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT , LinearLayout.LayoutParams.WRAP_CONTENT );


        // set the textView layout parameter  using the layout parameter we created earlier linearLayoutLayoutPrams
        textView.setLayoutParams(linearLayoutLayoutPrams);

        //add this textview to the linearLayout using addView
        // it will be added at position -1 or the last child of linearLayout
        // the LayoutParameter that will be used are the one specified
        linearLayout.addView(textView );


        /*create a  second TextView*/
        textView = new TextView(this);
        textView.setText("View added without specifying any " +
                "layout parameter so addView will get the default layout parameter ,position  " +
                "specified -1 , so last. " +
                "there is one view before this one which was added by calling the addView method " +
                "so this view should be the second. But we have added a view with position 1 so this view" +
                " will be positioned at position 2 or the third view .");

        textView.setTextSize(22.f);
        textView.setTypeface(Typeface.DEFAULT , Typeface.BOLD);
        textView.setTextColor(Color.WHITE);

        textView.setPadding(0,20,0,20);
        textView.setBackgroundColor(Color.DKGRAY);


        //add this textview to the linearLayout using addView
        // it will be added at position -1 or the last child of linearLayout
        // the LayoutParameter are not specified so addView will get default layout parameter
        // vertical linear layout  , width match parent , height is wrap content
        linearLayout.addView(textView , -1 );



        /*create a  third TextView*/
        textView = new TextView(this);
        textView.setText("View added by specifying the layout parameter using addView , will be added at position -1");
        textView.setTextSize(22.f);
        textView.setTypeface(Typeface.DEFAULT , Typeface.BOLD);
        textView.setTextColor(Color.BLACK);
        textView.setPadding(0,20,0,20);
        textView.setBackgroundColor(Color.LTGRAY);


        //create a LinearLayout.LayoutParams
        // width is set to match parent
        // height is set to wrap content
        linearLayoutLayoutPrams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT , LinearLayout.LayoutParams.WRAP_CONTENT );


        //add this textview to the linearLayout using addView
        // it will be added at position -1 or the last child of linearLayout
        // the LayoutParameter that will be used are the one specified
        linearLayout.addView(textView  , linearLayoutLayoutPrams);


        /*create a   fourth TextView*/
        textView = new TextView(this);
        textView.setText("View added by calling addView specifying the width and height, will be added at position -1");
        textView.setTextSize(22.f);
        textView.setTypeface(Typeface.DEFAULT , Typeface.BOLD);
        textView.setTextColor(Color.BLUE);
        textView.setPadding(0,20,0,20);
        textView.setBackgroundColor(Color.YELLOW);




        //add this textview to the linearLayout using addView
        // it will be added at position -1 or the last child of linearLayout
        // the addView method will create  the layout parameters ,
        // and it will set the width and height to the specified one
        // width and height are specified in pixel ,
        // pixel will look different in different screen
        // since it depends on screen density
        // pixels by default are specified for  the screen density of mdpi
        // so for screen density of xxhdpi we devide the pixels
        // by 3 , so here
        // @mdpi the width in pixel is 1000 and the height is 300
        // @xxhdpi the width is 333.33 and height is 100
        linearLayout.addView(textView  , 1000 , 300);



        /*create a  fifth TextView*/
        textView = new TextView(this);

        textView.setText("View added by specifying the index : 1  , and layout parameter  , so added as second child ");
        textView.setTextSize(22.f);
        textView.setTypeface(Typeface.DEFAULT , Typeface.BOLD);
        textView.setTextColor(Color.WHITE);
        textView.setPadding(0,20,0,20);
        textView.setBackgroundColor(Color.RED);


        //create a LinearLayout.LayoutParams
        // width is set to match parent
        // height is set to wrap content
        linearLayoutLayoutPrams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT , LinearLayout.LayoutParams.WRAP_CONTENT );



        //add this textview to the linearLayout using addView
        // it will be added at position -1 or the last child of linearLayout
        // the LayoutParameter that will be used are the one specified
        linearLayout.addView(textView , 1, linearLayoutLayoutPrams);




        //set the content of the activity to the linearlayout
        // setContentView will give the linearlayout a default width of match parent
        // and a default height of match parent
        // so the linear layout will take all the activity .
        setContentView(linearLayout);

    }
}
