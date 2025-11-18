package u2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* compiled from: OrientationListener.java */
/* loaded from: classes.dex */
final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f50341a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f50342b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f50343c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f50344d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f50345e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f50346f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f50347g;

    /* compiled from: OrientationListener.java */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f50345e = display;
        this.f50346f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f50342b);
        SensorManager.getOrientation(this.f50342b, this.f50344d);
        return this.f50344d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f50346f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f50347g) {
            c.a(this.f50343c, fArr);
            this.f50347g = true;
        }
        float[] fArr2 = this.f50342b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f50342b, 0, this.f50343c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f50342b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f50342b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f50341a, sensorEvent.values);
        d(this.f50341a, this.f50345e.getRotation());
        float fA = a(this.f50341a);
        e(this.f50341a);
        c(this.f50341a);
        b(this.f50341a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
