package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* renamed from: androidx.work.h */
/* loaded from: classes.dex */
public final class C0709h {

    /* renamed from: a */
    private final int f4522a;

    /* renamed from: b */
    private final int f4523b;

    /* renamed from: c */
    private final Notification f4524c;

    public C0709h(int i2, Notification notification, int i3) {
        this.f4522a = i2;
        this.f4524c = notification;
        this.f4523b = i3;
    }

    /* renamed from: a */
    public int m4841a() {
        return this.f4523b;
    }

    /* renamed from: b */
    public Notification m4842b() {
        return this.f4524c;
    }

    /* renamed from: c */
    public int m4843c() {
        return this.f4522a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0709h.class != obj.getClass()) {
            return false;
        }
        C0709h c0709h = (C0709h) obj;
        if (this.f4522a == c0709h.f4522a && this.f4523b == c0709h.f4523b) {
            return this.f4524c.equals(c0709h.f4524c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4522a * 31) + this.f4523b) * 31) + this.f4524c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4522a + ", mForegroundServiceType=" + this.f4523b + ", mNotification=" + this.f4524c + '}';
    }
}
