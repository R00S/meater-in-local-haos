package kotlin.reflect.p371y.internal.p374j0.p400i.p404s;

import kotlin.jvm.internal.C9801m;

/* compiled from: DeprecationInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.i.s.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10231a implements Comparable<AbstractC10231a> {
    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC10231a abstractC10231a) {
        C9801m.m32346f(abstractC10231a, "other");
        int iCompareTo = mo33147k().compareTo(abstractC10231a.mo33147k());
        if (iCompareTo == 0 && !mo36064q() && abstractC10231a.mo36064q()) {
            return 1;
        }
        return iCompareTo;
    }

    /* renamed from: k */
    public abstract EnumC10232b mo33147k();

    /* renamed from: q */
    public abstract boolean mo36064q();
}
