package sg.edu.np.mad.week2madprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton followbtn = findViewById(R.id.followbtn);
        Button messagebtn = findViewById(R.id.messagebtn);
        TextView iconName = findViewById(R.id.iconName);
        TextView iconDesc = findViewById(R.id.iconDesc);
        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);

        messagebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent navigateToMG = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(navigateToMG);
            }
        });

        // Creating new user from user class

        User newUser = new User("Ernest Tan " + text, "For testing purposes, user class imported.", 12345, false);
        // Syncing followed status
        if (newUser.followed == true){
            followbtn.setText("Unfollow");
            newUser.followed = false;
        }
        else if (newUser.followed == false){
            followbtn.setText("Follow");
            newUser.followed = true;
        }

        // Syncing name and description
        iconName.setText(newUser.name);
        iconDesc.setText(newUser.description);

        // Creating follow functions
        followbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}