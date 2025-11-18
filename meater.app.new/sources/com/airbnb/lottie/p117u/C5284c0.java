package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p119w.C5324d;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* renamed from: com.airbnb.lottie.u.c0 */
/* loaded from: classes.dex */
public class C5284c0 implements InterfaceC5298j0<C5324d> {

    /* renamed from: a */
    public static final C5284c0 f12900a = new C5284c0();

    private C5284c0() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5298j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5324d mo9781a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C5324d((fNextDouble / 100.0f) * f2, (fNextDouble2 / 100.0f) * f2);
    }
}
