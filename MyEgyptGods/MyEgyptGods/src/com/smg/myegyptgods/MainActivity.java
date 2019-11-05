package com.smg.myegyptgods;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;


public class MainActivity extends Activity {

    ImageView egyptGodImage;
    TextView godName;
    int colorValue = 0;
    int monthValue = 0;
    String[] egyptGodname;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        
        egyptGodImage = (ImageView) findViewById(R.id.imageEgyptGods);
        godName = (TextView) findViewById(R.id.godName);
        NumberPicker color_picker = (NumberPicker) findViewById(R.id.colorPicker);
        NumberPicker month_picker = (NumberPicker) findViewById(R.id.monthPicker);

        color_picker.setDisplayedValues(getResources().getStringArray(R.array.rainbow_color));
        color_picker.setMinValue(0);
        color_picker.setMaxValue(6);
        color_picker.setWrapSelectorWheel(true);

        month_picker.setDisplayedValues(getResources().getStringArray(R.array.month));
        month_picker.setMinValue(0);
        month_picker.setMaxValue(11);
        month_picker.setWrapSelectorWheel(true);
        
        egyptGodname = getResources().getStringArray(R.array.egyptgodname);

        color_picker
        .setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldVal,
                                      int newColor) {
                colorValue = newColor;
                // Select color
                switch (newColor) {
                    case 0:
                        godName.setText(egyptGodname[12]);
                        egyptGodImage.setImageResource(R.drawable.osiris_04);
                        break;
                    case 1:
                    	godName.setText(egyptGodname[13]);
                    	egyptGodImage.setImageResource(R.drawable.ptah_06);
                    	break;
                    case 2:
                    	godName.setText(egyptGodname[14]);
                    	egyptGodImage.setImageResource(R.drawable.ra_09);
                        break;
                    case 3:
                    	godName.setText(egyptGodname[15]);
                    	egyptGodImage.setImageResource(R.drawable.sekhmet_10);
                        break;
                    case 4:
                    	godName.setText(egyptGodname[16]);
                    	egyptGodImage.setImageResource(R.drawable.selkis_12);
                        break;
                    case 5:
                    	godName.setText(egyptGodname[17]);
                    	egyptGodImage.setImageResource(R.drawable.sobek_19);
                        break;
                    case 6:
                    	godName.setText(egyptGodname[18]);
                    	egyptGodImage.setImageResource(R.drawable.thoth_13);
                        break;
                }// switch
            }// onValueChanged
        });// Listener            	
        
        
        month_picker
        .setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldVal,
                                      int newMonth) {
                monthValue = newMonth;
                // Select month
                switch (newMonth) {
                    case 0:
                        godName.setText(egyptGodname[0]);
                        egyptGodImage.setImageResource(R.drawable.amum_11);
                        break;
                    case 1:
                    	godName.setText(egyptGodname[1]);
                    	egyptGodImage.setImageResource(R.drawable.anubis_08);
                        break;
                    case 2:
                    	godName.setText(egyptGodname[2]);
                    	egyptGodImage.setImageResource(R.drawable.atum_15);
                        break;
                    case 3:
                    	godName.setText(egyptGodname[3]);
                    	egyptGodImage.setImageResource(R.drawable.hathor_01);
                        break;
                    case 4:
                    	godName.setText(egyptGodname[4]);
                    	egyptGodImage.setImageResource(R.drawable.horus_05);
                        break;
                    case 5:
                    	godName.setText(egyptGodname[5]);
                    	egyptGodImage.setImageResource(R.drawable.isis_17);
                        break;
                    case 6:
                    	godName.setText(egyptGodname[6]);
                    	egyptGodImage.setImageResource(R.drawable.khnum_03);
                        break;
                    case 7:
                    	godName.setText(egyptGodname[7]);
                    	egyptGodImage.setImageResource(R.drawable.khonsu_14);
                        break;
                    case 8:
                    	godName.setText(egyptGodname[8]);
                    	egyptGodImage.setImageResource(R.drawable.maat_02);
                        break;
                    case 9:
                    	godName.setText(egyptGodname[9]);
                    	egyptGodImage.setImageResource(R.drawable.min_16);
                        break;
                    case 10:
                    	godName.setText(egyptGodname[10]);
                    	egyptGodImage.setImageResource(R.drawable.mut_07);
                        break;
                    case 11:
                    	godName.setText(egyptGodname[11]);
                    	egyptGodImage.setImageResource(R.drawable.nephthys_18);
                        break;
                }// switch
            }// onValueChanged
        });// Listener
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
