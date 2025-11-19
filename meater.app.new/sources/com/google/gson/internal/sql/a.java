package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f39111a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f39112b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f39113c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f39114d;

    /* renamed from: e, reason: collision with root package name */
    public static final u f39115e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f39116f;

    /* compiled from: SqlTypesSupport.java */
    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0498a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        C0498a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    class b extends DefaultDateTypeAdapter.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f39111a = z10;
        if (z10) {
            f39112b = new C0498a(java.sql.Date.class);
            f39113c = new b(Timestamp.class);
            f39114d = SqlDateTypeAdapter.f39105b;
            f39115e = SqlTimeTypeAdapter.f39107b;
            f39116f = SqlTimestampTypeAdapter.f39109b;
            return;
        }
        f39112b = null;
        f39113c = null;
        f39114d = null;
        f39115e = null;
        f39116f = null;
    }
}
