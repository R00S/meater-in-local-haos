package o0;

import i0.BlendModeColorFilter;
import i0.C3566b0;
import i0.C3602t0;
import i0.C3604u0;
import i0.T0;
import i0.e1;
import i0.f1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Li0/t0;", "other", "", "e", "(JJ)Z", "Li0/u0;", "f", "(Li0/u0;)Z", "", "Lo0/g;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "EmptyPath", "Li0/e1;", "b", "I", "()I", "DefaultStrokeLineCap", "Li0/f1;", "c", "DefaultStrokeLineJoin", "Li0/b0;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Li0/T0;", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4093n {

    /* renamed from: a, reason: collision with root package name */
    private static final List<AbstractC4086g> f46234a = kotlin.collections.r.m();

    /* renamed from: b, reason: collision with root package name */
    private static final int f46235b = e1.INSTANCE.a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f46236c = f1.INSTANCE.b();

    /* renamed from: d, reason: collision with root package name */
    private static final int f46237d = C3566b0.INSTANCE.z();

    /* renamed from: e, reason: collision with root package name */
    private static final long f46238e = C3602t0.INSTANCE.d();

    /* renamed from: f, reason: collision with root package name */
    private static final int f46239f = T0.INSTANCE.b();

    public static final int a() {
        return f46239f;
    }

    public static final int b() {
        return f46235b;
    }

    public static final int c() {
        return f46236c;
    }

    public static final List<AbstractC4086g> d() {
        return f46234a;
    }

    public static final boolean e(long j10, long j11) {
        return C3602t0.r(j10) == C3602t0.r(j11) && C3602t0.q(j10) == C3602t0.q(j11) && C3602t0.o(j10) == C3602t0.o(j11);
    }

    public static final boolean f(C3604u0 c3604u0) {
        if (c3604u0 instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) c3604u0;
            int blendMode = blendModeColorFilter.getBlendMode();
            C3566b0.Companion companion = C3566b0.INSTANCE;
            if (C3566b0.E(blendMode, companion.z()) || C3566b0.E(blendModeColorFilter.getBlendMode(), companion.B())) {
                return true;
            }
        } else if (c3604u0 == null) {
            return true;
        }
        return false;
    }
}
