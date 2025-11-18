package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final u f38890c = new u() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = com.google.gson.internal.b.g(typeD);
            return new ArrayTypeAdapter(gson, gson.m(P9.a.b(typeG)), com.google.gson.internal.b.k(typeG));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f38891a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<E> f38892b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f38892b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f38891a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(Q9.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.N() == Q9.b.NULL) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.m()) {
            arrayList.add(this.f38892b.read(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        if (!this.f38891a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f38891a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f38891a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.p();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f38892b.write(cVar, Array.get(obj, i10));
        }
        cVar.f();
    }
}
