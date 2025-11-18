package Y6;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import o7.i;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
public final class d {
    public static final void a(String str) {
        try {
            try {
                i.b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    i.a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e10) {
                e = e10;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message);
                Log.w("HttpUrlPinger", sb3.toString(), e);
                i.a();
            } catch (IndexOutOfBoundsException e11) {
                String message2 = e11.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb4.append("Error while parsing ping URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message2);
                Log.w("HttpUrlPinger", sb4.toString(), e11);
                i.a();
            } catch (RuntimeException e12) {
                e = e12;
                String message3 = e.getMessage();
                StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb32.append("Error while pinging URL: ");
                sb32.append(str);
                sb32.append(". ");
                sb32.append(message3);
                Log.w("HttpUrlPinger", sb32.toString(), e);
                i.a();
            }
        } catch (Throwable th) {
            i.a();
            throw th;
        }
    }
}
