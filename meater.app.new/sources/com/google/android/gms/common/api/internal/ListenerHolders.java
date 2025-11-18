package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
/* loaded from: classes2.dex */
public class ListenerHolders {

    /* renamed from: a */
    private final Set<ListenerHolder<?>> f17380a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void m14046a() {
        Iterator<ListenerHolder<?>> it = this.f17380a.iterator();
        while (it.hasNext()) {
            it.next().m14043a();
        }
        this.f17380a.clear();
    }
}
