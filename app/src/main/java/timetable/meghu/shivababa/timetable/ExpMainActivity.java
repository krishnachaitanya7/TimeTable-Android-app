package timetable.meghu.shivababa.timetable;


import android.app.Activity;
import android.app.AlertDialog;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.view.ViewGroup;
import android.widget.EditText;

import android.widget.TextView;

import android.view.View.OnLongClickListener;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.StringTokenizer;
//import java.util.logging.Handler;
import android.os.Handler;


public class ExpMainActivity extends ActionBarActivity {
    TextView sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10;
    TextView sub11,sub12,sub13,sub14,sub15,sub16,sub17,sub18,sub19,sub20;
    TextView sub21,sub22,sub23,sub24,sub25,sub26,sub27,sub28,sub29,sub30;
    TextView sub31,sub32,sub33,sub34,sub35,sub36,sub37,sub38,sub39,sub40;
    final Context context = this;
    String DEFAULT = "N/A,N/A";
    int[] ids = {R.id.sub1,R.id.sub2,R.id.sub3,R.id.sub4,R.id.sub5,R.id.sub6,R.id.sub7,R.id.sub8,R.id.sub9,R.id.sub10,
            R.id.sub11,R.id.sub12,R.id.sub13,R.id.sub14,R.id.sub15,R.id.sub16,R.id.sub17,R.id.sub18,R.id.sub19,R.id.sub20,
            R.id.sub21,R.id.sub2,R.id.sub23,R.id.sub24,R.id.sub25,R.id.sub26,R.id.sub27,R.id.sub28,R.id.sub29,R.id.sub30,
            R.id.sub31,R.id.sub32,R.id.sub33,R.id.sub34,R.id.sub35,R.id.sub36,R.id.sub37,R.id.sub38,R.id.sub39,R.id.sub40,};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explayout);

        tvinit();



    }

    /**
     * Initiating the text views with onclicklistener and onlongclicklistener
     */


    public void tvinit() {
        SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);



        sub1=(TextView)findViewById(R.id.sub1);
        sub2=(TextView)findViewById(R.id.sub2);
        sub3=(TextView)findViewById(R.id.sub3);
        sub4=(TextView)findViewById(R.id.sub4);
        sub5=(TextView)findViewById(R.id.sub5);
        sub6=(TextView)findViewById(R.id.sub6);
        sub7=(TextView)findViewById(R.id.sub7);
        sub8=(TextView)findViewById(R.id.sub8);
        sub9=(TextView)findViewById(R.id.sub9);
        sub10=(TextView)findViewById(R.id.sub10);
        sub11=(TextView)findViewById(R.id.sub11);
        sub12=(TextView)findViewById(R.id.sub12);
        sub13=(TextView)findViewById(R.id.sub13);
        sub14=(TextView)findViewById(R.id.sub14);
        sub15=(TextView)findViewById(R.id.sub15);
        sub16=(TextView)findViewById(R.id.sub16);
        sub17=(TextView)findViewById(R.id.sub17);
        sub18=(TextView)findViewById(R.id.sub18);
        sub19=(TextView)findViewById(R.id.sub19);
        sub20=(TextView)findViewById(R.id.sub20);
        sub21=(TextView)findViewById(R.id.sub21);
        sub22=(TextView)findViewById(R.id.sub22);
        sub23=(TextView)findViewById(R.id.sub23);
        sub24=(TextView)findViewById(R.id.sub24);
        sub25=(TextView)findViewById(R.id.sub25);
        sub26=(TextView)findViewById(R.id.sub26);
        sub27=(TextView)findViewById(R.id.sub27);
        sub28=(TextView)findViewById(R.id.sub28);
        sub29=(TextView)findViewById(R.id.sub29);
        sub30=(TextView)findViewById(R.id.sub30);
        sub31=(TextView)findViewById(R.id.sub31);
        sub32=(TextView)findViewById(R.id.sub32);
        sub33=(TextView)findViewById(R.id.sub33);
        sub34=(TextView)findViewById(R.id.sub34);
        sub35=(TextView)findViewById(R.id.sub35);
        sub36=(TextView)findViewById(R.id.sub36);
        sub37=(TextView)findViewById(R.id.sub37);
        sub38=(TextView)findViewById(R.id.sub38);
        sub39=(TextView)findViewById(R.id.sub39);
        sub40=(TextView)findViewById(R.id.sub40);


        sub1.setOnClickListener(m);
        sub2.setOnClickListener(m);
        sub3.setOnClickListener(m);
        sub4.setOnClickListener(m);
        sub5.setOnClickListener(m);
        sub6.setOnClickListener(m);
        sub7.setOnClickListener(m);
        sub8.setOnClickListener(m);
        sub9.setOnClickListener(m);
        sub10.setOnClickListener(m);
        sub11.setOnClickListener(m);
        sub12.setOnClickListener(m);
        sub13.setOnClickListener(m);
        sub14.setOnClickListener(m);
        sub15.setOnClickListener(m);
        sub16.setOnClickListener(m);
        sub17.setOnClickListener(m);
        sub18.setOnClickListener(m);
        sub19.setOnClickListener(m);
        sub20.setOnClickListener(m);
        sub21.setOnClickListener(m);
        sub22.setOnClickListener(m);
        sub23.setOnClickListener(m);
        sub24.setOnClickListener(m);
        sub25.setOnClickListener(m);
        sub26.setOnClickListener(m);
        sub27.setOnClickListener(m);
        sub28.setOnClickListener(m);
        sub29.setOnClickListener(m);
        sub30.setOnClickListener(m);
        sub31.setOnClickListener(m);
        sub32.setOnClickListener(m);
        sub33.setOnClickListener(m);
        sub34.setOnClickListener(m);
        sub35.setOnClickListener(m);
        sub36.setOnClickListener(m);
        sub37.setOnClickListener(m);
        sub38.setOnClickListener(m);
        sub39.setOnClickListener(m);
        sub40.setOnClickListener(m);


        sub1.setOnLongClickListener(o);
        sub2.setOnLongClickListener(o);
        sub3.setOnLongClickListener(o);
        sub4.setOnLongClickListener(o);
        sub5.setOnLongClickListener(o);
        sub6.setOnLongClickListener(o);
        sub7.setOnLongClickListener(o);
        sub8.setOnLongClickListener(o);
        sub9.setOnLongClickListener(o);
        sub10.setOnLongClickListener(o);
        sub11.setOnLongClickListener(o);
        sub12.setOnLongClickListener(o);
        sub13.setOnLongClickListener(o);
        sub14.setOnLongClickListener(o);
        sub15.setOnLongClickListener(o);
        sub16.setOnLongClickListener(o);
        sub17.setOnLongClickListener(o);
        sub18.setOnLongClickListener(o);
        sub19.setOnLongClickListener(o);
        sub20.setOnLongClickListener(o);
        sub21.setOnLongClickListener(o);
        sub22.setOnLongClickListener(o);
        sub23.setOnLongClickListener(o);
        sub24.setOnLongClickListener(o);
        sub25.setOnLongClickListener(o);
        sub26.setOnLongClickListener(o);
        sub27.setOnLongClickListener(o);
        sub28.setOnLongClickListener(o);
        sub29.setOnLongClickListener(o);
        sub30.setOnLongClickListener(o);
        sub31.setOnLongClickListener(o);
        sub32.setOnLongClickListener(o);
        sub33.setOnLongClickListener(o);
        sub34.setOnLongClickListener(o);
        sub35.setOnLongClickListener(o);
        sub36.setOnLongClickListener(o);
        sub37.setOnLongClickListener(o);
        sub38.setOnLongClickListener(o);
        sub39.setOnLongClickListener(o);
        sub40.setOnLongClickListener(o);

        sub1.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub1), DEFAULT)));
        sub2.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub2), DEFAULT)));
        sub3.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub3), DEFAULT)));
        sub4.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub4), DEFAULT)));
        sub5.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub5), DEFAULT)));
        sub6.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub6), DEFAULT)));
        sub7.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub7), DEFAULT)));
        sub8.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub8), DEFAULT)));
        sub9.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub9), DEFAULT)));
        sub10.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub10), DEFAULT)));
        sub11.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub11), DEFAULT)));
        sub12.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub12), DEFAULT)));
        sub13.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub13), DEFAULT)));
        sub14.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub14), DEFAULT)));
        sub15.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub15), DEFAULT)));
        sub16.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub16), DEFAULT)));
        sub17.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub17), DEFAULT)));
        sub18.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub18), DEFAULT)));
        sub19.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub19), DEFAULT)));
        sub20.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub20), DEFAULT)));
        sub21.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub21), DEFAULT)));
        sub22.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub22), DEFAULT)));
        sub23.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub23), DEFAULT)));
        sub24.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub24), DEFAULT)));
        sub25.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub25), DEFAULT)));
        sub26.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub26), DEFAULT)));
        sub27.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub27), DEFAULT)));
        sub28.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub28), DEFAULT)));
        sub29.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub29), DEFAULT)));
        sub30.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub30), DEFAULT)));
        sub31.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub31), DEFAULT)));
        sub32.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub32), DEFAULT)));
        sub33.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub33), DEFAULT)));
        sub34.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub34), DEFAULT)));
        sub35.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub35), DEFAULT)));
        sub36.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub36), DEFAULT)));
        sub37.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub37), DEFAULT)));
        sub38.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub38), DEFAULT)));
        sub39.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub39), DEFAULT)));
        sub40.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub40), DEFAULT)));




    }

    /**
     * onclicklistener object
     */

    OnClickListener m = new OnClickListener(){



        @Override
        public void onClick(View v) {
            SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
            Toast.makeText(context, subcode(sharedpref.getString(String.valueOf(v.getId()), DEFAULT)) + "\n" + subname(sharedpref.getString(String.valueOf(v.getId()), DEFAULT)), Toast.LENGTH_LONG).show();
        }
    };

    /**
     * onlongclicklistener object
     */

    OnLongClickListener o = new OnLongClickListener(){

        @Override
        public boolean onLongClick(final View v) {

            // get prompts.xml view


            LayoutInflater li = LayoutInflater.from(context);
            View promptsView = li.inflate(R.layout.prompts, (ViewGroup)findViewById(R.id.layout_root));

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    context);

            // set prompts.xml to alertdialog builder
            alertDialogBuilder.setView(promptsView);

            final EditText userInput1 = (EditText) promptsView
                    .findViewById(R.id.editTextDialogUserInput);
            final EditText userInput2 = (EditText) promptsView
                    .findViewById(R.id.editTextDialogUserInput2);

            // set dialog message
            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    // get user input and set it to result
                                    // edit text
                                    userinput(v.getId(),String.valueOf(v.getId()), userInput1.getText().toString() + "," + userInput2.getText().toString());



                                }
                            })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    dialog.cancel();
                                }
                            });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();
            return true;
        }




    };

    /**
     * used to get string from dialogue and put them into sharedpreferences
     * @param keyid
     * @param strinkey
     * @param s
     */

    private void userinput(int keyid,String strinkey, String s) {

          if(s ==null){
              Toast.makeText(context,"please enter data",Toast.LENGTH_LONG).show();
              return;
          }
        SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpref.edit();
        editor.putString(strinkey, s);
        editor.apply();
        TextView v =(TextView) findViewById(keyid);
        v.setText(subcode(sharedpref.getString(String.valueOf(keyid), DEFAULT)));



    }

    /**
     * used to get subject code from string its algorithmically defined to sustain crash when input invalid strings
     * @param s
     * @return
     */

    private String subcode(String s) {

        String[] k = {" "," "};
        if(s != ","){

            try {
                if(s.split(",")[0].isEmpty()){
                    k[0] = " ";
                } else {
                    k[0]=s.split(",")[0];
                }
            }
            catch (Exception e) {

                k[0]= " ";
            }

            try {
                k[1]=s.split(",")[1];
            } catch (Exception e) {

                k[1]=" ";
            }
        }
        return k[0];

    }

    /**
     * used to get course name from string its algorithmically defined to sustain crash
     * @param s
     * @return
     */
    private String subname(String s) {

        String[] k = {" "," "};
        if(s != ","){

            try {
                if(s.split(",")[0].isEmpty()){
                    k[0] = " ";
                } else {
                    k[0]=s.split(",")[0];
                }
            }
            catch (Exception e) {

                k[0]= " ";
            }

            try {
                k[1]=s.split(",")[1];
            } catch (Exception e) {

                k[1]=" ";
            }
        }
        return k[1];


    }



    //Bluetooth part
    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    private static final int REQUEST_CONNECT_DEVICE_INSECURE = 2;
    private static final int REQUEST_ENABLE_BT = 3;
    private String mConnectedDeviceName = null;


    /**
     * Name of the connected device
     */


    /**
     * String buffer for outgoing messages
     */
    private StringBuffer mOutStringBuffer;

    /**
     * Local Bluetooth adapter
     */
    private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();


    /**
     * Member object for the chat services
     */


    /**
     * handler for chat service
     */
    public final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what) {


                case Constants.MESSAGE_READ:
                    byte[] readBuf = (byte[]) msg.obj;
                    // construct a string from the valid bytes in the buffer
                    String readMessage = new String(readBuf, 0, msg.arg1);
                    StringToSharedPreferencesValidate(readMessage);
                    break;
                case Constants.MESSAGE_DEVICE_NAME:
                    // save the connected device's name
                    mConnectedDeviceName = msg.getData().getString(Constants.DEVICE_NAME);

                        Toast.makeText(context, "Connected to "
                                + mConnectedDeviceName, Toast.LENGTH_SHORT).show();

                    break;


            }

        }
    };


    private BluetoothChatService mChatService = new BluetoothChatService(this,mHandler);




    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mChatService != null) {
            mChatService.stop();
        }
    }


    private void setupChat() {


        // Initialize the BluetoothChatService to perform bluetooth connections
        // mChatService = new BluetoothChatService(this);

        // Initialize the buffer for outgoing messages
        mOutStringBuffer = new StringBuffer("");
    }



    private void ensureDiscoverable() {
        if (mBluetoothAdapter.getScanMode() !=
                BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
            startActivity(discoverableIntent);
        }

    }

    /**
     * Sends a message.
     *
     * @param message A string of text to send.
     */
    private void sendMessage(String message) {
        // Check that we're actually connected before trying anything
        if (mChatService.getState() != BluetoothChatService.STATE_CONNECTED) {
            Toast.makeText(this, R.string.not_connected, Toast.LENGTH_SHORT).show();
            return;
        }

        // Check that there's actually something to send
        if (message.length() > 0) {
            // Get the message bytes and tell the BluetoothChatService to write
            byte[] send = message.getBytes();
            mChatService.write(send);

            // Reset out string buffer to zero and clear the edit text field


        }
    }




    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE_SECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
                    connectDevice(data, true);
                }
                break;
            case REQUEST_CONNECT_DEVICE_INSECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
                    connectDevice(data, false);
                }
                break;

            case REQUEST_ENABLE_BT:
                // When the request to enable Bluetooth returns
                if (resultCode == Activity.RESULT_OK) {
                    // Bluetooth is now enabled, so set up a chat session
                    setupChat();
                }
        }
    }



    /**
     * Establish connection with other divice
     *
     * @param data   An {@link Intent} with {@link DeviceListActivity#EXTRA_DEVICE_ADDRESS} extra.
     * @param secure Socket Security type - Secure (true) , Insecure (false)
     */
    private void connectDevice(Intent data, boolean secure) {
        // Get the device MAC address
        String address = data.getExtras()
                .getString(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
        // Get the BluetoothDevice object
        BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);
        // Attempt to connect to the device
        mChatService.connect(device, secure);
    }

    /**
     * to create menu for the app
     * @param menu
     * @return
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bluetooth_chat, menu);
        return true;
    }

    /**
     * switch for options selected
     * @param item
     * @return
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.secure_connect_scan: {
                // Launch the DeviceListActivity to see devices and do scan


                    if (!(BluetoothAdapter.getDefaultAdapter()).isEnabled()) {
                        Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
                    }
                    if(BluetoothAdapter.getDefaultAdapter().getState() == 12) {
                        Intent serverIntent = new Intent(this, DeviceListActivity.class);
                        startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE_SECURE);

                    }

                return true;
            }
            case R.id.insecure_connect_scan: {
                // Launch the DeviceListActivity to see devices and do scan
                sendMessage(SharedPreferenceToString().toString());
                return true;
            }
            case R.id.discoverable: {
                // Ensure this device is discoverable by others
                ensureDiscoverable();
                return true;
            }
        }
        return false;
    }

    /** convert sharedpreference to string to send it through bluetooth
     *
     * @return
     */

    public StringBuffer SharedPreferenceToString()  {

        StringBuffer stringBuffer = new StringBuffer();
        SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);

        for(int i : ids)  {
            stringBuffer.append(sharedpref.getString(String.valueOf(i), DEFAULT));
            stringBuffer.append("@");

        }
        return stringBuffer;




    }

    /**
     * this method takes input string and checks whether string is correct, recieved from same app string is tokenizable so that they can be
     * converted into sharedpreferences. this method was implemented in order to sustain crash so that any random string sent from
     * Bluetooth chat doesn't crash the app
     * @param string
     */

    public void StringToSharedPreferencesValidate(String string){
         int counter = 0;
        StringTokenizer tk = new StringTokenizer(string,"@");
        if(tk.countTokens() == 40){
            StringToSharedPreferences(string);
        }  else {
            Toast.makeText(context,"Please Use the same timetable app to synchronize the data",Toast.LENGTH_SHORT).show();
        }

    }

    public void StringToSharedPreferences(String string){
        SharedPreferences sharedpref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        sharedpref.edit().clear().commit();
        SharedPreferences.Editor editor = sharedpref.edit();
        StringTokenizer st = new StringTokenizer(string,"@");
        for(int i : ids) {
            editor.putString(String.valueOf(i),st.nextToken());

        }
        editor.apply();

        sub1.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub1), DEFAULT)));
        sub2.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub2), DEFAULT)));
        sub3.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub3), DEFAULT)));
        sub4.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub4), DEFAULT)));
        sub5.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub5), DEFAULT)));
        sub6.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub6), DEFAULT)));
        sub7.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub7), DEFAULT)));
        sub8.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub8), DEFAULT)));
        sub9.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub9), DEFAULT)));
        sub10.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub10), DEFAULT)));
        sub11.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub11), DEFAULT)));
        sub12.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub12), DEFAULT)));
        sub13.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub13), DEFAULT)));
        sub14.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub14), DEFAULT)));
        sub15.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub15), DEFAULT)));
        sub16.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub16), DEFAULT)));
        sub17.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub17), DEFAULT)));
        sub18.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub18), DEFAULT)));
        sub19.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub19), DEFAULT)));
        sub20.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub20), DEFAULT)));
        sub21.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub21), DEFAULT)));
        sub22.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub22), DEFAULT)));
        sub23.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub23), DEFAULT)));
        sub24.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub24), DEFAULT)));
        sub25.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub25), DEFAULT)));
        sub26.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub26), DEFAULT)));
        sub27.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub27), DEFAULT)));
        sub28.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub28), DEFAULT)));
        sub29.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub29), DEFAULT)));
        sub30.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub30), DEFAULT)));
        sub31.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub31), DEFAULT)));
        sub32.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub32), DEFAULT)));
        sub33.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub33), DEFAULT)));
        sub34.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub34), DEFAULT)));
        sub35.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub35), DEFAULT)));
        sub36.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub36), DEFAULT)));
        sub37.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub37), DEFAULT)));
        sub38.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub38), DEFAULT)));
        sub39.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub39), DEFAULT)));
        sub40.setText(subcode(sharedpref.getString(String.valueOf(R.id.sub40), DEFAULT)));
    }

}




