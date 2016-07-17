package com.example.fatumdream.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fatumdream.R;
import com.example.fatumdream.Scenes.ChooseScene;
import com.example.fatumdream.Scenes.MainScene;

import java.io.IOException;

import static com.example.fatumdream.R.string.*;

public class GameActivity extends Activity {
    public static MainScene[] scenes;
    public static ChooseScene[] chooseScene1, chooseScene2,FromDeath,Sharf1,Sharf2,Shot,Ending,RedOut;
    // здесь можно !только! объявлять переменные.
    LinearLayout linearLayout;
    ImageView imageView;
    TextView textView;
    ImageView imageView2;
    Button b1,b2,b3,b4;
    Intent GoHomeBaby;

    static MediaPlayer Ch1,CLSoul,DL,EL,FC,F,Int,Mll,TD,UL,SS;

    int ChScena2;
    int lol;
    int ChScena1;
    int SharfCounter;
    int current;
    int FDcounter;
    int ShotCounter;
    int RedOutCounter;
    int EndingCounter;

    boolean VIV,VIV2;
    boolean ShotMonster;
    boolean WhichChoise;
    boolean OneDeath;
    boolean TwoDeath;
    boolean Masochism;
    boolean OneOneDeath;
    boolean Sharf;
    boolean SharfChoise;

    boolean f = false;
    boolean t = true;

    int Markus = R.drawable.tomas;
    int forest = R.drawable.forest;
    int door = R.drawable.door;
    int FW = R.drawable.forestwithway;
    int castle = R.drawable.castle;
    int way = R.drawable.incastle;
    int test = R.drawable.ally;
    int Black = R.drawable.darkbackground;
    int cage = R.drawable.cage;
    int cagelight = R.drawable.cagewithlight;
    int flange = R.drawable.flange;
    int Jane = R.drawable.jane;
    int com = R.drawable.machine;
    int comlight = R.drawable.machinewithlight;
    int casSh = R.drawable.castle_sharf;
    int red = R.drawable.red;

    public void PlayAudio(MediaPlayer mm){
        if (mm.isPlaying()){
            lol++;
        }
        else {
            AllStop();
            try {
                mm.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            mm.start();
        }
    }



    public void AllStop(){
        Ch1.stop();
        CLSoul.stop();
        DL.stop();
        EL.stop();
        FC.stop();
        F.stop();
        Int.stop();
        Mll.stop();
        TD.stop();
        UL.stop();
        SS.stop();
    }

    public void GoScena(MainScene mainScene){
        switch (mainScene.music){
            case 1: AllStop(); break;
            case R.raw.suspens:
                if (SS.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        SS.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    SS.start();
                }
                break;

            case R.raw.classic_horror1:
                if (Ch1.isPlaying()){
                     lol++;
                }
                else {
                    AllStop();
                    try {
                        Ch1.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Ch1.start();
                }
                break;

            case R.raw.clean_soul:
                if (CLSoul.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        CLSoul.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    CLSoul.start();
                }
                break;

            case R.raw.dreamlike:
                if (DL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        DL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    DL.start();
                }
                break;

            case R.raw.easy_lemon:
                if (EL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        EL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    EL.start();
                }
                break;

            case R.raw.floating_cities:
                if (FC.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        FC.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    FC.start();
                }
                break;

            case R.raw.forest:
                if (F.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        F.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    F.start();
                }
                break;

            case R.raw.intrepid:
                if (Int.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Int.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Int.start();
                }
                break;

            case R.raw.mellowtron:
                if (Mll.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Mll.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Mll.start();
                }
                break;

            case R.raw.thunder_dreams:
                if (TD.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        TD.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    TD.start();
                }
                break;

            case R.raw.unlight:
                if (UL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        UL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    UL.start();
                }
                break;
        }
        if(mainScene.visback){b4.setVisibility(View.VISIBLE);}else {b4.setVisibility(View.INVISIBLE);}
        linearLayout.setBackgroundResource(mainScene.Back);
        b1.setText("(1)");
        b2.setText("(2)");
        textView.setText(mainScene.text);
        imageView.setImageResource(mainScene.Picture1);
        imageView2.setImageResource(mainScene.Picture2);

        if (mainScene.visbts){
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
        }
        else {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
        }

        if (mainScene.vis_hero){
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.INVISIBLE);
        }

        if (mainScene.vis_hero2){
            imageView2.setVisibility(View.VISIBLE);
        }
        else {
            imageView2.setVisibility(View.INVISIBLE);
        }

        if (mainScene.visbt) {
            b3.setVisibility(View.VISIBLE);
        }
        else {
            b3.setVisibility(View.INVISIBLE);
        }
        current++;

    }


    public void GoScenas(MainScene[] mainScene,int current){
        switch (mainScene[current].music){
            case 1: AllStop();break;
            case R.raw.suspens:
                PlayAudio(SS);
                break;
            case R.raw.classic_horror1:
                PlayAudio(Ch1);
                break;
            case R.raw.clean_soul:
                PlayAudio(CLSoul);
                break;
            case R.raw.dreamlike:
                PlayAudio(DL);
                break;
            case R.raw.easy_lemon:
                PlayAudio(EL);
                break;
            case R.raw.floating_cities:
                PlayAudio(FC);
                break;
            case R.raw.forest:
                PlayAudio(F);
                break;
            case R.raw.intrepid:
                PlayAudio(Int);
                break;
            case R.raw.mellowtron:
                PlayAudio(Mll);
                break;
            case R.raw.thunder_dreams:
                PlayAudio(TD);
                break;
            case R.raw.unlight:
                PlayAudio(UL);
                break;
        }
        if (mainScene[current].visback){b4.setVisibility(View.VISIBLE);} else {b4.setVisibility(View.INVISIBLE);}
        linearLayout.setBackgroundResource(mainScene[current].Back);
        b1.setText("(1)");
        b2.setText("(2)");
        textView.setText(mainScene[current].text);
        imageView.setImageResource(mainScene[current].Picture1);
        imageView2.setImageResource(mainScene[current].Picture2);

        if (mainScene[current].visbts){
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
        }
        else {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
        }

        if (mainScene[current].vis_hero){
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.INVISIBLE);
        }

        if (mainScene[current].vis_hero2){
            imageView2.setVisibility(View.VISIBLE);
        }
        else {
            imageView2.setVisibility(View.INVISIBLE);
        }

        if (mainScene[current].visbt) {
            b3.setVisibility(View.VISIBLE);
        }
        else {
            b3.setVisibility(View.INVISIBLE);
        }

    }

