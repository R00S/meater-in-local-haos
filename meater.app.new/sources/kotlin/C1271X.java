package kotlin;

import E.c;
import E.g;
import M.m;
import U0.h;
import i0.Y0;
import i0.c1;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: Shapes.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LE/a;", "e", "(LE/a;)LE/a;", "a", "LK/W;", "LM/m;", "value", "Li0/c1;", "b", "(LK/W;LM/m;)Li0/c1;", "LO/G0;", "LO/G0;", "c", "()LO/G0;", "LocalShapes", "d", "(LM/m;LO/l;I)Li0/c1;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271X {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<Shapes> f8063a = C1576w.f(a.f8064B);

    /* compiled from: Shapes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK/W;", "a", "()LK/W;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.X$a */
    static final class a extends AbstractC3864v implements Ba.a<Shapes> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8064B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shapes invoke() {
            return new Shapes(null, null, null, null, null, 31, null);
        }
    }

    /* compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.X$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8065a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[m.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f8065a = iArr;
        }
    }

    public static final E.a a(E.a aVar) {
        float f10 = (float) 0.0d;
        return E.a.d(aVar, c.b(h.u(f10)), null, null, c.b(h.u(f10)), 6, null);
    }

    public static final c1 b(Shapes shapes, m mVar) {
        switch (b.f8065a[mVar.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return e(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return e(shapes.getExtraSmall());
            case 5:
                return g.f();
            case 6:
                return shapes.getLarge();
            case 7:
                return a(shapes.getLarge());
            case 8:
                return e(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Y0.a();
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AbstractC1501G0<Shapes> c() {
        return f8063a;
    }

    public static final c1 d(m mVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        c1 c1VarB = b(C1252D.f7860a.b(interfaceC1554l, 6), mVar);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c1VarB;
    }

    public static final E.a e(E.a aVar) {
        float f10 = (float) 0.0d;
        return E.a.d(aVar, null, null, c.b(h.u(f10)), c.b(h.u(f10)), 3, null);
    }
}
