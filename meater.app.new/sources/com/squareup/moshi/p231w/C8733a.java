package com.squareup.moshi.p231w;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.AbstractC8725o;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;

/* compiled from: NonNullJsonAdapter.java */
/* renamed from: com.squareup.moshi.w.a */
/* loaded from: classes2.dex */
public final class C8733a<T> extends AbstractC8716f<T> {

    /* renamed from: a */
    private final AbstractC8716f<T> f33223a;

    public C8733a(AbstractC8716f<T> abstractC8716f) {
        this.f33223a = abstractC8716f;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
        if (abstractC8719i.mo27699A() != AbstractC8719i.b.NULL) {
            return this.f33223a.fromJson(abstractC8719i);
        }
        throw new JsonDataException("Unexpected null at " + abstractC8719i.m27716g());
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
        if (t != null) {
            this.f33223a.toJson(abstractC8725o, (AbstractC8725o) t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + abstractC8725o.m27776g());
    }

    public String toString() {
        return this.f33223a + ".nonNull()";
    }
}
