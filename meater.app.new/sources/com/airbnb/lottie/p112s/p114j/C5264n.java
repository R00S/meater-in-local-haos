package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5195c;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* renamed from: com.airbnb.lottie.s.j.n */
/* loaded from: classes.dex */
public class C5264n implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12767a;

    /* renamed from: b */
    private final List<InterfaceC5252b> f12768b;

    public C5264n(String str, List<InterfaceC5252b> list) {
        this.f12767a = str;
        this.f12768b = list;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5195c(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public List<InterfaceC5252b> m9688b() {
        return this.f12768b;
    }

    /* renamed from: c */
    public String m9689c() {
        return this.f12767a;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f12767a + "' Shapes: " + Arrays.toString(this.f12768b.toArray()) + '}';
    }
}
