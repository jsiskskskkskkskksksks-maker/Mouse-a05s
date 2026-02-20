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
