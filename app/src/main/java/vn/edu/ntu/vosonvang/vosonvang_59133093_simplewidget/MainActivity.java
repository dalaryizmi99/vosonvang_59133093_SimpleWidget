package vn.edu.ntu.vosonvang.vosonvang_59133093_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnConfirm;
    EditText editTen, editNgaySinh, editSTK;
    RadioGroup rdgGioiTinh;
    RadioButton rbNam, rbNu;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    String returnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();

    }

    private void addViews(){
        editTen = findViewById(R.id.editTen);
        editNgaySinh = findViewById(R.id.editNgaySinh);
        editSTK = findViewById(R.id.editSTK);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rbNam = findViewById(R.id.rbNam);
        rbNu = findViewById(R.id.rbNu);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        btnConfirm = findViewById(R.id.btnConfirm);
    }

    private void addEvents(){
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmInfo();
            }
        });
    }
    private void confirmInfo(){
        returnInfo = editTen.getText().toString() + "\n"
                + "Ngày sinh: " + editNgaySinh.getText().toString() + "\n" + "Giới tính: ";
        if ( rdgGioiTinh.getCheckedRadioButtonId() == R.id.rbNam)
                    returnInfo = returnInfo + "Nam" + "\n" + "Sở thích: ";
        else
            if (rdgGioiTinh.getCheckedRadioButtonId() == R.id.rbNu)
                        returnInfo = returnInfo + "Nữ" + "\n" +  "Sở Thích: ";
        if (cb1.isChecked())
            returnInfo = returnInfo + "Xem phim; ";
        if (cb2.isChecked())
            returnInfo = returnInfo + "Nghe nhạc; ";
        if (cb3.isChecked())
            returnInfo = returnInfo + "Đi cafe với bạn bè; ";
        if (cb4.isChecked())
            returnInfo = returnInfo + "Ở nhà một mình; ";
        if (cb5.isChecked())
            returnInfo = returnInfo + "Vào bếp nấu ăn; ";

        returnInfo = returnInfo + editSTK.getText().toString();

        Toast.makeText(getApplicationContext(), returnInfo, Toast.LENGTH_SHORT).show();
    }

}
