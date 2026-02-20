// Esse código ativa o modo "PC" no Android
@Override
public void onPointerCaptureChange(boolean hasCapture) {
    super.onPointerCaptureChange(hasCapture);
}

// Quando você clica, o app captura o mouse
public void startFix() {
    View myView = findViewById(R.id.main_view);
    myView.requestPointerCapture(); // O mouse "some" e vira 100% Raw Input
}

@Override
public boolean onGenericMotionEvent(MotionEvent event) {
    if (event.getSource() == InputDevice.SOURCE_MOUSE) {
        float x = event.getX(); // Movimento real sem aceleração
        float y = event.getY();
        // Aqui o mouse nunca mais vai fugir
        return true;
    }
    return super.onGenericMotionEvent(event);
}
package com.mouse.fixer;

import android.app.Activity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Cria uma tela simples que captura o mouse
        FrameLayout layout = new FrameLayout(this);
        layout.setOnClickListener(v -> {
            v.requestPointerCapture();
        });
        setContentView(layout);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        // Se for movimento de mouse, o Android libera o sinal puro
        if ((event.getSource() & InputDevice.SOURCE_MOUSE) == InputDevice.SOURCE_MOUSE) {
            return true;
        }
        return super.onGenericMotionEvent(event);
    }
}
