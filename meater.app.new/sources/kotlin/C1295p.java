package kotlin;

import C9.h;
import com.apptionlabs.meater_app.data.Config;
import i0.C3602t0;
import i0.C3606v0;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aø\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001e\u0010)\u001a\u00020\u0000*\u00020%2\u0006\u0010(\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001a\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a&\u0010/\u001a\u00020\u0000*\u00020%2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u001e\u00101\u001a\u00020\u0000*\u00020%2\u0006\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001b\u00105\u001a\u00020\u0000*\u00020%2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106\" \u0010;\u001a\b\u0012\u0004\u0012\u00020%078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b9\u0010:\"\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020<078\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b=\u0010:\"\u0018\u00104\u001a\u00020\u0000*\u0002038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Li0/t0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "LK/o;", "g", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)LK/o;", "backgroundColor", "b", "(LK/o;J)J", "c", "(JLO/l;I)J", "LU0/h;", "elevation", "a", "(LK/o;JFLO/l;I)J", "i", "(LK/o;F)J", "LM/b;", "value", "d", "(LK/o;LM/b;)J", "LO/G0;", "LO/G0;", "e", "()LO/G0;", "LocalColorScheme", "", "getLocalTonalElevationEnabled", "LocalTonalElevationEnabled", "f", "(LM/b;LO/l;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295p {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<ColorScheme> f8551a = C1576w.f(a.f8553B);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<Boolean> f8552b = C1576w.f(b.f8554B);

    /* compiled from: ColorScheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK/o;", "a", "()LK/o;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.p$a */
    static final class a extends AbstractC3864v implements Ba.a<ColorScheme> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8553B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorScheme invoke() {
            return C1295p.h(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    /* compiled from: ColorScheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.p$b */
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f8554B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.p$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8555a;

        static {
            int[] iArr = new int[M.b.values().length];
            try {
                iArr[M.b.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[M.b.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[M.b.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[M.b.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[M.b.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[M.b.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[M.b.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[M.b.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[M.b.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[M.b.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[M.b.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[M.b.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[M.b.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[M.b.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[M.b.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[M.b.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[M.b.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[M.b.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[M.b.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[M.b.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[M.b.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[M.b.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[M.b.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[M.b.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[M.b.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[M.b.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[M.b.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[M.b.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[M.b.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[M.b.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[M.b.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[M.b.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[M.b.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[M.b.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[M.b.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[M.b.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f8555a = iArr;
        }
    }

    public static final long a(ColorScheme colorScheme, long j10, float f10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC1554l.o(f8552b)).booleanValue();
        if (C3602t0.m(j10, colorScheme.getSurface()) && zBooleanValue) {
            j10 = i(colorScheme, f10);
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return j10;
    }

    public static final long b(ColorScheme colorScheme, long j10) {
        return C3602t0.m(j10, colorScheme.getPrimary()) ? colorScheme.getOnPrimary() : C3602t0.m(j10, colorScheme.getSecondary()) ? colorScheme.getOnSecondary() : C3602t0.m(j10, colorScheme.getTertiary()) ? colorScheme.getOnTertiary() : C3602t0.m(j10, colorScheme.getBackground()) ? colorScheme.getOnBackground() : C3602t0.m(j10, colorScheme.getError()) ? colorScheme.getOnError() : C3602t0.m(j10, colorScheme.getPrimaryContainer()) ? colorScheme.getOnPrimaryContainer() : C3602t0.m(j10, colorScheme.getSecondaryContainer()) ? colorScheme.getOnSecondaryContainer() : C3602t0.m(j10, colorScheme.getTertiaryContainer()) ? colorScheme.getOnTertiaryContainer() : C3602t0.m(j10, colorScheme.getErrorContainer()) ? colorScheme.getOnErrorContainer() : C3602t0.m(j10, colorScheme.getInverseSurface()) ? colorScheme.getInverseOnSurface() : C3602t0.m(j10, colorScheme.getSurface()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceVariant()) ? colorScheme.getOnSurfaceVariant() : C3602t0.m(j10, colorScheme.getSurfaceBright()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceContainer()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceContainerHigh()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceContainerHighest()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceContainerLow()) ? colorScheme.getOnSurface() : C3602t0.m(j10, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : C3602t0.INSTANCE.e();
    }

    public static final long c(long j10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        interfaceC1554l.S(-1680936624);
        long jB = b(C1252D.f7860a.a(interfaceC1554l, 6), j10);
        if (jB == 16) {
            jB = ((C3602t0) interfaceC1554l.o(C1298s.a())).getValue();
        }
        interfaceC1554l.I();
        if (C1560o.J()) {
            C1560o.R();
        }
        return jB;
    }

    public static final long d(ColorScheme colorScheme, M.b bVar) {
        switch (c.f8555a[bVar.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return colorScheme.getOnPrimary();
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return colorScheme.getOnPrimaryContainer();
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return colorScheme.getOnSecondary();
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return C3602t0.INSTANCE.e();
        }
    }

    public static final AbstractC1501G0<ColorScheme> e() {
        return f8551a;
    }

    public static final long f(M.b bVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jD = d(C1252D.f7860a.a(interfaceC1554l, 6), bVar);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jD;
    }

    public static final ColorScheme g(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    public static /* synthetic */ ColorScheme h(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jT = (i10 & 1) != 0 ? M.a.f11344a.t() : j10;
        return g(jT, (i10 & 2) != 0 ? M.a.f11344a.j() : j11, (i10 & 4) != 0 ? M.a.f11344a.u() : j12, (i10 & 8) != 0 ? M.a.f11344a.k() : j13, (i10 & 16) != 0 ? M.a.f11344a.e() : j14, (i10 & 32) != 0 ? M.a.f11344a.w() : j15, (i10 & 64) != 0 ? M.a.f11344a.l() : j16, (i10 & 128) != 0 ? M.a.f11344a.x() : j17, (i10 & 256) != 0 ? M.a.f11344a.m() : j18, (i10 & 512) != 0 ? M.a.f11344a.H() : j19, (i10 & 1024) != 0 ? M.a.f11344a.p() : j20, (i10 & 2048) != 0 ? M.a.f11344a.I() : j21, (i10 & 4096) != 0 ? M.a.f11344a.q() : j22, (i10 & 8192) != 0 ? M.a.f11344a.a() : j23, (i10 & 16384) != 0 ? M.a.f11344a.g() : j24, (i10 & 32768) != 0 ? M.a.f11344a.y() : j25, (i10 & 65536) != 0 ? M.a.f11344a.n() : j26, (i10 & 131072) != 0 ? M.a.f11344a.G() : j27, (i10 & 262144) != 0 ? M.a.f11344a.o() : j28, (i10 & 524288) != 0 ? jT : j29, (i10 & 1048576) != 0 ? M.a.f11344a.f() : j30, (i10 & 2097152) != 0 ? M.a.f11344a.d() : j31, (i10 & 4194304) != 0 ? M.a.f11344a.b() : j32, (i10 & 8388608) != 0 ? M.a.f11344a.h() : j33, (i10 & 16777216) != 0 ? M.a.f11344a.c() : j34, (i10 & 33554432) != 0 ? M.a.f11344a.i() : j35, (i10 & 67108864) != 0 ? M.a.f11344a.r() : j36, (i10 & 134217728) != 0 ? M.a.f11344a.s() : j37, (i10 & 268435456) != 0 ? M.a.f11344a.v() : j38, (i10 & 536870912) != 0 ? M.a.f11344a.z() : j39, (i10 & 1073741824) != 0 ? M.a.f11344a.A() : j40, (i10 & Integer.MIN_VALUE) != 0 ? M.a.f11344a.B() : j41, (i11 & 1) != 0 ? M.a.f11344a.C() : j42, (i11 & 2) != 0 ? M.a.f11344a.D() : j43, (i11 & 4) != 0 ? M.a.f11344a.E() : j44, (i11 & 8) != 0 ? M.a.f11344a.F() : j45);
    }

    public static final long i(ColorScheme colorScheme, float f10) {
        if (U0.h.w(f10, U0.h.u(0))) {
            return colorScheme.getSurface();
        }
        return C3606v0.g(C3602t0.k(colorScheme.getSurfaceTint(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
