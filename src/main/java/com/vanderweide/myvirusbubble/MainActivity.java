package com.vanderweide.myvirusbubble;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//        ImageView imageView = new ImageView(this);
//        // Set the background color to white
//        imageView.setBackgroundColor(Color.WHITE);
//        // Parse the SVG file from the resource
//        SVG svg = SVGParser.getSVGFromResource(getResources(), R.raw.android);
//        // Get a drawable from the parsed SVG and set it as the drawable for the ImageView
//        imageView.setImageDrawable(svg.createPictureDrawable());
//        // Set the ImageView as the content view for the Activity
//        setContentView(imageView);



        this.setContentView(new GameSurface(this));
    }

}