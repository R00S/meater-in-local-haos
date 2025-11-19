package o3;

import Xb.C1849m;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l3.C3898b;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: MeasurementManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lo3/n;", "", "<init>", "()V", "Lo3/a;", "deletionRequest", "Loa/F;", "a", "(Lo3/a;Lta/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lta/d;)Ljava/lang/Object;", "trigger", "d", "(Landroid/net/Uri;Lta/d;)Ljava/lang/Object;", "Lo3/o;", "request", "e", "(Lo3/o;Lta/d;)Ljava/lang/Object;", "Lo3/p;", "f", "(Lo3/p;Lta/d;)Ljava/lang/Object;", "", "b", "(Lta/d;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4122n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lo3/n$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lo3/n;", "a", "(Landroid/content/Context;)Lo3/n;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o3.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AbstractC4122n a(Context context) {
            C3862t.g(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C3898b c3898b = C3898b.f44354a;
            sb2.append(c3898b.a());
            Log.d("MeasurementManager", sb2.toString());
            if (c3898b.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private Companion() {
        }
    }

    public abstract Object a(C4109a c4109a, InterfaceC4588d<? super C4153F> interfaceC4588d);

    public abstract Object b(InterfaceC4588d<? super Integer> interfaceC4588d);

    public abstract Object c(Uri uri, InputEvent inputEvent, InterfaceC4588d<? super C4153F> interfaceC4588d);

    public abstract Object d(Uri uri, InterfaceC4588d<? super C4153F> interfaceC4588d);

    public abstract Object e(C4123o c4123o, InterfaceC4588d<? super C4153F> interfaceC4588d);

    public abstract Object f(C4124p c4124p, InterfaceC4588d<? super C4153F> interfaceC4588d);

    /* compiled from: MeasurementManager.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001aH\u0097@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000eH\u0097@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0012H\u0097@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'H\u0097@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lo3/n$a;", "Lo3/n;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Lo3/a;", "request", "Landroid/adservices/measurement/DeletionRequest;", "k", "(Lo3/a;)Landroid/adservices/measurement/DeletionRequest;", "Lo3/o;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "l", "(Lo3/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;", "Lo3/p;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "m", "(Lo3/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "deletionRequest", "Loa/F;", "a", "(Lo3/a;Lta/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lta/d;)Ljava/lang/Object;", "trigger", "d", "(Landroid/net/Uri;Lta/d;)Ljava/lang/Object;", "e", "(Lo3/o;Lta/d;)Ljava/lang/Object;", "f", "(Lo3/p;Lta/d;)Ljava/lang/Object;", "", "b", "(Lta/d;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: o3.n$a */
    private static final class a extends AbstractC4122n {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final MeasurementManager mMeasurementManager;

        public a(MeasurementManager mMeasurementManager) {
            C3862t.g(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(C4109a request) {
            C4119k.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(C4123o request) {
            C4120l.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(C4124p request) {
            C4111c.a();
            throw null;
        }

        @Override // o3.AbstractC4122n
        public Object a(C4109a c4109a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.deleteRegistrations(k(c4109a), new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        }

        @Override // o3.AbstractC4122n
        public Object b(InterfaceC4588d<? super Integer> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.getMeasurementApiStatus(new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR;
        }

        @Override // o3.AbstractC4122n
        public Object c(Uri uri, InputEvent inputEvent, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.registerSource(uri, inputEvent, new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        }

        @Override // o3.AbstractC4122n
        public Object d(Uri uri, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.registerTrigger(uri, new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        }

        @Override // o3.AbstractC4122n
        public Object e(C4123o c4123o, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.registerWebSource(l(c4123o), new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        }

        @Override // o3.AbstractC4122n
        public Object f(C4124p c4124p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            this.mMeasurementManager.registerWebTrigger(m(c4124p), new ExecutorC4121m(), n1.n.a(c1849m));
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            C3862t.g(context, "context");
            Object systemService = context.getSystemService((Class<Object>) C4114f.a());
            C3862t.f(systemService, "context.getSystemService…:class.java\n            )");
            this(C4115g.a(systemService));
        }
    }
}
