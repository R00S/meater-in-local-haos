package tb;

import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;

/* compiled from: ExternalOverridabilityCondition.java */
/* renamed from: tb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4598j {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: tb.j$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: tb.j$b */
    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, InterfaceC1692e interfaceC1692e);

    a b();
}
