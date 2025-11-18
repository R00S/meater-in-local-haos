package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.p215t.p216n.C8609i;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: com.google.gson.t.n.m */
/* loaded from: classes2.dex */
final class C8613m<T> extends AbstractC8578q<T> {

    /* renamed from: a */
    private final C8566e f32635a;

    /* renamed from: b */
    private final AbstractC8578q<T> f32636b;

    /* renamed from: c */
    private final Type f32637c;

    C8613m(C8566e c8566e, AbstractC8578q<T> abstractC8578q, Type type) {
        this.f32635a = c8566e;
        this.f32636b = abstractC8578q;
        this.f32637c = type;
    }

    /* renamed from: e */
    private Type m27148e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: b */
    public T mo26938b(C8585a c8585a) throws IOException {
        return this.f32636b.mo26938b(c8585a);
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: d */
    public void mo26939d(C8587c c8587c, T t) throws IOException {
        AbstractC8578q<T> abstractC8578qM26926j = this.f32636b;
        Type typeM27148e = m27148e(this.f32637c, t);
        if (typeM27148e != this.f32637c) {
            abstractC8578qM26926j = this.f32635a.m26926j(C8619a.get(typeM27148e));
            if (abstractC8578qM26926j instanceof C8609i.b) {
                AbstractC8578q<T> abstractC8578q = this.f32636b;
                if (!(abstractC8578q instanceof C8609i.b)) {
                    abstractC8578qM26926j = abstractC8578q;
                }
            }
        }
        abstractC8578qM26926j.mo26939d(c8587c, t);
    }
}
