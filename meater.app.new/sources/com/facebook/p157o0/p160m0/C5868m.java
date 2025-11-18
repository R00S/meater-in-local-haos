package com.facebook.p157o0.p160m0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: ViewIndexingTrigger.kt */
/* renamed from: com.facebook.o0.m0.m */
/* loaded from: classes.dex */
public final class C5868m implements SensorEventListener {

    /* renamed from: f */
    public static final a f15213f = new a(null);

    /* renamed from: g */
    private b f15214g;

    /* compiled from: ViewIndexingTrigger.kt */
    /* renamed from: com.facebook.o0.m0.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: ViewIndexingTrigger.kt */
    /* renamed from: com.facebook.o0.m0.m$b */
    public interface b {
        /* renamed from: a */
        void mo12370a();
    }

    /* renamed from: a */
    public final void m12434a(b bVar) {
        this.f15214g = bVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        C9801m.m32346f(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        C9801m.m32346f(sensorEvent, "event");
        b bVar = this.f15214g;
        if (bVar == null) {
            return;
        }
        float[] fArr = sensorEvent.values;
        double d2 = fArr[0] / 9.80665f;
        double d3 = fArr[1] / 9.80665f;
        double d4 = fArr[2] / 9.80665f;
        Double.isNaN(d2);
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d4);
        if (Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4)) > 2.3d) {
            bVar.mo12370a();
        }
    }
}
