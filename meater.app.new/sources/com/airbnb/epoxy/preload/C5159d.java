package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.InterfaceC5158c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;

/* compiled from: PreloadTargetProvider.kt */
/* renamed from: com.airbnb.epoxy.preload.d */
/* loaded from: classes.dex */
public final class C5159d<P extends InterfaceC5158c> {

    /* renamed from: a */
    private final ArrayDeque<P> f12275a;

    public C5159d(int i2, Function0<? extends P> function0) {
        C9801m.m32347g(function0, "requestHolderFactory");
        IntRange intRangeM32428k = C9848l.m32428k(0, i2);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(intRangeM32428k, 10));
        Iterator<Integer> it = intRangeM32428k.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).mo32397b();
            arrayList.add(function0.invoke());
        }
        this.f12275a = new ArrayDeque<>(arrayList);
    }

    /* renamed from: a */
    public final void m9341a() {
        Iterator<T> it = this.f12275a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5158c) it.next()).clear();
        }
    }

    /* renamed from: b */
    public final P m9342b() {
        P pPoll = this.f12275a.poll();
        this.f12275a.offer(pPoll);
        pPoll.clear();
        C9801m.m32342b(pPoll, "result");
        return pPoll;
    }
}
