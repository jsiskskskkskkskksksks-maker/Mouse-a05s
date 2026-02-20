package com.mouse.fixer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Criamos um botão gigante. Quando clicar, o mouse trava no modo PC.
        Button btn = new Button(this);
        btn.setText("ATIVAR MOUSE PC");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.requestPointerCapture();
            }
        });
        
        setContentView(btn);
    }
}
