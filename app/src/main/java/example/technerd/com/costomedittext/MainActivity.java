package example.technerd.com.costomedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etFirstName;
    AutoCompleteTextView etEmail;
    AutoCompleteTextView etCountry;
    EditText etLastName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName=(AutoCompleteTextView) findViewById(R.id.etFirstName);
        String [] names = {"Kamau" ,"Kimani" ,"Kamaunu","Karuiki", "Kamakia"};
        ArrayAdapter<String> adapter
               =  new ArrayAdapter<String>
               (this, R.layout.costom_design_autocomplete, names);
        etFirstName.setThreshold(1);
        etFirstName.setAdapter(adapter);

        etEmail=(AutoCompleteTextView) findViewById(R.id.etEmail);
        String [] emails = {"gmail.com" ,"yahoo.com" ,"hotmail.com","probox.com", "office.com"};
        ArrayAdapter<String> a
                =  new ArrayAdapter<String>
                (this, R.layout.costom_design_autocomplete, emails);

        etEmail.setThreshold(10);
        etEmail.setAdapter(a);


        etCountry=(AutoCompleteTextView) findViewById(R.id.etCountry);
        String [] countries = {"Kenya" ,"Kazighstan" ,"Kwale","Kibo", "Kesha"};
        ArrayAdapter<String> adapters
                =  new ArrayAdapter<String>
                (this, R.layout.costom_design_autocomplete, countries);
        etFirstName.setThreshold(1);
        etFirstName.setAdapter(adapters);
    }
}
