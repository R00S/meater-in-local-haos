package com.google.gson;

import com.google.gson.p215t.C8595h;
import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* renamed from: com.google.gson.l */
/* loaded from: classes2.dex */
public final class C8573l extends AbstractC8571j {

    /* renamed from: a */
    private final C8595h<String, AbstractC8571j> f32450a = new C8595h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8573l) && ((C8573l) obj).f32450a.equals(this.f32450a));
    }

    public int hashCode() {
        return this.f32450a.hashCode();
    }

    /* renamed from: q */
    public void m26961q(String str, AbstractC8571j abstractC8571j) {
        if (abstractC8571j == null) {
            abstractC8571j = C8572k.f32449a;
        }
        this.f32450a.put(str, abstractC8571j);
    }

    /* renamed from: r */
    public Set<Map.Entry<String, AbstractC8571j>> m26962r() {
        return this.f32450a.entrySet();
    }
}
