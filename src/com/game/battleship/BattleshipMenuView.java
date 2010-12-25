package com.game.battleship;

import org.xmlpull.v1.XmlPullParser;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class BattleshipMenuView extends LinearLayout  {

	private Activity myActivity;

	public BattleshipMenuView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		
        /* Load in the layout file for the main menu */
		LayoutInflater layoutInflater =
			      (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
		View view=layoutInflater.inflate(R.layout.main_menu_layout,this);
		
	    LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT); 
				   
	     
	}
	
	public void setActivity(Activity a) {
		myActivity = a;
	}
}
