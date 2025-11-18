package io.sentry.clientreport;

import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReportKey.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.c */
/* loaded from: classes2.dex */
final class C9399c {

    /* renamed from: a */
    private final String f36243a;

    /* renamed from: b */
    private final String f36244b;

    C9399c(String str, String str2) {
        this.f36243a = str;
        this.f36244b = str2;
    }

    /* renamed from: a */
    public String m30685a() {
        return this.f36244b;
    }

    /* renamed from: b */
    public String m30686b() {
        return this.f36243a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9399c)) {
            return false;
        }
        C9399c c9399c = (C9399c) obj;
        return C9646q.m31800a(m30686b(), c9399c.m30686b()) && C9646q.m31800a(m30685a(), c9399c.m30685a());
    }

    public int hashCode() {
        return C9646q.m31801b(m30686b(), m30685a());
    }
}
