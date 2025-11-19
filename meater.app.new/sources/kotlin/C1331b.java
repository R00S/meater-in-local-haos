package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.C1350u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LL0/b;", "LL0/H;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LL0/k;", "font", "Landroid/graphics/Typeface;", "d", "(LL0/k;)Landroid/graphics/Typeface;", "a", "(LL0/k;Lta/d;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331b implements InterfaceC1315H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object cacheKey;

    /* compiled from: AndroidFontLoader.android.kt */
    @f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.b$a */
    static final class a extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f8975B;

        /* renamed from: C, reason: collision with root package name */
        Object f8976C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f8977D;

        /* renamed from: F, reason: collision with root package name */
        int f8979F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8977D = obj;
            this.f8979F |= Integer.MIN_VALUE;
            return C1331b.this.a(null, this);
        }
    }

    public C1331b(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlin.InterfaceC1315H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.InterfaceC1340k r6, ta.InterfaceC4588d<? super android.graphics.Typeface> r7) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlin.C1331b.a
            if (r0 == 0) goto L13
            r0 = r7
            L0.b$a r0 = (kotlin.C1331b.a) r0
            int r1 = r0.f8979F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8979F = r1
            goto L18
        L13:
            L0.b$a r0 = new L0.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8977D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f8979F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f8976C
            L0.k r6 = (kotlin.InterfaceC1340k) r6
            java.lang.Object r0 = r0.f8975B
            L0.b r0 = (kotlin.C1331b) r0
            oa.C4173r.b(r7)
            goto L5e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            oa.C4173r.b(r7)
            return r7
        L40:
            oa.C4173r.b(r7)
            boolean r7 = r6 instanceof kotlin.AbstractC1330a
            if (r7 != 0) goto L84
            boolean r7 = r6 instanceof kotlin.ResourceFont
            if (r7 == 0) goto L6d
            r7 = r6
            L0.O r7 = (kotlin.ResourceFont) r7
            android.content.Context r2 = r5.context
            r0.f8975B = r5
            r0.f8976C = r6
            r0.f8979F = r3
            java.lang.Object r7 = kotlin.C1332c.b(r7, r2, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            L0.O r6 = (kotlin.ResourceFont) r6
            L0.A r6 = r6.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r6 = kotlin.C1321N.c(r7, r6, r0)
            return r6
        L6d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L84:
            L0.a r6 = (kotlin.AbstractC1330a) r6
            r6.d()
            r0.f8979F = r4
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1331b.a(L0.k, ta.d):java.lang.Object");
    }

    @Override // kotlin.InterfaceC1315H
    /* renamed from: c, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // kotlin.InterfaceC1315H
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(InterfaceC1340k font) {
        Object objA;
        Typeface typefaceC;
        if (font instanceof AbstractC1330a) {
            ((AbstractC1330a) font).d();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        C1350u.Companion companion = C1350u.INSTANCE;
        if (C1350u.e(loadingStrategy, companion.b())) {
            typefaceC = C1332c.c((ResourceFont) font, this.context);
        } else {
            if (!C1350u.e(loadingStrategy, companion.c())) {
                if (C1350u.e(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) C1350u.g(font.getLoadingStrategy())));
            }
            try {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                objA = C4172q.a(C1332c.c((ResourceFont) font, this.context));
            } catch (Throwable th) {
                C4172q.Companion companion3 = C4172q.INSTANCE;
                objA = C4172q.a(C4173r.a(th));
            }
            typefaceC = (Typeface) (C4172q.c(objA) ? null : objA);
        }
        return C1321N.c(typefaceC, ((ResourceFont) font).getVariationSettings(), this.context);
    }
}
