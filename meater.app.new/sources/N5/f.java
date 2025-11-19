package N5;

import P5.Q;
import android.content.Context;
import android.view.View;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import x4.g;

/* compiled from: ProbeInstructionFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003¨\u0006\f"}, d2 = {"LN5/f;", "LN5/d;", "<init>", "()V", "Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "G2", "()Lcom/apptionlabs/meater_app/targets/MeaterTargetSetupActivity$c;", "Loa/F;", "J2", "z2", "M0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends d {

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: N0, reason: collision with root package name */
    private static final String f12531N0 = "ProbeInstructionFragment";

    /* compiled from: ProbeInstructionFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LN5/f$a;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "LN5/f;", "b", "(Lcom/apptionlabs/meater_app/model/Probe;)LN5/f;", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: N5.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a() {
            return f.f12531N0;
        }

        public final f b(Probe probe) {
            f fVar = new f();
            fVar.k2(d.INSTANCE.a(probe));
            return fVar;
        }

        private Companion() {
        }
    }

    public static final f M2(Probe probe) {
        return INSTANCE.b(probe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(f fVar, View view) {
        Q.G(fVar.T(), "https://youtu.be/yCbhQ6KpLVg");
    }

    @Override // N5.d
    public MeaterTargetSetupActivity.c G2() {
        return MeaterTargetSetupActivity.c.PROBE_INSTRUCTION;
    }

    @Override // N5.d
    public void J2() {
        MeatCut meatCut;
        MEATERDeviceType mEATERDeviceType;
        x4.b.l(T(), "Insert Probe Instructions");
        A2().f9717l.setOnClickListener(new View.OnClickListener() { // from class: N5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.N2(this.f12529B, view);
            }
        });
        Context contextZ = Z();
        Integer animationRawRes = null;
        if (contextZ != null) {
            Probe probeB2 = getProbe();
            boolean z10 = false;
            if (probeB2 != null && (mEATERDeviceType = probeB2.getMEATERDeviceType()) != null && mEATERDeviceType.isG2Probe()) {
                z10 = true;
            }
            Probe probeB22 = getProbe();
            if (probeB22 != null && (meatCut = probeB22.getmCut()) != null) {
                animationRawRes = meatCut.getAnimationRawRes(contextZ, z10);
            }
        }
        A2().f9707b.setAnimation(animationRawRes != null ? animationRawRes.intValue() : R.raw.beef_steak);
        I2(A0(R.string.probe_insertion_fragment_heading_1), A0(R.string.probe_insertion_fragment_label_1), A0(R.string.probe_insertion_fragment_label_2), A0(R.string.probe_insertion_fragment_label_3));
    }

    @Override // N5.d
    public void z2() {
        g.t().Q0(false);
    }
}
