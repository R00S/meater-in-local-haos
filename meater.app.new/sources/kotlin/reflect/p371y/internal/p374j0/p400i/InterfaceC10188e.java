package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;

/* compiled from: ExternalOverridabilityCondition.java */
/* renamed from: kotlin.f0.y.e.j0.i.e */
/* loaded from: classes3.dex */
public interface InterfaceC10188e {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.f0.y.e.j0.i.e$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.f0.y.e.j0.i.e$b */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    a mo33227a();

    /* renamed from: b */
    b mo33228b(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e);
}
