package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0415u;
import androidx.datastore.preferences.protobuf.C0415u.b;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.q */
/* loaded from: classes.dex */
abstract class AbstractC0404q<T extends C0415u.b<T>> {
    AbstractC0404q() {
    }

    /* renamed from: a */
    abstract int mo3142a(Map.Entry<?, ?> entry);

    /* renamed from: b */
    abstract Object mo3143b(C0401p c0401p, InterfaceC0405q0 interfaceC0405q0, int i2);

    /* renamed from: c */
    abstract C0415u<T> mo3144c(Object obj);

    /* renamed from: d */
    abstract C0415u<T> mo3145d(Object obj);

    /* renamed from: e */
    abstract boolean mo3146e(InterfaceC0405q0 interfaceC0405q0);

    /* renamed from: f */
    abstract void mo3147f(Object obj);

    /* renamed from: g */
    abstract <UT, UB> UB mo3148g(InterfaceC0370e1 interfaceC0370e1, Object obj, C0401p c0401p, C0415u<T> c0415u, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) throws IOException;

    /* renamed from: h */
    abstract void mo3149h(InterfaceC0370e1 interfaceC0370e1, Object obj, C0401p c0401p, C0415u<T> c0415u) throws IOException;

    /* renamed from: i */
    abstract void mo3150i(AbstractC0377h abstractC0377h, Object obj, C0401p c0401p, C0415u<T> c0415u) throws IOException;

    /* renamed from: j */
    abstract void mo3151j(InterfaceC0412s1 interfaceC0412s1, Map.Entry<?, ?> entry) throws IOException;
}
