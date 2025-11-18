package kotlin;

import U0.h;
import com.apptionlabs.meater_app.model.TemperatureLog;
import kotlin.C4716F;
import kotlin.C4737a;
import kotlin.C4768p0;
import kotlin.CubicBezierEasing;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.InterfaceC5159h;

/* compiled from: Elevation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lv/a;", "LU0/h;", "target", "Lz/h;", "from", "to", "Loa/F;", "d", "(Lv/a;FLz/h;Lz/h;Lta/d;)Ljava/lang/Object;", "Lv/p0;", "a", "Lv/p0;", "DefaultIncomingSpec", "b", "DefaultOutgoingSpec", "c", "HoveredOutgoingSpec", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115B {

    /* renamed from: a, reason: collision with root package name */
    private static final C4768p0<h> f5830a = new C4768p0<>(TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, 0, C4716F.d(), 2, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C4768p0<h> f5831b = new C4768p0<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C4768p0<h> f5832c = new C4768p0<>(TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(C4737a<h, ?> c4737a, float f10, InterfaceC5159h interfaceC5159h, InterfaceC5159h interfaceC5159h2, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        InterfaceC4753i<h> interfaceC4753iA = interfaceC5159h2 != null ? C1114A.f5829a.a(interfaceC5159h2) : interfaceC5159h != null ? C1114A.f5829a.b(interfaceC5159h) : null;
        if (interfaceC4753iA != null) {
            Object objF = C4737a.f(c4737a, h.p(f10), interfaceC4753iA, null, null, interfaceC4588d, 12, null);
            return objF == C4696b.e() ? objF : C4153F.f46609a;
        }
        Object objT = c4737a.t(h.p(f10), interfaceC4588d);
        return objT == C4696b.e() ? objT : C4153F.f46609a;
    }
}
