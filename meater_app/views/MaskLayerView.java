package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MaskLayerView extends View {

    /* renamed from: q, reason: collision with root package name */
    private float f10373q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f10374r;

    /* renamed from: s, reason: collision with root package name */
    private final RectF f10375s;

    /* renamed from: t, reason: collision with root package name */
    private int f10376t;

    /* renamed from: u, reason: collision with root package name */
    private int f10377u;

    public MaskLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10375s = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        b();
    }

    private void b() {
        Paint paint = new Paint();
        this.f10374r = paint;
        paint.setColor(f8.l0.i(getContext(), 2131100532));
    }

    public void a(Probe probe) {
        float b10 = f8.l0.b(probe, probe.getInternalTemperature());
        if (probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED && probe.getCookState() != DeviceCookState.COOK_STATE_STARTED) {
            if (272.0f != this.f10373q) {
                setAngle(361.0f);
            }
        } else if (b10 - 89.0f != this.f10373q) {
            setAngle(b10);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10373q <= 0.0f) {
            this.f10373q = 182.5f;
        }
        float f10 = (this.f10373q - 150.0f) + 242.0f;
        this.f10375s.set(this.f10376t - getWidth(), this.f10377u - getHeight(), this.f10376t, this.f10377u);
        float f11 = this.f10373q;
        if (f11 < 271.0f) {
            canvas.drawArc(this.f10375s, f11, -f10, true, this.f10374r);
        }
        canvas.clipRect(0, 0, getWidth(), getHeight());
        this.f10375s.inset(-200.0f, -200.0f);
        canvas.drawArc(this.f10375s, 147.5f, -115.0f, true, this.f10374r);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f10376t = i10;
        this.f10377u = i11;
    }

    public void setAngle(float f10) {
        float f11 = f10 - 89.0f;
        if (this.f10373q != f11) {
            this.f10373q = f11;
            invalidate();
        }
    }
}
