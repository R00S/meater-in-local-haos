package kotlin;

import U0.h;
import i0.C3602t0;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ElevationOverlay.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Li0/t0;", "backgroundColor", "LU0/h;", "elevation", "b", "(JFLO/l;I)J", "LO/G0;", "LI/C;", "a", "LO/G0;", "d", "()LO/G0;", "LocalElevationOverlay", "c", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117D {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC1116C> f5833a = C1576w.f(b.f5836B);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<h> f5834b = C1576w.d(null, a.f5835B, 1, null);

    /* compiled from: ElevationOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/h;", "a", "()F"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.D$a */
    static final class a extends AbstractC3864v implements Ba.a<h> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5835B = new a();

        a() {
            super(0);
        }

        public final float a() {
            return h.u(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.p(a());
        }
    }

    /* compiled from: ElevationOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI/C;", "a", "()LI/C;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.D$b */
    static final class b extends AbstractC3864v implements Ba.a<InterfaceC1116C> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f5836B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1116C invoke() {
            return C1154q.f6446a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, float f10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long jK = C3602t0.k(C1146i.b(j10, interfaceC1554l, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jK;
    }

    public static final AbstractC1501G0<h> c() {
        return f5834b;
    }

    public static final AbstractC1501G0<InterfaceC1116C> d() {
        return f5833a;
    }
}
