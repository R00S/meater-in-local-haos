package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ViewModelStore.java */
/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public class C0530z {

    /* renamed from: a */
    private final HashMap<String, AbstractC0528x> f3521a = new HashMap<>();

    /* renamed from: a */
    public final void m3919a() {
        Iterator<AbstractC0528x> it = this.f3521a.values().iterator();
        while (it.hasNext()) {
            it.next().m3912a();
        }
        this.f3521a.clear();
    }

    /* renamed from: b */
    final AbstractC0528x m3920b(String str) {
        return this.f3521a.get(str);
    }

    /* renamed from: c */
    Set<String> m3921c() {
        return new HashSet(this.f3521a.keySet());
    }

    /* renamed from: d */
    final void m3922d(String str, AbstractC0528x abstractC0528x) {
        AbstractC0528x abstractC0528xPut = this.f3521a.put(str, abstractC0528x);
        if (abstractC0528xPut != null) {
            abstractC0528xPut.mo3674d();
        }
    }
}