    public void GoScenas_forButtonOne(ChooseScene[] chooseScene1,int ChScena){
        switch (chooseScene1[ChScena].music){
            case 1:
                AllStop();
                break;

            case R.raw.suspens:
                if (SS.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        SS.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    SS.start();
                }
                break;

            case R.raw.classic_horror1:
                if (Ch1.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Ch1.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Ch1.start();
                }
                break;

            case R.raw.clean_soul:
                if (CLSoul.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        CLSoul.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    CLSoul.start();
                }
                break;

            case R.raw.dreamlike:
                if (DL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        DL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    DL.start();
                }
                break;

            case R.raw.easy_lemon:
                if (EL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        EL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    EL.start();
                }
                break;

            case R.raw.floating_cities:
                if (FC.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        FC.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    FC.start();
                }
                break;

            case R.raw.forest:
                if (F.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        F.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    F.start();
                }
                break;

            case R.raw.intrepid:
                if (Int.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Int.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Int.start();
                }
                break;

            case R.raw.mellowtron:
                if (Mll.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Mll.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Mll.start();
                }
                break;

            case R.raw.thunder_dreams:
                if (TD.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        TD.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    TD.start();
                }
                break;

            case R.raw.unlight:
                if (UL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        UL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    UL.start();
                }
                break;
        }
        if (chooseScene1[ChScena].visback){b4.setVisibility(View.VISIBLE);} else {b4.setVisibility(View.INVISIBLE);}
        textView.setText(chooseScene1[ChScena].text);
        linearLayout.setBackgroundResource(chooseScene1[ChScena].Back);
        imageView.setImageResource(chooseScene1[ChScena].Picture1);
        imageView2.setImageResource(chooseScene1[ChScena].Picture2);
        if (chooseScene1[ChScena].vis_hero){
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.INVISIBLE);
        }

        if (chooseScene1[ChScena].vis_hero2){
            imageView2.setVisibility(View.VISIBLE);
        }
        else {
            imageView2.setVisibility(View.INVISIBLE);
        }

        if (chooseScene1[ChScena1].visbts){
            b3.setVisibility(View.VISIBLE);
            b2.setVisibility(View.INVISIBLE);
        }
        else {
            b3.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
        }

