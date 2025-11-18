package com.google.android.datatransport.cct.p177f;

import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.d */
/* loaded from: classes2.dex */
final class C6245d extends AbstractC6251j {

    /* renamed from: a */
    private final List<AbstractC6254m> f16662a;

    C6245d(List<AbstractC6254m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f16662a = list;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6251j
    /* renamed from: c */
    public List<AbstractC6254m> mo13451c() {
        return this.f16662a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6251j) {
            return this.f16662a.equals(((AbstractC6251j) obj).mo13451c());
        }
        return false;
    }

    public int hashCode() {
        return this.f16662a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16662a + "}";
    }
}
