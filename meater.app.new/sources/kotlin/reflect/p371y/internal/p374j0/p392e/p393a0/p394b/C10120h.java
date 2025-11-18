package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;

/* compiled from: JvmNameResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.h */
/* loaded from: classes3.dex */
public final class C10120h {
    /* renamed from: a */
    public static final List<C10112a.e.c> m34255a(List<C10112a.e.c> list) {
        C9801m.m32346f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C10112a.e.c cVar : list) {
            int iM34207F = cVar.m34207F();
            for (int i2 = 0; i2 < iM34207F; i2++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
