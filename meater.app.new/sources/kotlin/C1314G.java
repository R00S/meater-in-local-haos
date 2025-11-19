package kotlin;

import Ba.l;
import O0.i;
import android.graphics.Typeface;
import kotlin.InterfaceC1329W;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"LL0/G;", "", "<init>", "()V", "LL0/U;", "typefaceRequest", "LL0/H;", "platformFontLoader", "Lkotlin/Function1;", "LL0/W$b;", "Loa/F;", "onAsyncCompletion", "createDefaultTypeface", "LL0/W;", "a", "(LL0/U;LL0/H;LBa/l;LBa/l;)LL0/W;", "LL0/J;", "LL0/J;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1317J platformTypefaceResolver = C1321N.a();

    public InterfaceC1329W a(TypefaceRequest typefaceRequest, InterfaceC1315H platformFontLoader, l<? super InterfaceC1329W.b, C4153F> onAsyncCompletion, l<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceA;
        AbstractC1341l fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof C1338i) {
            typefaceA = this.platformTypefaceResolver.a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof C1312E) {
            typefaceA = this.platformTypefaceResolver.b((C1312E) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            InterfaceC1324Q typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            C3862t.e(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceA = ((i) typeface).a(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new InterfaceC1329W.b(typefaceA, false, 2, null);
    }
}
