package com.example.animalgamefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class I extends AppCompatActivity {
    private ImageButton a, a1, a2, no, no2, yes, yes2, start, homeButton;
    private ImageView apple;

    private TextView pareizasAtbildes, nepareizasAtbildes, countRight, countWrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //To remove top bar and make full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_i);

        Random ran = new Random();

        a = findViewById(R.id.i);
        a1 = findViewById(R.id.i1);
        a2 = findViewById(R.id.i2);
        no = findViewById(R.id.noI);
        no2 = findViewById(R.id.no2I);
        yes = findViewById(R.id.yesI);
        yes2 = findViewById(R.id.yes2I);
        apple = findViewById(R.id.indianis);
        start = findViewById(R.id.startI);
        homeButton = findViewById(R.id.homeButton);


        pareizasAtbildes = findViewById(R.id.pareizasAtbildes);
        nepareizasAtbildes = findViewById(R.id.nepareizasAtbildes);
        countRight = findViewById(R.id.countRight);
        countWrong = findViewById(R.id.countWrong);


        countRight.setText(String.valueOf(Count.countR));
        countWrong.setText(String.valueOf(Count.countW));

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHome();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r1 = ran.nextInt(5);
                int r2 = ran.nextInt(5);

                float posxX = a.getX();
                float posyY = a.getY();
                float posX = a1.getX();
                float posY = a1.getY();
                float posXx = a2.getX();
                float posYy = a2.getY();

                apple.setVisibility(View.VISIBLE);
                start.setVisibility(View.INVISIBLE);

                pareizasAtbildes.setVisibility(View.INVISIBLE);
                nepareizasAtbildes.setVisibility(View.INVISIBLE);
                countRight.setVisibility(View.INVISIBLE);
                countWrong.setVisibility(View.INVISIBLE);

                homeButton.setVisibility(View.INVISIBLE);


                if (r1 % 2 == 0) {

                    a.setX(posXx);
                    a.setY(posYy);
                    a1.setX(posxX);
                    a1.setY(posyY);
                    a2.setX(posX);
                    a2.setY(posY);

                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);

                } else if (r2 % 2 == 1) {

                    a.setX(posX);
                    a.setY(posY);
                    a1.setX(posxX);
                    a1.setY(posyY);
                    a2.setX(posXx);
                    a2.setY(posYy);

                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                } else {
                    a.setX(posxX);
                    a.setY(posyY);
                    a1.setX(posX);
                    a1.setY(posY);
                    a2.setX(posXx);
                    a2.setY(posYy);

                    a.setVisibility(View.VISIBLE);
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                }
            }
        });


        //YES images actions
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionNext();
            }
        });

        yes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionNext();
            }
        });


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionYes();
                Count.countR++;
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionNo();
                Count.countW++;
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionNo();
                Count.countW++;
            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryAgain();
            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryAgain2();
            }
        });


    }

    private void backToHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void actionYes() {
        int ran = (int) (Math.random() * 6);
        if (ran % 2 == 0) {
            yes.setVisibility(View.VISIBLE);
            a.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a2.setVisibility(View.INVISIBLE);
            apple.setVisibility(View.INVISIBLE);
        } else if (ran % 2 == 1) {
            yes2.setVisibility(View.VISIBLE);
            a.setVisibility(View.INVISIBLE);
            a1.setVisibility(View.INVISIBLE);
            a2.setVisibility(View.INVISIBLE);
            apple.setVisibility(View.INVISIBLE);
        }
    }

    private void actionNo() {
        int ran = (int) (Math.random() * 6);
        if (ran % 2 == 0) {
            no.setVisibility(View.VISIBLE);
        } else if (ran % 2 == 1) {
            no2.setVisibility(View.VISIBLE);
        }
    }

    private void actionNext() {
//        Intent intent = new Intent(this, CC.class);
//        startActivity(intent);
        int randomNum = (int) (Math.random() * 33 + 1);  // 0 to 2

        switch (randomNum) {
            case 1:
                Intent intent = new Intent(this, A.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, AA.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, B.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, C.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, CC.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(this, D.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(this, E.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(this, EE.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(this, F.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(this, G.class);
                startActivity(intent);
                break;
            case 11:
                intent = new Intent(this, GG.class);
                startActivity(intent);
                break;
            case 12:
                intent = new Intent(this, H.class);
                startActivity(intent);
                break;
            case 13:
                intent = new Intent(this, I.class);
                startActivity(intent);
                break;
            case 14:
                intent = new Intent(this, II.class);
                startActivity(intent);
                break;
            case 15:
                intent = new Intent(this, J.class);
                startActivity(intent);
                break;
            case 16:
                intent = new Intent(this, K.class);
                startActivity(intent);
                break;
            case 17:
                intent = new Intent(this, KK.class);
                startActivity(intent);
                break;
            case 18:
                intent = new Intent(this, L.class);
                startActivity(intent);
                break;
            case 19:
                intent = new Intent(this, LL.class);
                startActivity(intent);
                break;
            case 20:
                intent = new Intent(this, M.class);
                startActivity(intent);
                break;
            case 21:
                intent = new Intent(this, N.class);
                startActivity(intent);
                break;
            case 22:
                intent = new Intent(this, NN.class);
                startActivity(intent);
                break;
            case 23:
                intent = new Intent(this, O.class);
                startActivity(intent);
                break;
            case 24:
                intent = new Intent(this, P.class);
                startActivity(intent);
                break;
            case 25:
                intent = new Intent(this, RR.class);
                startActivity(intent);
                break;
            case 26:
                intent = new Intent(this, S.class);
                startActivity(intent);
                break;
            case 27:
                intent = new Intent(this, SS.class);
                startActivity(intent);
                break;
            case 28:
                intent = new Intent(this, T.class);
                startActivity(intent);
                break;
            case 29:
                intent = new Intent(this, U.class);
                startActivity(intent);
                break;
            case 30:
                intent = new Intent(this, UU.class);
                startActivity(intent);
                break;
            case 31:
                intent = new Intent(this, V.class);
                startActivity(intent);
                break;
            case 32:
                intent = new Intent(this, Z.class);
                startActivity(intent);
                break;
            case 33:
                intent = new Intent(this, ZZ.class);
                startActivity(intent);
                break;

            default:
        }
    }

    private void tryAgain2() {
        no2.setVisibility(View.INVISIBLE);
    }

    private void tryAgain() {
        no.setVisibility(View.INVISIBLE);
    }
}


