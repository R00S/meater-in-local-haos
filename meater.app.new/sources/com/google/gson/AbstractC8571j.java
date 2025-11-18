package com.google.gson;

import com.google.gson.p215t.C8599l;
import com.google.gson.stream.C8587c;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* renamed from: com.google.gson.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8571j {
    /* renamed from: c */
    public C8568g m26954c() {
        if (m26957h()) {
            return (C8568g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: f */
    public C8573l m26955f() {
        if (m26959n()) {
            return (C8573l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C8574m m26956g() {
        if (m26960o()) {
            return (C8574m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public boolean m26957h() {
        return this instanceof C8568g;
    }

    /* renamed from: i */
    public boolean m26958i() {
        return this instanceof C8572k;
    }

    /* renamed from: n */
    public boolean m26959n() {
        return this instanceof C8573l;
    }

    /* renamed from: o */
    public boolean m26960o() {
        return this instanceof C8574m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8587c c8587c = new C8587c(stringWriter);
            c8587c.m27028J(true);
            C8599l.m27111b(this, c8587c);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
