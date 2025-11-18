package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5239c;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p113i.C5243g;
import com.airbnb.lottie.p112s.p113i.C5244h;
import com.airbnb.lottie.p112s.p113i.C5246j;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5324d;
import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* renamed from: com.airbnb.lottie.u.d */
/* loaded from: classes.dex */
public class C5285d {
    /* renamed from: a */
    private static <T> List<C5321a<T>> m9783a(JsonReader jsonReader, float f2, C5180d c5180d, InterfaceC5298j0<T> interfaceC5298j0) throws IOException {
        return C5306r.m9826a(jsonReader, c5180d, f2, interfaceC5298j0);
    }

    /* renamed from: b */
    private static <T> List<C5321a<T>> m9784b(JsonReader jsonReader, C5180d c5180d, InterfaceC5298j0<T> interfaceC5298j0) throws IOException {
        return C5306r.m9826a(jsonReader, c5180d, 1.0f, interfaceC5298j0);
    }

    /* renamed from: c */
    static C5237a m9785c(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5237a(m9784b(jsonReader, c5180d, C5289f.f12902a));
    }

    /* renamed from: d */
    static C5246j m9786d(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5246j(m9784b(jsonReader, c5180d, C5293h.f12903a));
    }

    /* renamed from: e */
    public static C5238b m9787e(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return m9788f(jsonReader, c5180d, true);
    }

    /* renamed from: f */
    public static C5238b m9788f(JsonReader jsonReader, C5180d c5180d, boolean z) throws IOException {
        return new C5238b(m9783a(jsonReader, z ? C5320f.m9887e() : 1.0f, c5180d, C5295i.f12904a));
    }

    /* renamed from: g */
    static C5239c m9789g(JsonReader jsonReader, C5180d c5180d, int i2) throws IOException {
        return new C5239c(m9784b(jsonReader, c5180d, new C5300l(i2)));
    }

    /* renamed from: h */
    static C5240d m9790h(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5240d(m9784b(jsonReader, c5180d, C5303o.f12906a));
    }

    /* renamed from: i */
    static C5242f m9791i(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5242f(m9783a(jsonReader, C5320f.m9887e(), c5180d, C5313y.f12911a));
    }

    /* renamed from: j */
    static C5243g m9792j(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5243g((List<C5321a<C5324d>>) m9784b(jsonReader, c5180d, C5284c0.f12900a));
    }

    /* renamed from: k */
    static C5244h m9793k(JsonReader jsonReader, C5180d c5180d) throws IOException {
        return new C5244h(m9783a(jsonReader, C5320f.m9887e(), c5180d, C5286d0.f12901a));
    }
}
