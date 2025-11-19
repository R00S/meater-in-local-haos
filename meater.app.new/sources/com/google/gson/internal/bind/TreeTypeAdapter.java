package com.google.gson.internal.bind;

import Q9.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.u;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<T> f38943a;

    /* renamed from: b, reason: collision with root package name */
    private final i<T> f38944b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f38945c;

    /* renamed from: d, reason: collision with root package name */
    private final P9.a<T> f38946d;

    /* renamed from: e, reason: collision with root package name */
    private final u f38947e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f38948f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f38949g;

    /* renamed from: h, reason: collision with root package name */
    private volatile TypeAdapter<T> f38950h;

    private static final class SingleTypeFactory implements u {

        /* renamed from: B, reason: collision with root package name */
        private final P9.a<?> f38951B;

        /* renamed from: C, reason: collision with root package name */
        private final boolean f38952C;

        /* renamed from: D, reason: collision with root package name */
        private final Class<?> f38953D;

        /* renamed from: E, reason: collision with root package name */
        private final p<?> f38954E;

        /* renamed from: F, reason: collision with root package name */
        private final i<?> f38955F;

        SingleTypeFactory(Object obj, P9.a<?> aVar, boolean z10, Class<?> cls) {
            p<?> pVar = obj instanceof p ? (p) obj : null;
            this.f38954E = pVar;
            i<?> iVar = obj instanceof i ? (i) obj : null;
            this.f38955F = iVar;
            com.google.gson.internal.a.a((pVar == null && iVar == null) ? false : true);
            this.f38951B = aVar;
            this.f38952C = z10;
            this.f38953D = cls;
        }

        @Override // com.google.gson.u
        public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
            P9.a<?> aVar2 = this.f38951B;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f38952C && this.f38951B.d() == aVar.c()) : this.f38953D.isAssignableFrom(aVar.c())) {
                return new TreeTypeAdapter(this.f38954E, this.f38955F, gson, aVar, this);
            }
            return null;
        }
    }

    private final class b implements o, h {
        private b() {
        }
    }

    public TreeTypeAdapter(p<T> pVar, i<T> iVar, Gson gson, P9.a<T> aVar, u uVar, boolean z10) {
        this.f38948f = new b();
        this.f38943a = pVar;
        this.f38944b = iVar;
        this.f38945c = gson;
        this.f38946d = aVar;
        this.f38947e = uVar;
        this.f38949g = z10;
    }

    private TypeAdapter<T> b() {
        TypeAdapter<T> typeAdapter = this.f38950h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> typeAdapterO = this.f38945c.o(this.f38947e, this.f38946d);
        this.f38950h = typeAdapterO;
        return typeAdapterO;
    }

    public static u c(P9.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.d() == aVar.c(), null);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> a() {
        return this.f38943a != null ? this : b();
    }

    @Override // com.google.gson.TypeAdapter
    public T read(Q9.a aVar) {
        if (this.f38944b == null) {
            return b().read(aVar);
        }
        j jVarA = l.a(aVar);
        if (this.f38949g && jVarA.x()) {
            return null;
        }
        return this.f38944b.a(jVarA, this.f38946d.d(), this.f38948f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, T t10) throws IOException {
        p<T> pVar = this.f38943a;
        if (pVar == null) {
            b().write(cVar, t10);
        } else if (this.f38949g && t10 == null) {
            cVar.p();
        } else {
            l.b(pVar.a(t10, this.f38946d.d(), this.f38948f), cVar);
        }
    }

    public TreeTypeAdapter(p<T> pVar, i<T> iVar, Gson gson, P9.a<T> aVar, u uVar) {
        this(pVar, iVar, gson, aVar, uVar, true);
    }
}
