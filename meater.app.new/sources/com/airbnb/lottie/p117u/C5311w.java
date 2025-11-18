package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p108q.p110b.C5218h;
import com.airbnb.lottie.p118v.C5320f;
import java.io.IOException;

/* compiled from: PathKeyframeParser.java */
/* renamed from: com.airbnb.lottie.u.w */
/* loaded from: classes.dex */
class C5311w {
    /* renamed from: a */
    static C5218h m9837a(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5218h(c5180d, C5305q.m9821b(jsonReader, c5180d, C5320f.m9887e(), C5312x.f12910a, jsonReader.peek() == JsonToken.BEGIN_OBJECT));
    }
}
