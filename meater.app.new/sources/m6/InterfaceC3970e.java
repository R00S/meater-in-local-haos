package m6;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* renamed from: m6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3970e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f45117a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
