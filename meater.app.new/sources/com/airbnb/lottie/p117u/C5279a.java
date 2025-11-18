package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5241e;
import com.airbnb.lottie.p112s.p113i.C5245i;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5321a;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: com.airbnb.lottie.u.a */
/* loaded from: classes.dex */
public class C5279a {
    /* renamed from: a */
    public static C5241e m9774a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C5311w.m9837a(jsonReader, c5180d));
            }
            jsonReader.endArray();
            C5306r.m9827b(arrayList);
        } else {
            arrayList.add(new C5321a(C5304p.m9817e(jsonReader, C5320f.m9887e())));
        }
        return new C5241e(arrayList);
    }

    /* renamed from: b */
    static InterfaceC5249m<PointF, PointF> m9775b(JsonReader jsonReader, C5180d c5180d) throws IOException {
        jsonReader.beginObject();
        C5241e c5241eM9774a = null;
        C5238b c5238bM9787e = null;
        C5238b c5238bM9787e2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "k":
                    c5241eM9774a = m9774a(jsonReader, c5180d);
                    continue;
                case "x":
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        c5238bM9787e = C5285d.m9787e(jsonReader, c5180d);
                    }
                case "y":
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        c5238bM9787e2 = C5285d.m9787e(jsonReader, c5180d);
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            z = true;
        }
        jsonReader.endObject();
        if (z) {
            c5180d.m9395a("Lottie doesn't support expressions.");
        }
        return c5241eM9774a != null ? c5241eM9774a : new C5245i(c5238bM9787e, c5238bM9787e2);
    }
}
