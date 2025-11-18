package com.squareup.moshi.p231w;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.AbstractC8725o;
import java.io.IOException;

/* compiled from: NullSafeJsonAdapter.java */
/* renamed from: com.squareup.moshi.w.b */
/* loaded from: classes2.dex */
public final class C8734b<T> extends AbstractC8716f<T> {

    /* renamed from: a */
    private final AbstractC8716f<T> f33224a;

    public C8734b(AbstractC8716f<T> abstractC8716f) {
        this.f33224a = abstractC8716f;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
        return abstractC8719i.mo27699A() == AbstractC8719i.b.NULL ? (T) abstractC8719i.mo27722x() : this.f33224a.fromJson(abstractC8719i);
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
        if (t == null) {
            abstractC8725o.mo27761m();
        } else {
            this.f33224a.toJson(abstractC8725o, (AbstractC8725o) t);
        }
    }

    public String toString() {
        return this.f33224a + ".nullSafe()";
    }
}
