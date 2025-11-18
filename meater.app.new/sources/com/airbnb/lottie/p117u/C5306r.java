package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p119w.C5321a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* renamed from: com.airbnb.lottie.u.r */
/* loaded from: classes.dex */
class C5306r {
    /* renamed from: a */
    static <T> List<C5321a<T>> m9826a(JsonReader jsonReader, C5180d c5180d, float f2, InterfaceC5298j0<T> interfaceC5298j0) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c5180d.m9395a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C5305q.m9821b(jsonReader, c5180d, f2, interfaceC5298j0, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C5305q.m9821b(jsonReader, c5180d, f2, interfaceC5298j0, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C5305q.m9821b(jsonReader, c5180d, f2, interfaceC5298j0, false));
            }
        }
        jsonReader.endObject();
        m9827b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m9827b(List<? extends C5321a<?>> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            C5321a<?> c5321a = list.get(i3);
            i3++;
            c5321a.f12936f = Float.valueOf(list.get(i3).f12935e);
        }
        C5321a<?> c5321a2 = list.get(i2);
        if (c5321a2.f12932b == 0) {
            list.remove(c5321a2);
        }
    }
}
