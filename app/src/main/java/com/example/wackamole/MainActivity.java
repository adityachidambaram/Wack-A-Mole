package com.example.wackamole;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    public int counter = 60;
    TextView textView, score;
    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;
    int iScore = 0;
    boolean v1 = false, v2 = false, v3 = false, v4 = false, v5 = false, v6 = false, v7 = false, v8 = false, v9 = false;
    ConstraintLayout afterScreen;
    TextView afterScore;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.time);
        score = findViewById(R.id.score);
        layout = findViewById(R.id.main);

        i1 = findViewById(R.id.imageView1);
        i2 = findViewById(R.id.imageView2);
        i3 = findViewById(R.id.imageView3);
        i4 = findViewById(R.id.imageView4);
        i5 = findViewById(R.id.imageView5);
        i6 = findViewById(R.id.imageView6);
        i7 = findViewById(R.id.imageView7);
        i8 = findViewById(R.id.imageView8);
        i9 = findViewById(R.id.imageView9);

        i1.setVisibility(View.INVISIBLE);
        i2.setVisibility(View.INVISIBLE);
        i3.setVisibility(View.INVISIBLE);
        i4.setVisibility(View.INVISIBLE);
        i5.setVisibility(View.INVISIBLE);
        i6.setVisibility(View.INVISIBLE);
        i7.setVisibility(View.INVISIBLE);
        i8.setVisibility(View.INVISIBLE);
        i9.setVisibility(View.INVISIBLE);

        afterScreen = findViewById(R.id.afterScreen);
        afterScore = findViewById(R.id.afterScore);




        Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                int random = (int) (Math.random() * 9) + 1;
                int bad = (int) (Math.random() * 20) + 1;


                try {
                    switch (random) {
                        case 1:
                            if(bad == 1){
                                i1.setImageResource(R.drawable.badiron);
                            }
                            i1.setVisibility(View.VISIBLE);
                            up(i1);

                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v1) {
                                        down(i1);
                                    }
                                    i1.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i1.setVisibility(View.INVISIBLE);
                                            v1 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 2:
                            if(bad == 1){
                                i2.setImageResource(R.drawable.badiron);
                            }
                            i2.setVisibility(View.VISIBLE);
                            up(i2);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v2) {
                                        down(i2);
                                    }
                                    i2.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i2.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i2.setVisibility(View.INVISIBLE);
                                            v2 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 3:
                            if(bad == 1){
                                i3.setImageResource(R.drawable.badiron);
                            }
                            i3.setVisibility(View.VISIBLE);
                            up(i3);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v3) {
                                        down(i3);
                                    }
                                    i3.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i3.setVisibility(View.INVISIBLE);
                                            v3 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 4:
                            if(bad == 1){
                                i4.setImageResource(R.drawable.badiron);
                            }
                            i4.setVisibility(View.VISIBLE);
                            up(i4);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v4) {
                                        down(i4);
                                    }
                                    i4.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i4.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i4.setVisibility(View.INVISIBLE);
                                            v4 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 5:
                            if(bad == 1){
                                i5.setImageResource(R.drawable.badiron);
                            }
                            i5.setVisibility(View.VISIBLE);
                            up(i5);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v5) {
                                        down(i5);
                                    }
                                    i5.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i5.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i5.setVisibility(View.INVISIBLE);
                                            v5 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 6:
                            if(bad == 1){
                                i6.setImageResource(R.drawable.badiron);
                            }
                            i6.setVisibility(View.VISIBLE);
                            up(i6);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v6) {
                                        down(i6);
                                    }
                                    i6.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i6.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i6.setVisibility(View.INVISIBLE);
                                            v6 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 7:
                            if(bad == 1){
                                i7.setImageResource(R.drawable.badiron);
                            }
                            i7.setVisibility(View.VISIBLE);
                            up(i7);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v7) {
                                        down(i7);
                                    }
                                    i7.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i7.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i7.setVisibility(View.INVISIBLE);
                                            v7 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 8:
                            if(bad == 1){
                                i8.setImageResource(R.drawable.badiron);
                            }
                            i8.setVisibility(View.VISIBLE);
                            up(i8);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v8) {
                                        down(i8);
                                    }
                                    i8.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i8.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i8.setVisibility(View.INVISIBLE);
                                            v8 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;

                        case 9:
                            if(bad == 1){
                                i9.setImageResource(R.drawable.badiron);
                            }
                            i9.setVisibility(View.VISIBLE);
                            up(i9);
                            new CountDownTimer(750, 1000) {
                                public void onFinish() {
                                    if(!v9) {
                                        down(i9);
                                    }
                                    i9.setVisibility(View.INVISIBLE);
                                }

                                public void onTick(long millisUntilFinished) {
                                    i9.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            i9.setVisibility(View.INVISIBLE);
                                            v9 = true;
                                            if(bad != 1) {
                                                iScore++;
                                            }
                                            if(bad == 1) {
                                                counter -= 5;
                                            }
                                        }
                                    });
                                }
                            }.start();
                            break;
                    }
                    score.setText("" + iScore);


                    v1 = false;
                    v2 = false;
                    v3 = false;
                    v4 = false;
                    v5 = false;
                    v6 = false;
                    v7 = false;
                    v8 = false;
                    v9 = false;

                }
                catch(Exception e) {
                    e.printStackTrace();
                }


                Log.d("Thread", "Thread Waiting (after wait)");
            }



        };

        new CountDownTimer(counter * 1000, 1000){
            public void onTick(long millisUntilFinished){
                textView.setText(String.valueOf(counter));
                counter--;
                if(counter < 0) {
                    afterScreen.setVisibility(View.VISIBLE);
                    afterScore.setText("Score: " + iScore);
                }
            }
            public  void onFinish(){
                afterScreen.setVisibility(View.VISIBLE);
                afterScore.setText("Score: " + iScore);
            }
        }.start();

        for(int i = 0; i < 59; i++) {
            int time = i *1100;
            handler.postDelayed(run, time);

        }


    }
    public void up(ImageView img) {
        final ScaleAnimation scaleAnimationUp = new ScaleAnimation(0.1f, 1f, 0.1f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimationUp.setDuration(400);
        img.startAnimation(scaleAnimationUp);
    }
    public void down(ImageView img) {
        final ScaleAnimation scaleAnimationDown = new ScaleAnimation(1f, 0.1f, 1f, 0.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimationDown.setDuration(400);
        img.startAnimation(scaleAnimationDown);
    }
}