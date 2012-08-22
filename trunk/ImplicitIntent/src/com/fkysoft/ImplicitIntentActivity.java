package com.fkysoft;

import java.util.Calendar;
import java.util.List;

import org.apache.http.protocol.HTTP;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImplicitIntentActivity extends Activity {
    /** Called when the activity is first created. */
	Intent intent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //get all button
        Button btnCallNumber = (Button)findViewById(R.id.btnCallNumber);
        Button btnViewMap = (Button)findViewById(R.id.btnViewMap);
        Button btnViewWebPage = (Button)findViewById(R.id.btnViewWebPage);
        Button btnSendEmail = (Button)findViewById(R.id.btnSendEmail);
        Button btnCreateCalendarEvent = (Button)findViewById(R.id.btnCreateCalendarEvent);
        
        //process event for button
        btnCallNumber.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//call into number: 0987654321
		        intent = callNumber("0987654321");
		        startIntent(intent);
			}
		});
        btnViewMap.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//view a map point based on address:
		        intent = viewMap("0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
		        startIntent(intent);
			}
		});
        btnViewWebPage.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//View a web page
		        intent = viewWebPage("http://www.android.com");
		        startIntent(intent);
			}
		});
        btnSendEmail.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//Send an email with an attachment
		        intent = sendEmail(new String[] {"n.d.thang1987@gmail.com"}, "Email subject", 
		        					"Email message text", Uri.parse("content://path/to/email/attachment"));
		        startIntent(intent);
			}
		});
        btnCreateCalendarEvent.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//Create a calendar event
		        //Calendar beginTime = Calendar.getInstance().set(2012, 0, 19, 7, 30).get;
		  		//Calendar endTime = Calendar.getInstance().set(2012, 0, 19, 10, 30);
		        //createCalendarEvent(beginTime, endTime, "Event title", "Event location");
		        startIntent(null);
			}
		});
    }
    
    public void startIntent(Intent intent){
    	PackageManager packageManage = getPackageManager();
        List<ResolveInfo> activities = packageManage.queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;
        if(isIntentSafe) 
        	startActivity(intent);
    }
    
    public Intent callNumber(String number){
    	Uri numberUri = Uri.parse("tel:" + number);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, numberUri);
        return callIntent;
    }
    
    public Intent viewMap(String address){    	 
        Uri location = Uri.parse("geo:" + address);
        // Or map point based on latitude/longitude
        // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        return mapIntent;
    }
    
    public Intent viewWebPage(String uri){
        Uri webpage = Uri.parse(uri);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        return webIntent;
    }
    
    public Intent sendEmail(String[] recipients, String subject, String emailContent, Uri attachment){
    	Intent emailIntent = new Intent(Intent.ACTION_SEND);
    	
		// The intent does not have a URI, so declare the "text/plain" MIME type
		emailIntent.setType(HTTP.PLAIN_TEXT_TYPE);
		emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients); // recipients
		emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
		emailIntent.putExtra(Intent.EXTRA_TEXT, emailContent);
		emailIntent.putExtra(Intent.EXTRA_STREAM, attachment);
		// You can also attach multiple items by passing an ArrayList of Uris
		
		return emailIntent;
    }
    
    public Intent createCalendarEvent(Calendar beginTime, Calendar endTime, String title, String location){
    	//Intent calendarIntent = new Intent(Intent.ACTION_INSERT, Events.CONTENT_URI);
    	
		//calendarIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis());
		//calendarIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis());
		//calendarIntent.putExtra(Events.TITLE, title);
		//calendarIntent.putExtra(Events.EVENT_LOCATION, location);
    	
    	return null;
    }
}