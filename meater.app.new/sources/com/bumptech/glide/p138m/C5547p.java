package com.bumptech.glide.p138m;

import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p145r.C5597k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* renamed from: com.bumptech.glide.m.p */
/* loaded from: classes.dex */
public final class C5547p implements InterfaceC5540i {

    /* renamed from: f */
    private final Set<InterfaceC5577i<?>> f13890f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m10833a() {
        this.f13890f.clear();
    }

    /* renamed from: b */
    public List<InterfaceC5577i<?>> m10834b() {
        return C5597k.m11053j(this.f13890f);
    }

    /* renamed from: c */
    public void m10835c(InterfaceC5577i<?> interfaceC5577i) {
        this.f13890f.add(interfaceC5577i);
    }

    /* renamed from: d */
    public void m10836d(InterfaceC5577i<?> interfaceC5577i) {
        this.f13890f.remove(interfaceC5577i);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onDestroy() {
        Iterator it = C5597k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5577i) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStart() {
        Iterator it = C5597k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5577i) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public void onStop() {
        Iterator it = C5597k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5577i) it.next()).onStop();
        }
    }
}
