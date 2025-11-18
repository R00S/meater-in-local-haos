package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzard
/* loaded from: classes2.dex */
public final class zzbah implements zzazw {

    /* renamed from: a */
    private final String f22749a;

    public zzbah() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    /* renamed from: a */
    public final void mo15137a(String str) {
        try {
            String strValueOf = String.valueOf(str);
            zzbad.m17349e(strValueOf.length() != 0 ? "Pinging URL: ".concat(strValueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                zzyt.m20844a();
                zzazt.m17305i(true, httpURLConnection, this.f22749a);
                zzazx zzazxVar = new zzazx();
                zzazxVar.m17341i(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzazxVar.m17340h(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(str);
                    zzbad.m17353i(sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            zzbad.m17353i(sb2.toString());
        } catch (IndexOutOfBoundsException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            zzbad.m17353i(sb3.toString());
        } catch (RuntimeException e4) {
            String message3 = e4.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            zzbad.m17353i(sb4.toString());
        }
    }

    public zzbah(String str) {
        this.f22749a = str;
    }
}
