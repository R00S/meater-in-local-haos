package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: IntegerParser.java */
/* renamed from: com.airbnb.lottie.u.o */
/* loaded from: classes.dex */
public class C5303o implements InterfaceC5298j0<Integer> {

    /* renamed from: a */
    public static final C5303o f12906a = new C5303o();

    private C5303o() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5298j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo9781a(JsonReader jsonReader, float f2) throws IOException {
        return Integer.valueOf(Math.round(C5304p.m9819g(jsonReader) * f2));
    }
}
