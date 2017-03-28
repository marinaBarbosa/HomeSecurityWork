package com.example.marin.homesecuritywork;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class register_server_manually extends Activity {

    TextView textResponse;
    EditText addressManually, portManually;
    Button buttonConnect,buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_server_manually);

        addressManually = (EditText)findViewById(R.id.addressm);
        portManually = (EditText)findViewById(R.id.portm);
        buttonConnect = (Button)findViewById(R.id.btnAuto);
        buttonClear = (Button)findViewById(R.id.clear);
        textResponse = (TextView)findViewById(R.id.textResponse);

        buttonConnect.setOnClickListener(buttonConnectOnClickListener);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResponse.setText("");
            }
        });
    }

    OnClickListener buttonConnectOnClickListener =
            new OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyClientTask myClientTask = new MyClientTask(
                            addressManually.getText().toString(), Integer.parseInt(portManually.getText().toString()));
                            myClientTask.execute();
                }};

        public class MyClientTask extends AsyncTask <Void, Void, Void> {
            String dstAddress;
            int dstPort;
            String response;

            MyClientTask(String addr, int port ) {
                dstAddress = addr;
                dstPort = port;
            }

            protected Void doInBackground(Void... arg0) {
                try {
                    Socket socket = new Socket(dstAddress,dstPort);
                    InputStream inputStream = socket.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = inputStream.read(buffer)) != -1){
                        byteArrayOutputStream.write(buffer, 0, bytesRead);
                    }

                    socket.close();
                    response = byteArrayOutputStream.toString("UTF-8");

                } catch (UnknownHostException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                textResponse.setText(response);
                super.onPostExecute(result);
            }
                }


}
