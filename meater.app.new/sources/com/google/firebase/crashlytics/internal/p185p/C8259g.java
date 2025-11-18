package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* renamed from: com.google.firebase.crashlytics.h.p.g */
/* loaded from: classes2.dex */
final class C8259g extends AbstractC8258f0.d.b {

    /* renamed from: a */
    private final String f31348a;

    /* renamed from: b */
    private final byte[] f31349b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.g$b */
    static final class b extends AbstractC8258f0.d.b.a {

        /* renamed from: a */
        private String f31350a;

        /* renamed from: b */
        private byte[] f31351b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.b.a
        /* renamed from: a */
        public AbstractC8258f0.d.b mo25678a() {
            String str = this.f31350a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " filename";
            }
            if (this.f31351b == null) {
                str2 = str2 + " contents";
            }
            if (str2.isEmpty()) {
                return new C8259g(this.f31350a, this.f31351b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.b.a
        /* renamed from: b */
        public AbstractC8258f0.d.b.a mo25679b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f31351b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.b.a
        /* renamed from: c */
        public AbstractC8258f0.d.b.a mo25680c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f31350a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.b
    /* renamed from: b */
    public byte[] mo25676b() {
        return this.f31349b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.b
    /* renamed from: c */
    public String mo25677c() {
        return this.f31348a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.d.b)) {
            return false;
        }
        AbstractC8258f0.d.b bVar = (AbstractC8258f0.d.b) obj;
        if (this.f31348a.equals(bVar.mo25677c())) {
            if (Arrays.equals(this.f31349b, bVar instanceof C8259g ? ((C8259g) bVar).f31349b : bVar.mo25676b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31348a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31349b);
    }

    public String toString() {
        return "File{filename=" + this.f31348a + ", contents=" + Arrays.toString(this.f31349b) + "}";
    }

    private C8259g(String str, byte[] bArr) {
        this.f31348a = str;
        this.f31349b = bArr;
    }
}
