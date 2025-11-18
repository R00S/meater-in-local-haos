package org.parceler;

import java.util.ArrayList;
import java.util.List;

/* compiled from: IdentityCollection.java */
/* renamed from: org.parceler.a */
/* loaded from: classes3.dex */
public final class C11184a {

    /* renamed from: a */
    private static final Object f41990a = new Object();

    /* renamed from: b */
    private final List<Object> f41991b = new ArrayList();

    public C11184a() {
        m39865e(null);
    }

    /* renamed from: a */
    public boolean m39861a(int i2) {
        return i2 < this.f41991b.size();
    }

    /* renamed from: b */
    public <T> T m39862b(int i2) {
        return (T) this.f41991b.get(i2);
    }

    /* renamed from: c */
    public int m39863c(Object obj) {
        for (int i2 = 0; i2 < this.f41991b.size(); i2++) {
            if (this.f41991b.get(i2) == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public boolean m39864d(int i2) {
        return this.f41991b.get(i2) == f41990a;
    }

    /* renamed from: e */
    public int m39865e(Object obj) {
        this.f41991b.add(obj);
        return this.f41991b.size() - 1;
    }

    /* renamed from: f */
    public void m39866f(int i2, Object obj) {
        if (this.f41991b.size() > i2) {
            this.f41991b.remove(i2);
        }
        this.f41991b.add(i2, obj);
    }

    /* renamed from: g */
    public int m39867g() {
        return m39865e(f41990a);
    }
}
