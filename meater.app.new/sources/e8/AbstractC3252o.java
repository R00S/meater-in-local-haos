package e8;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3252o {

    /* renamed from: a, reason: collision with root package name */
    protected final C3253p f40769a;

    /* renamed from: b, reason: collision with root package name */
    private final IntentFilter f40770b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f40771c;

    /* renamed from: d, reason: collision with root package name */
    protected final Set f40772d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f40773e = false;

    protected AbstractC3252o(C3253p c3253p, IntentFilter intentFilter, Context context) {
        this.f40769a = c3253p;
        this.f40770b = intentFilter;
        this.f40771c = C3237B.a(context);
    }
}
