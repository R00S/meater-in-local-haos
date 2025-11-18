package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@zzard
/* renamed from: com.google.android.gms.internal.ads.c8 */
/* loaded from: classes2.dex */
final class C6553c8 implements SensorEventListener {

    /* renamed from: f */
    private final SensorManager f18415f;

    /* renamed from: h */
    private final Display f18417h;

    /* renamed from: k */
    private float[] f18420k;

    /* renamed from: l */
    private Handler f18421l;

    /* renamed from: m */
    private InterfaceC6627e8 f18422m;

    /* renamed from: i */
    private final float[] f18418i = new float[9];

    /* renamed from: j */
    private final float[] f18419j = new float[9];

    /* renamed from: g */
    private final Object f18416g = new Object();

    C6553c8(Context context) {
        this.f18415f = (SensorManager) context.getSystemService("sensor");
        this.f18417h = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: e */
    private final void m14966e(int i2, int i3) {
        float[] fArr = this.f18419j;
        float f2 = fArr[i2];
        fArr[i2] = fArr[i3];
        fArr[i3] = f2;
    }

    /* renamed from: a */
    final void m14967a() {
        if (this.f18421l != null) {
            return;
        }
        Sensor defaultSensor = this.f18415f.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzbad.m17351g("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdbh zzdbhVar = new zzdbh(handlerThread.getLooper());
        this.f18421l = zzdbhVar;
        if (this.f18415f.registerListener(this, defaultSensor, 0, zzdbhVar)) {
            return;
        }
        zzbad.m17351g("SensorManager.registerListener failed.");
        m14968b();
    }

    /* renamed from: b */
    final void m14968b() {
        if (this.f18421l == null) {
            return;
        }
        this.f18415f.unregisterListener(this);
        this.f18421l.post(new RunnableC6590d8(this));
        this.f18421l = null;
    }

    /* renamed from: c */
    final void m14969c(InterfaceC6627e8 interfaceC6627e8) {
        this.f18422m = interfaceC6627e8;
    }

    /* renamed from: d */
    final boolean m14970d(float[] fArr) {
        synchronized (this.f18416g) {
            float[] fArr2 = this.f18420k;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f18416g) {
            if (this.f18420k == null) {
                this.f18420k = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f18418i, fArr);
        int rotation = this.f18417h.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f18418i, 2, 129, this.f18419j);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f18418i, 129, 130, this.f18419j);
        } else if (rotation != 3) {
            System.arraycopy(this.f18418i, 0, this.f18419j, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f18418i, 130, 1, this.f18419j);
        }
        m14966e(1, 3);
        m14966e(2, 6);
        m14966e(5, 7);
        synchronized (this.f18416g) {
            System.arraycopy(this.f18419j, 0, this.f18420k, 0, 9);
        }
        InterfaceC6627e8 interfaceC6627e8 = this.f18422m;
        if (interfaceC6627e8 != null) {
            interfaceC6627e8.mo15104a();
        }
    }
}
