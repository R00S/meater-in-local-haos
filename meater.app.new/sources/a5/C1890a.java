package a5;

import android.view.B;
import android.view.D;
import com.apptionlabs.meater_app.data.JuicyVideoList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import p4.OfferData;

/* compiled from: NewsOffersManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"La5/a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/data/JuicyVideoList;", "videos", "Loa/F;", "d", "(Lcom/apptionlabs/meater_app/data/JuicyVideoList;)V", "", "Lp4/j;", "newOffers", "e", "(Ljava/util/List;)V", "Landroidx/lifecycle/B;", "a", "()Landroidx/lifecycle/B;", "c", "Landroidx/lifecycle/D;", "b", "Landroidx/lifecycle/D;", "_offers", "Landroidx/lifecycle/B;", "getOffers", "offers", "_juicyVideoList", "setJuicyVideoList", "(Landroidx/lifecycle/B;)V", "juicyVideoList", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1890a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1890a f20074a = new C1890a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final D<List<OfferData>> _offers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final B<List<OfferData>> offers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final D<JuicyVideoList> _juicyVideoList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static B<JuicyVideoList> juicyVideoList;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20079f;

    static {
        D<List<OfferData>> d10 = new D<>();
        _offers = d10;
        offers = d10;
        D<JuicyVideoList> d11 = new D<>();
        _juicyVideoList = d11;
        juicyVideoList = d11;
        f20079f = 8;
    }

    private C1890a() {
    }

    public final B<List<OfferData>> a() {
        return offers;
    }

    public final B<JuicyVideoList> b() {
        return juicyVideoList;
    }

    public final B<JuicyVideoList> c() {
        return juicyVideoList;
    }

    public final void d(JuicyVideoList videos) {
        C3862t.g(videos, "videos");
        _juicyVideoList.l(videos);
    }

    public final void e(List<OfferData> newOffers) {
        C3862t.g(newOffers, "newOffers");
        _offers.l(newOffers);
    }
}
