package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: com.google.firebase.crashlytics.h.n.m */
/* loaded from: classes2.dex */
final class C8216m extends AbstractC8195b0 {

    /* renamed from: a */
    private final AbstractC8258f0 f30941a;

    /* renamed from: b */
    private final String f30942b;

    /* renamed from: c */
    private final File f30943c;

    C8216m(AbstractC8258f0 abstractC8258f0, String str, File file) {
        if (abstractC8258f0 == null) {
            throw new NullPointerException("Null report");
        }
        this.f30941a = abstractC8258f0;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f30942b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f30943c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.AbstractC8195b0
    /* renamed from: b */
    public AbstractC8258f0 mo25226b() {
        return this.f30941a;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.AbstractC8195b0
    /* renamed from: c */
    public File mo25227c() {
        return this.f30943c;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.AbstractC8195b0
    /* renamed from: d */
    public String mo25228d() {
        return this.f30942b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8195b0)) {
            return false;
        }
        AbstractC8195b0 abstractC8195b0 = (AbstractC8195b0) obj;
        return this.f30941a.equals(abstractC8195b0.mo25226b()) && this.f30942b.equals(abstractC8195b0.mo25228d()) && this.f30943c.equals(abstractC8195b0.mo25227c());
    }

    public int hashCode() {
        return ((((this.f30941a.hashCode() ^ 1000003) * 1000003) ^ this.f30942b.hashCode()) * 1000003) ^ this.f30943c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f30941a + ", sessionId=" + this.f30942b + ", reportFile=" + this.f30943c + "}";
    }
}
