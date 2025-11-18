package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5203k;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: MergePaths.java */
/* renamed from: com.airbnb.lottie.s.j.h */
/* loaded from: classes.dex */
public class C5258h implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12730a;

    /* renamed from: b */
    private final a f12731b;

    /* compiled from: MergePaths.java */
    /* renamed from: com.airbnb.lottie.s.j.h$a */
    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        /* renamed from: g */
        public static a m9660g(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? Merge : ExcludeIntersections : Intersect : Subtract : Add : Merge;
        }
    }

    public C5258h(String str, a aVar) {
        this.f12730a = str;
        this.f12731b = aVar;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        if (c5182f.m9466h()) {
            return new C5203k(this);
        }
        C5179c.m9394d("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public a m9658b() {
        return this.f12731b;
    }

    /* renamed from: c */
    public String m9659c() {
        return this.f12730a;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f12731b + '}';
    }
}
