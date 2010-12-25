package com.game.battleship;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class Battleship extends Activity implements OnClickListener {
	
	static final int NumberOfViews = 2;
	static final int MainMenuView = 0;
	static final int GameView = 1;
	
	/* Initialize the current view to the main menu */
	int currentView = MainMenuView;
	
	View[] allViews;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /* Create views, main menu, the game, etc */
        allViews = new View[NumberOfViews];
        
        allViews[MainMenuView] = new BattleshipMenuView(this.getApplicationContext());
        allViews[GameView] = new BattleshipGameView(this.getApplicationContext());                

        /* Set up the button listeners */
        allViews[MainMenuView].findViewById(R.id.QuitButton).setOnClickListener(this);
        allViews[MainMenuView].findViewById(R.id.PlaySingleButton).setOnClickListener(this);
    	
        /* set the activity for the main menu view, so that the view can kill the activity or change the current view */
        ((BattleshipMenuView) allViews[MainMenuView]).setActivity(this);
    
        /* Display the current view */
        setContentView(allViews[currentView]);
        allViews[currentView].setFocusable(true);
        allViews[currentView].setFocusableInTouchMode(true);
        allViews[currentView].invalidate();
    }
    
    public void ChangeCurrentView(int viewID) {
    	currentView = viewID;
    	setContentView(allViews[currentView]);
        allViews[currentView].setFocusable(true);
        allViews[currentView].setFocusableInTouchMode(true);
        allViews[currentView].invalidate();
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.d("DEBUG_PRINT", "GOT TO ONCLICK!");
		if(v.getId() == R.id.QuitButton)
		{
			this.finish();
		}
		if(v.getId() == R.id.PlaySingleButton)
		{
			this.ChangeCurrentView(Battleship.GameView);
		}
		
	}
}
