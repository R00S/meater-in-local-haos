package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8579r;
import com.google.gson.p215t.C8589b;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* renamed from: com.google.gson.t.n.a */
/* loaded from: classes2.dex */
public final class C8601a<E> extends AbstractC8578q<Object> {

    /* renamed from: a */
    public static final InterfaceC8579r f32577a = new a();

    /* renamed from: b */
    private final Class<E> f32578b;

    /* renamed from: c */
    private final AbstractC8578q<E> f32579c;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.a$a */
    static class a implements InterfaceC8579r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            Type type = c8619a.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeM27052g = C8589b.m27052g(type);
            return new C8601a(c8566e, c8566e.m26926j(C8619a.get(typeM27052g)), C8589b.m27056k(typeM27052g));
        }
    }

    public C8601a(C8566e c8566e, AbstractC8578q<E> abstractC8578q, Class<E> cls) {
        this.f32579c = new C8613m(c8566e, abstractC8578q, cls);
        this.f32578b = cls;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: b */
    public Object mo26938b(C8585a c8585a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c8585a.mo27001Q() == EnumC8586b.NULL) {
            c8585a.mo26999I();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8585a.mo27002a();
        while (c8585a.mo27009l()) {
            arrayList.add(this.f32579c.mo26938b(c8585a));
        }
        c8585a.mo27006f();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f32578b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: d */
    public void mo26939d(C8587c c8587c, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c8587c.mo27043y();
            return;
        }
        c8587c.mo27035c();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f32579c.mo26939d(c8587c, Array.get(obj, i2));
        }
        c8587c.mo27037f();
    }
}
