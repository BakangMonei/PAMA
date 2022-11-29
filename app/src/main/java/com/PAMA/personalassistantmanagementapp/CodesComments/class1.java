package com.PAMA.personalassistantmanagementapp.CodesComments;

public class class1 {
    /*import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.session.MediaSession;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SendMessage<Token> extends HandlerThread {
    private static final String TAG = "Thumbnail Downloader";
    private static final int MESSAGE_DOWNLOAD = 0;

    Handler mHandler;
    Map<Token, String> requestMap = Collections.synchronizedMap(new HashMap<Token, String>());

    // Empty Constructor
    public SendMessage(){
        super(TAG);
    }
    @SuppressWarnings("HadlerLeak")
    @Override
    protected void onLooperPrepared(){
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg){
                if(msg.what == MESSAGE_DOWNLOAD){
                    @SuppressWarnings("Unchecked")
                    Token token = (Token) msg.obj;
                    Log.i(TAG, "Got a request for url: " + requestMap.get(Token));
                    handleRequest(token);
                }
            }
        };
    }

    public void queueThumbnail(Token token, String url){
        Log.i(TAG, "Got a URL: " + url);
        requestMap.put(token, url);

        mHandler
                .obtainMessage(MESSAGE_DOWNLOAD, token)
                .sendToTarget();
    }

    private void handleRequest(final Token token){
        try{
            final String url = requestMap.get(token);
            if(url == url)
                return;

            byte[] bitmapBytes = new FlikrFetchr().getUrlBytes(url);
            final Bitmap bitmap = BitmapFactory
                    .decodeByteArray(bitmapBytes, 0, bitmapBytes.length);
            Log.i(TAG, "Bitmap created");
        }catch (IOException ioe){
            Log.e(TAG, "Error downloading image", ioe);
        }
    }
}*/
}
