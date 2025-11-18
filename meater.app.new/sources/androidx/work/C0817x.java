package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* renamed from: androidx.work.x */
/* loaded from: classes.dex */
public final class C0817x {

    /* renamed from: a */
    private UUID f4990a;

    /* renamed from: b */
    private a f4991b;

    /* renamed from: c */
    private C0706e f4992c;

    /* renamed from: d */
    private Set<String> f4993d;

    /* renamed from: e */
    private C0706e f4994e;

    /* renamed from: f */
    private int f4995f;

    /* compiled from: WorkInfo.java */
    /* renamed from: androidx.work.x$a */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: g */
        public boolean m5237g() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C0817x(UUID uuid, a aVar, C0706e c0706e, List<String> list, C0706e c0706e2, int i2) {
        this.f4990a = uuid;
        this.f4991b = aVar;
        this.f4992c = c0706e;
        this.f4993d = new HashSet(list);
        this.f4994e = c0706e2;
        this.f4995f = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0817x.class != obj.getClass()) {
            return false;
        }
        C0817x c0817x = (C0817x) obj;
        if (this.f4995f == c0817x.f4995f && this.f4990a.equals(c0817x.f4990a) && this.f4991b == c0817x.f4991b && this.f4992c.equals(c0817x.f4992c) && this.f4993d.equals(c0817x.f4993d)) {
            return this.f4994e.equals(c0817x.f4994e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f4990a.hashCode() * 31) + this.f4991b.hashCode()) * 31) + this.f4992c.hashCode()) * 31) + this.f4993d.hashCode()) * 31) + this.f4994e.hashCode()) * 31) + this.f4995f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f4990a + "', mState=" + this.f4991b + ", mOutputData=" + this.f4992c + ", mTags=" + this.f4993d + ", mProgress=" + this.f4994e + '}';
    }
}
