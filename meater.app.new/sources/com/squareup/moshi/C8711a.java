package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: ArrayJsonAdapter.java */
/* renamed from: com.squareup.moshi.a */
/* loaded from: classes2.dex */
final class C8711a extends AbstractC8716f<Object> {

    /* renamed from: a */
    public static final AbstractC8716f.e f33071a = new a();

    /* renamed from: b */
    private final Class<?> f33072b;

    /* renamed from: c */
    private final AbstractC8716f<Object> f33073c;

    /* compiled from: ArrayJsonAdapter.java */
    /* renamed from: com.squareup.moshi.a$a */
    class a implements AbstractC8716f.e {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8716f.e
        /* renamed from: a */
        public AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r) {
            Type typeM27842a = C8731u.m27842a(type);
            if (typeM27842a != null && set.isEmpty()) {
                return new C8711a(C8731u.m27848g(typeM27842a), c8728r.m27811d(typeM27842a)).nullSafe();
            }
            return null;
        }
    }

    C8711a(Class<?> cls, AbstractC8716f<Object> abstractC8716f) {
        this.f33072b = cls;
        this.f33073c = abstractC8716f;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public Object fromJson(AbstractC8719i abstractC8719i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        ArrayList arrayList = new ArrayList();
        abstractC8719i.mo27710a();
        while (abstractC8719i.mo27715f()) {
            arrayList.add(this.f33073c.fromJson(abstractC8719i));
        }
        abstractC8719i.mo27712c();
        Object objNewInstance = Array.newInstance(this.f33072b, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, Object obj) throws IOException {
        abstractC8725o.mo27756a();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f33073c.toJson(abstractC8725o, (AbstractC8725o) Array.get(obj, i2));
        }
        abstractC8725o.mo27758d();
    }

    public String toString() {
        return this.f33073c + ".array()";
    }
}
