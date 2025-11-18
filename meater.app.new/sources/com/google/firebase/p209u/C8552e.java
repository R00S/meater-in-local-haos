package com.google.firebase.p209u;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* renamed from: com.google.firebase.u.e */
/* loaded from: classes2.dex */
public class C8552e {

    /* renamed from: a */
    private static volatile C8552e f32409a;

    /* renamed from: b */
    private final Set<AbstractC8554g> f32410b = new HashSet();

    C8552e() {
    }

    /* renamed from: a */
    public static C8552e m26899a() {
        C8552e c8552e = f32409a;
        if (c8552e == null) {
            synchronized (C8552e.class) {
                c8552e = f32409a;
                if (c8552e == null) {
                    c8552e = new C8552e();
                    f32409a = c8552e;
                }
            }
        }
        return c8552e;
    }

    /* renamed from: b */
    Set<AbstractC8554g> m26900b() {
        Set<AbstractC8554g> setUnmodifiableSet;
        synchronized (this.f32410b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f32410b);
        }
        return setUnmodifiableSet;
    }
}
