package neu.chaiyasittirak.natthaphat.bookshop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by iMac_18 on 6/20/2016 AD.
 */
public class DogAlert {

    public void myDialog(Context context,
                         String strTitle,
                         String stnMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.bird48);
        builder.setTitle(strTitle);
        builder.setMessage(stnMessage);
        builder.setPositiveButton("ได้แล้ว", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();

    }


}// Main Class
