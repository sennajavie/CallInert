package magdalena.pl.callmistake.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import magdalena.pl.callmistake.model.Person;
import magdalena.pl.callmistake.R;

public class Stage3Activity extends AppCompatActivity {


    @BindView(R.id.emailTextView)
    TextView emailTextView;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3);
        ButterKnife.bind(this);

        person = getIntent().getParcelableExtra("person");

        emailTextView.setText(person.getEmail());
    }

    @OnClick(R.id.buttonNextButton)
    public void onClick() {

    }
}