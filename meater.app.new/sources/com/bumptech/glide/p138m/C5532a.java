package com.bumptech.glide.p138m;

import com.bumptech.glide.p145r.C5597k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* renamed from: com.bumptech.glide.m.a */
/* loaded from: classes.dex */
class C5532a implements InterfaceC5539h {

    /* renamed from: a */
    private final Set<InterfaceC5540i> f13855a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f13856b;

    /* renamed from: c */
    private boolean f13857c;

    C5532a() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5539h
    /* renamed from: a */
    public void mo10783a(InterfaceC5540i interfaceC5540i) {
        this.f13855a.add(interfaceC5540i);
        if (this.f13857c) {
            interfaceC5540i.onDestroy();
        } else if (this.f13856b) {
            interfaceC5540i.onStart();
        } else {
            interfaceC5540i.onStop();
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5539h
    /* renamed from: b */
    public void mo10784b(InterfaceC5540i interfaceC5540i) {
        this.f13855a.remove(interfaceC5540i);
    }

    /* renamed from: c */
    void m10785c() {
        this.f13857c = true;
        Iterator it = C5597k.m11053j(this.f13855a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5540i) it.next()).onDestroy();
        }
    }

    /* renamed from: d */
    void m10786d() {
        this.f13856b = true;
        Iterator it = C5597k.m11053j(this.f13855a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5540i) it.next()).onStart();
        }
    }

    /* renamed from: e */
    void m10787e() {
        this.f13856b = false;
        Iterator it = C5597k.m11053j(this.f13855a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5540i) it.next()).onStop();
        }
    }
}
