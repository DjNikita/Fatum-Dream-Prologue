package com.example.fatumdream.Scenes;

        import android.graphics.Picture;
        import android.graphics.drawable.Drawable;
        import android.widget.ImageView;
        import android.view.View;
        import android.widget.TextView;

        import com.example.fatumdream.Activity.GameActivity;
        import com.example.fatumdream.Activity.MainActivity;

/**
 * Created by Никита Ирюпин on 06.02.2016.
 */
public class MainScene {
    public int number;
    public String text;
    public int Back;
    public int Picture1;
    public int Picture2;
    public boolean vis_hero;
    public boolean vis_hero2;
    public boolean visbts;
    public boolean visbt;
    public boolean visback;
    public int music;



    public MainScene(int number, String text, int Back, int Picture1, int Picture2, boolean vis_hero, boolean vis_hero2, boolean visbts, boolean visback, boolean visbt, int music) {
        this.number = number;
        this.text = text;
        this.Picture1 = Picture1;
        this.Picture2 = Picture2;
        this.Back = Back;
        this.vis_hero = vis_hero;
        this.vis_hero2 = vis_hero2;
        this.visbts = visbts;
        this.visbt = visbt;
        this.visback = visback;
        this.music = music;

    }


    static public MainScene GoTo(MainScene[] mainScene,int number){
        return mainScene[number - 1];
    }

}