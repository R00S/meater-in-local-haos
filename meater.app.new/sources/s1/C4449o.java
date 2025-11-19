package s1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: DifferentialMotionFlingController.java */
/* renamed from: s1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4449o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49178a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4451p f49179b;

    /* renamed from: c, reason: collision with root package name */
    private final b f49180c;

    /* renamed from: d, reason: collision with root package name */
    private final a f49181d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f49182e;

    /* renamed from: f, reason: collision with root package name */
    private float f49183f;

    /* renamed from: g, reason: collision with root package name */
    private int f49184g;

    /* renamed from: h, reason: collision with root package name */
    private int f49185h;

    /* renamed from: i, reason: collision with root package name */
    private int f49186i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f49187j;

    /* compiled from: DifferentialMotionFlingController.java */
    /* renamed from: s1.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* compiled from: DifferentialMotionFlingController.java */
    /* renamed from: s1.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C4449o(Context context, InterfaceC4451p interfaceC4451p) {
        this(context, interfaceC4451p, new b() { // from class: s1.m
            @Override // s1.C4449o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C4449o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: s1.n
            @Override // s1.C4449o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C4449o.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C4422a0.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C4422a0.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f49185h == source && this.f49186i == deviceId && this.f49184g == i10) {
            return false;
        }
        this.f49180c.a(this.f49178a, this.f49187j, motionEvent, i10);
        this.f49185h = source;
        this.f49186i = deviceId;
        this.f49184g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f49182e == null) {
            this.f49182e = VelocityTracker.obtain();
        }
        return this.f49181d.a(this.f49182e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        U.a(velocityTracker, motionEvent);
        U.b(velocityTracker, 1000);
        return U.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f49187j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f49182e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f49182e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f49179b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f49183f) && fSignum != 0.0f)) {
            this.f49179b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f49187j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f49183f = this.f49179b.a(fMax) ? fMax : 0.0f;
    }

    C4449o(Context context, InterfaceC4451p interfaceC4451p, b bVar, a aVar) {
        this.f49184g = -1;
        this.f49185h = -1;
        this.f49186i = -1;
        this.f49187j = new int[]{Integer.MAX_VALUE, 0};
        this.f49178a = context;
        this.f49179b = interfaceC4451p;
        this.f49180c = bVar;
        this.f49181d = aVar;
    }
}
