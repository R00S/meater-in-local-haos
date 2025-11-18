package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.j */
/* loaded from: classes3.dex */
public final class C10253j {
    /* renamed from: a */
    public static final Set<C10163f> m36161a(Iterable<? extends InterfaceC10251h> iterable) {
        C9801m.m32346f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends InterfaceC10251h> it = iterable.iterator();
        while (it.hasNext()) {
            Set<C10163f> setMo33315e = it.next().mo33315e();
            if (setMo33315e == null) {
                return null;
            }
            C10827z.m38933z(hashSet, setMo33315e);
        }
        return hashSet;
    }
}
