package kotlin.reflect.p371y.internal.p374j0.p415l.p419w1;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w1.a */
/* loaded from: classes3.dex */
public final class C10434a extends ArrayList<InterfaceC10446m> implements InterfaceC10445l {
    public C10434a(int i2) {
        super(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC10446m) {
            return m37091f((InterfaceC10446m) obj);
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ boolean m37091f(InterfaceC10446m interfaceC10446m) {
        return super.contains(interfaceC10446m);
    }

    /* renamed from: g */
    public /* bridge */ int m37092g() {
        return super.size();
    }

    /* renamed from: h */
    public /* bridge */ int m37093h(InterfaceC10446m interfaceC10446m) {
        return super.indexOf(interfaceC10446m);
    }

    /* renamed from: i */
    public /* bridge */ int m37094i(InterfaceC10446m interfaceC10446m) {
        return super.lastIndexOf(interfaceC10446m);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC10446m) {
            return m37093h((InterfaceC10446m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC10446m) {
            return m37094i((InterfaceC10446m) obj);
        }
        return -1;
    }

    /* renamed from: n */
    public /* bridge */ boolean m37095n(InterfaceC10446m interfaceC10446m) {
        return super.remove(interfaceC10446m);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC10446m) {
            return m37095n((InterfaceC10446m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m37092g();
    }
}
