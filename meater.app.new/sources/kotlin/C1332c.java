package kotlin;

import Xb.C1849m;
import Xb.InterfaceC1847l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import i1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LL0/O;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(LL0/O;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(LL0/O;Landroid/content/Context;Lta/d;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332c {

    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"L0/c$a", "Li1/h$e;", "Landroid/graphics/Typeface;", "typeface", "Loa/F;", "i", "(Landroid/graphics/Typeface;)V", "", "reason", "h", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.c$a */
    public static final class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<Typeface> f8980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResourceFont f8981b;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1847l<? super Typeface> interfaceC1847l, ResourceFont resourceFont) {
            this.f8980a = interfaceC1847l;
            this.f8981b = resourceFont;
        }

        @Override // i1.h.e
        /* renamed from: h */
        public void f(int reason) {
            this.f8980a.M(new IllegalStateException("Unable to load font " + this.f8981b + " (reason=" + reason + ')'));
        }

        @Override // i1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            this.f8980a.resumeWith(C4172q.a(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        Typeface typefaceG = h.g(context, resourceFont.getResId());
        C3862t.d(typefaceG);
        return typefaceG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, InterfaceC4588d<? super Typeface> interfaceC4588d) throws Resources.NotFoundException {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        h.i(context, resourceFont.getResId(), new a(c1849m, resourceFont), null);
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }
}
