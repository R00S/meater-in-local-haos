package com.airbnb.lottie.p117u;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* renamed from: com.airbnb.lottie.u.p */
/* loaded from: classes.dex */
class C5304p {

    /* compiled from: JsonUtils.java */
    /* renamed from: com.airbnb.lottie.u.p$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12907a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f12907a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12907a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12907a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    private static PointF m9813a(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f2, fNextDouble2 * f2);
    }

    /* renamed from: b */
    private static PointF m9814b(JsonReader jsonReader, float f2) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f2, fNextDouble2 * f2);
    }

    /* renamed from: c */
    private static PointF m9815c(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginObject();
        float fM9819g = 0.0f;
        float fM9819g2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("x")) {
                fM9819g = m9819g(jsonReader);
            } else if (strNextName.equals("y")) {
                fM9819g2 = m9819g(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fM9819g * f2, fM9819g2 * f2);
    }

    /* renamed from: d */
    static int m9816d(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    /* renamed from: e */
    static PointF m9817e(JsonReader jsonReader, float f2) throws IOException {
        int i2 = a.f12907a[jsonReader.peek().ordinal()];
        if (i2 == 1) {
            return m9814b(jsonReader, f2);
        }
        if (i2 == 2) {
            return m9813a(jsonReader, f2);
        }
        if (i2 == 3) {
            return m9815c(jsonReader, f2);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    /* renamed from: f */
    static List<PointF> m9818f(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m9817e(jsonReader, f2));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: g */
    static float m9819g(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i2 = a.f12907a[jsonTokenPeek.ordinal()];
        if (i2 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i2 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + jsonTokenPeek);
        }
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return fNextDouble;
    }
}
