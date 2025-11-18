package kotlin;

import Ba.l;
import U0.d;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"LL0/S;", "", "<init>", "()V", "LL0/A;", "Landroid/content/Context;", "context", "", "b", "(LL0/A;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "a", "(Landroid/graphics/Typeface;LL0/A;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1325S {

    /* renamed from: a, reason: collision with root package name */
    public static final C1325S f8956a = new C1325S();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    /* compiled from: PlatformTypefaces.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/z;", "setting", "", "a", "(LL0/z;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.S$a */
    static final class a extends AbstractC3864v implements l<InterfaceC1355z, CharSequence> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ d f8958B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f8958B = dVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC1355z interfaceC1355z) {
            return '\'' + interfaceC1355z.b() + "' " + interfaceC1355z.c(this.f8958B);
        }
    }

    private C1325S() {
    }

    private final String b(C1308A c1308a, Context context) {
        return W0.a.e(c1308a.a(), null, null, null, 0, null, new a(U0.a.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, C1308A variationSettings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.a().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(variationSettings, context));
        return paint.getTypeface();
    }
}
