package com.prongbang.barcode128;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.prongbang.barcode128.barcode.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    private ImageView ivBarcode128;
    private TextView tvCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBarcode128 = (ImageView) findViewById(R.id.ivBarcode128);
        tvCode = (TextView) findViewById(R.id.tvCode);

        String code = "1234567891013";
        Bitmap bitmap = BarcodeEncoder.genBarcode128(code, 550, 222);
        if(bitmap != null) {
            ivBarcode128.setImageBitmap(bitmap);
            tvCode.setText(code);
        }

    }


}
