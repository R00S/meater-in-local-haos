package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InvalidationLiveDataContainer.java */
/* renamed from: androidx.room.f */
/* loaded from: classes.dex */
class C0647f {

    /* renamed from: a */
    final Set<LiveData> f4253a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final AbstractC0651j f4254b;

    C0647f(AbstractC0651j abstractC0651j) {
        this.f4254b = abstractC0651j;
    }
}
