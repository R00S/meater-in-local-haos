package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.HttpUrl;
import p353j.InterfaceC9705g;

/* compiled from: JsonWriter.java */
/* renamed from: com.squareup.moshi.o */
/* loaded from: classes2.dex */
public abstract class AbstractC8725o implements Closeable, Flushable {

    /* renamed from: j */
    String f33147j;

    /* renamed from: k */
    boolean f33148k;

    /* renamed from: l */
    boolean f33149l;

    /* renamed from: m */
    boolean f33150m;

    /* renamed from: f */
    int f33143f = 0;

    /* renamed from: g */
    int[] f33144g = new int[32];

    /* renamed from: h */
    String[] f33145h = new String[32];

    /* renamed from: i */
    int[] f33146i = new int[32];

    /* renamed from: n */
    int f33151n = -1;

    AbstractC8725o() {
    }

    /* renamed from: p */
    public static AbstractC8725o m27770p(InterfaceC9705g interfaceC9705g) {
        return new C8722l(interfaceC9705g);
    }

    /* renamed from: A */
    final void m27771A(int i2) {
        this.f33144g[this.f33143f - 1] = i2;
    }

    /* renamed from: B */
    public void mo27750B(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f33147j = str;
    }

    /* renamed from: D */
    public final void m27772D(boolean z) {
        this.f33148k = z;
    }

    /* renamed from: H */
    public final void m27773H(boolean z) {
        this.f33149l = z;
    }

    /* renamed from: I */
    public abstract AbstractC8725o mo27751I(double d2) throws IOException;

    /* renamed from: J */
    public abstract AbstractC8725o mo27752J(long j2) throws IOException;

    /* renamed from: K */
    public abstract AbstractC8725o mo27753K(Number number) throws IOException;

    /* renamed from: N */
    public abstract AbstractC8725o mo27754N(String str) throws IOException;

    /* renamed from: Q */
    public abstract AbstractC8725o mo27755Q(boolean z) throws IOException;

    /* renamed from: a */
    public abstract AbstractC8725o mo27756a() throws IOException;

    /* renamed from: b */
    public abstract AbstractC8725o mo27757b() throws IOException;

    /* renamed from: c */
    final boolean m27774c() {
        int i2 = this.f33143f;
        int[] iArr = this.f33144g;
        if (i2 != iArr.length) {
            return false;
        }
        if (i2 == 256) {
            throw new JsonDataException("Nesting too deep at " + m27776g() + ": circular reference?");
        }
        this.f33144g = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f33145h;
        this.f33145h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f33146i;
        this.f33146i = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof C8724n)) {
            return true;
        }
        C8724n c8724n = (C8724n) this;
        Object[] objArr = c8724n.f33141o;
        c8724n.f33141o = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    /* renamed from: d */
    public abstract AbstractC8725o mo27758d() throws IOException;

    /* renamed from: e */
    public abstract AbstractC8725o mo27759e() throws IOException;

    /* renamed from: f */
    public final String m27775f() {
        String str = this.f33147j;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: g */
    public final String m27776g() {
        return C8720j.m27726a(this.f33143f, this.f33144g, this.f33145h, this.f33146i);
    }

    /* renamed from: j */
    public final boolean m27777j() {
        return this.f33149l;
    }

    /* renamed from: k */
    public final boolean m27778k() {
        return this.f33148k;
    }

    /* renamed from: l */
    public abstract AbstractC8725o mo27760l(String str) throws IOException;

    /* renamed from: m */
    public abstract AbstractC8725o mo27761m() throws IOException;

    /* renamed from: x */
    final int m27779x() {
        int i2 = this.f33143f;
        if (i2 != 0) {
            return this.f33144g[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: y */
    public final void m27780y() throws IOException {
        int iM27779x = m27779x();
        if (iM27779x != 5 && iM27779x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f33150m = true;
    }

    /* renamed from: z */
    final void m27781z(int i2) {
        int[] iArr = this.f33144g;
        int i3 = this.f33143f;
        this.f33143f = i3 + 1;
        iArr[i3] = i2;
    }
}
