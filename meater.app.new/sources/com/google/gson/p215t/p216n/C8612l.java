package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8571j;
import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.InterfaceC8569h;
import com.google.gson.InterfaceC8570i;
import com.google.gson.InterfaceC8575n;
import com.google.gson.InterfaceC8576o;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonParseException;
import com.google.gson.p215t.C8599l;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import java.io.IOException;

/* compiled from: TreeTypeAdapter.java */
/* renamed from: com.google.gson.t.n.l */
/* loaded from: classes2.dex */
public final class C8612l<T> extends AbstractC8578q<T> {

    /* renamed from: a */
    private final InterfaceC8576o<T> f32627a;

    /* renamed from: b */
    private final InterfaceC8570i<T> f32628b;

    /* renamed from: c */
    final C8566e f32629c;

    /* renamed from: d */
    private final C8619a<T> f32630d;

    /* renamed from: e */
    private final InterfaceC8579r f32631e;

    /* renamed from: f */
    private final C8612l<T>.b f32632f = new b();

    /* renamed from: g */
    private AbstractC8578q<T> f32633g;

    /* compiled from: TreeTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.l$b */
    private final class b implements InterfaceC8575n, InterfaceC8569h {
        private b() {
        }
    }

    public C8612l(InterfaceC8576o<T> interfaceC8576o, InterfaceC8570i<T> interfaceC8570i, C8566e c8566e, C8619a<T> c8619a, InterfaceC8579r interfaceC8579r) {
        this.f32627a = interfaceC8576o;
        this.f32628b = interfaceC8570i;
        this.f32629c = c8566e;
        this.f32630d = c8619a;
        this.f32631e = interfaceC8579r;
    }

    /* renamed from: e */
    private AbstractC8578q<T> m27147e() {
        AbstractC8578q<T> abstractC8578q = this.f32633g;
        if (abstractC8578q != null) {
            return abstractC8578q;
        }
        AbstractC8578q<T> abstractC8578qM26928l = this.f32629c.m26928l(this.f32631e, this.f32630d);
        this.f32633g = abstractC8578qM26928l;
        return abstractC8578qM26928l;
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: b */
    public T mo26938b(C8585a c8585a) throws JsonParseException, IOException {
        if (this.f32628b == null) {
            return m27147e().mo26938b(c8585a);
        }
        AbstractC8571j abstractC8571jM27110a = C8599l.m27110a(c8585a);
        if (abstractC8571jM27110a.m26958i()) {
            return null;
        }
        return this.f32628b.m26953a(abstractC8571jM27110a, this.f32630d.getType(), this.f32632f);
    }

    @Override // com.google.gson.AbstractC8578q
    /* renamed from: d */
    public void mo26939d(C8587c c8587c, T t) throws IOException {
        InterfaceC8576o<T> interfaceC8576o = this.f32627a;
        if (interfaceC8576o == null) {
            m27147e().mo26939d(c8587c, t);
        } else if (t == null) {
            c8587c.mo27043y();
        } else {
            C8599l.m27111b(interfaceC8576o.m26976a(t, this.f32630d.getType(), this.f32632f), c8587c);
        }
    }
}
