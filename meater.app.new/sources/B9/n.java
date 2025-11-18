package B9;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: URLWrapper.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final URL f1952a;

    public n(URL url) {
        this.f1952a = url;
    }

    public URLConnection a() {
        return this.f1952a.openConnection();
    }

    public String toString() {
        return this.f1952a.toString();
    }
}
