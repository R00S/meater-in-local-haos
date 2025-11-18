package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcxo {

    /* renamed from: a */
    public final List<String> f25272a;

    /* renamed from: b */
    public final String f25273b;

    /* renamed from: c */
    public final int f25274c;

    /* renamed from: d */
    public final String f25275d;

    /* renamed from: e */
    public final int f25276e;

    /* renamed from: f */
    public final long f25277f;

    zzcxo(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List<String> listEmptyList = Collections.emptyList();
        jsonReader.beginObject();
        String strNextString = HttpUrl.FRAGMENT_ENCODE_SET;
        String strNextString2 = HttpUrl.FRAGMENT_ENCODE_SET;
        long jNextLong = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = zzazc.m17260b(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f25272a = listEmptyList;
        this.f25274c = iNextInt;
        this.f25273b = strNextString;
        this.f25275d = strNextString2;
        this.f25276e = iNextInt2;
        this.f25277f = jNextLong;
    }
}
