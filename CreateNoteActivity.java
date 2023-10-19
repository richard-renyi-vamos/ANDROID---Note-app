import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateNoteActivity extends AppCompatActivity {
    private EditText noteEditText;
    private Button saveNoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        noteEditText = findViewById(R.id.noteEditText);
        saveNoteButton = findViewById(R.id.saveNoteButton);

        saveNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the text from the EditText
                String noteText = noteEditText.getText().toString();

                // Save the note to a database or file
                // You would need to implement database/file handling here

                // Show a message to confirm the note is saved
                Toast.makeText(CreateNoteActivity.this, "Note saved!", Toast.LENGTH_SHORT).show();

                // Close this activity
                finish();
            }
        });
    }
}
