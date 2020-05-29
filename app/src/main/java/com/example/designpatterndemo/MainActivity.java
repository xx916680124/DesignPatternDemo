package com.example.designpatterndemo;



import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatterndemo.bulider.Preson;
import com.example.designpatterndemo.factory.Constants;
import com.example.designpatterndemo.factory.Shape;
import com.example.designpatterndemo.factory.ShapeFactory;
import com.example.designpatterndemo.single.SingleIntance;
import com.example.designpatterndemo.tem.Game;
import com.example.designpatterndemo.tem.LOL;
import com.example.designpatterndemo.tem.TXT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_single;
    private Button btn_factory;
    private Button btn_tem;
    private Button btn_bulider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_single = (Button) findViewById(R.id.btn_single);
        btn_factory = (Button) findViewById(R.id.btn_factory);
        btn_tem = (Button) findViewById(R.id.btn_tem);
        btn_bulider = (Button) findViewById(R.id.btn_bulider);

        btn_single.setOnClickListener(this);
        btn_factory.setOnClickListener(this);
        btn_tem.setOnClickListener(this);
        btn_bulider.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_single:
                String fun = SingleIntance.getInstance().fun();
                btn_single.setText(fun);
                break;
            case R.id.btn_factory:
                ShapeFactory shapeFactory = new ShapeFactory();
                shapeFactory.getShape(Constants.CIRCLE);
                Shape shape1 = shapeFactory.getShape(Constants.CIRCLE);
                String CIRCLE = shape1.draw();
                Shape shape2 = shapeFactory.getShape(Constants.RECTANGLE);
                String RECTANGLE = shape2.draw();
                Shape shape3 = shapeFactory.getShape(Constants.SQUARE);
                String SQUARE = shape3.draw();
                break;
            case R.id.btn_tem:
                Game game=new LOL();
                game.play();

                game=new TXT();
                game.play();
                break;
            case R.id.btn_bulider:
                Preson bulid = new Preson.Builder()
                        .setAge(18)
                        .setName("xx")
                        .setSex("男")
                        .bulid();
                Log.i("TAG", "onClick: "+bulid.toString());
                break;
        }
    }
}
