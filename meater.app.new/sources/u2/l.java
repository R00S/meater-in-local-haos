package u2;

import X1.C1804a;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import u2.d;
import u2.m;

/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes.dex */
public final class l extends GLSurfaceView {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f50392N = 0;

    /* renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f50393B;

    /* renamed from: C, reason: collision with root package name */
    private final SensorManager f50394C;

    /* renamed from: D, reason: collision with root package name */
    private final Sensor f50395D;

    /* renamed from: E, reason: collision with root package name */
    private final d f50396E;

    /* renamed from: F, reason: collision with root package name */
    private final Handler f50397F;

    /* renamed from: G, reason: collision with root package name */
    private final m f50398G;

    /* renamed from: H, reason: collision with root package name */
    private final i f50399H;

    /* renamed from: I, reason: collision with root package name */
    private SurfaceTexture f50400I;

    /* renamed from: J, reason: collision with root package name */
    private Surface f50401J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f50402K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f50403L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f50404M;

    /* compiled from: SphericalGLSurfaceView.java */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: B, reason: collision with root package name */
        private final i f50405B;

        /* renamed from: E, reason: collision with root package name */
        private final float[] f50408E;

        /* renamed from: F, reason: collision with root package name */
        private final float[] f50409F;

        /* renamed from: G, reason: collision with root package name */
        private final float[] f50410G;

        /* renamed from: H, reason: collision with root package name */
        private float f50411H;

        /* renamed from: I, reason: collision with root package name */
        private float f50412I;

        /* renamed from: C, reason: collision with root package name */
        private final float[] f50406C = new float[16];

        /* renamed from: D, reason: collision with root package name */
        private final float[] f50407D = new float[16];

        /* renamed from: J, reason: collision with root package name */
        private final float[] f50413J = new float[16];

        /* renamed from: K, reason: collision with root package name */
        private final float[] f50414K = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f50408E = fArr;
            float[] fArr2 = new float[16];
            this.f50409F = fArr2;
            float[] fArr3 = new float[16];
            this.f50410G = fArr3;
            this.f50405B = iVar;
            GlUtil.k(fArr);
            GlUtil.k(fArr2);
            GlUtil.k(fArr3);
            this.f50412I = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f50409F, 0, -this.f50411H, (float) Math.cos(this.f50412I), (float) Math.sin(this.f50412I), 0.0f);
        }

        @Override // u2.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f50408E;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f50412I = -f10;
            d();
        }

        @Override // u2.m.a
        public synchronized void b(PointF pointF) {
            this.f50411H = pointF.y;
            d();
            Matrix.setRotateM(this.f50410G, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f50414K, 0, this.f50408E, 0, this.f50410G, 0);
                Matrix.multiplyMM(this.f50413J, 0, this.f50409F, 0, this.f50414K, 0);
            }
            Matrix.multiplyMM(this.f50407D, 0, this.f50406C, 0, this.f50413J, 0);
            this.f50405B.c(this.f50407D, false);
        }

        @Override // u2.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f50406C, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f50405B.d());
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    public interface b {
        void C(Surface surface);

        void E(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f50401J;
        if (surface != null) {
            Iterator<b> it = this.f50393B.iterator();
            while (it.hasNext()) {
                it.next().C(surface);
            }
        }
        h(this.f50400I, surface);
        this.f50400I = null;
        this.f50401J = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f50400I;
        Surface surface = this.f50401J;
        Surface surface2 = new Surface(surfaceTexture);
        this.f50400I = surfaceTexture;
        this.f50401J = surface2;
        Iterator<b> it = this.f50393B.iterator();
        while (it.hasNext()) {
            it.next().E(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final SurfaceTexture surfaceTexture) {
        this.f50397F.post(new Runnable() { // from class: u2.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f50390B.f(surfaceTexture);
            }
        });
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f50402K && this.f50403L;
        Sensor sensor = this.f50395D;
        if (sensor == null || z10 == this.f50404M) {
            return;
        }
        if (z10) {
            this.f50394C.registerListener(this.f50396E, sensor, 0);
        } else {
            this.f50394C.unregisterListener(this.f50396E);
        }
        this.f50404M = z10;
    }

    public void d(b bVar) {
        this.f50393B.add(bVar);
    }

    public InterfaceC4662a getCameraMotionListener() {
        return this.f50399H;
    }

    public t2.h getVideoFrameMetadataListener() {
        return this.f50399H;
    }

    public Surface getVideoSurface() {
        return this.f50401J;
    }

    public void i(b bVar) {
        this.f50393B.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50397F.post(new Runnable() { // from class: u2.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f50389B.e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f50403L = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f50403L = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f50399H.g(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f50402K = z10;
        j();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50393B = new CopyOnWriteArrayList<>();
        this.f50397F = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C1804a.e(context.getSystemService("sensor"));
        this.f50394C = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f50395D = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f50399H = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f50398G = mVar;
        this.f50396E = new d(((WindowManager) C1804a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f50402K = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
