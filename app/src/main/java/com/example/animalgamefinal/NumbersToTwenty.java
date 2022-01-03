package com.example.animalgamefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class NumbersToTwenty extends AppCompatActivity {

    private ImageButton no10, no210, yes10, yes210, start, home;
    private TextView pareizasAtbildes, nepareizasAtbildes, countRight, countWrong, pluss, numberOne, numberTwo;
    private Button test;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_numbers_to_twenty);

        no10 = findViewById(R.id.no20);
        no210 = findViewById(R.id.no220);
        yes10 = findViewById(R.id.yes20);
        yes210 = findViewById(R.id.yes220);
        start = findViewById(R.id.start20);
        home = findViewById(R.id.homeButton);

        pareizasAtbildes = findViewById(R.id.pareizasAtbildes);
        nepareizasAtbildes = findViewById(R.id.nepareizasAtbildes);
        countRight = findViewById(R.id.countRight);
        countWrong = findViewById(R.id.countWrong);

        test = findViewById(R.id.test2);
        result = findViewById(R.id.result2);
        numberOne = findViewById(R.id.numberOne2);
        numberTwo = findViewById(R.id.numberTwo2);
        pluss = findViewById(R.id.pluss);

        countRight.setText(String.valueOf(Count.countR));
        countWrong.setText(String.valueOf(Count.countW));

        result.setRawInputType(Configuration.KEYBOARD_12KEY);

        test.setEnabled(false);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = result.getText().toString();
                if (!text.isEmpty()) {
                    test.setEnabled(true);
                } else {
                    test.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        };


        result.addTextChangedListener(textWatcher);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start.setVisibility(View.INVISIBLE);
                pareizasAtbildes.setVisibility(View.INVISIBLE);
                nepareizasAtbildes.setVisibility(View.INVISIBLE);
                home.setVisibility(View.INVISIBLE);
                countRight.setVisibility(View.INVISIBLE);
                countWrong.setVisibility(View.INVISIBLE);

                test.setVisibility(View.VISIBLE);
                result.setVisibility(View.VISIBLE);
                numberOne.setVisibility(View.VISIBLE);
                numberTwo.setVisibility(View.VISIBLE);
                pluss.setVisibility(View.VISIBLE);

                int a = (int) (Math.random() * 11) + 1;
                int b = (int) (Math.random() * 11) + 1;


                numberOne.setText(String.valueOf(a));

                numberTwo.setText(String.valueOf(b));


                // result.setText(String.valueOf(a + b));


                test.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (a + b == res()) {
                            actionYes();
                        } else {
                            actionNo();
                        }
                    }
                });
            }


            private int res() {
                int n = Integer.parseInt(result.getText().toString());
                return n;
            }


        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHome();
            }
        });

        no10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.countW++;
                tryAgain();
                result.setText("");
            }
        });

        no210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.countW++;
                tryAgain2();
                result.setText("");
            }
        });


        yes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.countR++;
                yes();
            }
        });

        yes210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count.countR++;
                yes();
            }
        });


    }


    private void backToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void yes() {
        Intent intent = new Intent(this, NumbersToTen.class);
        startActivity(intent);
    }

    private void tryAgain2() {
        no210.setVisibility(View.INVISIBLE);
        test.setVisibility(View.VISIBLE);
        result.setVisibility(View.VISIBLE);
        numberOne.setVisibility(View.VISIBLE);
        numberTwo.setVisibility(View.VISIBLE);
        pluss.setVisibility(View.VISIBLE);
    }

    private void tryAgain() {
        no10.setVisibility(View.INVISIBLE);
        test.setVisibility(View.VISIBLE);
        result.setVisibility(View.VISIBLE);
        numberOne.setVisibility(View.VISIBLE);
        numberTwo.setVisibility(View.VISIBLE);
        pluss.setVisibility(View.VISIBLE);

    }

    private void actionNo() {
        int ran = (int) (Math.random() * 6);
        if (ran % 2 == 0) {
            no10.setVisibility(View.VISIBLE);
            numberOne.setVisibility(View.INVISIBLE);
            numberTwo.setVisibility(View.INVISIBLE);
            pluss.setVisibility(View.INVISIBLE);
            test.setVisibility(View.INVISIBLE);
            result.setVisibility(View.INVISIBLE);
        } else if (ran % 2 == 1) {
            no210.setVisibility(View.VISIBLE);
            numberOne.setVisibility(View.INVISIBLE);
            numberTwo.setVisibility(View.INVISIBLE);
            pluss.setVisibility(View.INVISIBLE);
            test.setVisibility(View.INVISIBLE);
            result.setVisibility(View.INVISIBLE);
        }
    }

    private void actionYes() {
        int ran = (int) (Math.random() * 6);
        if (ran % 2 == 0) {
            yes10.setVisibility(View.VISIBLE);
            numberOne.setVisibility(View.INVISIBLE);
            numberTwo.setVisibility(View.INVISIBLE);
            pluss.setVisibility(View.INVISIBLE);
            test.setVisibility(View.INVISIBLE);
            result.setVisibility(View.INVISIBLE);


        } else if (ran % 2 == 1) {
            yes210.setVisibility(View.VISIBLE);
            numberOne.setVisibility(View.INVISIBLE);
            numberTwo.setVisibility(View.INVISIBLE);
            pluss.setVisibility(View.INVISIBLE);
            test.setVisibility(View.INVISIBLE);
            result.setVisibility(View.INVISIBLE);

        }
    }


}
