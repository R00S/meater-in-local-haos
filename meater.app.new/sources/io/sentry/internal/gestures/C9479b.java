package io.sentry.internal.gestures;

import io.sentry.util.C9646q;
import java.lang.ref.WeakReference;

/* compiled from: UiElement.java */
/* renamed from: io.sentry.internal.gestures.b */
/* loaded from: classes2.dex */
public final class C9479b {

    /* renamed from: a */
    final WeakReference<Object> f36366a;

    /* renamed from: b */
    final String f36367b;

    /* renamed from: c */
    final String f36368c;

    /* renamed from: d */
    final String f36369d;

    /* renamed from: e */
    final String f36370e;

    /* compiled from: UiElement.java */
    /* renamed from: io.sentry.internal.gestures.b$a */
    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public C9479b(Object obj, String str, String str2, String str3, String str4) {
        this.f36366a = new WeakReference<>(obj);
        this.f36367b = str;
        this.f36368c = str2;
        this.f36369d = str3;
        this.f36370e = str4;
    }

    /* renamed from: a */
    public String m30860a() {
        return this.f36367b;
    }

    /* renamed from: b */
    public String m30861b() {
        String str = this.f36368c;
        return str != null ? str : (String) C9646q.m31802c(this.f36369d, "UiElement.tag can't be null");
    }

    /* renamed from: c */
    public String m30862c() {
        return this.f36370e;
    }

    /* renamed from: d */
    public String m30863d() {
        return this.f36368c;
    }

    /* renamed from: e */
    public String m30864e() {
        return this.f36369d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9479b.class != obj.getClass()) {
            return false;
        }
        C9479b c9479b = (C9479b) obj;
        return C9646q.m31800a(this.f36367b, c9479b.f36367b) && C9646q.m31800a(this.f36368c, c9479b.f36368c) && C9646q.m31800a(this.f36369d, c9479b.f36369d);
    }

    /* renamed from: f */
    public Object m30865f() {
        return this.f36366a.get();
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36366a, this.f36368c, this.f36369d);
    }
}
