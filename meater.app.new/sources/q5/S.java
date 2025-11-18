package q5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.R;
import g5.EnumC3427c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import o5.AbstractC4134b;

/* compiled from: SetupCompleteFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\u000f"}, d2 = {"Lq5/S;", "Lo5/b;", "<init>", "()V", "Loa/F;", "R2", "z2", "J2", "I2", "H2", "N2", "O2", "G2", "I0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class S extends AbstractC4134b {

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: SetupCompleteFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq5/S$a;", "", "<init>", "()V", "Lq5/S;", "a", "()Lq5/S;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.S$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final S a() {
            S s10 = new S();
            s10.k2(new Bundle());
            return s10;
        }

        private Companion() {
        }
    }

    private final void R2() {
        if (com.apptionlabs.meater_app.views.X.f32816z) {
            Intent intent = new Intent();
            intent.setPackage(x4.g.h().getPackageName());
            c2().setResult(-1, intent);
            com.apptionlabs.meater_app.views.X.f32816z = false;
        } else {
            Intent intent2 = new Intent(T(), (Class<?>) MainActivity.class);
            intent2.putExtra("fromQsgScreen", true);
            t2(intent2);
            x4.g.t().b1(false);
        }
        androidx.fragment.app.o oVarT = T();
        if (oVarT != null) {
            oVarT.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(S s10, View view) {
        s10.R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(S s10, View view) {
        s10.E2().E();
    }

    @Override // o5.AbstractC4134b
    public void G2() {
        LinearLayoutCompat progressHolder = B2().f9677u;
        C3862t.f(progressHolder, "progressHolder");
        Q4.l.i(progressHolder);
    }

    @Override // o5.AbstractC4134b
    public void H2() {
        B2().f9658b.setAnimation(R.raw.qsg_setup_complete);
    }

    @Override // o5.AbstractC4134b
    public void I2() {
        B2().f9679w.setText(A0(R.string.setup_complete_description));
    }

    @Override // o5.AbstractC4134b
    public void J2() {
        B2().f9680x.setText(A0(R.string.setup_complete_title));
    }

    @Override // o5.AbstractC4134b
    public void N2() {
        B2().f9661e.setText(A0(R.string.lets_get_started));
        B2().f9661e.setOnClickListener(new View.OnClickListener() { // from class: q5.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                S.S2(this.f48043B, view);
            }
        });
    }

    @Override // o5.AbstractC4134b
    public void O2() {
        B2().f9656A.setText(A0(R.string.add_another_product));
        B2().f9656A.setTextColor(e2().getColor(R.color.meater_red));
        B2().f9656A.setPaintFlags(B2().f9656A.getPaintFlags() | 8);
        AppCompatTextView whyDoINeed = B2().f9656A;
        C3862t.f(whyDoINeed, "whyDoINeed");
        Q4.l.j(whyDoINeed);
        B2().f9656A.setOnClickListener(new View.OnClickListener() { // from class: q5.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                S.T2(this.f48044B, view);
            }
        });
    }

    @Override // o5.AbstractC4134b
    public void z2() {
        E2().J(EnumC3427c.f41920Y);
        K2();
    }
}
