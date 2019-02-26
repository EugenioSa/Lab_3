package mx.tec.lab_3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        AlertDialog.Builder Dialogconf = new AlertDialog.Builder(this);




        Dialogconf.setTitle("Regular menus");
        Dialogconf.setMessage("ARE YOU SURE?");
        Dialogconf.setIcon(R.mipmap.ic_launcher);

        Dialogconf.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Context context;
                context = getApplicationContext();

                Toast MyToast = new Toast(context);

                MyToast.makeText(context,"SUP BRO",Toast.LENGTH_LONG).show();
            }


        });

        Dialogconf.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }


        });

        AlertDialog MyDialog = Dialogconf.create();
        MyDialog.show();

    }

}
