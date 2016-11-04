package andyciu.minesweeper20161104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ImageView.OnClickListener, ImageView.OnLongClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=1;i<10;i++){
            String str1="imageView"+i;
            int resID=getResources().getIdentifier(str1,"id",getPackageName());
            ImageView iva= (ImageView) findViewById(resID);
            iva.setOnClickListener(this);
            iva.setOnLongClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        ImageView ivi= (ImageView) findViewById(v.getId());
        ivi.setImageResource(android.R.drawable.checkbox_on_background);
    }

    @Override
    public boolean onLongClick(View v) {
        ImageView ivi= (ImageView) findViewById(v.getId());
        ivi.setImageResource(android.R.drawable.btn_dialog);
        return true;
    }
}
