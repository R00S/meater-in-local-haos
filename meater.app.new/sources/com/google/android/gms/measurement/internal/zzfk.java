package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfk {

    /* renamed from: a */
    @VisibleForTesting
    private final String f29244a;

    /* renamed from: b */
    private final String f29245b;

    /* renamed from: c */
    private final String f29246c;

    /* renamed from: d */
    private final long f29247d;

    /* renamed from: e */
    private final /* synthetic */ C7807r3 f29248e;

    private zzfk(C7807r3 c7807r3, String str, long j2) {
        this.f29248e = c7807r3;
        Preconditions.m14368g(str);
        Preconditions.m14362a(j2 > 0);
        this.f29244a = String.valueOf(str).concat(":start");
        this.f29245b = String.valueOf(str).concat(":count");
        this.f29246c = String.valueOf(str).concat(":value");
        this.f29247d = j2;
    }

    /* renamed from: c */
    private final void m23161c() {
        this.f29248e.mo22792d();
        long jMo14608a = this.f29248e.mo22837j().mo14608a();
        SharedPreferences.Editor editorEdit = this.f29248e.m22813N().edit();
        editorEdit.remove(this.f29245b);
        editorEdit.remove(this.f29246c);
        editorEdit.putLong(this.f29244a, jMo14608a);
        editorEdit.apply();
    }

    /* renamed from: d */
    private final long m23162d() {
        return this.f29248e.m22813N().getLong(this.f29244a, 0L);
    }

    /* renamed from: a */
    public final Pair<String, Long> m23163a() {
        long jAbs;
        this.f29248e.mo22792d();
        this.f29248e.mo22792d();
        long jM23162d = m23162d();
        if (jM23162d == 0) {
            m23161c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM23162d - this.f29248e.mo22837j().mo14608a());
        }
        long j2 = this.f29247d;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > (j2 << 1)) {
            m23161c();
            return null;
        }
        String string = this.f29248e.m22813N().getString(this.f29246c, null);
        long j3 = this.f29248e.m22813N().getLong(this.f29245b, 0L);
        m23161c();
        return (string == null || j3 <= 0) ? C7807r3.f28847c : new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void m23164b(String str, long j2) {
        this.f29248e.mo22792d();
        if (m23162d() == 0) {
            m23161c();
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j3 = this.f29248e.m22813N().getLong(this.f29245b, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = this.f29248e.m22813N().edit();
            editorEdit.putString(this.f29246c, str);
            editorEdit.putLong(this.f29245b, 1L);
            editorEdit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z = (this.f29248e.mo22839l().m23555z0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor editorEdit2 = this.f29248e.m22813N().edit();
        if (z) {
            editorEdit2.putString(this.f29246c, str);
        }
        editorEdit2.putLong(this.f29245b, j4);
        editorEdit2.apply();
    }
}