        if (chooseScene1[ChScena].visbt){
            b1.setVisibility(View.VISIBLE);
        }
        else {
            b1.setVisibility(View.INVISIBLE);
        }
        b1.setText("Вперед!");
    }

    public void GoScenas_forButtonTwo(ChooseScene[] chooseScene2,int ChScena){
        switch (chooseScene2[ChScena].music){
            case 1:
                AllStop(); break;
            case R.raw.suspens:
                if (SS.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        SS.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    SS.start();
                }
                break;

            case R.raw.classic_horror1:
                if (Ch1.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Ch1.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Ch1.start();
                }
                break;

            case R.raw.clean_soul:
                if (CLSoul.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        CLSoul.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    CLSoul.start();
                }
                break;

            case R.raw.dreamlike:
                if (DL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        DL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    DL.start();
                }
                break;

            case R.raw.easy_lemon:
                if (EL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        EL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    EL.start();
                }
                break;

            case R.raw.floating_cities:
                if (FC.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        FC.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    FC.start();
                }
                break;

            case R.raw.forest:
                if (F.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        F.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    F.start();
                }
                break;

            case R.raw.intrepid:
                if (Int.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Int.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Int.start();
                }
                break;

            case R.raw.mellowtron:
                if (Mll.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        Mll.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Mll.start();
                }
                break;

            case R.raw.thunder_dreams:
                if (TD.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        TD.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    TD.start();
                }
                break;

            case R.raw.unlight:
                if (UL.isPlaying()){
                    lol++;
                }
                else {
                    AllStop();
                    try {
                        UL.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    UL.start();
                }
                break;
        }
        if (chooseScene2[ChScena].visback){b4.setVisibility(View.VISIBLE);} else {b4.setVisibility(View.INVISIBLE);}
        textView.setText(chooseScene2[ChScena].text);
        linearLayout.setBackgroundResource(chooseScene2[ChScena].Back);
        imageView.setImageResource(chooseScene2[ChScena].Picture1);
        imageView2.setImageResource(chooseScene2[ChScena].Picture2);
        if (chooseScene2[ChScena].vis_hero){
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.INVISIBLE);
        }

        if (chooseScene2[ChScena].vis_hero2){
            imageView2.setVisibility(View.VISIBLE);
        }
        else {
            imageView2.setVisibility(View.INVISIBLE);
        }

        if (chooseScene2[ChScena2].visbts){
            b3.setVisibility(View.VISIBLE);
            b1.setVisibility(View.INVISIBLE);
        }
        else {
            b3.setVisibility(View.INVISIBLE);
            b1.setVisibility(View.INVISIBLE);
        }

        if (chooseScene2[ChScena].visbt){
            b2.setVisibility(View.VISIBLE);
        }
        else {
            b2.setVisibility(View.INVISIBLE);
        }
        b2.setText("Вперед!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // и толкьо после setContentView ты можешь делать findViewById
        // т.к. до подключения лайоута просто нечего искать было
        GoHomeBaby = new Intent(GameActivity.this, MainActivity.class);
        linearLayout = (LinearLayout)findViewById(R.id.linearlayout);
        imageView = (ImageView)findViewById(R.id.imageview);
        textView = (TextView)findViewById(R.id.text);
        imageView2 = (ImageView)findViewById(R.id.imageview2);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.button_back);

        Ch1 = MediaPlayer.create(this,R.raw.classic_horror1);
        CLSoul = MediaPlayer.create(this,R.raw.clean_soul);
        DL = MediaPlayer.create(this,R.raw.dreamlike);
        EL = MediaPlayer.create(this,R.raw.easy_lemon);
        FC = MediaPlayer.create(this,R.raw.floating_cities);
        F = MediaPlayer.create(this,R.raw.forest);
        Int = MediaPlayer.create(this,R.raw.intrepid);
        Mll = MediaPlayer.create(this,R.raw.mellowtron);
        TD = MediaPlayer.create(this,R.raw.thunder_dreams);
        UL = MediaPlayer.create(this,R.raw.unlight);
        SS = MediaPlayer.create(this,R.raw.suspens);

        if (CLSoul.isPlaying()){
            CLSoul.setVolume(100,100);
        }

        OneDeath = f;
        OneOneDeath = f;
        TwoDeath = f;
        Masochism = f;

        WhichChoise = t;

        Sharf = f;
        SharfChoise = f;

        VIV = t;
        VIV2 = f;

        ShotMonster = f;

        current = 0;
        ChScena1 = 0;
        ChScena2 = 0;
        FDcounter = 0;
        SharfCounter = 0;
        ShotCounter = 0;
        RedOutCounter = 0;
        EndingCounter = 0;

        scenes = new MainScene[84];
        chooseScene1 = new ChooseScene[12];
        chooseScene2 = new ChooseScene[9];
        FromDeath = new ChooseScene[13];
        Sharf1 = new ChooseScene[4];
        Sharf2 = new ChooseScene[4];
        Shot = new ChooseScene[5];
        RedOut = new ChooseScene[6];
        Ending = new ChooseScene[8];

        Ending[0] = new ChooseScene(1,"Я перехватил пистолет в руках Элли, и потребовал объясниться",cagelight,test,Markus,t,t,f,t,t,R.raw.thunder_dreams);
        Ending[1] = new ChooseScene(2,"Мне было не важно, что сзади меня монстр, я просто хотел узнать, как она смогла так спрятать пистолет.",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[2] = new ChooseScene(3,"Хотя, я просто уже хотел уйти.",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[3] = new ChooseScene(4,"Томас: Пошли отсюда.",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[4] = new ChooseScene(5,"Это был первый раз, когда я видел, чтобы Элли плакала",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[5] = new ChooseScene(6,"Выйдя к лесной опушке, я было хотел спросить Элли обо всем, что мы увидели, но я решил молчать, пока мы не придем к базе.",forest,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[6] = new ChooseScene(7,"Хорошая концовка № 1: Туда и обратно.",forest,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Ending[7] = new ChooseScene(8,"...",forest,test,Markus,f,f,f,f,f,R.raw.thunder_dreams);

        RedOut[0] = new ChooseScene(1,"Я остановил Элли, став перед стволом.",cagelight,test,Markus,t,t,f,t,t,R.raw.unlight);
        RedOut[1] = new ChooseScene(2,"Томас: Мы не знаем, что это, и лучше это не трогать.",cagelight,test,Markus,f,f,f,t,t,R.raw.unlight);
        RedOut[2] = new ChooseScene(3,"И тут я понял свою ошибку... Что-то подняло меня в воздух...",cagelight,test,Markus,f,f,f,t,t,R.raw.unlight);
        RedOut[3] = new ChooseScene(4,"...И разорвало на две части",red,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        RedOut[4] = new ChooseScene(5,"Плохая концовка № 4: Слишком доверчивый...",red,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        RedOut[5] = new ChooseScene(6,"...",red,test,Markus,f,f,f,f,f,R.raw.thunder_dreams);

        Shot[0] = new ChooseScene(1,"Томас: Стреляй в нею, СТРЕЛЯЙ",cagelight,test,Markus,t,t,f,t,t,R.raw.unlight);
        Shot[1] = new ChooseScene(2,"Но тварь вырвалась из клетки, и разорвала Элли на две части.",red,test,Markus,f,f,f,t,t,R.raw.unlight);
        Shot[2] = new ChooseScene(3,"Я был следующим...",red,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Shot[3] = new ChooseScene(4,"Плохая концовка № 3: Не будите зверя...",red,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        Shot[4] = new ChooseScene(5,"...",red,test,Markus,f,f,f,f,f,R.raw.thunder_dreams);

        Sharf1[0] = new ChooseScene(1,"Томас : О, смотри, шарфик, хочешь достану?", castle,test,Markus,f,t,f,t,t,R.raw.mellowtron);
        Sharf1[1] = new ChooseScene(2, "Элли: И зачем он мне нужен? Если нужно, себе доставай.", castle,test,Markus,t,t,f,t,t,R.raw.mellowtron);
        Sharf1[2] = new ChooseScene(3,getString(R.string.Have_Sharf),casSh,test,Markus,f,f,f,f,t,R.raw.mellowtron);
        Sharf1[3] = new ChooseScene(3," ",casSh,test,Markus,f,f,t,f,f,R.raw.mellowtron);

        Sharf2[0] = new ChooseScene(1,"Томас : О, смотри, шарфик, хочешь достану?", castle,test,Markus,f,t,f,t,t,R.raw.mellowtron);
        Sharf2[1] = new ChooseScene(2,"Элли: И ты с ним будешь его с собой таскать? Плюс, мы вообще не знаем, чей он. Оставь его здесь",castle,test,Markus,t,t,f,t,t,R.raw.mellowtron);
        Sharf2[2] = new ChooseScene(3,getString(R.string.NotHave_Sharf),castle,test,Markus,f,f,f,f,t,R.raw.mellowtron);
        Sharf2[3] = new ChooseScene(3," ",castle,test,Markus,f,f,t,f,f,R.raw.mellowtron);

        FromDeath[0] = new ChooseScene(1,getString(GameText1),forest,test, Markus,t,f,f,t,t,1);
        FromDeath[1] = new ChooseScene(2,"А ты убивал(а) в реальной жизни?",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[2] = new ChooseScene(3,"Я думаю, нет",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[3] = new ChooseScene(4,"Ты сильно не убивай моих персонажей, ладно?",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[4] = new ChooseScene(5,"Исправь ошибки...",Black,test,test,f,f,f,f,f,R.raw.intrepid);

        FromDeath[5] = new ChooseScene(6,getString(GameText1),forest,test, Markus,t,f,f,t,t,1);
        FromDeath[6] = new ChooseScene(7,"Оо, ты здесь, привет.",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[7] = new ChooseScene(8,"Если ты уже был(а) здесь, значит ты успел(а) натворить дел.",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[8] = new ChooseScene(9,"Ты сильно не убивай моих персонажей, ладно?",Black,test,test,f,f,f,t,t,R.raw.intrepid);
        FromDeath[9] = new ChooseScene(10,"Исправь ошибки...",Black,test,test,f,f,f,f,f,R.raw.intrepid);

        FromDeath[10] = new ChooseScene(11,"Я ПРОСИЛ ИХ НЕ ТРОГАТЬ, А ТЫ НАЗЛО УБИВАЛ(А), ИДИ ОТСЮДА, БЕЗМОЗГЛОЕ ЖИВОТНОЕ.",Black,Markus,Markus,f,f,f,t,t,R.raw.unlight);
        FromDeath[11] = new ChooseScene(12,"Непредвиденная концовка №1: Садо-мазохист",Black,test,test,f,f,f,t,t,R.raw.unlight);
        FromDeath[12] = new ChooseScene(13,"Ты слишком много натворил...",Black,test,test,f,f,f,f,f,R.raw.unlight);

        chooseScene1[0] = new ChooseScene(1,"Томас : Думаю, нам надо отсюда уходить, меня что то тревожит зде...",forest, test, Markus,f,t,f,t,t,1);
        chooseScene1[1] = new ChooseScene(2,"*БАМ*", Black, test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[2] = new ChooseScene(3,"Томас : КАКОГО ХРЕНА?! ЭТО ТЫ, ЭЛЛИ?! ЭЛЛИ?",forest,test,Markus,f,t,f,t,t,R.raw.unlight);
        chooseScene1[3] = new ChooseScene(4,"*ТЫ ДУМАЕШЬ, ЧТО МОЖЕШЬ УЙТИ, МОЖЕШЬ ЗАБЫТЬ ОБ ЭТОМ МЕСТЕ?*",Black,test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[4] = new ChooseScene(5,"Томас: КТО ЭТО?!",forest, test, Markus,f,t,f,t,t,R.raw.unlight);
        chooseScene1[5] = new ChooseScene(6,"*ТОТ, О КОМ ТЫ НЕ УЗНАЕШЬ ИЗ-ЗА СВОЕЙ ГЛУПОСТИ, УМРИ.*",Black, test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[6] = new ChooseScene(7,"...",forest, Black, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[7] = new ChooseScene(8,".ШшШшшшшШШшШ..",Black, test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[8] = new ChooseScene(9,"ПОСЛЕДНИЕ НОВОСТИ: НА ДАННЫЙ МОМЕНТ ПРОДОЛЖАЮТСЯ ПОИСКИ ТОМАСА КЛЕЙФЕЛА И ЭЛЛИ МЕНБРАУН",forest, test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[9] = new ChooseScene(10,"ВЕСЬ ЛЕС И ПРИГРАНИЧНЫЕ ТЕРРИТОРИИ БЫЛИ ПРОВЕРЕНЫ, ЧТО, КАК НИ СТРАННО, НЕ ДАЛО РЕЗУЛЬТАТОВ. РАССЛЕДОВАНИЕ ПРОДОЛЖАЕТСЯ...",castle,test, Markus,f,f,f,t,t,R.raw.unlight);
        chooseScene1[10] = new ChooseScene(11, "Плохая концовка № 1: Свернув назад...",Black,test,Markus,t,t,f,f,t,R.raw.unlight);
        chooseScene1[11] = new ChooseScene(12, "Исправь ошибки...",Black,test,Markus,f,f,f,f,f,R.raw.unlight);

        chooseScene2[0] = new ChooseScene(1,"Томас : Может свернем в деревню, там переночюем, а утром попремся в замок?",FW, test, Markus,f,t,f,t,t,R.raw.classic_horror1);
        chooseScene2[1] = new ChooseScene(2,"Элли : А долго до деревни?",FW, test, Markus,t,t,f,t,t,R.raw.classic_horror1);
        chooseScene2[2] = new ChooseScene(3,"Томас : Да нет, спустимся и уже там.",FW,test,Markus,t,t,f,t,t,R.raw.classic_horror1);
        chooseScene2[3] = new ChooseScene(4,"...",Black,test,Markus,f,f,f,t,t,R.raw.classic_horror1);
        chooseScene2[4] = new ChooseScene(5,".ШшшшШшШШШш.",FW,test,Markus,f,f,f,t,t,R.raw.classic_horror1);
        chooseScene2[5] = new ChooseScene(6,"ПОСЛЕДНИЕ НОВОСТИ: В ЛЕСУ ОКОЛО ДЕРЕВУШКИ ДРИМАУТ БЫЛИ НАЙДЕНЫ ТОМАС КЛЕЙФЕЛ И ЭЛЛИ МЕНБРАУН",FW,test,Markus,t,t,f,t,t,R.raw.classic_horror1);
        chooseScene2[6] = new ChooseScene(7,"КАК ПОКАЗАЛО ВСКРЫТИЕ, МОЛОДЫЕ ЛЮДИ ПОГИБЛИ ПРИ ЗАГАДОЧНЫХ ОБСТОЯТЕЛЬСТВАХ: НЕ ЯДА, НЕ ТЕЛЕСНЫХ ПОВРЕЖДЕНИЙ У ОБОИХ НЕТ, САМИ ОНИ БЫЛИ НАЙДЕНЫ В ЧАЩЕ ЛЕСА, РАССЛЕДОВАНИЕ ПРОДОЛЖАЕТСЯ...",FW,test,Markus,t,t,f,t,t,R.raw.classic_horror1);
        chooseScene2[7] = new ChooseScene(8,"Плохая концовка № 2: Поворот не туда...",Black,test,Markus,t,t,f,f,t,R.raw.classic_horror1);
        chooseScene2[8] = new ChooseScene(9, "Исправь ошибки...",Black,test,Markus,f,f,f,f,f,R.raw.classic_horror1);

        scenes[0] = new MainScene(1,getString(R.string.GameText1),forest,test, Markus,t,f,f,t,t,1);
        scenes[1] = new MainScene(2,"И теперь попробуйте прокрутить текст, когда он будет помешаться в поле текста.",forest,test,Markus,f,f,f,t,t,1);
        scenes[2] = new MainScene(3,"Элли : И ты думаешь он нам заплатит за эту работу?",forest, test, Markus,t,f,f,t,t,R.raw.forest);
        scenes[3] = new MainScene(4,"Томас : Ты сама вызвалась, плюс этот засранец перестал уже кому-либо платить.",forest, test, Markus,f,t,f,t,t,R.raw.forest);
        scenes[4] = new MainScene(5,"Элли : Тогда ты зачем со мной поперся?", forest, test, Markus,t,t,f,t,t,R.raw.forest);
        scenes[5] = new MainScene(6,"Томас : Не хотел бросать тебя одну, ты же все таки моя подруга.", forest, test, Markus,t,t,f,t,t,R.raw.forest);
        scenes[6] = new MainScene(7,"Элли : Угу, подруга, месяц работаем, и уже подруга.", forest, test, Markus,t,t,f,t,t,R.raw.forest);
        scenes[7] = new MainScene(8,"Томас : Ну ты вообще со всеми остальными сотрудниками держишься особняком, я даже не знаю, как мне удалось тебя разговорить месяц назад.", forest, test, Markus,t,t,f,t,t,R.raw.clean_soul);
        scenes[8] = new MainScene(9,"А ведь тогда она не казалось мне такой букой...", forest, test, Markus,f,t,f,t,t,R.raw.clean_soul);
        scenes[9] = new MainScene(10,"Элли : И вообще, я хотела одна пойти.", forest, test, Markus,t,f,f,t,t,R.raw.clean_soul);
        scenes[10] = new MainScene(11,"Томас: Тогда почему сразу мне не сказала?!", forest, test, Markus,t,t,f,t,t,R.raw.clean_soul);
        scenes[11] = new MainScene(12,"Всю остальную дорогу мы молчали, хотя я заметил в ее походке что то странное, но спрашивать не хотелось", forest, test, Markus,f,f,f,t,t,R.raw.clean_soul);
        scenes[12] = new MainScene(13,"Дойдя до развилки, Элли предложила мне выбрать путь", FW, test, Markus,f,f,f,t,t,R.raw.floating_cities);
        scenes[13] = new MainScene(14,"Если пойти ВПЕРЕД - то за пять минут мы доберемся до ЗАМКА", FW, test, Markus,f,f,f,t,t,R.raw.floating_cities);
        scenes[14] = new MainScene(15,"Хотя еще из далека меня пугал вид замка, я думал свернуть и ПОБРЕСТИ ОТСЮДА(1), или пойти НАПРАВО, в деревню(2)", FW, test, Markus,f,f,f,t,t,R.raw.floating_cities);
        scenes[15] = new MainScene(16,"Элли : Ну решай, холодно стоять на месте.", FW, test, Markus,t,f,t,t,t,R.raw.floating_cities);

        scenes[16] = new MainScene(17,"Томас : Я думаю нам не стоит забывать о задании, хоть и место страшноватое.", FW, test, Markus,t,t,f,t,t,R.raw.thunder_dreams);
        scenes[17] = new MainScene(18,"Элли промолчала, но я почуствовал, что и она побаивается этого места.", forest, test, Markus,t,f,f,t,t,R.raw.thunder_dreams);
        scenes[18] = new MainScene(19,"Томас : Все окей?", forest, test, Markus,f,t,f,t,t,R.raw.thunder_dreams);
        scenes[19] = new MainScene(20,"Элли : Почему то, моя интуиция, как Паучий сенсор, требует отсюда свалить и как можно дальше", forest, test, Markus,t,f,f,t,t,R.raw.thunder_dreams);
        scenes[20] = new MainScene(21,"Томас: Мне тоже это место не нравится.", forest, test, Markus,f,t,f,t,t,R.raw.thunder_dreams);
        scenes[21] = new MainScene(22,"Элли: Ну раз мы в такой (цензурное слово, но не очень хорошее), расскажи о себе.", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[22] = new MainScene(23,"Томас : Слушай, значит она должна молчать и не говорить про себя, а я давай автобиографию делай?!", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[23] = new MainScene(24,"Элли : ...", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[24] = new MainScene(25,"Томас : Ладно, но ты и так большую часть знаешь.", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[25] = new MainScene(26,"Элли : Рассказывай уже, (примерно такое же слово, как и было выше)", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[26] = new MainScene(27,"Томас : В общем, я родился в одной захудалой дере...", forest, test, Markus,f,t,f,t,t,R.raw.easy_lemon);
        scenes[27] = new MainScene(28,"Элли : НЕ ТАК КОНКРЕТНО!", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[28] = new MainScene(29,"Томас : Эй, ну давай на собственном примере расскажи, как надо!", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[29] = new MainScene(30,"Элли : Окей", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[30] = new MainScene(31,"Элли : Как ты знаешь...", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[31] = new MainScene(32,"Томас : Как я знаю!", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[32] = new MainScene(33,"Элли : Заткнись, Томас. Так вот, я училась Техническом Университете Таунстоуна...", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[33] = new MainScene(34,"Томас : Ты училась ТУТ? :D", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[34] = new MainScene(35,"Элли : ТООООМАС!", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[35] = new MainScene(36,"Томас : Да ладно, я стебусь. Так почему ты училась на техническом? Ты здесь, а значит должна иметь образования для работы геолога, или на крайняк археолога.", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[36] = new MainScene(37,"Элли : Я поняла, что программистом работать скучно, да и платят по некоторым мало (а иногда совсем ничего), поэтому решила получить второе образование в Гуманитарном Елгавском Институте.", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[37] = new MainScene(38,"Томас : Я даже не знаю, шутить или нет.", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[38] = new MainScene(39,"Элли : После этого я пошла на день открытых дверей в организацию, в которой мы сейчас работаем...", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[39] = new MainScene(40,"Томас : А дальше я знаю, ты стояла одна, попивала свой кофе, и пыталась рассмотреть за огромной толпы будущих работников наших типо иследований.", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[40] = new MainScene(41,"Элли : Твоя очередь!", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[41] = new MainScene(42,"Томас : Окей, я тоже учился сначала не на геолога, сюда меня пригнали родаки лет 10 назад... И получить здесь хоть какую то работу...", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[42] = new MainScene(43,"Элли : Было трудно?", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[43] = new MainScene(44,"Томас : Просто невероятно трудно.", forest, test, Markus,t,t,f,t,t,R.raw.easy_lemon);
        scenes[44] = new MainScene(45,"Элли : О, мы дошли.", castle, test, Markus,t,f,f,t,t,R.raw.forest);
        scenes[45] = new MainScene(46,"В замке горел свет, хотя нам говорили, что замок пустует уже давно.", castle, test, Markus,f,f,f,t,t,R.raw.forest);
        scenes[46] = new MainScene(47,"На фонаре мы заметили шарф. Забрать его или нет? (1)ДА (2)НЕТ", castle, test, Markus,f,f,t,f,f,R.raw.forest);

        scenes[47] = new MainScene(48,"Я пропустил Элли вперед, и зашел за ней в ворота замка.", way, test, Markus,f,f,f,t,t,R.raw.floating_cities);
        scenes[48] = new MainScene(49,"Коридор, по которому мы шли, был достаточно светлый.", way, test, Markus,f,f,f,t,t,R.raw.floating_cities);
        scenes[49] = new MainScene(50,"Элли: Ну и что нам нужно проверить?", way, test, Markus,t,f,f,t,t,R.raw.floating_cities);
        scenes[50] = new MainScene(51,"Томас: Говорили, что нас должны были встретить местные и рассказать, что к чему.", way, test, Markus,f,t,f,t,t,R.raw.floating_cities);
        scenes[51] = new MainScene(52,"Элли: И где они? Или: Где они должны были нас встретить?!", way, test, Markus,t,t,f,t,t,R.raw.floating_cities);

        scenes[52] = new MainScene(53,"Томас: Слушай, это дверь приоткрыта, проверим?", door,test,Markus,f,t,f,t,t,R.raw.suspens);
        scenes[53] = new MainScene(54,"Элли: И с какой стати мы должны туда идти? Что мы там мы найдем? Давай просто пойдем обратно?", door,test,Markus,t,t,f,t,t,R.raw.suspens);
        scenes[54] = new MainScene(55,"Томас: Да давай заглянем, хуже не будет?", door,test,Markus,t,t,f,t,t,R.raw.suspens);
        scenes[55] = new MainScene(56,"Элли(про себя): А потом нас убьет неведомая ...", door,test,Markus,t,f,f,t,t,R.raw.suspens);
        scenes[56] = new MainScene(57,"Томас: Ты что то говоришь?", door,test,Markus,t,t,f,t,t,R.raw.suspens);
        scenes[57] = new MainScene(58,"Элли: Да нет, я так,про себя. Так мы заходим или нет? ДА(1) НЕТ(2)", door,test,Markus,t,t,t,f,f,R.raw.suspens);
        scenes[58] = new MainScene(59,"Томас: Я все равно туда пойду вне зависимости от моего состояния: внутреннего или внешнего.",door,test,Markus,t,t,f,t,t,R.raw.suspens);

        scenes[59] = new MainScene(60,"Зайдя внутрь комнаты, я заметил, что часть вещей было раскидано по полу, а в левом углу стояло три клетки...",cage,test,Markus,f,f,f,t,t,R.raw.suspens);
        scenes[60] = new MainScene(61,"Томас(с ужасом): Что это? Кто это?",cage,test,Markus,f,t,f,t,t,R.raw.suspens);

        scenes[61] = new MainScene(62,"Элли: Включи фонарик",cage,test,Markus,t,f,f,t,t,R.raw.suspens);
        scenes[62] = new MainScene(63,"Я незамедлительно выполнил сказанное",cagelight,test,Markus,f,f,f,t,t,R.raw.suspens);
        scenes[63] = new MainScene(64,"Томас: ТВОЮ МАТЬ!",cagelight,test,Markus,f,t,f,t,t,R.raw.suspens);
        scenes[64] = new MainScene(65,"Резко, Элли достала пистолет из кобуры и навела его на монстра в второй клетке.",cagelight,test,Markus,t,f,f,t,t,R.raw.suspens);
        scenes[65] = new MainScene(66,"Дать ей выстрелить?! Да(1) Нет(2)",cagelight,test,Markus,t,t,t,t,f,R.raw.suspens);
        scenes[66] = new MainScene(67,"Стреляй!",Black,test,Markus,f,f,f,f,t,R.raw.thunder_dreams);
        scenes[67] = new MainScene(68,"Прогремел выстрел, и монстр упал.",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[68] = new MainScene(69,"Но не на это я смотрел...",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[69] = new MainScene(70,"...а на устройство в другой части комнаты",com,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[70] = new MainScene(71,"Меня потянуло к нему. Я включил его и мои пальцы начали набирать какую-то комбинацию. Моим телом кто-то или что-то контролировало!",com,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[71] = new MainScene(72,"Элли заметила мое неадекватное поведение, и пыталась меня отрвать от монитора, но это бы безполезно...",comlight,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[72] = new MainScene(73,"И тут меня окутал мрак, я ничего не понимал, и единственное, что я мог слышать, так это голос Элли, зовущий меня куда-то.",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[73] = new MainScene(74,"...",Black,test,flange,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[74] = new MainScene(75,"Элли: Томас!",Black,test,Markus,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[75] = new MainScene(76,"???: Томаса уже нет...",Black,test,flange,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[76] = new MainScene(77,"Элли: Кто ты?!",Black,test,flange,f,f,f,t,t,R.raw.thunder_dreams);
        scenes[77] = new MainScene(78,"Флендж: Я - Флендж, сфера Кошмаров и Снов в одном флаконе, мне пришлось забрать душу Томаса, дабы появится самим.",Black,test,flange,t,t,f,t,t,R.raw.thunder_dreams);
        scenes[78] = new MainScene(79,"Элли: Зачем?!",Black,test,flange,t,t,f,t,t,R.raw.thunder_dreams);
        scenes[79] = new MainScene(80,"Флендж: Чтобы существовать. А теперь беги, пока я не прередумал, и не высосал твою душу",Black,test,flange,t,t,f,t,t,R.raw.thunder_dreams);
        scenes[80] = new MainScene(81,"...",Black,test,flange,f,f,f,t,t,1);
        scenes[81] = new MainScene(82,"Элли: Бежать! Но куда? Точно, поворот в деревню, туда и пойду.",FW,test,flange,f,f,f,t,t,R.raw.forest);
        scenes[82] = new MainScene(83,"Конец пролога. Продолжение следует... через 20 лет.",Black,test,flange,f,f,f,t,t,R.raw.forest);
        scenes[83] = new MainScene(84,"...",Black,test,flange,f,f,f,f,f,R.raw.forest);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (VIV2) {
                    if (current >= 65) {
                        if (Sharf) {
                           GoScena(scenes[66]);
                        }
                        else {
                            GoScenas_forButtonOne(Shot,ShotCounter);
                            ShotCounter++;
                            if (ShotCounter == Shot.length){
                                GoScena(scenes[45]);
                                current = 45;
                            }
                        }
                    }
                }

                if(VIV) {
                    if (current >= 57) {
                        GoScenas(scenes, current);
                        current++;
                        VIV = f;
                        VIV2 = t;
                    }
                }

                if (SharfChoise==f){
                 GoScenas_forButtonOne(Sharf1,SharfCounter);
                    SharfCounter++;
                }
                if (SharfCounter == 4){
                    SharfCounter = 0;
                    SharfChoise = t;
                    GoScena(scenes[47]);
                    Sharf = t;
                }
                if(OneDeath){OneOneDeath = t;}

                if (WhichChoise) {
                    GoScenas_forButtonOne(chooseScene1, ChScena1);
                    ChScena1++;
                }

                if (ChScena1 > 11) {
                    if (OneDeath == f) {
                        WhichChoise = f;
                        GoScenas_forButtonOne(FromDeath, FDcounter);
                        FDcounter++;
                    }
                    else {
                        current = 0;
                        ChScena1 = 0;
                        FDcounter = 0;
                        GoScenas(scenes, current);
                    }
                }

                if (FDcounter > 4) {
                        current = 0;
                        ChScena1 = 0;
                        OneDeath = t;
                        GoScenas(scenes, current);

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (VIV2){
                    if (current >= 65){
                        if (Sharf) {
                            GoScenas_forButtonTwo(RedOut,RedOutCounter);
                            RedOutCounter++;
                            if (RedOutCounter == RedOut.length){
                                GoScena(scenes[45]);
                                current = 45;
                            }
                        }
                        else {
                            GoScenas_forButtonTwo(Ending, EndingCounter);
                            EndingCounter++;
                            if (EndingCounter == Ending.length){
                                startActivity(GoHomeBaby);
                            }
                        }

                    }
                }

                if(VIV) {
                    if (current >= 56) {
                        GoScena(scenes[58]);
                        VIV = f;
                        VIV2= t;
                    }
                }

                if (SharfChoise==f){
                    GoScenas_forButtonTwo(Sharf2, SharfCounter);
                    SharfCounter++;
                }
                if (SharfCounter == 4){
                    GoScena(scenes[47]);
                    SharfCounter = 0;
                    SharfChoise = t;
                    Sharf = f;
                }

                if (TwoDeath) {
                    Masochism = t;
                }

                if (Masochism){
                    if(FDcounter < 10){
                        GoScena(FromDeath[10]);
                        FDcounter = FDcounter + 10;
                    }
                    GoScenas_forButtonTwo(FromDeath, FDcounter);
                    FDcounter++;
                    if(FDcounter > 11){startActivity(GoHomeBaby);}
                }


                if (WhichChoise) {
                    GoScenas_forButtonTwo(chooseScene2, ChScena2);
                    ChScena2++;
                }

                if (ChScena2 > 8) {
                    if (TwoDeath == f) {
                        if (FDcounter < 5) {
                            GoScena(FromDeath[5]);
                            FDcounter = FDcounter + 5;
                        }
                        WhichChoise = f;
                        GoScenas_forButtonTwo(FromDeath, FDcounter);
                        FDcounter++;
                        }
                    else {
                        current = 0;
                        ChScena2 = 0;
                        FDcounter = 0;
                        GoScenas(scenes, current);
                    }
                }



                if (FDcounter > 9) {
                    if (TwoDeath == f) {
                        current = 0;
                        ChScena1 = 0;
                        TwoDeath = t;
                        GoScenas(scenes, current);
                    }
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (current == 83){
                    startActivity(GoHomeBaby);
                }

                if(current==scenes.length){
                    Toast.makeText(getApplication(), "Это последняя сцена, перезапускай игру!", Toast.LENGTH_SHORT).show();
                    return;}
                if (current > 16){WhichChoise=f;}else {WhichChoise=t;}
                FDcounter = 0;
                GoScenas(scenes,current);
                current++;

            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(current<=1){
                    Toast.makeText(getApplication(), "Это первая сцена.", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    current--;
                    GoScenas(scenes,current);
                }
            }
        });
    }

    @Override protected void onPause() {
        super.onPause();
        AllStop();
    }
}

