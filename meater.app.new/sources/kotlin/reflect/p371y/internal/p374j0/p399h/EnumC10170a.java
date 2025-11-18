package kotlin.reflect.p371y.internal.p374j0.p399h;

import kotlin.jvm.internal.C9789g;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.f0.y.e.j0.h.a */
/* loaded from: classes3.dex */
public enum EnumC10170a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* renamed from: j */
    private final boolean f39366j;

    /* renamed from: k */
    private final boolean f39367k;

    EnumC10170a(boolean z, boolean z2) {
        this.f39366j = z;
        this.f39367k = z2;
    }

    /* renamed from: k */
    public final boolean m35494k() {
        return this.f39366j;
    }

    /* renamed from: q */
    public final boolean m35495q() {
        return this.f39367k;
    }

    /* synthetic */ EnumC10170a(boolean z, boolean z2, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }
}
