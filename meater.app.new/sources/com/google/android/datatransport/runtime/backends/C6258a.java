package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC6263f;
import java.util.Arrays;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.AbstractC8867j;

/* compiled from: AutoValue_BackendRequest.java */
/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes2.dex */
final class C6258a extends AbstractC6263f {

    /* renamed from: a */
    private final Iterable<AbstractC8867j> f16759a;

    /* renamed from: b */
    private final byte[] f16760b;

    /* compiled from: AutoValue_BackendRequest.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class b extends AbstractC6263f.a {

        /* renamed from: a */
        private Iterable<AbstractC8867j> f16761a;

        /* renamed from: b */
        private byte[] f16762b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC6263f.a
        /* renamed from: a */
        public AbstractC6263f mo13511a() {
            Iterable<AbstractC8867j> iterable = this.f16761a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (iterable == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " events";
            }
            if (str.isEmpty()) {
                return new C6258a(this.f16761a, this.f16762b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC6263f.a
        /* renamed from: b */
        public AbstractC6263f.a mo13512b(Iterable<AbstractC8867j> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f16761a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC6263f.a
        /* renamed from: c */
        public AbstractC6263f.a mo13513c(byte[] bArr) {
            this.f16762b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6263f
    /* renamed from: b */
    public Iterable<AbstractC8867j> mo13509b() {
        return this.f16759a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6263f
    /* renamed from: c */
    public byte[] mo13510c() {
        return this.f16760b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6263f)) {
            return false;
        }
        AbstractC6263f abstractC6263f = (AbstractC6263f) obj;
        if (this.f16759a.equals(abstractC6263f.mo13509b())) {
            if (Arrays.equals(this.f16760b, abstractC6263f instanceof C6258a ? ((C6258a) abstractC6263f).f16760b : abstractC6263f.mo13510c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16759a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16760b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f16759a + ", extras=" + Arrays.toString(this.f16760b) + "}";
    }

    private C6258a(Iterable<AbstractC8867j> iterable, byte[] bArr) {
        this.f16759a = iterable;
        this.f16760b = bArr;
    }
}
