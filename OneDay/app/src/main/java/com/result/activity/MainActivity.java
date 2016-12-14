package com.result.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.result.bean.UserBean;
import com.result.prestenter.ILoginPresenter;
import com.result.prestenter.LoginPresenter;
import com.result.view.ILoginView;


public class MainActivity extends AppCompatActivity implements ILoginView{

    private EditText names;
    private EditText pwds;
    private Button btns;
    ILoginPresenter mILoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names =(EditText)findViewById(R.id.name);
        pwds =(EditText)findViewById(R.id.ped);
        btns =(Button)findViewById(R.id.btn);
        mILoginPresenter=new LoginPresenter(this);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mILoginPresenter.login(names.getText().toString(),pwds.getText().toString());
            }
        });
    }

    @Override
    public void loginSuccess(UserBean user) {
        Toast.makeText(MainActivity.this,user+"登陆成功！！！",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }

    @Override
    public void loginFail(String errmag) {
        Toast.makeText(MainActivity.this,errmag,Toast.LENGTH_SHORT).show();
    }
}
