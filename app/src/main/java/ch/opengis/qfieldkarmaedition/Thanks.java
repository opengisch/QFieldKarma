package ch.opengis.qfieldkarmaedition;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Thanks extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        //make_link_button(R.id.install_qfield, "https://play.google.com/store/apps/details?id=ch.opengis.qfield");
        make_link_button(R.id.install_qfield, "http://www.opengis.ch/android-gis/qfield/installation/");
        make_link_button(R.id.see_donors, "http://www.opengis.ch/android-gis/qfield/donors/");
        make_link_button(R.id.donate_more, "http://www.opengis.ch/android-gis/qfield/donate-and-sponsor/");
        make_link_button(R.id.contact_us, "mailto:info@opengis.ch?subject=QField%20Karma%20contact");
    }

    private void make_link_button(int resourceId, final String url) {
        Button button;
        // Locate the button in activity_main.xml
        button = (Button) findViewById(resourceId);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.thanks, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}