package C6;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f2255a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f2255a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f2255a;
    }
}
