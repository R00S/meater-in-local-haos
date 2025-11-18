package e3;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* compiled from: CaptionStyleCompat.java */
/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3185a {

    /* renamed from: g, reason: collision with root package name */
    public static final C3185a f40402g = new C3185a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f40403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40407e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f40408f;

    public C3185a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f40403a = i10;
        this.f40404b = i11;
        this.f40405c = i12;
        this.f40406d = i13;
        this.f40407e = i14;
        this.f40408f = typeface;
    }

    public static C3185a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C3185a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f40402g.f40403a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f40402g.f40404b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f40402g.f40405c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f40402g.f40406d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f40402g.f40407e, captionStyle.getTypeface());
    }
}
