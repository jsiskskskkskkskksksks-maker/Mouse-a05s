package com.mouse.fixer;

import android.app.Activity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        setContentView(view);
        
        // Ativa a captura do mouse ao tocar na tela
        view.setOnClickListener(v -> {
            v.requestPointerCapture();
        });
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        if (event.getSource() == InputDevice.SOURCE_MOUSE) {
            // Aqui o Android entrega o movimento puro do seu mouse
            return true;
        }
        return super.onGenericMotionEvent(event);
    }
}
