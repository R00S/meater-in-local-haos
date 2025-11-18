package U1;

import java.util.HashSet;

/* compiled from: MediaLibraryInfo.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f17366a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f17367b = "media3.common";

    public static synchronized void a(String str) {
        if (f17366a.add(str)) {
            f17367b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f17367b;
    }
}
