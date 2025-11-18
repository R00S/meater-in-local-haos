package com.bumptech.glide.p140o;

import com.bumptech.glide.load.InterfaceC5428k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* renamed from: com.bumptech.glide.o.f */
/* loaded from: classes.dex */
public class C5557f {

    /* renamed from: a */
    private final List<a<?>> f13906a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* renamed from: com.bumptech.glide.o.f$a */
    private static final class a<T> {

        /* renamed from: a */
        private final Class<T> f13907a;

        /* renamed from: b */
        final InterfaceC5428k<T> f13908b;

        a(Class<T> cls, InterfaceC5428k<T> interfaceC5428k) {
            this.f13907a = cls;
            this.f13908b = interfaceC5428k;
        }

        /* renamed from: a */
        boolean m10862a(Class<?> cls) {
            return this.f13907a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m10860a(Class<Z> cls, InterfaceC5428k<Z> interfaceC5428k) {
        this.f13906a.add(new a<>(cls, interfaceC5428k));
    }

    /* renamed from: b */
    public synchronized <Z> InterfaceC5428k<Z> m10861b(Class<Z> cls) {
        int size = this.f13906a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = this.f13906a.get(i2);
            if (aVar.m10862a(cls)) {
                return (InterfaceC5428k<Z>) aVar.f13908b;
            }
        }
        return null;
    }
}
