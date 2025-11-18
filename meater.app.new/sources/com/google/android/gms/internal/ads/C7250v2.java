package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* loaded from: classes2.dex */
final class C7250v2 {

    /* renamed from: a */
    long f20710a;

    /* renamed from: b */
    final String f20711b;

    /* renamed from: c */
    final String f20712c;

    /* renamed from: d */
    final long f20713d;

    /* renamed from: e */
    final long f20714e;

    /* renamed from: f */
    final long f20715f;

    /* renamed from: g */
    final long f20716g;

    /* renamed from: h */
    final List<zzl> f20717h;

    private C7250v2(String str, String str2, long j2, long j3, long j4, long j5, List<zzl> list) {
        this.f20711b = str;
        this.f20712c = HttpUrl.FRAGMENT_ENCODE_SET.equals(str2) ? null : str2;
        this.f20713d = j2;
        this.f20714e = j3;
        this.f20715f = j4;
        this.f20716g = j5;
        this.f20717h = list;
    }

    /* renamed from: b */
    static C7250v2 m15951b(C7361y2 c7361y2) throws IOException {
        if (zzan.m16737l(c7361y2) == 538247942) {
            return new C7250v2(zzan.m16731f(c7361y2), zzan.m16731f(c7361y2), zzan.m16739n(c7361y2), zzan.m16739n(c7361y2), zzan.m16739n(c7361y2), zzan.m16739n(c7361y2), zzan.m16738m(c7361y2));
        }
        throw new IOException();
    }

    /* renamed from: a */
    final boolean m15952a(OutputStream outputStream) throws IOException {
        try {
            zzan.m16732g(outputStream, 538247942);
            zzan.m16734i(outputStream, this.f20711b);
            String str = this.f20712c;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            zzan.m16734i(outputStream, str);
            zzan.m16733h(outputStream, this.f20713d);
            zzan.m16733h(outputStream, this.f20714e);
            zzan.m16733h(outputStream, this.f20715f);
            zzan.m16733h(outputStream, this.f20716g);
            List<zzl> list = this.f20717h;
            if (list != null) {
                zzan.m16732g(outputStream, list.size());
                for (zzl zzlVar : list) {
                    zzan.m16734i(outputStream, zzlVar.m20195a());
                    zzan.m16734i(outputStream, zzlVar.m20196b());
                }
            } else {
                zzan.m16732g(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            zzag.m16526a("%s", e2.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    C7250v2(String str, zzc zzcVar) {
        String str2 = zzcVar.f23918b;
        long j2 = zzcVar.f23919c;
        long j3 = zzcVar.f23920d;
        long j4 = zzcVar.f23921e;
        long j5 = zzcVar.f23922f;
        List arrayList = zzcVar.f23924h;
        if (arrayList == null) {
            Map<String, String> map = zzcVar.f23923g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new zzl(entry.getKey(), entry.getValue()));
            }
        }
        this(str, str2, j2, j3, j4, j5, arrayList);
    }
}
