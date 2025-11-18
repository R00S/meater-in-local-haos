package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzuo {

    /* renamed from: a */
    private final int f27146a;

    /* renamed from: b */
    private final int f27147b;

    /* renamed from: c */
    private final int f27148c;

    /* renamed from: d */
    private final boolean f27149d;

    /* renamed from: e */
    private final zzvb f27150e;

    /* renamed from: f */
    private final zzvk f27151f;

    /* renamed from: n */
    private int f27159n;

    /* renamed from: g */
    private final Object f27152g = new Object();

    /* renamed from: h */
    private ArrayList<String> f27153h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<String> f27154i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<zzuz> f27155j = new ArrayList<>();

    /* renamed from: k */
    private int f27156k = 0;

    /* renamed from: l */
    private int f27157l = 0;

    /* renamed from: m */
    private int f27158m = 0;

    /* renamed from: o */
    private String f27160o = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: p */
    private String f27161p = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: q */
    private String f27162q = HttpUrl.FRAGMENT_ENCODE_SET;

    public zzuo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.f27146a = i2;
        this.f27147b = i3;
        this.f27148c = i4;
        this.f27149d = z;
        this.f27150e = new zzvb(i5);
        this.f27151f = new zzvk(i6, i7, i8);
    }

    /* renamed from: b */
    private static String m20606b(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    /* renamed from: f */
    private final void m20607f(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str == null || str.length() < this.f27148c) {
            return;
        }
        synchronized (this.f27152g) {
            this.f27153h.add(str);
            this.f27156k += str.length();
            if (z) {
                this.f27154i.add(str);
                this.f27155j.add(new zzuz(f2, f3, f4, f5, this.f27154i.size() - 1));
            }
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    private final int m20608g(int i2, int i3) {
        return this.f27149d ? this.f27147b : (i2 * this.f27146a) + (i3 * this.f27147b);
    }

    /* renamed from: a */
    public final int m20609a() {
        return this.f27159n;
    }

    /* renamed from: c */
    public final void m20610c(String str, boolean z, float f2, float f3, float f4, float f5) {
        m20607f(str, z, f2, f3, f4, f5);
        synchronized (this.f27152g) {
            if (this.f27158m < 0) {
                zzbad.m17349e("ActivityContent: negative number of WebViews.");
            }
            m20621p();
        }
    }

    /* renamed from: d */
    public final void m20611d(String str, boolean z, float f2, float f3, float f4, float f5) {
        m20607f(str, z, f2, f3, f4, f5);
    }

    /* renamed from: e */
    public final void m20612e(int i2) {
        this.f27157l = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzuo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzuo) obj).f27160o;
        return str != null && str.equals(this.f27160o);
    }

    /* renamed from: h */
    public final boolean m20613h() {
        boolean z;
        synchronized (this.f27152g) {
            z = this.f27158m == 0;
        }
        return z;
    }

    public final int hashCode() {
        return this.f27160o.hashCode();
    }

    /* renamed from: i */
    public final String m20614i() {
        return this.f27160o;
    }

    /* renamed from: j */
    public final String m20615j() {
        return this.f27161p;
    }

    /* renamed from: k */
    public final String m20616k() {
        return this.f27162q;
    }

    /* renamed from: l */
    public final void m20617l() {
        synchronized (this.f27152g) {
            this.f27159n -= 100;
        }
    }

    /* renamed from: m */
    public final void m20618m() {
        synchronized (this.f27152g) {
            this.f27158m--;
        }
    }

    /* renamed from: n */
    public final void m20619n() {
        synchronized (this.f27152g) {
            this.f27158m++;
        }
    }

    /* renamed from: o */
    public final void m20620o() {
        synchronized (this.f27152g) {
            int iM20608g = m20608g(this.f27156k, this.f27157l);
            if (iM20608g > this.f27159n) {
                this.f27159n = iM20608g;
            }
        }
    }

    /* renamed from: p */
    public final void m20621p() {
        synchronized (this.f27152g) {
            int iM20608g = m20608g(this.f27156k, this.f27157l);
            if (iM20608g > this.f27159n) {
                this.f27159n = iM20608g;
                if (!zzk.zzlk().m17061r().mo17097k()) {
                    this.f27160o = this.f27150e.m20652a(this.f27153h);
                    this.f27161p = this.f27150e.m20652a(this.f27154i);
                }
                if (!zzk.zzlk().m17061r().mo17088b()) {
                    this.f27162q = this.f27151f.m20661a(this.f27154i, this.f27155j);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: q */
    final int m20622q() {
        return this.f27156k;
    }

    public final String toString() {
        int i2 = this.f27157l;
        int i3 = this.f27159n;
        int i4 = this.f27156k;
        String strM20606b = m20606b(this.f27153h, 100);
        String strM20606b2 = m20606b(this.f27154i, 100);
        String str = this.f27160o;
        String str2 = this.f27161p;
        String str3 = this.f27162q;
        StringBuilder sb = new StringBuilder(String.valueOf(strM20606b).length() + 165 + String.valueOf(strM20606b2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(strM20606b);
        sb.append("\n viewableText");
        sb.append(strM20606b2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
