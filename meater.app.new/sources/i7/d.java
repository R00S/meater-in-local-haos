package i7;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import e7.AbstractC3225o;
import e7.InterfaceC3223m;
import g7.C3448t;
import g7.C3451w;
import g7.InterfaceC3450v;
import p7.f;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class d extends com.google.android.gms.common.api.b implements InterfaceC3450v {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f43145k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0458a f43146l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f43147m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f43148n = 0;

    static {
        a.g gVar = new a.g();
        f43145k = gVar;
        c cVar = new c();
        f43146l = cVar;
        f43147m = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C3451w c3451w) {
        super(context, f43147m, c3451w, b.a.f33481c);
    }

    @Override // g7.InterfaceC3450v
    public final AbstractC5208j<Void> a(final C3448t c3448t) {
        AbstractC3225o.a aVarA = AbstractC3225o.a();
        aVarA.d(f.f47657a);
        aVarA.c(false);
        aVarA.b(new InterfaceC3223m() { // from class: i7.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e7.InterfaceC3223m
            public final void a(Object obj, Object obj2) {
                int i10 = d.f43148n;
                ((C3630a) ((e) obj).D()).u1(c3448t);
                ((C5209k) obj2).c(null);
            }
        });
        return d(aVarA.a());
    }
}
