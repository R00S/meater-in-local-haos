package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8579r;
import com.google.gson.p215t.C8589b;
import com.google.gson.p215t.C8590c;
import com.google.gson.p215t.InterfaceC8596i;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.b */
/* loaded from: classes2.dex */
public final class C8602b implements InterfaceC8579r {

    /* renamed from: f */
    private final C8590c f32580f;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.b$a */
    private static final class a<E> extends AbstractC8578q<Collection<E>> {

        /* renamed from: a */
        private final AbstractC8578q<E> f32581a;

        /* renamed from: b */
        private final InterfaceC8596i<? extends Collection<E>> f32582b;

        public a(C8566e c8566e, Type type, AbstractC8578q<E> abstractC8578q, InterfaceC8596i<? extends Collection<E>> interfaceC8596i) {
            this.f32581a = new C8613m(c8566e, abstractC8578q, type);
            this.f32582b = interfaceC8596i;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            Collection<E> collectionMo27071a = this.f32582b.mo27071a();
            c8585a.mo27002a();
            while (c8585a.mo27009l()) {
                collectionMo27071a.add(this.f32581a.mo26938b(c8585a));
            }
            c8585a.mo27006f();
            return collectionMo27071a;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c8587c.mo27043y();
                return;
            }
            c8587c.mo27035c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f32581a.mo26939d(c8587c, it.next());
            }
            c8587c.mo27037f();
        }
    }

    public C8602b(C8590c c8590c) {
        this.f32580f = c8590c;
    }

    @Override // com.google.gson.InterfaceC8579r
    /* renamed from: b */
    public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
        Type type = c8619a.getType();
        Class<? super T> rawType = c8619a.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeM27053h = C8589b.m27053h(type, rawType);
        return new a(c8566e, typeM27053h, c8566e.m26926j(C8619a.get(typeM27053h)), this.f32580f.m27070a(c8619a));
    }
}
