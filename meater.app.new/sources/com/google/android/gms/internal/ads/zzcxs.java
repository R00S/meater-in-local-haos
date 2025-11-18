package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcxs {

    /* renamed from: a */
    public final List<zzcxm> f25283a;

    /* renamed from: b */
    public final zzcxo f25284b;

    /* renamed from: c */
    public final List<zzcxt> f25285c;

    private zzcxs(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List<zzcxm> listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzcxo zzcxoVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new zzcxm(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzcxoVar = new zzcxo(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    Map<String, String> mapM17268j = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            mapM17268j = zzazc.m17268j(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new zzcxt(strNextString, mapM17268j));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f25285c = arrayList;
        this.f25283a = listEmptyList;
        this.f25284b = zzcxoVar == null ? new zzcxo(new JsonReader(new StringReader("{}"))) : zzcxoVar;
    }

    /* renamed from: a */
    public static zzcxs m19023a(Reader reader) throws IOException, zzcxp {
        try {
            try {
                return new zzcxs(new JsonReader(reader));
            } catch (IOException | IllegalStateException | NumberFormatException | JSONException e2) {
                throw new zzcxp("unable to parse ServerResponse", e2);
            }
        } finally {
            IOUtils.m14630a(reader);
        }
    }
}
