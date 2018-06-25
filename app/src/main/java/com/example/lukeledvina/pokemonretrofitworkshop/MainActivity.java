package com.example.lukeledvina.pokemonretrofitworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.pokemon_edittext)
    protected EditText pokemonEditText;

    @BindView(R.id.catch_button)
    protected Button catchButton;

    private LyricsFragment lyricsFragment;
    public static final String ARTIST_NAME = "artist_name";
    public static final String SONG_TITLE = "song_title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.catch_button)
    protected void submitClicked() {

        if (pokemonEditText.getText().toString().isEmpty()) {
            //handle if there is mssng input
            Toast.makeText(this, "All fields are required", Toast.LENGTH_LONG).show();

        }else {
            //handle getting info from edittexts and oassing it to the frahmentnt for our api calls
            lyricsFragment = LyricsFragment.newInstance();
            Bundle bundle = new Bundle();
            bundle.putString(ARTIST_NAME, artistName.getText().toString());
            bundle.putString(SONG_TITLE, songTitle.getText().toString());
            lyricsFragment.setArguments(bundle);

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, ).commit();

        }
    }

    @Override
    public void onBackPressed() {
        if (.isVisible()) {
            getSupportFragmentManager().beginTransaction().remove()
                    .commit();

        } else {
        }

        super.onBackPressed();

    }
}
























    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
