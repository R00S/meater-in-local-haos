package com.airbnb.lottie.p112s.p113i;

import com.airbnb.lottie.p119w.C5321a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* renamed from: com.airbnb.lottie.s.i.n */
/* loaded from: classes.dex */
abstract class AbstractC5250n<V, O> implements InterfaceC5249m<V, O> {

    /* renamed from: a */
    final List<C5321a<V>> f12692a;

    AbstractC5250n(V v) {
        this(Collections.singletonList(new C5321a(v)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f12692a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f12692a.toArray()));
        }
        return sb.toString();
    }

    AbstractC5250n(List<C5321a<V>> list) {
        this.f12692a = list;
    }
}
