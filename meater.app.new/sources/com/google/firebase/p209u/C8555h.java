package com.google.firebase.p209u;

import android.content.Context;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;

/* compiled from: LibraryVersionComponent.java */
/* renamed from: com.google.firebase.u.h */
/* loaded from: classes2.dex */
public class C8555h {

    /* compiled from: LibraryVersionComponent.java */
    /* renamed from: com.google.firebase.u.h$a */
    public interface a<T> {
        /* renamed from: a */
        String mo24966a(T t);
    }

    /* renamed from: a */
    public static C8124n<?> m26903a(String str, String str2) {
        return C8124n.m24988j(AbstractC8554g.m26902a(str, str2), AbstractC8554g.class);
    }

    /* renamed from: b */
    public static C8124n<?> m26904b(final String str, final a<Context> aVar) {
        return C8124n.m24989k(AbstractC8554g.class).m25006b(C8132v.m25060k(Context.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.u.b
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return AbstractC8554g.m26902a(str, aVar.mo24966a((Context) interfaceC8126p.mo24973a(Context.class)));
            }
        }).m25008d();
    }
}
