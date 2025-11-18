package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* renamed from: com.google.firebase.crashlytics.h.p.r */
/* loaded from: classes2.dex */
final class C8281r extends AbstractC8258f0.e.d.a.b.AbstractC11508e {

    /* renamed from: a */
    private final String f31479a;

    /* renamed from: b */
    private final int f31480b;

    /* renamed from: c */
    private final List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> f31481c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.r$b */
    static final class b extends AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a {

        /* renamed from: a */
        private String f31482a;

        /* renamed from: b */
        private Integer f31483b;

        /* renamed from: c */
        private List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> f31484c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e mo25822a() {
            String str = this.f31482a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " name";
            }
            if (this.f31483b == null) {
                str2 = str2 + " importance";
            }
            if (this.f31484c == null) {
                str2 = str2 + " frames";
            }
            if (str2.isEmpty()) {
                return new C8281r(this.f31482a, this.f31483b.intValue(), this.f31484c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a mo25823b(List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f31484c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a mo25824c(int i2) {
            this.f31483b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a mo25825d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31482a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e
    /* renamed from: b */
    public List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> mo25819b() {
        return this.f31481c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e
    /* renamed from: c */
    public int mo25820c() {
        return this.f31480b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11508e
    /* renamed from: d */
    public String mo25821d() {
        return this.f31479a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b.AbstractC11508e)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b.AbstractC11508e abstractC11508e = (AbstractC8258f0.e.d.a.b.AbstractC11508e) obj;
        return this.f31479a.equals(abstractC11508e.mo25821d()) && this.f31480b == abstractC11508e.mo25820c() && this.f31481c.equals(abstractC11508e.mo25819b());
    }

    public int hashCode() {
        return ((((this.f31479a.hashCode() ^ 1000003) * 1000003) ^ this.f31480b) * 1000003) ^ this.f31481c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f31479a + ", importance=" + this.f31480b + ", frames=" + this.f31481c + "}";
    }

    private C8281r(String str, int i2, List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> list) {
        this.f31479a = str;
        this.f31480b = i2;
        this.f31481c = list;
    }
}
