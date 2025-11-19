package f1;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final String f41201a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f41202b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f41203c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41204d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41205e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f41206f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f41207g;

    /* compiled from: RemoteInput.java */
    static class a {
        public static RemoteInput a(w wVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wVar.i()).setLabel(wVar.h()).setChoices(wVar.e()).setAllowFreeFormInput(wVar.c()).addExtras(wVar.g());
            Set<String> setD = wVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, wVar.f());
            }
            return builderAddExtras.build();
        }
    }

    /* compiled from: RemoteInput.java */
    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* compiled from: RemoteInput.java */
    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput a(w wVar) {
        return a.a(wVar);
    }

    static RemoteInput[] b(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            remoteInputArr[i10] = a(wVarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f41204d;
    }

    public Set<String> d() {
        return this.f41207g;
    }

    public CharSequence[] e() {
        return this.f41203c;
    }

    public int f() {
        return this.f41205e;
    }

    public Bundle g() {
        return this.f41206f;
    }

    public CharSequence h() {
        return this.f41202b;
    }

    public String i() {
        return this.f41201a;
    }

    public boolean j() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
