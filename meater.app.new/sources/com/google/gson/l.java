package com.google.gson;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes2.dex */
public final class l extends j {

    /* renamed from: B, reason: collision with root package name */
    private final com.google.gson.internal.g<String, j> f39118B = new com.google.gson.internal.g<>(false);

    public void A(String str, j jVar) {
        com.google.gson.internal.g<String, j> gVar = this.f39118B;
        if (jVar == null) {
            jVar = k.f39117B;
        }
        gVar.put(str, jVar);
    }

    public Set<Map.Entry<String, j>> B() {
        return this.f39118B.entrySet();
    }

    public j D(String str) {
        return this.f39118B.get(str);
    }

    public g E(String str) {
        return (g) this.f39118B.get(str);
    }

    public boolean F(String str) {
        return this.f39118B.containsKey(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f39118B.equals(this.f39118B));
    }

    public int hashCode() {
        return this.f39118B.hashCode();
    }
}
