package za;

import Ub.n;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "", "a", "(Ljava/io/File;)Ljava/lang/String;", "extension", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes2.dex */
public class f extends e {
    public static String a(File file) {
        C3862t.g(file, "<this>");
        String name = file.getName();
        C3862t.f(name, "getName(...)");
        return n.J0(name, '.', "");
    }
}
