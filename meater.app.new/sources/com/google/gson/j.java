package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class j {
    @Deprecated
    public j() {
    }

    public boolean c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g i() {
        if (w()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public l j() {
        if (y()) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public n r() {
        if (z()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Q9.c cVar = new Q9.c(stringWriter);
            cVar.z(true);
            com.google.gson.internal.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String v() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean w() {
        return this instanceof g;
    }

    public boolean x() {
        return this instanceof k;
    }

    public boolean y() {
        return this instanceof l;
    }

    public boolean z() {
        return this instanceof n;
    }
}
