package com.timbuchalka.pg;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KnowMoreActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "KnowMoreActivity";

    public ConstraintLayout knowMore, knowMore1, knowMore2, knowMore3;
    public View currentLayout;
    public TextView tvTitle, tvText, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.know_more_1);

        getSupportActionBar().hide();

        next = (TextView) findViewById(R.id.next_tv);
        next.setOnClickListener(kOnClickListener);

        Button genetics = (Button) findViewById(R.id.btn_genetics);
        Button genomics = (Button) findViewById(R.id.btn_genomics);
        Button genotype = (Button) findViewById(R.id.btn_genotype);
        Button phenotype = (Button) findViewById(R.id.btn_phenotype);

        genetics.setOnClickListener(defListener);
        genomics.setOnClickListener(defListener);
        genotype.setOnClickListener(defListener);
        phenotype.setOnClickListener(defListener);
        currentLayout = (ConstraintLayout) findViewById(R.id.km1);
        Log.d(TAG, "onCreate: current layout" + currentLayout.getId());

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

    private View.OnClickListener kOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch(currentLayout.getId()) {
                case R.id.km1:
                    setContentView(R.layout.know_more_2);
                    getSupportActionBar().hide();
                    next = (TextView) findViewById(R.id.next_tv);

                    next.setOnClickListener(kOnClickListener);
                    currentLayout = findViewById(R.id.km2);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km2:
                    setContentView(R.layout.know_more_3);
                    getSupportActionBar().hide();
                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);
                    currentLayout = findViewById(R.id.km3);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km3:
                    setContentView(R.layout.know_more_4);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km4);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km4:
                    setContentView(R.layout.know_more_5);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km5);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km5:
                    setContentView(R.layout.know_more_6);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km6);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km6:
                    setContentView(R.layout.know_more_7);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km7);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km7:
                    setContentView(R.layout.know_more_8);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km8);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;
                case R.id.km8:
                    setContentView(R.layout.know_more_9);
                    getSupportActionBar().hide();

                    next = (TextView) findViewById(R.id.next_tv);
                    next.setOnClickListener(kOnClickListener);

                    currentLayout = findViewById(R.id.km9);
                    currentLayout.setOnClickListener(kOnClickListener);
                    break;

            }
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
