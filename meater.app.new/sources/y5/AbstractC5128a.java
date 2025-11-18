package y5;

import Ba.p;
import M4.h;
import Xb.C1841i;
import Xb.I;
import android.view.Y;
import android.view.Z;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import o4.StepContentMeta;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x5.g;

/* compiled from: BaseRecipeViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0011R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010\u0011R\"\u00104\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u00103R\"\u00108\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u00103R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u0016R\"\u0010?\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u0016R\"\u0010C\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00109\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u0016R\"\u0010F\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00109\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u0016R\"\u0010J\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010\u0016R\"\u0010M\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00109\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u0010\u0016R\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00109\u001a\u0004\bN\u0010\u0018\"\u0004\b'\u0010\u0016R\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00109\u001a\u0004\bQ\u0010\u0018\"\u0004\bR\u0010\u0016R\"\u0010V\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010\u0016R>\u0010^\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020X0Wj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020X`Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010Z\u001a\u0004\bG\u0010[\"\u0004\b\\\u0010]R\"\u0010c\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010`\u001a\u0004\bP\u0010a\"\u0004\b9\u0010bR$\u0010i\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006j"}, d2 = {"Ly5/a;", "Landroidx/lifecycle/Y;", "LG5/a;", "preferences", "<init>", "(LG5/a;)V", "Loa/F;", "h", "()V", "", "recipeId", "", "onGoingRecipeID", "i", "(IJ)V", "probeID", "Q", "(J)V", "F", "k", "adapterPosition", "W", "(I)V", "x", "()I", "", "D", "()Z", "b", "LG5/a;", "Lo4/o;", "c", "Lo4/o;", "z", "()Lo4/o;", "S", "(Lo4/o;)V", "recipe", "d", "J", "w", "()J", "setOnGoingRecipeId", "onGoingRecipeId", "e", "y", "R", "f", "Z", "m", "G", "(Z)V", "cookConfirmed", "g", "n", "H", "cookFinished", "I", "q", "K", "currentStepNumber", "s", "M", "deviceSelectionStepNumber", "j", "B", "U", "setupCookStepNumber", "r", "L", "deviceInstructionVideoStepNumber", "l", "t", "N", "elapsedTimeStepNumber", "v", "P", "internalTempStepNumber", "p", "cookStepNumber", "o", "A", "T", "restStepNumber", "u", "O", "finishStepNumber", "Ljava/util/HashMap;", "Lo4/z;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "E", "(Ljava/util/HashMap;)V", "autoProgressMap", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "()Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "(Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)V", "cookState", "Ljava/lang/Integer;", "C", "()Ljava/lang/Integer;", "V", "(Ljava/lang/Integer;)V", "setupRecommendedTemperature", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5128a extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Recipe recipe;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long onGoingRecipeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long probeID;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cookConfirmed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean cookFinished;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentStepNumber;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int deviceSelectionStepNumber;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int setupCookStepNumber;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int deviceInstructionVideoStepNumber;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int elapsedTimeStepNumber;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int internalTempStepNumber;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int cookStepNumber;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int restStepNumber;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int finishStepNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private HashMap<Integer, StepContentMeta> autoProgressMap;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private DeviceCookState cookState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Integer setupRecommendedTemperature;

    /* compiled from: BaseRecipeViewModel.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.BaseRecipeViewModel$finishCook$1", f = "BaseRecipeViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: y5.a$a, reason: collision with other inner class name */
    static final class C0779a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f53132B;

        C0779a(InterfaceC4588d<? super C0779a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return AbstractC5128a.this.new C0779a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0779a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f53132B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a.f8678a.b(AbstractC5128a.this.getOnGoingRecipeId());
            return C4153F.f46609a;
        }
    }

    /* compiled from: BaseRecipeViewModel.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.BaseRecipeViewModel$setCookConfirmed$1", f = "BaseRecipeViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: y5.a$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f53134B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return AbstractC5128a.this.new b(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f53134B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a.l(K4.a.f8678a, 0, 0, 0L, AbstractC5128a.this.getOnGoingRecipeId(), 0L, 0, 0, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), null, 0L, 7159, null);
            return C4153F.f46609a;
        }
    }

    /* compiled from: BaseRecipeViewModel.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.BaseRecipeViewModel$setProbe$1", f = "BaseRecipeViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: y5.a$c */
    static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f53136B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f53138D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f53138D = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return AbstractC5128a.this.new c(this.f53138D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f53136B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a.l(K4.a.f8678a, 0, 0, this.f53138D, AbstractC5128a.this.getOnGoingRecipeId(), 0L, 0, 0, null, null, null, null, null, 0L, 8179, null);
            return C4153F.f46609a;
        }
    }

    /* compiled from: BaseRecipeViewModel.kt */
    @f(c = "com.apptionlabs.meater_app.recipe.ui.BaseRecipeViewModel$storeOnGoingAdapterPosition$1", f = "BaseRecipeViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: y5.a$d */
    static final class d extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f53139B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f53141D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f53141D = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return AbstractC5128a.this.new d(this.f53141D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f53139B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a.l(K4.a.f8678a, 0, 0, 0L, AbstractC5128a.this.getOnGoingRecipeId(), 0L, this.f53141D, 0, null, null, null, null, null, 0L, 8151, null);
            return C4153F.f46609a;
        }
    }

    public AbstractC5128a(G5.a preferences) {
        C3862t.g(preferences, "preferences");
        this.preferences = preferences;
        this.onGoingRecipeId = -1L;
        this.probeID = -1L;
        this.currentStepNumber = -1;
        this.deviceSelectionStepNumber = -1;
        this.setupCookStepNumber = -1;
        this.deviceInstructionVideoStepNumber = -1;
        this.elapsedTimeStepNumber = -1;
        this.internalTempStepNumber = -1;
        this.cookStepNumber = -1;
        this.restStepNumber = -1;
        this.finishStepNumber = -1;
        this.autoProgressMap = new HashMap<>();
        this.cookState = DeviceCookState.COOK_STATE_NOT_STARTED;
    }

    private final void h() {
        this.preferences.b0(z().getId());
    }

    public static /* synthetic */ void j(AbstractC5128a abstractC5128a, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRecipe");
        }
        if ((i11 & 2) != 0) {
            j10 = -1;
        }
        abstractC5128a.i(i10, j10);
    }

    /* renamed from: A, reason: from getter */
    public final int getRestStepNumber() {
        return this.restStepNumber;
    }

    /* renamed from: B, reason: from getter */
    public final int getSetupCookStepNumber() {
        return this.setupCookStepNumber;
    }

    /* renamed from: C, reason: from getter */
    public final Integer getSetupRecommendedTemperature() {
        return this.setupRecommendedTemperature;
    }

    public final boolean D() {
        return this.recipe != null;
    }

    public final void E(HashMap<Integer, StepContentMeta> map) {
        C3862t.g(map, "<set-?>");
        this.autoProgressMap = map;
    }

    public final void F() {
        U4.b.t("(BaseRecipeViewModel) Cook Confirmed", new Object[0]);
        C1841i.d(Z.a(this), null, null, new b(null), 3, null);
        this.cookConfirmed = true;
    }

    public final void G(boolean z10) {
        this.cookConfirmed = z10;
    }

    public final void H(boolean z10) {
        this.cookFinished = z10;
    }

    public final void I(DeviceCookState deviceCookState) {
        C3862t.g(deviceCookState, "<set-?>");
        this.cookState = deviceCookState;
    }

    public final void J(int i10) {
        this.cookStepNumber = i10;
    }

    public final void K(int i10) {
        this.currentStepNumber = i10;
    }

    public final void L(int i10) {
        this.deviceInstructionVideoStepNumber = i10;
    }

    public final void M(int i10) {
        this.deviceSelectionStepNumber = i10;
    }

    public final void N(int i10) {
        this.elapsedTimeStepNumber = i10;
    }

    public final void O(int i10) {
        this.finishStepNumber = i10;
    }

    public final void P(int i10) {
        this.internalTempStepNumber = i10;
    }

    public final void Q(long probeID) {
        C1841i.d(Z.a(this), null, null, new c(probeID, null), 3, null);
        this.probeID = probeID;
    }

    public final void R(long j10) {
        this.probeID = j10;
    }

    public final void S(Recipe recipe) {
        C3862t.g(recipe, "<set-?>");
        this.recipe = recipe;
    }

    public final void T(int i10) {
        this.restStepNumber = i10;
    }

    public final void U(int i10) {
        this.setupCookStepNumber = i10;
    }

    public final void V(Integer num) {
        this.setupRecommendedTemperature = num;
    }

    public final void W(int adapterPosition) {
        C1841i.d(Z.a(this), null, null, new d(adapterPosition, null), 3, null);
        U4.b.t("(BaseRecipeViewModel) Store Ongoing Adapter Position : " + adapterPosition, new Object[0]);
    }

    public final void i(int recipeId, long onGoingRecipeID) {
        Recipe recipeG = g.f52863a.g(recipeId);
        if (recipeG != null) {
            S(recipeG);
        }
        this.onGoingRecipeId = onGoingRecipeID;
    }

    public void k() {
        MEATERDevice mEATERDeviceO;
        U4.b.t("(BaseRecipeViewModel) Finish Cook", new Object[0]);
        long j10 = this.probeID;
        if (j10 != -1 && (mEATERDeviceO = h.f11978a.o(j10)) != null && (mEATERDeviceO instanceof Probe)) {
            ((Probe) mEATERDeviceO).cancelCook(true);
        }
        h();
        this.probeID = -1L;
        this.cookConfirmed = false;
        this.cookFinished = false;
        C1841i.d(Z.a(this), Xb.Z.b(), null, new C0779a(null), 2, null);
    }

    public final HashMap<Integer, StepContentMeta> l() {
        return this.autoProgressMap;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getCookConfirmed() {
        return this.cookConfirmed;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getCookFinished() {
        return this.cookFinished;
    }

    /* renamed from: o, reason: from getter */
    public final DeviceCookState getCookState() {
        return this.cookState;
    }

    /* renamed from: p, reason: from getter */
    public final int getCookStepNumber() {
        return this.cookStepNumber;
    }

    /* renamed from: q, reason: from getter */
    public final int getCurrentStepNumber() {
        return this.currentStepNumber;
    }

    /* renamed from: r, reason: from getter */
    public final int getDeviceInstructionVideoStepNumber() {
        return this.deviceInstructionVideoStepNumber;
    }

    /* renamed from: s, reason: from getter */
    public final int getDeviceSelectionStepNumber() {
        return this.deviceSelectionStepNumber;
    }

    /* renamed from: t, reason: from getter */
    public final int getElapsedTimeStepNumber() {
        return this.elapsedTimeStepNumber;
    }

    /* renamed from: u, reason: from getter */
    public final int getFinishStepNumber() {
        return this.finishStepNumber;
    }

    /* renamed from: v, reason: from getter */
    public final int getInternalTempStepNumber() {
        return this.internalTempStepNumber;
    }

    /* renamed from: w, reason: from getter */
    public final long getOnGoingRecipeId() {
        return this.onGoingRecipeId;
    }

    public final int x() {
        K4.b bVarE;
        long j10 = this.onGoingRecipeId;
        if (j10 == -1 || (bVarE = K4.a.f8678a.e(j10)) == null) {
            return 0;
        }
        return bVarE.getStepNumber();
    }

    /* renamed from: y, reason: from getter */
    public final long getProbeID() {
        return this.probeID;
    }

    public final Recipe z() {
        Recipe recipe = this.recipe;
        if (recipe != null) {
            return recipe;
        }
        C3862t.u("recipe");
        return null;
    }
}
