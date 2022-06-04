package sg.edu.np.mad.week2madprac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageButton img = findViewById(R.id.img);

        // Setting number to be sent to MainActivity
        int number = new Random().nextInt(10000000 - 0);
        String numberText = String.valueOf(number);

        // Creating Alert Dialog
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder build1 = new AlertDialog.Builder(ListActivity.this);
                build1.setTitle("Profile");
                build1.setTitle("MADness");
                build1.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ListActivity.this, MainActivity.class);
                        intent.putExtra(Intent.EXTRA_TEXT, numberText);
                        startActivity(intent);
                    }
                });
                build1.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert1 = build1.create();
                alert1.show();
            }
        });

        // Creating 20 new User objects
        User user1 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user2 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user3 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user4 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user5 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user6 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user7 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user8 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user9 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user10 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user11 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user12 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user13 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user14 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user15 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user16 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user17 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user18 = new User( "Name" + numberText, "Description" + numberText, number, true);
        User user19 = new User( "Name" + numberText, "Description" + numberText, number, false);
        User user20 = new User( "Name" + numberText, "Description" + numberText, number, true);
    }
}