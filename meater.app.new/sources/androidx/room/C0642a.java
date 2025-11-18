package androidx.room;

import android.content.Context;
import androidx.room.AbstractC0651j;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p024c.p082u.p083a.InterfaceC1009c;

/* compiled from: DatabaseConfiguration.java */
/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
public class C0642a {

    /* renamed from: a */
    public final InterfaceC1009c.c f4236a;

    /* renamed from: b */
    public final Context f4237b;

    /* renamed from: c */
    public final String f4238c;

    /* renamed from: d */
    public final AbstractC0651j.d f4239d;

    /* renamed from: e */
    public final List<AbstractC0651j.b> f4240e;

    /* renamed from: f */
    public final boolean f4241f;

    /* renamed from: g */
    public final AbstractC0651j.c f4242g;

    /* renamed from: h */
    public final Executor f4243h;

    /* renamed from: i */
    public final Executor f4244i;

    /* renamed from: j */
    public final boolean f4245j;

    /* renamed from: k */
    public final boolean f4246k;

    /* renamed from: l */
    public final boolean f4247l;

    /* renamed from: m */
    private final Set<Integer> f4248m;

    /* renamed from: n */
    public final String f4249n;

    /* renamed from: o */
    public final File f4250o;

    public C0642a(Context context, String str, InterfaceC1009c.c cVar, AbstractC0651j.d dVar, List<AbstractC0651j.b> list, boolean z, AbstractC0651j.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f4236a = cVar;
        this.f4237b = context;
        this.f4238c = str;
        this.f4239d = dVar;
        this.f4240e = list;
        this.f4241f = z;
        this.f4242g = cVar2;
        this.f4243h = executor;
        this.f4244i = executor2;
        this.f4245j = z2;
        this.f4246k = z3;
        this.f4247l = z4;
        this.f4248m = set;
        this.f4249n = str2;
        this.f4250o = file;
    }

    /* renamed from: a */
    public boolean m4586a(int i2, int i3) {
        Set<Integer> set;
        return !((i2 > i3) && this.f4247l) && this.f4246k && ((set = this.f4248m) == null || !set.contains(Integer.valueOf(i2)));
    }
}
