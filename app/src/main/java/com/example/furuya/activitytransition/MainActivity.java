package com.example.furuya.activitytransition;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  Context context;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    context = MainActivity.this;
    setContentView(R.layout.activity_main);
  }

  public void transit(View v) {
    Intent intent = new Intent(context, Main2Activity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
    overridePendingTransition(0, 0);
  }
}
