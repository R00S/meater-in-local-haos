package Lc;

import Fc.j;
import Fc.n;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: MemoryPersistence.java */
/* loaded from: classes3.dex */
public class a implements j {

    /* renamed from: a, reason: collision with root package name */
    private Hashtable<String, n> f11316a;

    @Override // Fc.j
    public n a(String str) {
        return this.f11316a.get(str);
    }

    @Override // Fc.j
    public void b(String str, n nVar) {
        this.f11316a.put(str, nVar);
    }

    @Override // Fc.j
    public Enumeration c() {
        return this.f11316a.keys();
    }

    @Override // Fc.j
    public void clear() {
        this.f11316a.clear();
    }

    @Override // Fc.j
    public void close() {
        this.f11316a.clear();
    }

    @Override // Fc.j
    public void d(String str, String str2) {
        this.f11316a = new Hashtable<>();
    }

    @Override // Fc.j
    public boolean e(String str) {
        return this.f11316a.containsKey(str);
    }

    @Override // Fc.j
    public void remove(String str) {
        this.f11316a.remove(str);
    }
}
