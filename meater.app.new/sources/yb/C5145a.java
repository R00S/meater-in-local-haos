package yb;

import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.g0;
import Ua.K;
import db.C3096k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5145a implements InterfaceC5150f {

    /* renamed from: b, reason: collision with root package name */
    private final List<InterfaceC5150f> f53256b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5145a(List<? extends InterfaceC5150f> inner) {
        C3862t.g(inner, "inner");
        this.f53256b = inner;
    }

    @Override // yb.InterfaceC5150f
    public void a(InterfaceC1692e thisDescriptor, qb.f name, List<InterfaceC1692e> result, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(name, "name");
        C3862t.g(result, "result");
        C3862t.g(c10, "c");
        Iterator<T> it = this.f53256b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5150f) it.next()).a(thisDescriptor, name, result, c10);
        }
    }

    @Override // yb.InterfaceC5150f
    public void b(InterfaceC1692e thisDescriptor, qb.f name, Collection<g0> result, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(name, "name");
        C3862t.g(result, "result");
        C3862t.g(c10, "c");
        Iterator<T> it = this.f53256b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5150f) it.next()).b(thisDescriptor, name, result, c10);
        }
    }

    @Override // yb.InterfaceC5150f
    public void c(InterfaceC1692e thisDescriptor, List<InterfaceC1691d> result, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(result, "result");
        C3862t.g(c10, "c");
        Iterator<T> it = this.f53256b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5150f) it.next()).c(thisDescriptor, result, c10);
        }
    }

    @Override // yb.InterfaceC5150f
    public void d(InterfaceC1692e thisDescriptor, qb.f name, Collection<g0> result, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(name, "name");
        C3862t.g(result, "result");
        C3862t.g(c10, "c");
        Iterator<T> it = this.f53256b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5150f) it.next()).d(thisDescriptor, name, result, c10);
        }
    }

    @Override // yb.InterfaceC5150f
    public List<qb.f> e(InterfaceC1692e thisDescriptor, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(c10, "c");
        List<InterfaceC5150f> list = this.f53256b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r.D(arrayList, ((InterfaceC5150f) it.next()).e(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // yb.InterfaceC5150f
    public K f(InterfaceC1692e thisDescriptor, K propertyDescriptor, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(propertyDescriptor, "propertyDescriptor");
        C3862t.g(c10, "c");
        Iterator<T> it = this.f53256b.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((InterfaceC5150f) it.next()).f(thisDescriptor, propertyDescriptor, c10);
        }
        return propertyDescriptor;
    }

    @Override // yb.InterfaceC5150f
    public List<qb.f> g(InterfaceC1692e thisDescriptor, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(c10, "c");
        List<InterfaceC5150f> list = this.f53256b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r.D(arrayList, ((InterfaceC5150f) it.next()).g(thisDescriptor, c10));
        }
        return arrayList;
    }

    @Override // yb.InterfaceC5150f
    public List<qb.f> h(InterfaceC1692e thisDescriptor, C3096k c10) {
        C3862t.g(thisDescriptor, "thisDescriptor");
        C3862t.g(c10, "c");
        List<InterfaceC5150f> list = this.f53256b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r.D(arrayList, ((InterfaceC5150f) it.next()).h(thisDescriptor, c10));
        }
        return arrayList;
    }
}
