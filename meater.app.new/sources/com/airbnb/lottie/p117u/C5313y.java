package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* renamed from: com.airbnb.lottie.u.y */
/* loaded from: classes.dex */
public class C5313y implements InterfaceC5298j0<PointF> {

    /* renamed from: a */
    public static final C5313y f12911a = new C5313y();

    private C5313y() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5298j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF mo9781a(JsonReader jsonReader, float f2) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return C5304p.m9817e(jsonReader, f2);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return C5304p.m9817e(jsonReader, f2);
        }
        if (jsonTokenPeek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + jsonTokenPeek);
    }
}
