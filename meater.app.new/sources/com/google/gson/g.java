package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: B, reason: collision with root package name */
    private final ArrayList<j> f38869B = new ArrayList<>();

    private j B() {
        int size = this.f38869B.size();
        if (size == 1) {
            return this.f38869B.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void A(j jVar) {
        if (jVar == null) {
            jVar = k.f39117B;
        }
        this.f38869B.add(jVar);
    }

    @Override // com.google.gson.j
    public boolean c() {
        return B().c();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f38869B.equals(this.f38869B));
    }

    @Override // com.google.gson.j
    public double f() {
        return B().f();
    }

    @Override // com.google.gson.j
    public int h() {
        return B().h();
    }

    public int hashCode() {
        return this.f38869B.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f38869B.iterator();
    }

    @Override // com.google.gson.j
    public String v() {
        return B().v();
    }
}
