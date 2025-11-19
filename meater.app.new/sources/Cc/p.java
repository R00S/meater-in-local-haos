package Cc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001c\u0010\u001f\u001a\u00020\u000e*\u00060\u001bj\u0002`\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljava/io/OutputStream;", "LCc/z;", "e", "(Ljava/io/OutputStream;)LCc/z;", "Ljava/io/InputStream;", "LCc/B;", "i", "(Ljava/io/InputStream;)LCc/B;", "Ljava/net/Socket;", "f", "(Ljava/net/Socket;)LCc/z;", "j", "(Ljava/net/Socket;)LCc/B;", "Ljava/io/File;", "", "append", "d", "(Ljava/io/File;Z)LCc/z;", "b", "(Ljava/io/File;)LCc/z;", "h", "(Ljava/io/File;)LCc/B;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f3256a = Logger.getLogger("okio.Okio");

    public static final z b(File file) {
        C3862t.g(file, "<this>");
        return o.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        C3862t.g(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? Ub.n.L(message, "getsockname failed", false, 2, null) : false;
    }

    public static final z d(File file, boolean z10) {
        C3862t.g(file, "<this>");
        return o.g(new FileOutputStream(file, z10));
    }

    public static final z e(OutputStream outputStream) {
        C3862t.g(outputStream, "<this>");
        return new sink(outputStream, new C());
    }

    public static final z f(Socket socket) throws IOException {
        C3862t.g(socket, "<this>");
        A a10 = new A(socket);
        OutputStream outputStream = socket.getOutputStream();
        C3862t.f(outputStream, "getOutputStream(...)");
        return a10.z(new sink(outputStream, a10));
    }

    public static /* synthetic */ z g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return o.f(file, z10);
    }

    public static final B h(File file) {
        C3862t.g(file, "<this>");
        return new source(new FileInputStream(file), C.f3205e);
    }

    public static final B i(InputStream inputStream) {
        C3862t.g(inputStream, "<this>");
        return new source(inputStream, new C());
    }

    public static final B j(Socket socket) throws IOException {
        C3862t.g(socket, "<this>");
        A a10 = new A(socket);
        InputStream inputStream = socket.getInputStream();
        C3862t.f(inputStream, "getInputStream(...)");
        return a10.A(new source(inputStream, a10));
    }
}
