package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.p114j.C5258h;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* renamed from: com.airbnb.lottie.u.v */
/* loaded from: classes.dex */
class C5310v {
    /* renamed from: a */
    static C5258h m9836a(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        C5258h.a aVarM9660g = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("mm")) {
                aVarM9660g = C5258h.a.m9660g(jsonReader.nextInt());
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new C5258h(strNextString, aVarM9660g);
    }
}
