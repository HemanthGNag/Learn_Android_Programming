package ayrat.salavatovich.gmail.com.day_18.simplepaint;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new Draw2D(getApplicationContext()));
	}

}
