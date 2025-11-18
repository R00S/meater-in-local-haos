package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class zzd implements Runnable {

    /* renamed from: f */
    private static final Logger f17092f = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: g */
    private final String f17093g;

    /* renamed from: h */
    private final StatusPendingResult f17094h;

    private zzd(String str) {
        Preconditions.m14368g(str);
        this.f17093g = str;
        this.f17094h = new StatusPendingResult(null);
    }

    /* renamed from: a */
    public static PendingResult<Status> m13723a(String str) {
        if (str == null) {
            return PendingResults.m13902a(new Status(4), null);
        }
        zzd zzdVar = new zzd(str);
        new Thread(zzdVar).start();
        return zzdVar.f17094h;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.f17293i;
        try {
            String strValueOf = String.valueOf(this.f17093g);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f17291g;
            } else {
                f17092f.m14529b("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f17092f;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.m14528a(sb.toString(), new Object[0]);
        } catch (IOException e2) {
            Logger logger2 = f17092f;
            String strValueOf2 = String.valueOf(e2.toString());
            logger2.m14529b(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e3) {
            Logger logger3 = f17092f;
            String strValueOf3 = String.valueOf(e3.toString());
            logger3.m14529b(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f17094h.m13940k(status);
    }
}
