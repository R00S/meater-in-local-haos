package com.google.gson.p215t;

import com.google.gson.AbstractC8578q;
import com.google.gson.C8563b;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8562a;
import com.google.gson.InterfaceC8579r;
import com.google.gson.p214s.InterfaceC8580a;
import com.google.gson.p214s.InterfaceC8583d;
import com.google.gson.p214s.InterfaceC8584e;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Excluder.java */
/* renamed from: com.google.gson.t.d */
/* loaded from: classes2.dex */
public final class C8591d implements InterfaceC8579r, Cloneable {

    /* renamed from: f */
    public static final C8591d f32527f = new C8591d();

    /* renamed from: j */
    private boolean f32531j;

    /* renamed from: g */
    private double f32528g = -1.0d;

    /* renamed from: h */
    private int f32529h = 136;

    /* renamed from: i */
    private boolean f32530i = true;

    /* renamed from: k */
    private List<InterfaceC8562a> f32532k = Collections.emptyList();

    /* renamed from: l */
    private List<InterfaceC8562a> f32533l = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Excluder.java */
    /* renamed from: com.google.gson.t.d$a */
    class a<T> extends AbstractC8578q<T> {

        /* renamed from: a */
        private AbstractC8578q<T> f32534a;

        /* renamed from: b */
        final /* synthetic */ boolean f32535b;

        /* renamed from: c */
        final /* synthetic */ boolean f32536c;

        /* renamed from: d */
        final /* synthetic */ C8566e f32537d;

        /* renamed from: e */
        final /* synthetic */ C8619a f32538e;

        a(boolean z, boolean z2, C8566e c8566e, C8619a c8619a) {
            this.f32535b = z;
            this.f32536c = z2;
            this.f32537d = c8566e;
            this.f32538e = c8619a;
        }

        /* renamed from: e */
        private AbstractC8578q<T> m27083e() {
            AbstractC8578q<T> abstractC8578q = this.f32534a;
            if (abstractC8578q != null) {
                return abstractC8578q;
            }
            AbstractC8578q<T> abstractC8578qM26928l = this.f32537d.m26928l(C8591d.this, this.f32538e);
            this.f32534a = abstractC8578qM26928l;
            return abstractC8578qM26928l;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: b */
        public T mo26938b(C8585a c8585a) throws IOException {
            if (!this.f32535b) {
                return m27083e().mo26938b(c8585a);
            }
            c8585a.mo27011n0();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: d */
        public void mo26939d(C8587c c8587c, T t) throws IOException {
            if (this.f32536c) {
                c8587c.mo27043y();
            } else {
                m27083e().mo26939d(c8587c, t);
            }
        }
    }

    /* renamed from: f */
    private boolean m27072f(Class<?> cls) {
        if (this.f32528g == -1.0d || m27079n((InterfaceC8583d) cls.getAnnotation(InterfaceC8583d.class), (InterfaceC8584e) cls.getAnnotation(InterfaceC8584e.class))) {
            return (!this.f32530i && m27075j(cls)) || m27074i(cls);
        }
        return true;
    }

    /* renamed from: g */
    private boolean m27073g(Class<?> cls, boolean z) {
        Iterator<InterfaceC8562a> it = (z ? this.f32532k : this.f32533l).iterator();
        while (it.hasNext()) {
            if (it.next().m26911b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m27074i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: j */
    private boolean m27075j(Class<?> cls) {
        return cls.isMemberClass() && !m27076k(cls);
    }

    /* renamed from: k */
    private boolean m27076k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    private boolean m27077l(InterfaceC8583d interfaceC8583d) {
        return interfaceC8583d == null || interfaceC8583d.value() <= this.f32528g;
    }

    /* renamed from: m */
    private boolean m27078m(InterfaceC8584e interfaceC8584e) {
        return interfaceC8584e == null || interfaceC8584e.value() > this.f32528g;
    }

    /* renamed from: n */
    private boolean m27079n(InterfaceC8583d interfaceC8583d, InterfaceC8584e interfaceC8584e) {
        return m27077l(interfaceC8583d) && m27078m(interfaceC8584e);
    }

    @Override // com.google.gson.InterfaceC8579r
    /* renamed from: b */
    public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
        Class<? super T> rawType = c8619a.getRawType();
        boolean zM27072f = m27072f(rawType);
        boolean z = zM27072f || m27073g(rawType, true);
        boolean z2 = zM27072f || m27073g(rawType, false);
        if (z || z2) {
            return new a(z2, z, c8566e, c8619a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8591d clone() {
        try {
            return (C8591d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: e */
    public boolean m27081e(Class<?> cls, boolean z) {
        return m27072f(cls) || m27073g(cls, z);
    }

    /* renamed from: h */
    public boolean m27082h(Field field, boolean z) {
        InterfaceC8580a interfaceC8580a;
        if ((this.f32529h & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f32528g != -1.0d && !m27079n((InterfaceC8583d) field.getAnnotation(InterfaceC8583d.class), (InterfaceC8584e) field.getAnnotation(InterfaceC8584e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f32531j && ((interfaceC8580a = (InterfaceC8580a) field.getAnnotation(InterfaceC8580a.class)) == null || (!z ? interfaceC8580a.deserialize() : interfaceC8580a.serialize()))) {
            return true;
        }
        if ((!this.f32530i && m27075j(field.getType())) || m27074i(field.getType())) {
            return true;
        }
        List<InterfaceC8562a> list = z ? this.f32532k : this.f32533l;
        if (list.isEmpty()) {
            return false;
        }
        C8563b c8563b = new C8563b(field);
        Iterator<InterfaceC8562a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m26910a(c8563b)) {
                return true;
            }
        }
        return false;
    }
}
