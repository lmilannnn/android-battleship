package com.game.battleship;

import org.xmlpull.v1.XmlPullParser;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;


public class BattleshipGameView extends View {

	private Context myContext;
	
	public BattleshipGameView(Context context) {
		super(context);
		
		myContext = context;
		// TODO Auto-generated constructor stub
			
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
		Log.d("DEBUG_PRINT", "GOT TO onDraw");
		
		super.onDraw(canvas);
		
    	Paint paint = new Paint();
    	paint.setAntiAlias(true);
    	paint.setStrokeWidth(3);

    	paint.setColor(Color.rgb(15, 99, 110));
    	
    	canvas.drawLine(50, 50, 50, 150, paint);
	}

}
