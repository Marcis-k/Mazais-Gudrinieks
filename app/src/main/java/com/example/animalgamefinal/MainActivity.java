package com.example.animalgamefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bToStartABCGame, desmit, divdesmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //To remove top bar and make full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        bToStartABCGame = findViewById(R.id.bToStartABCGame);
        desmit = findViewById(R.id.desmit);
        divdesmit = findViewById(R.id.divdesmit);




        bToStartABCGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avtion();
                Count.countR=0;
                Count.countW=0;
            }
        });




        desmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNumbersToTen();
                Count.countR=0;
                Count.countW=0;
            }
        });

        divdesmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNumbersToTwenty();
                Count.countR=0;
                Count.countW=0;
            }
        });




    }

    private void startNumbersToTwenty() {
        Intent intent = new Intent(this,NumbersToTwenty.class);
        startActivity(intent);
    }

    private void startNumbersToTen() {
        Intent intent = new Intent(this,NumbersToTen.class);
        startActivity(intent);
    }



    private void avtion() {

//        Intent intent =new Intent(this, A.class);
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
}