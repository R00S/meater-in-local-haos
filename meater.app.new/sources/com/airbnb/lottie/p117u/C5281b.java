package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5247k;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: com.airbnb.lottie.u.b */
/* loaded from: classes.dex */
public class C5281b {
    /* renamed from: a */
    public static C5247k m9777a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        jsonReader.beginObject();
        C5247k c5247kM9778b = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("a")) {
                c5247kM9778b = m9778b(jsonReader, c5180d);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return c5247kM9778b == null ? new C5247k(null, null, null, null) : c5247kM9778b;
    }

    /* renamed from: b */
    private static C5247k m9778b(JsonReader jsonReader, C5180d c5180d) throws IOException {
        jsonReader.beginObject();
        C5237a c5237aM9785c = null;
        C5237a c5237aM9785c2 = null;
        C5238b c5238bM9787e = null;
        C5238b c5238bM9787e2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "t":
                    c5238bM9787e2 = C5285d.m9787e(jsonReader, c5180d);
                    break;
                case "fc":
                    c5237aM9785c = C5285d.m9785c(jsonReader, c5180d);
                    break;
                case "sc":
                    c5237aM9785c2 = C5285d.m9785c(jsonReader, c5180d);
                    break;
                case "sw":
                    c5238bM9787e = C5285d.m9787e(jsonReader, c5180d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5247k(c5237aM9785c, c5237aM9785c2, c5238bM9787e, c5238bM9787e2);
    }
}
