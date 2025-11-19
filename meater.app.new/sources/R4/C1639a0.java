package R4;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import d2.C3032d;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NewDeviceFoundDialog.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 72\u00020\u0001:\u000289B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105¨\u0006:"}, d2 = {"LR4/a0;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "b3", "(Landroid/view/View;)V", "a3", "Landroidx/media3/exoplayer/ExoPlayer$b;", "playerBuilder", "Landroid/content/Context;", "context", "f3", "(Landroidx/media3/exoplayer/ExoPlayer$b;Landroid/content/Context;)V", "", "preferExtensionRenderer", "Ld2/H;", "Y2", "(Landroid/content/Context;Z)Ld2/H;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "x1", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "E2", "()I", "y1", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "X0", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Y0", "I", "path", "LL4/N0;", "Z0", "LL4/N0;", "binding", "a1", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: R4.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1639a0 extends com.google.android.material.bottomsheet.b {

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b1, reason: collision with root package name */
    public static final int f14925b1 = 8;

    /* renamed from: c1, reason: collision with root package name */
    private static String f14926c1;

    /* renamed from: d1, reason: collision with root package name */
    private static MEATERDeviceType f14927d1;

    /* renamed from: e1, reason: collision with root package name */
    private static a f14928e1;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private ExoPlayer player;

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private int path;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private L4.N0 binding;

    /* compiled from: NewDeviceFoundDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"LR4/a0$a;", "", "Loa/F;", "b", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.a0$a */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: NewDeviceFoundDialog.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LR4/a0$b;", "", "<init>", "()V", "", "deviceName", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "deviceType", "LR4/a0$a;", "listener", "LR4/a0;", "a", "(Ljava/lang/String;Lcom/apptionlabs/meater_app/model/MEATERDeviceType;LR4/a0$a;)LR4/a0;", "Ljava/lang/String;", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "LR4/a0$a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C1639a0 a(String deviceName, MEATERDeviceType deviceType, a listener) {
            C3862t.g(deviceName, "deviceName");
            C3862t.g(deviceType, "deviceType");
            C1639a0 c1639a0 = new C1639a0();
            Bundle bundle = new Bundle();
            C1639a0.f14926c1 = deviceName;
            C1639a0.f14927d1 = deviceType;
            C1639a0.f14928e1 = listener;
            c1639a0.k2(bundle);
            return c1639a0;
        }

        private Companion() {
        }
    }

    /* compiled from: NewDeviceFoundDialog.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: R4.a0$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14932a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MEATERDeviceType.AMBER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f14932a = iArr;
        }
    }

    private final d2.H Y2(Context context, boolean preferExtensionRenderer) {
        C3032d c3032dL = new C3032d(context.getApplicationContext()).m(preferExtensionRenderer ? 2 : 1).l(true);
        C3862t.f(c3032dL, "setEnableDecoderFallback(...)");
        return c3032dL;
    }

    static /* synthetic */ d2.H Z2(C1639a0 c1639a0, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c1639a0.Y2(context, z10);
    }

    private final void a3() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ExoPlayer.b bVar = new ExoPlayer.b(e2());
        Context contextE2 = e2();
        C3862t.f(contextE2, "requireContext(...)");
        f3(bVar, contextE2);
        ExoPlayer exoPlayerF = bVar.f();
        this.player = exoPlayerF;
        L4.N0 n02 = null;
        if (exoPlayerF == null) {
            C3862t.u("player");
            exoPlayerF = null;
        }
        exoPlayerF.S(2);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            C3862t.u("player");
            exoPlayer = null;
        }
        exoPlayer.F(true);
        MEATERDeviceType mEATERDeviceType = f14927d1;
        if (mEATERDeviceType == null) {
            C3862t.u("deviceType");
            mEATERDeviceType = null;
        }
        int i10 = c.f14932a[mEATERDeviceType.ordinal()];
        int i11 = R.raw.new_device_pro;
        switch (i10) {
            case 1:
            case 2:
                i11 = R.raw.new_device_plus;
                break;
            case 3:
                i11 = R.raw.new_device_se;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i11 = R.raw.new_device_block;
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                i11 = R.raw.new_device_pro_duo;
                break;
            case 16:
                i11 = R.raw.new_device_pro_xl;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.path = i11;
        U1.v vVarB = U1.v.b(Uri.parse("android.resource://" + e2().getPackageName() + "/" + this.path));
        C3862t.f(vVarB, "fromUri(...)");
        ExoPlayer exoPlayer2 = this.player;
        if (exoPlayer2 == null) {
            C3862t.u("player");
            exoPlayer2 = null;
        }
        exoPlayer2.Z(vVarB);
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 == null) {
            C3862t.u("player");
            exoPlayer3 = null;
        }
        exoPlayer3.i();
        L4.N0 n03 = this.binding;
        if (n03 == null) {
            C3862t.u("binding");
            n03 = null;
        }
        PlayerView playerView = n03.f9543g;
        ExoPlayer exoPlayer4 = this.player;
        if (exoPlayer4 == null) {
            C3862t.u("player");
            exoPlayer4 = null;
        }
        playerView.setPlayer(exoPlayer4);
        L4.N0 n04 = this.binding;
        if (n04 == null) {
            C3862t.u("binding");
            n04 = null;
        }
        n04.f9543g.setControllerAutoShow(false);
        L4.N0 n05 = this.binding;
        if (n05 == null) {
            C3862t.u("binding");
            n05 = null;
        }
        n05.f9543g.G();
        L4.N0 n06 = this.binding;
        if (n06 == null) {
            C3862t.u("binding");
        } else {
            n02 = n06;
        }
        n02.f9543g.setUseController(false);
    }

    private final void b3(View view) {
        L4.N0 n02 = this.binding;
        L4.N0 n03 = null;
        if (n02 == null) {
            C3862t.u("binding");
            n02 = null;
        }
        AppCompatTextView appCompatTextView = n02.f9541e;
        MEATERDeviceType mEATERDeviceType = f14927d1;
        if (mEATERDeviceType == null) {
            C3862t.u("deviceType");
            mEATERDeviceType = null;
        }
        appCompatTextView.setText(mEATERDeviceType.getProductName());
        L4.N0 n04 = this.binding;
        if (n04 == null) {
            C3862t.u("binding");
            n04 = null;
        }
        AppCompatTextView appCompatTextView2 = n04.f9546j;
        String str = f14926c1;
        if (str == null) {
            C3862t.u("deviceName");
            str = null;
        }
        appCompatTextView2.setText(str);
        L4.N0 n05 = this.binding;
        if (n05 == null) {
            C3862t.u("binding");
            n05 = null;
        }
        n05.f9539c.setOnClickListener(new View.OnClickListener() { // from class: R4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1639a0.c3(this.f14918B, view2);
            }
        });
        L4.N0 n06 = this.binding;
        if (n06 == null) {
            C3862t.u("binding");
        } else {
            n03 = n06;
        }
        n03.f9540d.f9313b.setOnClickListener(new View.OnClickListener() { // from class: R4.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1639a0.d3(this.f14923B, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(C1639a0 c1639a0, View view) {
        a aVar = f14928e1;
        if (aVar != null) {
            aVar.b();
        }
        c1639a0.A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(C1639a0 c1639a0, View view) {
        c1639a0.A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(DialogInterface dialogInterface) {
        C3862t.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View viewFindViewById = aVar.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            aVar.r().R0(viewFindViewById.getHeight());
            viewFindViewById.getParent().getParent().requestLayout();
        }
    }

    private final void f3(ExoPlayer.b playerBuilder, Context context) {
        playerBuilder.l(Z2(this, context, false, 2, null));
    }

    @Override // androidx.fragment.app.n
    public int E2() {
        return R.style.VT_BottomSheet;
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        this.binding = L4.N0.c(j0(), container, false);
        K2(true);
        L4.N0 n02 = this.binding;
        L4.N0 n03 = null;
        if (n02 == null) {
            C3862t.u("binding");
            n02 = null;
        }
        ConstraintLayout constraintLayoutB = n02.b();
        C3862t.f(constraintLayoutB, "getRoot(...)");
        b3(constraintLayoutB);
        L4.N0 n04 = this.binding;
        if (n04 == null) {
            C3862t.u("binding");
        } else {
            n03 = n04;
        }
        ConstraintLayout rootView = n03.f9544h;
        C3862t.f(rootView, "rootView");
        return rootView;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        a aVar;
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Dialog dialogD2 = D2();
        if (dialogD2 == null || !dialogD2.isShowing() || (aVar = f14928e1) == null) {
            return;
        }
        aVar.a();
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        C3862t.g(dialog, "dialog");
        super.onDismiss(dialog);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            C3862t.u("player");
            exoPlayer = null;
        }
        exoPlayer.c();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.x1();
        a3();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        L4.N0 n02 = this.binding;
        ExoPlayer exoPlayer = null;
        if (n02 == null) {
            C3862t.u("binding");
            n02 = null;
        }
        n02.f9543g.Q();
        ExoPlayer exoPlayer2 = this.player;
        if (exoPlayer2 != null) {
            if (exoPlayer2 == null) {
                C3862t.u("player");
                exoPlayer2 = null;
            }
            exoPlayer2.F(false);
            ExoPlayer exoPlayer3 = this.player;
            if (exoPlayer3 == null) {
                C3862t.u("player");
                exoPlayer3 = null;
            }
            exoPlayer3.stop();
            ExoPlayer exoPlayer4 = this.player;
            if (exoPlayer4 == null) {
                C3862t.u("player");
            } else {
                exoPlayer = exoPlayer4;
            }
            exoPlayer.c();
        }
        System.gc();
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        Dialog dialogD2 = D2();
        if (dialogD2 != null) {
            dialogD2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: R4.X
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C1639a0.e3(dialogInterface);
                }
            });
        }
        L4.N0 n02 = this.binding;
        if (n02 == null) {
            C3862t.u("binding");
            n02 = null;
        }
        n02.f9543g.setShutterBackgroundColor(x4.g.h().getColor(R.color.transparent));
    }
}
