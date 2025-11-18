package com.google.gson;

import com.google.gson.p215t.p216n.C8606f;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* renamed from: com.google.gson.q */
/* loaded from: classes2.dex */
public abstract class AbstractC8578q<T> {

    /* compiled from: TypeAdapter.java */
    /* renamed from: com.google.gson.q$a */
    class a extends AbstractC8578q<T> {
        a() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: b */
        public T mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return (T) AbstractC8578q.this.mo26938b(c8585a);
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: d */
        public void mo26939d(C8587c c8587c, T t) throws IOException {
            if (t == null) {
                c8587c.mo27043y();
            } else {
                AbstractC8578q.this.mo26939d(c8587c, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC8578q<T> m26977a() {
        return new a();
    }

    /* renamed from: b */
    public abstract T mo26938b(C8585a c8585a) throws IOException;

    /* renamed from: c */
    public final AbstractC8571j m26978c(T t) {
        try {
            C8606f c8606f = new C8606f();
            mo26939d(c8606f, t);
            return c8606f.m27130e0();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    /* renamed from: d */
    public abstract void mo26939d(C8587c c8587c, T t) throws IOException;
}
