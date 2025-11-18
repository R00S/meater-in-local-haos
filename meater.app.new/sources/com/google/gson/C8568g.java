package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* renamed from: com.google.gson.g */
/* loaded from: classes2.dex */
public final class C8568g extends AbstractC8571j implements Iterable<AbstractC8571j> {

    /* renamed from: f */
    private final List<AbstractC8571j> f32448f = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8568g) && ((C8568g) obj).f32448f.equals(this.f32448f));
    }

    public int hashCode() {
        return this.f32448f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC8571j> iterator() {
        return this.f32448f.iterator();
    }

    /* renamed from: q */
    public void m26952q(AbstractC8571j abstractC8571j) {
        if (abstractC8571j == null) {
            abstractC8571j = C8572k.f32449a;
        }
        this.f32448f.add(abstractC8571j);
    }
}
