package i0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import i0.C3566b0;
import kotlin.Metadata;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Li0/b0;", "Landroid/graphics/PorterDuff$Mode;", "c", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "b", "(Landroid/graphics/BlendMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3543F {

    /* compiled from: AndroidBlendMode.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.F$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42835a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f42835a = iArr;
        }
    }

    public static final BlendMode a(int i10) {
        C3566b0.Companion companion = C3566b0.INSTANCE;
        return C3566b0.E(i10, companion.a()) ? BlendMode.CLEAR : C3566b0.E(i10, companion.x()) ? BlendMode.SRC : C3566b0.E(i10, companion.g()) ? BlendMode.DST : C3566b0.E(i10, companion.B()) ? BlendMode.SRC_OVER : C3566b0.E(i10, companion.k()) ? BlendMode.DST_OVER : C3566b0.E(i10, companion.z()) ? BlendMode.SRC_IN : C3566b0.E(i10, companion.i()) ? BlendMode.DST_IN : C3566b0.E(i10, companion.A()) ? BlendMode.SRC_OUT : C3566b0.E(i10, companion.j()) ? BlendMode.DST_OUT : C3566b0.E(i10, companion.y()) ? BlendMode.SRC_ATOP : C3566b0.E(i10, companion.h()) ? BlendMode.DST_ATOP : C3566b0.E(i10, companion.C()) ? BlendMode.XOR : C3566b0.E(i10, companion.t()) ? BlendMode.PLUS : C3566b0.E(i10, companion.q()) ? BlendMode.MODULATE : C3566b0.E(i10, companion.v()) ? BlendMode.SCREEN : C3566b0.E(i10, companion.s()) ? BlendMode.OVERLAY : C3566b0.E(i10, companion.e()) ? BlendMode.DARKEN : C3566b0.E(i10, companion.o()) ? BlendMode.LIGHTEN : C3566b0.E(i10, companion.d()) ? BlendMode.COLOR_DODGE : C3566b0.E(i10, companion.c()) ? BlendMode.COLOR_BURN : C3566b0.E(i10, companion.m()) ? BlendMode.HARD_LIGHT : C3566b0.E(i10, companion.w()) ? BlendMode.SOFT_LIGHT : C3566b0.E(i10, companion.f()) ? BlendMode.DIFFERENCE : C3566b0.E(i10, companion.l()) ? BlendMode.EXCLUSION : C3566b0.E(i10, companion.r()) ? BlendMode.MULTIPLY : C3566b0.E(i10, companion.n()) ? BlendMode.HUE : C3566b0.E(i10, companion.u()) ? BlendMode.SATURATION : C3566b0.E(i10, companion.b()) ? BlendMode.COLOR : C3566b0.E(i10, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.f42835a[blendMode.ordinal()]) {
            case 1:
                return C3566b0.INSTANCE.a();
            case 2:
                return C3566b0.INSTANCE.x();
            case 3:
                return C3566b0.INSTANCE.g();
            case 4:
                return C3566b0.INSTANCE.B();
            case 5:
                return C3566b0.INSTANCE.k();
            case 6:
                return C3566b0.INSTANCE.z();
            case 7:
                return C3566b0.INSTANCE.i();
            case 8:
                return C3566b0.INSTANCE.A();
            case 9:
                return C3566b0.INSTANCE.j();
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return C3566b0.INSTANCE.y();
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return C3566b0.INSTANCE.h();
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return C3566b0.INSTANCE.C();
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return C3566b0.INSTANCE.t();
            case 14:
                return C3566b0.INSTANCE.q();
            case 15:
                return C3566b0.INSTANCE.v();
            case 16:
                return C3566b0.INSTANCE.s();
            case 17:
                return C3566b0.INSTANCE.e();
            case 18:
                return C3566b0.INSTANCE.o();
            case 19:
                return C3566b0.INSTANCE.d();
            case 20:
                return C3566b0.INSTANCE.c();
            case 21:
                return C3566b0.INSTANCE.m();
            case 22:
                return C3566b0.INSTANCE.w();
            case 23:
                return C3566b0.INSTANCE.f();
            case 24:
                return C3566b0.INSTANCE.l();
            case 25:
                return C3566b0.INSTANCE.r();
            case 26:
                return C3566b0.INSTANCE.n();
            case 27:
                return C3566b0.INSTANCE.u();
            case 28:
                return C3566b0.INSTANCE.b();
            case 29:
                return C3566b0.INSTANCE.p();
            default:
                return C3566b0.INSTANCE.B();
        }
    }

    public static final PorterDuff.Mode c(int i10) {
        C3566b0.Companion companion = C3566b0.INSTANCE;
        return C3566b0.E(i10, companion.a()) ? PorterDuff.Mode.CLEAR : C3566b0.E(i10, companion.x()) ? PorterDuff.Mode.SRC : C3566b0.E(i10, companion.g()) ? PorterDuff.Mode.DST : C3566b0.E(i10, companion.B()) ? PorterDuff.Mode.SRC_OVER : C3566b0.E(i10, companion.k()) ? PorterDuff.Mode.DST_OVER : C3566b0.E(i10, companion.z()) ? PorterDuff.Mode.SRC_IN : C3566b0.E(i10, companion.i()) ? PorterDuff.Mode.DST_IN : C3566b0.E(i10, companion.A()) ? PorterDuff.Mode.SRC_OUT : C3566b0.E(i10, companion.j()) ? PorterDuff.Mode.DST_OUT : C3566b0.E(i10, companion.y()) ? PorterDuff.Mode.SRC_ATOP : C3566b0.E(i10, companion.h()) ? PorterDuff.Mode.DST_ATOP : C3566b0.E(i10, companion.C()) ? PorterDuff.Mode.XOR : C3566b0.E(i10, companion.t()) ? PorterDuff.Mode.ADD : C3566b0.E(i10, companion.v()) ? PorterDuff.Mode.SCREEN : C3566b0.E(i10, companion.s()) ? PorterDuff.Mode.OVERLAY : C3566b0.E(i10, companion.e()) ? PorterDuff.Mode.DARKEN : C3566b0.E(i10, companion.o()) ? PorterDuff.Mode.LIGHTEN : C3566b0.E(i10, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
