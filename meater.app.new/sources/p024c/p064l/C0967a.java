package p024c.p064l;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C9801m;

/* compiled from: DataStoreFile.kt */
/* renamed from: c.l.a */
/* loaded from: classes.dex */
public final class C0967a {
    /* renamed from: a */
    public static final File m6177a(Context context, String str) {
        C9801m.m32346f(context, "<this>");
        C9801m.m32346f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C9801m.m32354n("datastore/", str));
    }
}
