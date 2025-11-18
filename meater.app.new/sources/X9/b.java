package X9;

import C9.h;
import android.graphics.Canvas;
import android.view.MotionEvent;
import ca.C2352a;

/* compiled from: DrawController.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private T9.a f18924a;

    /* renamed from: b, reason: collision with root package name */
    private Z9.a f18925b;

    /* renamed from: c, reason: collision with root package name */
    private Y9.a f18926c;

    /* compiled from: DrawController.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18927a;

        static {
            int[] iArr = new int[V9.a.values().length];
            f18927a = iArr;
            try {
                iArr[V9.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18927a[V9.a.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18927a[V9.a.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18927a[V9.a.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18927a[V9.a.SLIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18927a[V9.a.FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18927a[V9.a.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18927a[V9.a.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18927a[V9.a.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18927a[V9.a.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DrawController.java */
    /* renamed from: X9.b$b, reason: collision with other inner class name */
    public interface InterfaceC0274b {
    }

    public b(Y9.a aVar) {
        this.f18926c = aVar;
        this.f18925b = new Z9.a(aVar);
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        boolean zX = this.f18926c.x();
        int iP = this.f18926c.p();
        int iQ = this.f18926c.q();
        boolean z10 = false;
        boolean z11 = !zX && (i10 == iP || i10 == this.f18926c.e());
        if (zX && (i10 == iP || i10 == iQ)) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        this.f18925b.k(i10, i11, i12);
        if (this.f18924a == null || !z12) {
            this.f18925b.a(canvas, z12);
        } else {
            c(canvas);
        }
    }

    private void c(Canvas canvas) {
        switch (a.f18927a[this.f18926c.b().ordinal()]) {
            case 1:
                this.f18925b.a(canvas, true);
                break;
            case 2:
                this.f18925b.b(canvas, this.f18924a);
                break;
            case 3:
                this.f18925b.e(canvas, this.f18924a);
                break;
            case 4:
                this.f18925b.j(canvas, this.f18924a);
                break;
            case 5:
                this.f18925b.g(canvas, this.f18924a);
                break;
            case 6:
                this.f18925b.d(canvas, this.f18924a);
                break;
            case 7:
                this.f18925b.i(canvas, this.f18924a);
                break;
            case 8:
                this.f18925b.c(canvas, this.f18924a);
                break;
            case 9:
                this.f18925b.h(canvas, this.f18924a);
                break;
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                this.f18925b.f(canvas, this.f18924a);
                break;
        }
    }

    public void a(Canvas canvas) {
        int iC = this.f18926c.c();
        for (int i10 = 0; i10 < iC; i10++) {
            b(canvas, i10, C2352a.e(this.f18926c, i10), C2352a.f(this.f18926c, i10));
        }
    }

    public void f(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public void g(T9.a aVar) {
        this.f18924a = aVar;
    }

    public void e(InterfaceC0274b interfaceC0274b) {
    }

    private void d(float f10, float f11) {
    }
}
