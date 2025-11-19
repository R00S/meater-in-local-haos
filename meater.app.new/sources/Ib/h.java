package Ib;

import Hb.U;
import Ra.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final G<t<C>> f6983a = new G<>("KotlinTypeRefiner");

    public static final G<t<C>> a() {
        return f6983a;
    }

    public static final List<U> b(g gVar, Iterable<? extends U> types) {
        C3862t.g(gVar, "<this>");
        C3862t.g(types, "types");
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(types, 10));
        Iterator<? extends U> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
