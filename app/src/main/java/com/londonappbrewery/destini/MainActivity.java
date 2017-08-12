package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mTopButton;
    Button mBotButton;
    int mCurrStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCurrStory = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);
        mTopButton = (Button)findViewById(R.id.buttonTop);
        mBotButton = (Button)findViewById(R.id.buttonBottom);

        updateFields();


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mCurrStory){
                    case 1:
                        mCurrStory = 3;
                        break;
                    case 2:
                        mCurrStory = 3;
                        break;
                    case 3:
                        mCurrStory = 6;
                        break;
                }
                updateFields();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mCurrStory){
                    case 1:
                        mCurrStory = 2;
                        break;
                    case 2:
                        mCurrStory = 4;
                        break;
                    case 3:
                        mCurrStory = 5;
                        break;
                }
                updateFields();
            }
        });
    }

    private void updateFields()
    {
        switch (mCurrStory){
            case 1:
                mStoryTextView.setText(R.string.T1_Story);
                mTopButton.setText(R.string.T1_Ans1);
                mBotButton.setText(R.string.T1_Ans2);
                break;
            case 2:
                mStoryTextView.setText(R.string.T2_Story);
                mTopButton.setText(R.string.T2_Ans1);
                mBotButton.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mBotButton.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStoryTextView.setText(R.string.T4_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBotButton.setVisibility(View.INVISIBLE);
                break;
            case 5:
                mStoryTextView.setText(R.string.T5_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBotButton.setVisibility(View.INVISIBLE);
                break;
            case 6:
                mStoryTextView.setText(R.string.T6_End);
                mTopButton.setVisibility(View.INVISIBLE);
                mBotButton.setVisibility(View.INVISIBLE);
                break;
        }
    }

}
