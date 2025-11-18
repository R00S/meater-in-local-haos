package com.google.firebase.encoders.p194i;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.InterfaceC8329e;
import com.google.firebase.encoders.p192g.InterfaceC8331a;
import com.google.firebase.encoders.p192g.InterfaceC8332b;
import com.google.firebase.encoders.p194i.C8346h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* renamed from: com.google.firebase.encoders.i.h */
/* loaded from: classes2.dex */
public class C8346h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC8327c<?>> f31688a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC8329e<?>> f31689b;

    /* renamed from: c */
    private final InterfaceC8327c<Object> f31690c;

    /* compiled from: ProtobufEncoder.java */
    /* renamed from: com.google.firebase.encoders.i.h$a */
    public static final class a implements InterfaceC8332b<a> {

        /* renamed from: a */
        private static final InterfaceC8327c<Object> f31691a = new InterfaceC8327c() { // from class: com.google.firebase.encoders.i.b
            @Override // com.google.firebase.encoders.InterfaceC8327c
            /* renamed from: a */
            public final void mo13444a(Object obj, Object obj2) throws IOException {
                C8346h.a.m26152d(obj, (InterfaceC8328d) obj2);
                throw null;
            }
        };

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC8327c<?>> f31692b = new HashMap();

        /* renamed from: c */
        private final Map<Class<?>, InterfaceC8329e<?>> f31693c = new HashMap();

        /* renamed from: d */
        private InterfaceC8327c<Object> f31694d = f31691a;

        /* renamed from: d */
        static /* synthetic */ void m26152d(Object obj, InterfaceC8328d interfaceC8328d) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: b */
        public C8346h m26153b() {
            return new C8346h(new HashMap(this.f31692b), new HashMap(this.f31693c), this.f31694d);
        }

        /* renamed from: c */
        public a m26154c(InterfaceC8331a interfaceC8331a) {
            interfaceC8331a.mo13443a(this);
            return this;
        }

        @Override // com.google.firebase.encoders.p192g.InterfaceC8332b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a mo26092a(Class<U> cls, InterfaceC8327c<? super U> interfaceC8327c) {
            this.f31692b.put(cls, interfaceC8327c);
            this.f31693c.remove(cls);
            return this;
        }
    }

    C8346h(Map<Class<?>, InterfaceC8327c<?>> map, Map<Class<?>, InterfaceC8329e<?>> map2, InterfaceC8327c<Object> interfaceC8327c) {
        this.f31688a = map;
        this.f31689b = map2;
        this.f31690c = interfaceC8327c;
    }

    /* renamed from: a */
    public static a m26149a() {
        return new a();
    }

    /* renamed from: b */
    public void m26150b(Object obj, OutputStream outputStream) throws IOException {
        new C8345g(outputStream, this.f31688a, this.f31689b, this.f31690c).m26148u(obj);
    }

    /* renamed from: c */
    public byte[] m26151c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m26150b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
