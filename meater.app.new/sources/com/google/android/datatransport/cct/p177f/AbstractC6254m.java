package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.C6248g;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: LogRequest.java */
@AutoValue
/* renamed from: com.google.android.datatransport.cct.f.m */
/* loaded from: classes2.dex */
public abstract class AbstractC6254m {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.f.m$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC6254m mo13479a();

        /* renamed from: b */
        public abstract a mo13480b(AbstractC6252k abstractC6252k);

        /* renamed from: c */
        public abstract a mo13481c(List<AbstractC6253l> list);

        /* renamed from: d */
        abstract a mo13482d(Integer num);

        /* renamed from: e */
        abstract a mo13483e(String str);

        /* renamed from: f */
        public abstract a mo13484f(EnumC6257p enumC6257p);

        /* renamed from: g */
        public abstract a mo13485g(long j2);

        /* renamed from: h */
        public abstract a mo13486h(long j2);

        /* renamed from: i */
        public a m13500i(int i2) {
            return mo13482d(Integer.valueOf(i2));
        }

        /* renamed from: j */
        public a m13501j(String str) {
            return mo13483e(str);
        }
    }

    /* renamed from: a */
    public static a m13499a() {
        return new C6248g.b();
    }

    /* renamed from: b */
    public abstract AbstractC6252k mo13472b();

    /* renamed from: c */
    public abstract List<AbstractC6253l> mo13473c();

    /* renamed from: d */
    public abstract Integer mo13474d();

    /* renamed from: e */
    public abstract String mo13475e();

    /* renamed from: f */
    public abstract EnumC6257p mo13476f();

    /* renamed from: g */
    public abstract long mo13477g();

    /* renamed from: h */
    public abstract long mo13478h();
}
