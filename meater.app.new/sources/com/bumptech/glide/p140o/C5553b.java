package com.bumptech.glide.p140o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry.java */
/* renamed from: com.bumptech.glide.o.b */
/* loaded from: classes.dex */
public final class C5553b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f13895a = new ArrayList();

    /* renamed from: a */
    public synchronized void m10846a(ImageHeaderParser imageHeaderParser) {
        this.f13895a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> m10847b() {
        return this.f13895a;
    }
}
