package com.timbuchalka.pg;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class KnowMoreActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "KnowMoreActivity";

    public ConstraintLayout knowMore, knowMore1, knowMore2, knowMore3;
    public View currentLayout;
    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.know_more_1);

        getSupportActionBar().hide();

        TextView s = (TextView) findViewById(R.id.next_tv);
        s.setOnClickListener(mOnClickListener);

        Button genetics = (Button) findViewById(R.id.btn_genetics);
        Button genomics = (Button) findViewById(R.id.btn_genomics);
        Button genotype = (Button) findViewById(R.id.btn_genotype);
        Button phenotype = (Button) findViewById(R.id.btn_phenotype);

        genetics.setOnClickListener(defListener);
        genomics.setOnClickListener(defListener);
        genotype.setOnClickListener(defListener);
        phenotype.setOnClickListener(defListener);

//        mTextView = (TextView) findViewById(R.id.know_more_1);
//        mTextView.setText(R.string.know_more_intro);
//
//        knowMore = (ConstraintLayout) findViewById(R.id.know_more);
//        knowMore1 = (ConstraintLayout) findViewById(R.id.know_more_first);
//        knowMore2 = (ConstraintLayout) findViewById(R.id.know_more_second);
//        knowMore3 = (ConstraintLayout) findViewById(R.id.know_more_third);
//
//        currentLayout = findViewById(R.id.know_more);
//
//        Log.d(TAG, "root view is " + currentLayout.getId() + " and " + R.id.know_more);
//        currentLayout.setOnClickListener(mOnClickListener);

    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(TAG, "onClick: sdfsdf");
//            switch(currentLayout.getId()) {
//                case R.id.know_more:
//                    setContentView(R.layout.know_more_first);
//                    mTextView = (TextView) findViewById(R.id.know_more_1);
//                    mTextView.setText(R.string.know_more_1);
//                    currentLayout = findViewById(R.id.know_more_first);
//                    currentLayout.setOnClickListener(mOnClickListener);
//                    break;
//                case R.id.know_more_first:
//                    setContentView(R.layout.know_more_second);
//                    currentLayout = findViewById(R.id.know_more_second);
//                    currentLayout.setOnClickListener(mOnClickListener);
//                    break;
//                case R.id.know_more_second:
//                    setContentView(R.layout.know_more_third);
//                    mTextView = (TextView) findViewById(R.id.know_more_1);
//                    mTextView.setText(com.timbuchalka.pg.R.string.know_more_third);
//                    currentLayout = findViewById(R.id.know_more_third);
//                    currentLayout.setOnClickListener(mOnClickListener);
//                    break;
//                case R.id.know_more_third:
//                    startActivity(new Intent(KnowMoreActivity.this, MainActivity.class));
//                    currentLayout = findViewById(R.id.activity_main);
//                    break;
//            }
        }
    };

    private View.OnClickListener defListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_genetics:
                    Snackbar.make(v, "Genetics: The study of a single gene and its impact on the individual",
                            Snackbar.LENGTH_INDEFINITE)
                            .setAction("Dismiss", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();
                    break;
                case R.id.btn_genomics:
                    Snackbar.make(v, "Genomics: The study of all parts of the individual’s genome",
                            Snackbar.LENGTH_INDEFINITE)
                            .setAction("Dismiss", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();
                    break;
                case R.id.btn_genotype:
                    Snackbar.make(v, "Genotype: The set of genes an individual carries.",
                            Snackbar.LENGTH_INDEFINITE)
                            .setAction("Dismiss", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();
                    break;
                case R.id.btn_phenotype:
                    Snackbar.make(v, "Phenotype: The observable expression of one’s genes.",
                            Snackbar.LENGTH_INDEFINITE)
                            .setAction("Dismiss", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();
                    break;
            }
        }
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);


    }

    @Override
    public void onClick(View v) {

    }
}
