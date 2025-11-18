package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RolloutAssignmentList.java */
/* renamed from: com.google.firebase.crashlytics.h.o.k */
/* loaded from: classes2.dex */
public class C8245k {

    /* renamed from: a */
    private final List<AbstractC8244j> f31111a = new ArrayList();

    /* renamed from: b */
    private final int f31112b;

    public C8245k(int i2) {
        this.f31112b = i2;
    }

    /* renamed from: a */
    public List<AbstractC8258f0.e.d.AbstractC11514e> m25533a() {
        List<AbstractC8244j> listM25534b = m25534b();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listM25534b.size(); i2++) {
            arrayList.add(listM25534b.get(i2).m25532h());
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized List<AbstractC8244j> m25534b() {
        return Collections.unmodifiableList(new ArrayList(this.f31111a));
    }

    /* renamed from: c */
    public synchronized boolean m25535c(List<AbstractC8244j> list) {
        this.f31111a.clear();
        if (list.size() <= this.f31112b) {
            return this.f31111a.addAll(list);
        }
        C8179h.m25176f().m25185k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f31112b);
        return this.f31111a.addAll(list.subList(0, this.f31112b));
    }
}
