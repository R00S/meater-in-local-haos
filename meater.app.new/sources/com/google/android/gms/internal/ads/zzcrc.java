package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcrc {

    /* renamed from: a */
    public final String f24955a;

    /* renamed from: b */
    public String f24956b;

    public zzcrc(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        jsonReader.beginObject();
        String strNextString = HttpUrl.FRAGMENT_ENCODE_SET;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ((strNextName == null ? HttpUrl.FRAGMENT_ENCODE_SET : strNextName).equals("params")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        this.f24955a = strNextString;
        jsonReader.endObject();
    }

    /* renamed from: a */
    final zzcrc m18954a(Bundle bundle) {
        try {
            this.f24956b = zzk.zzlg().m17171N(bundle).toString();
        } catch (JSONException unused) {
            this.f24956b = "{}";
        }
        return this;
    }
}
