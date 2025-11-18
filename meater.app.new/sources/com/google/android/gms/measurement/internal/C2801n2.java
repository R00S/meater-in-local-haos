package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.C2601v2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2801n2 extends AbstractC2873x5 {
    public C2801n2(C2880y5 c2880y5) {
        super(c2880y5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] B(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean C() {
        v();
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ N5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2812p r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2866w5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }

    public final void z(String str, C2887z5 c2887z5, C2601v2 c2601v2, InterfaceC2794m2 interfaceC2794m2) {
        n();
        v();
        try {
            URL url = new URI(c2887z5.c()).toURL();
            p();
            o().A(new RunnableC2808o2(this, str, url, c2601v2.m(), c2887z5.d(), interfaceC2794m2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            k().H().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C2759h2.w(str), c2887z5.c());
        }
    }
}
