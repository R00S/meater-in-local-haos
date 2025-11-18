package androidx.compose.ui.tooling;

import A.N;
import A0.InterfaceC0828g;
import Ba.p;
import Ba.q;
import Ub.n;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.o;
import b0.h;
import b0.i;
import d.ActivityC3006j;
import e.C3107d;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.C1;
import kotlin.C1125L;
import kotlin.C1135X;
import kotlin.C1538d1;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1557m0;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.I;

/* compiled from: PreviewActivity.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Ld/j;", "<init>", "()V", "", "composableFqn", "Loa/F;", "r0", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "s0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "X", "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreviewActivity extends ActivityC3006j {

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final String TAG = "PreviewActivity";

    /* compiled from: PreviewActivity.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f23496B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f23497C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f23496B = str;
            this.f23497C = str2;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) throws Exception {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-840626948, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
            }
            S0.a.f15260a.g(this.f23496B, this.f23497C, interfaceC1554l, new Object[0]);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) throws Exception {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: PreviewActivity.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Object[] f23498B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f23499C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f23500D;

        /* compiled from: PreviewActivity.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Object[] f23501B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC1557m0 f23502C;

            /* compiled from: PreviewActivity.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a, reason: collision with other inner class name */
            static final class C0334a extends AbstractC3864v implements Ba.a<C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ InterfaceC1557m0 f23503B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ Object[] f23504C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0334a(InterfaceC1557m0 interfaceC1557m0, Object[] objArr) {
                    super(0);
                    this.f23503B = interfaceC1557m0;
                    this.f23504C = objArr;
                }

                public final void a() {
                    InterfaceC1557m0 interfaceC1557m0 = this.f23503B;
                    interfaceC1557m0.g((interfaceC1557m0.d() + 1) % this.f23504C.length);
                }

                @Override // Ba.a
                public /* bridge */ /* synthetic */ C4153F invoke() {
                    a();
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object[] objArr, InterfaceC1557m0 interfaceC1557m0) {
                super(2);
                this.f23501B = objArr;
                this.f23502C = interfaceC1557m0;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(958604965, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                }
                p<InterfaceC1554l, Integer, C4153F> pVarA = S0.b.f15261a.a();
                boolean zL = interfaceC1554l.l(this.f23501B);
                InterfaceC1557m0 interfaceC1557m0 = this.f23502C;
                Object[] objArr = this.f23501B;
                Object objF = interfaceC1554l.f();
                if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new C0334a(interfaceC1557m0, objArr);
                    interfaceC1554l.J(objF);
                }
                C1125L.a(pVarA, (Ba.a) objF, null, null, null, null, 0L, 0L, null, interfaceC1554l, 6, 508);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: PreviewActivity.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA/N;", "padding", "Loa/F;", "a", "(LA/N;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b, reason: collision with other inner class name */
        static final class C0335b extends AbstractC3864v implements q<N, InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f23505B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ String f23506C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Object[] f23507D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InterfaceC1557m0 f23508E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0335b(String str, String str2, Object[] objArr, InterfaceC1557m0 interfaceC1557m0) {
                super(3);
                this.f23505B = str;
                this.f23506C = str2;
                this.f23507D = objArr;
                this.f23508E = interfaceC1557m0;
            }

            public final void a(N n10, InterfaceC1554l interfaceC1554l, int i10) throws Exception {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC1554l.R(n10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(57310875, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                }
                i iVarH = o.h(i.INSTANCE, n10);
                String str = this.f23505B;
                String str2 = this.f23506C;
                Object[] objArr = this.f23507D;
                InterfaceC1557m0 interfaceC1557m0 = this.f23508E;
                I iH = d.h(b0.c.INSTANCE.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = h.e(interfaceC1554l, iVarH);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.getInserting()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion.d());
                f fVar = f.f22255a;
                S0.a.f15260a.g(str, str2, interfaceC1554l, objArr[interfaceC1557m0.d()]);
                interfaceC1554l.P();
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.q
            public /* bridge */ /* synthetic */ C4153F g(N n10, InterfaceC1554l interfaceC1554l, Integer num) throws Exception {
                a(n10, interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, String str, String str2) {
            super(2);
            this.f23498B = objArr;
            this.f23499C = str;
            this.f23500D = str2;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-861939235, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
            }
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = C1538d1.a(0);
                interfaceC1554l.J(objF);
            }
            InterfaceC1557m0 interfaceC1557m0 = (InterfaceC1557m0) objF;
            C1135X.a(null, null, null, null, null, W.c.d(958604965, true, new a(this.f23498B, interfaceC1557m0), interfaceC1554l, 54), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, W.c.d(57310875, true, new C0335b(this.f23499C, this.f23500D, this.f23498B, interfaceC1557m0), interfaceC1554l, 54), interfaceC1554l, 196608, 12582912, 131039);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: PreviewActivity.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f23509B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f23510C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object[] f23511D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Object[] objArr) {
            super(2);
            this.f23509B = str;
            this.f23510C = str2;
            this.f23511D = objArr;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) throws Exception {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1901447514, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
            }
            S0.a aVar = S0.a.f15260a;
            String str = this.f23509B;
            String str2 = this.f23510C;
            Object[] objArr = this.f23511D;
            aVar.g(str, str2, interfaceC1554l, Arrays.copyOf(objArr, objArr.length));
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) throws Exception {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    private final void r0(String composableFqn) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        String strT0 = n.T0(composableFqn, '.', null, 2, null);
        String strL0 = n.L0(composableFqn, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            s0(strT0, strL0, stringExtra);
            return;
        }
        Log.d(this.TAG, "Previewing '" + strL0 + "' without a parameter provider.");
        C3107d.b(this, null, W.c.b(-840626948, true, new a(strT0, strL0)), 1, null);
    }

    private final void s0(String className, String methodName, String parameterProvider) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + '\'');
        Object[] objArrB = S0.d.b(S0.d.a(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrB.length > 1) {
            C3107d.b(this, null, W.c.b(-861939235, true, new b(objArrB, className, methodName)), 1, null);
        } else {
            C3107d.b(this, null, W.c.b(-1901447514, true, new c(className, methodName, objArrB)), 1, null);
        }
    }

    @Override // d.ActivityC3006j, f1.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        r0(stringExtra);
    }
}
